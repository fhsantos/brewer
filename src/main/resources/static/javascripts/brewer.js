  $(function() {
	  var decimal = $('.js-decimal');
	  decimal.maskMoney();
	  
	  var nrInteiros = $('.js-inteiro');
	  nrInteiros.maskMoney({precision :0});
  })