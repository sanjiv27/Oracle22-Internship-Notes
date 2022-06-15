define(['ojs/ojcore', 'knockout', 'ojs/ojmodel', 'ojs/ojcollectiondataprovider', 'ojs/ojtable'],
    function(oj, ko, ojmodel_1, CollectionDataProvider) {
        function IncidentsViewModel() {
            this.serviceURL = 'http://localhost:3000/Departments';
            this.DeptCol = ko.observable();
            this.datasource = ko.observable();
            this.parseDept = (response) => {
                return {
                    DepartmentId: response['DepartmentId'],
                    DepartmentName: response['DepartmentName'],
                    LocationId: response['LocationId'],
                    ManagerId: response['ManagerId']
                };
            }
            this.Department = ojmodel_1.Model.extend({
                urlRoot: this.serviceURL,
                parse: this.parseDept,
                idAttribute: 'DepartmentId'
            });
            this.myDept = new this.Department();
            this.DeptCollection = ojmodel_1.Collection.extend({
                url: this.serviceURL,
                model: this.myDept,
                comparator: 'DepartmentId'
            });
            this.DeptCol(new this.DeptCollection());
            this.datasource(new CollectionDataProvider(this.DeptCol()));


        };



        return IncidentsViewModel;
    });