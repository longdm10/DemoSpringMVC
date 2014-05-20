$(document).ready(function() {

    $("#nav li").hover(function() {
        $(this).find('ul:first').css({visibility: "visible", display: "none"}).show(400);
    }, function() {
        $(this).find('ul:first').css({visibility: "hidden"});

    });
    if ($(".datepicker").length > 0) {
        $(".datepicker").datepicker({
            changeMonth: true,
            changeYear: true,
            yearRange: '-100:+0',
            showOn: "button",
            dateFormat: 'mm/dd/yy',
        });
    }
});

function confirmDelete() {
    return confirm("Are you sure to delete?");
}

function selectAllCheckbox(className) {
    $("." + className).attr('checked', true);
}

function unSelectAllCheckbox(className) {
    $("." + className).attr('checked', false);
}