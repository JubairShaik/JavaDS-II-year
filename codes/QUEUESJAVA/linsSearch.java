function linearSearch(data, searchQuery) {
    var answer = 'not found';
    for (var i = 0, len = data.length; i < len; i++) {
      if (data[i] === searchQuery) {
        answer = i;
      }
    }
    return answer;
  }

  var names = ["Jack", "Molly", "Tristan", "Jacob", "Steph"]
  var result = linearSearch(names, "Jacob");
  console.log(result);

function findIndexByName(data, name) {
var result = data.findIndex(function(element, index, array) {
  if (element=== name) {
      return true;
  }
  return false;
});
return result;
}
var data = ["Jack", "Molly", "Tristan", "Jacob", "Steph"];
var result = findIndexByName(data, "Jacob");
console.log(result);