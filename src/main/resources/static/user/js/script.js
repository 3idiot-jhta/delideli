$(document).ready(function(){
    // header category dropdown
    $('.header__bot-menu > li').hover(
        function() {
            $(this).find('ul').stop(true, true).fadeToggle('slow');
        }
    );
});