import { CourseService } from './course.service';
import { Component, OnInit } from '@angular/core';
import { Course } from './course';

@Component ({
    selector: 'app-course-list',
    templateUrl: './course-list.component.html'
})

export class CourseListComponent implements OnInit{

    filteredCourses: Course[] = [];
    _courses: Course[] = [];
    _filterBy!: String;

    constructor (private CourseService: CourseService){}

    ngOnInit(): void{
        this._courses  = this.CourseService.retrievAll();
    }

    set filter (value: String){
        this._filterBy = value;
    }

    get filter(){
        return this._filterBy;
    }

}