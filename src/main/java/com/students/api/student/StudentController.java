package com.students.api.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentService stdService;
@Autowired
    public StudentController(StudentService stdService) {
        this.stdService = stdService;
    }

    @GetMapping
    public List<Student> getStudents (){
return  stdService.getStudents();
    }
@PostMapping
    public void registerNewStudent(@RequestBody Student student){
        stdService.addNewStudent(student);
    }
    @DeleteMapping(path= "{studentId}")
    public void deleteStudent (@PathVariable("studentId") Long studentId){
        stdService.deleteStudent(studentId);
    }
    @PutMapping(path= "{studentId}")
    public void updateStudent (@PathVariable ("studentId") Long studentId,
                               @RequestParam(required = false) String name,
                               @RequestParam(required = false) String email){
        stdService.updateStudent(studentId,name, email);
    }
}
// Test only - Dlete Later 
// Public static void main (String[] args){
//     System.out.println("Customer Number is:"
//     + 200003456 + "Created At:" 
//     + 12 + "-" + 8 + "-" + 2023+ 
//     "By New User with unknown identity 
//     and undetected IP 
//     Eoror 404: 
//     page not found!
//     Contact the system adminstrator at richy.sa 
//     with the previosly written information at 
//     this domain, or try to reconnect you wi-fi
//     , or restart your device if it is 
//     been open for long period of time, 
//     because sometimes the RAM needs to be 
//     clean for the device to operate properly!
//     Also, you can change your device or browser
//     or turn off the device if its heat is high");
// }
