package cn.hsbc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/nj")
public class TCControler {

	@RequestMapping("/hello")
	@ResponseBody
	public Map<String, Object> showHelloWorld() {

		Map<String, Object> map = new HashMap();
		map.put("msg", "2020-09-30");
		return map;
	}
}
