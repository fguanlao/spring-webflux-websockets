//package fguanlao.controller;
//
//import fguanlao.service.TeamService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/teams")
//public class ConnectionController {
//
//    private TeamService service;
//
//    @Autowired
//    public ConnectionController(TeamService service){
//        this.service = service;
//    }
//
//    @GetMapping("/{id}")
//    public String getTeam(@PathVariable("id") long id) {
//         return service.getTeam(id);
//    }
//}
