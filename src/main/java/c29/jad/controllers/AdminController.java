package c29.jad.controllers;

import c29.jad.forms.CheckInRecordForm;
import c29.jad.forms.CourseListForm;
import c29.jad.models.CheckInRecordModel;
import c29.jad.models.CourseListModel;
import c29.jad.services.CheckInRecordService;
import c29.jad.services.CourseListService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.naming.AuthenticationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "admin")
public class AdminController {

    @Autowired
    CheckInRecordService checkInRecordService;

    @Autowired
    CourseListService courseListService;



//    @RequestMapping(value = "/visitor", method = RequestMethod.GET)
//    public ResponseEntity<Map<String, Object>> visitor (HttpServletRequest request){
////        Integer gymRoomId = new CheckInRecordForm().getGymRoomId();
////
//        List<CheckInRecordModel> numberOfPeople = checkInRecordService.getAllRecords();
////        int usersNumber = checkInRecords.size();
////
////        Map<String, Object> response = new HashMap<>();
////        response.put("Users number", usersNumber);
////        response.put("Check-In Records", checkInRecords);
//
//        return new ResponseEntity<>(Map.of("numberOfPeople", numberOfPeople), HttpStatus.OK);
//    }

    @RequestMapping(value = "/visitor", method = RequestMethod.POST)
    public ResponseEntity<Map<String, Object>> visitor(@RequestBody CheckInRecordForm checkInRecordForm){
        List<CheckInRecordModel> numberOfPeople = checkInRecordService.getAllRecords(checkInRecordForm.getStartDate(), checkInRecordForm.getEndDate());
//        Integer size = numberOfPeople.size();
        return new ResponseEntity<>(Map.of("message", "Selected successfully", "NumberOfPeople", numberOfPeople), HttpStatus.OK);
    }




    @RequestMapping(value = "/newcourse", method = RequestMethod.POST)
    public ResponseEntity<Map<String, Object>> addCourse(@RequestBody CourseListForm courseListForm){
        try{
            CourseListModel newCourse = courseListService.newCourse(courseListForm);
            return new ResponseEntity<>(Map.of("message", "New course added", "course", newCourse), HttpStatus.OK);
        } catch (AuthenticationException e) {
            return new ResponseEntity<>(Map.of("message",  e.getMessage()), HttpStatus.UNAUTHORIZED);
        }
    }


}
