package com.demo.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StudentHandler
{
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentHandler.class);

    public Object handleRequest(RequestResource<Student> studentResource, Context context)
    {
        LOGGER.info("Student details {}", studentResource);
        String httpMethod = studentResource.getHttpMethod();
        LOGGER.debug("httpMethod {}", httpMethod);
        switch (httpMethod)
        {
            case "GET":
//                return getStudentByIdIfExist(studentResource.getId());
            case "POST":
                return setAndGetStudent(studentResource);
        }
        return null;
    }

    private Student setAndGetStudent(RequestResource<Student> requestResource)
    {
//        students.add(requestResource.getRequestObject());
        return requestResource.getRequestObject();
    }

//    private Optional<Student> getStudentByIdIfExist(String id)
//    {
//        return students.stream().filter(student -> id.equalsIgnoreCase(student.getId())).findAny();
//    }

}
