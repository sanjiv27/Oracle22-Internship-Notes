/**
 * @license
 * Copyright (c) 2014, 2022, Oracle and/or its affiliates.
 * Licensed under The Universal Permissive License (UPL), Version 1.0
 * as shown at https://oss.oracle.com/licenses/upl/
 * @ignore
 */
/*
 * Your customer ViewModel code goes here
 */

define(['ojs/ojcore', 'knockout', 'ojs/ojarraydataprovider', 'text!json/data.json', 'ojs/ojchart'],
    function(oj, ko, ArrayDataProvider, data) {
        function CustomerViewModel() {

            this.threeDValue = ko.observable("off");
            /* chart data */
            this.dataProvider = new ArrayDataProvider(JSON.parse(data), {
                keyAttributes: "id",
            });
        };
        return CustomerViewModel;
    }
);