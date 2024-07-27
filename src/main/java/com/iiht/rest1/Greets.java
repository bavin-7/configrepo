/*
 * package com.iiht.rest1;
 * 
 * import java.nio.charset.Charset; import java.util.ArrayList; import
 * java.util.Iterator; import java.util.List; import java.util.Set; import
 * java.util.Map.Entry;
 * 
 * import org.springframework.http.HttpHeaders; import
 * org.springframework.http.MediaType; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestHeader; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * @RestController
 * 
 * @RequestMapping("abc/api1.0") public class Greets {
 * 
 * @GetMapping
 * 
 * @RequestMapping("/language/{Locale}") public ResponseEntity<String>
 * genderMessage2(@RequestHeader HttpHeaders headers,@PathVariable String
 * language){
 * 
 * Set<String> set = headers.keySet(); Iterator<String> keys=set.iterator();
 * String keyStr = null; while(keys.hasNext()) {
 * 
 * keyStr+=keys.next()+"\n"; } String keyValueStr=null;
 * Set<Entry<String,List<String>>>entries=headers.entrySet();
 * 
 * 
 * 
 * 
 * HttpHeaders headers2= new HttpHeaders();
 * headers2.setAcceptLanguageAsLocales(null);
 * headers2.setAcceptCharset((List<Charset>)Charset.defaultCharset());
 * List<Charset>list= new ArrayList<>();
 * headers2.setContentType(MediaType.TEXT_HTML);
 * 
 * 
 * return null;
 * 
 * 
 * 
 * 
 * } }
 */