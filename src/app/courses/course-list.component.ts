import { CourseService } from './course.service';
import { Component, OnInit } from '@angular/core';
import { Course } from './course';

@Component ({
      templateUrl: './course-list.component.html'
})

export class CourseListComponent implements OnInit{

    filteredCourses: Course[] = [];
    _courses: Course[] = [];
    _filterBy!: String;

    constructor (private CourseService: CourseService){}

    ngOnInit(): void{
        this._courses  = this.CourseService.retrievAll();
        this.filteredCourses = this._courses;
    }

    set filter (value: String){
        this._filterBy = value;

        this.filteredCourses = this._courses.filter((course: Course) => Course.name.toLocaleLowerCase().indexOf(this._filterBy.toLocaleLowerCase()) > -1);
    }

    get filter(){
        return this._filterBy;
    }

}
