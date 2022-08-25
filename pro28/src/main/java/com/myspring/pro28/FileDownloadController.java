package com.myspring.pro28;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.coobird.thumbnailator.Thumbnails;
//
//@Controller
public class FileDownloadController {
	private static String CURR_IMAGE_REPO_PATH ="c:\\spring\\image_repo";
	
	@RequestMapping("/download")
	//@requestparam -->request.getparameter랑 같음
	public void download(@RequestParam("imageFileName") String imageFileName,
							HttpServletResponse response)throws Exception{
		OutputStream out = response.getOutputStream();
		String filePath = CURR_IMAGE_REPO_PATH+"\\"+imageFileName;
//		String downFile =CURR_IMAGE_REPO_PATH+"\\"+imageFileName;
//		File file = new File(downFile);
//		response.setHeader("Cache-Control", "no-cache");
//		response.addHeader("Content-disposition", "attachment; fileName="+imageFileName);
//		FileInputStream in = new FileInputStream(file);
		File image= new File(filePath);
		int lastIndex = imageFileName.lastIndexOf(".");
		String fileName= imageFileName.substring(0,lastIndex);
		File thumbnail = new File(CURR_IMAGE_REPO_PATH+"\\"+"thumbnail"+"\\"+fileName+".png");
		if(image.exists()) {
			thumbnail.getParentFile().mkdirs();
			//폴더만들지 못해도  makedirectory해서 폴더생성
			Thumbnails.of(image).size(50,50).outputFormat("png").toFile(thumbnail);
	
		}
		FileInputStream in = new FileInputStream(thumbnail);
		byte[] buffer = new byte[1024*8];
		while(true) {
			int count = in.read(buffer);
			if(count==-1)
				break;
			out.write(buffer,0,count);
		}
		in.close();
		out.close();
	}
}
