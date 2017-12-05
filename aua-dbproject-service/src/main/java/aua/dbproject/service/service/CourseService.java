package aua.dbproject.service.service;

import aua.dbproject.common.dto.CourseDto;
import aua.dbproject.common.filter.CourseFilters;
import aua.dbproject.service.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hrachyayeghishyan on 11/30/17.
 */
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<CourseDto> getCsCourseList(CourseFilters courseFilters){
        return courseRepository.getCSres(courseFilters);
    }

}
