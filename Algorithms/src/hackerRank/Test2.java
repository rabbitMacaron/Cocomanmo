package hackerRank;

public class Test2 {

	/*
	 어느 연못에 엄마 말씀을 좀처럼 듣지 않는 청개구리가 살고 있었습니다. 
	청개구리는 엄마가 하는 말은 무엇이든 반대로 말하였습니다.
	
	엄마 말씀 word가 매개변수로 주어질 때, 아래 청개구리 사전을 참고해 반대로 변환하여 return 하도록 
	solution 메서드를 완성해주세요.
	
	65  66  67  68  69  70  71  72  73  74  75  76  77  78  79  80   81  82  83  84  85  86  87  88  89  90 
	A	B	C	D	E	F	G	H	I	J	K	L	M	N	O	P	Q	R	S	T	U	V	W	X	Y	Z 
	Z	Y	X	W	V	U	T	S	R	Q	P	O	N	M	L	K	J	I	H	G	F	E	D	C	B	A
	90	89  88  87  86  85  84  83  82  81  80  79  78  77  76  75  74  73  72  71  70  69  68  67  66  65
	
	97  98  99 100 101 ~
	a	b	c	d	e	f	g	h	i	j	k	l	m	n	o	p	q	r	s	t	u	v	w	x	y	z 
	z	y	x	w	v	u	t	s	r	q	p	o	n	m	l	k	j	i	h	g	f	e	d	c	b	a
	제한사항
	word는 길이가 1 이상 1,000 이하인 문자열입니다.
	알파벳 외의 문자는 변환하지 않습니다.
	알파벳 대문자는 알파벳 대문자로, 알파벳 소문자는 알파벳 소문자로 변환합니다.
	입출력 예
	word	result
	I love you	R olev blf
	입출력 예 설명
	입출력 예 #1
	
	'I'는 알파벳 대문자이므로 'R'로 변환할 수 있습니다.
	공백(스페이스 바)은 알파벳 외의 문자이므로 변환하지 않습니다.
	'l'은 알파벳 소문자이므로 'o'로 변환할 수 있습니다.
	'o'은 알파벳 소문자이므로 'l'로 변환할 수 있습니다.
	'v'은 알파벳 소문자이므로 'e'로 변환할 수 있습니다.
	'e'은 알파벳 소문자이므로 'v'로 변환할 수 있습니다.
	공백(스페이스 바)은 알파벳 외의 문자이므로 변환하지 않습니다.
	'y'은 알파벳 소문자이므로 'b'로 변환할 수 있습니다.
	'o'은 알파벳 소문자이므로 'l'로 변환할 수 있습니다.
	'u'은 알파벳 소문자이므로 'f'로 변환할 수 있습니다.
	 */
	public static void main(String[] args) {
		String word = "I love you";
		solution(word);
	}

	public static void solution(String word) {
		String result="";
		char[] chWord = word.toCharArray();

		for(int i=0; i< chWord.length; i++) {
			char ch = chWord[i];
			
			if(ch>=65 && ch<=90) {	// 대문자
				result+= String.valueOf((char)(90 - Math.abs(65-ch)));

			} else if(ch>=97 && ch <= 122) {	// 소문자
				result += String.valueOf((char)(122 - Math.abs(97-ch)));
			} else {
				result+= ch;
			}
			
		}
		System.out.println(result);
	
	}
}
