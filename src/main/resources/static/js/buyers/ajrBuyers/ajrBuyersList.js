$(function(){
	var dataTable = $("#ajrBuyersDataTable").DataTable({
		"ajax": {
			"url": '/ajrBuyers/list',
			"data": function(data){
				data.title = $("#title").val();
				data.custName = $("#custName").val();
				data.custTelephone = $("#custTelephone").val();
				data.updateDateStart = $("#updateDateStart").val();
				data.updateDateEnd = $("#updateDateEnd").val();
			}
		},
		"ordering": false,
		"columns": [
			{
				"data": "id",
				"className": "text-center sign-col",
				"render": function(data, type, row, meta){
					
					return '<input type="checkbox" name="pk" value="' + data + '" onclick="checkOne()"/>';
				}
			},
			{"data": "pid"},
			{"data": "count"},
			{"data": "title"},
			{"data": "ip"},
			{"data": "custName"},
			{"data": "content"},
			{"data": "custEmail"},
			{"data": "custCorporate"},
			{"data": "custTelephone"},
			{
				"data": "id",
				"className": "operate-col",
				"render": function(data, type, row, meta){
					
					var html = '<button type="button" onclick="edit(\''+ data +'\')" class="btn btn-sm btn-warning right-5">'
						+ '<i class="fa fa-edit"></i>'
						+ '</button>'
						+ '<button type="button" onclick="view(\''+ data +'\')" class="btn btn-sm btn-info">'
                    	+ '<i class="fa fa-search"></i>'
                    	+ '</button>';
					return html;
				}
			}
		]
	});
	
	$('#searchBtn').click(function(){
		
		dataTable.ajax.reload();
	});
	
	$('#resetBtn').click(function(){
		
		$('#ajrBuyersSearchForm')[0].reset();
		dataTable.ajax.reload();
	});
	
	$('#addBtn').click(function(){
		
		forwardPage('/ajrBuyers/ajrBuyers');
	});
	
	$('#delBtn').click(function(){
		
		ajaxBySelecteRows(dataTable,'/ajrBuyers/delete','确定要删除？');
	});
	
	// 日期
	$('.datepicker').datetimepicker({
		language: 'zh-CN',
		format: 'yyyy-mm-dd',
		autoclose: true,
		todayBtn: true,
		clearBtn:true,
		minView: 2
	});
});

function edit(id){
	
	forwardPage('/ajrBuyers/ajrBuyers?id='+id);
}

function view(id){
	
	forwardPage('/ajrBuyers/view?id='+id);
}