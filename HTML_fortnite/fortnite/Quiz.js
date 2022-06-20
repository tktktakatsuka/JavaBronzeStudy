let score = 0;

function showScore(){
  const totalScore = document.getElementById('score-message');
    
  if(score === 3) {
    totalScore.innerHTML = score + "点：満点！おめでとう！"
  } else if(score === 2) {
    totalScore.innerHTML = score + "点：あともう一息！";
  } else if(score === 1) {
    totalScore.innerHTML = score + "点：まあまあ";
  } else {
    totalScore.innerHTML = score + "点：残念";
  }   
}

/**
1問目の正解はBの清少納言
2問目の正解はAの中国
3問目の正解はCのナイル
**/

const correct = 'すごい！”正解です!　ぶゆりるさんの誕生日は2月11日です。ちなみに年齢は2004年生まれのため18歳だそうです。お若いですね。フォートナイトの競技年齢は低いですよね。';
const incorrect = '残念！不正解です!';


function answerQuiz1() {
  const quiz_1 = document.getElementById('quiz-1');
  

  if (quiz_1.answer.value == 'a') {
    quiz_1.innerHTML = incorrect
  // 正解はB
  } else if (quiz_1.answer.value == 'b') {
    quiz_1.innerHTML = correct
  } else if (quiz_1.answer.value == 'c') {
    quiz_1.innerHTML = incorrect
  } else {
    alert('1問目の答えを入力してください');
  }
}



function　mauseEvent(){
  var elem = document.getElementsById("movie");
  elem.addEventListener("mouseover", function(event) {
    event.target.style.backgroundColor = "orange";
// マウスオーバー時の処理
}, false);
}