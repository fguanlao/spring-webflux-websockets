//package fguanlao.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//@Service
//public class TeamService {
//
//    @Value("${rest.client.url}")
//    private String url;
//    private RestTemplate restTemplate;
//
//    @Autowired
//    public TeamService(RestTemplate restTemplate){
//        this.restTemplate = restTemplate;
//    }
//
//    public String getTeam(long teamId){
//        return restTemplate.getForObject(url + String.format("teams/%d?expand=team.roster", teamId), String.class);
//    }
//}
