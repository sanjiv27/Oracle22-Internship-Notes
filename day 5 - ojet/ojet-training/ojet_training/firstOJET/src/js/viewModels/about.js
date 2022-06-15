/**
 * @license
 * Copyright (c) 2014, 2022, Oracle and/or its affiliates.
 * Licensed under The Universal Permissive License (UPL), Version 1.0
 * as shown at https://oss.oracle.com/licenses/upl/
 * @ignore
 */
/*
 * Your about ViewModel code goes here
 */
define(["require", "knockout", "ojs/ojcore", "ojs/ojbootstrap", "ojs/ojknockout", "ojs/ojinputtext", "ojs/ojformlayout"],
    function(oj, ko) {
        function AboutViewModel() {
            var self = this;
            self.name = ko.observable("");

        }
        return AboutViewModel;
    });