package com.ksv.jamrimproved.Controller;

import com.ksv.jamrimproved.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;
}
