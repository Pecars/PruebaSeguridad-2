$(document).ready( function () {

    $("form").validate();
  
   $(".boton").on( "click", function() {
       
      var $registerForm = $('form');

        if($registerForm.length){
          $registerForm.validate({
               rules:{
                name: {
                    alphanumeric: true,
                    required: true,
                  },
                marca: {
                required: true,
                },
                color:{
                    alphabetic:true,
                },
                rut:{
                    
                }


                }
            })
        }
    });
} );