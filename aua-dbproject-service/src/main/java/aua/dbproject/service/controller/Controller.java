package aua.dbproject.service.controller;

import aua.dbproject.common.dto.CourseDto;
import aua.dbproject.common.filter.CourseFilters;
import aua.dbproject.service.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Controller {
    @Autowired
    CourseService courseService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public List<CourseDto> deps(@RequestBody CourseFilters courseFilters){
        return courseService.getCsCourseList(courseFilters);
    }
}
