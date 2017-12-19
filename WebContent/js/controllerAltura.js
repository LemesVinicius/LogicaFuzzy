angular.module("MeuApp",[]).controller("MeuController", function($http){ 
	
	
	var self = this;
	
	self.Pessoa = new Object();
	
	self.defaltura = function(){
		
		$http({
			method :"POST",
			url:'fuzzy',
			data:self.Pessoa
		}).then(function successCallback(response) {
			self.Pessoa = response.data;
			console.log(self.Pessoa)
		});
		
	}
	
});