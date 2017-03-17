package kr.or.dgit.mybatis_dev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.dgit.mybatis_dev.services.UserPicService;

public class UserPicServiceTest {
	private static UserPicService userpicService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		userpicService = new UserPicService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		userpicService = null;
	}

/*	@Test
	public void testinsertUserPic() {
		byte[] pic = null;
		File file = new File(System.getProperty("user.dir")+"\\DateFiles\\jjh.gif");
		try (InputStream is = new FileInputStream(file);){
			pic = new byte[is.available()];
			is.read(pic);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		UserPic userpic = new UserPic(1, "전지현", pic, "인어공주 전지현");
		int res = userpicService.insertUserPic(userpic);
		Assert.assertEquals(1, res);
	}*/
	
	/*@Test
	public void testselectUserPicById() throws IOException{
		UserPic userpic = userpicService.findUserPicById(1);
		byte[] pic = userpic.getPic();
		
		
		File file = new File(System.getProperty("user.dir")+"\\Download\\jjh.jpg");
		try(OutputStream os = new FileOutputStream(file)){
			os.write(pic);
			os.flush();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}*/

}
