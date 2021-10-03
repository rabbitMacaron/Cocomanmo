package hackerRank;

public class Test2 {

	/*
	 ��� ������ ���� ������ ��ó�� ���� �ʴ� û�������� ��� �־����ϴ�. 
	û�������� ������ �ϴ� ���� �����̵� �ݴ�� ���Ͽ����ϴ�.
	
	���� ���� word�� �Ű������� �־��� ��, �Ʒ� û������ ������ ������ �ݴ�� ��ȯ�Ͽ� return �ϵ��� 
	solution �޼��带 �ϼ����ּ���.
	
	65  66  67  68  69  70  71  72  73  74  75  76  77  78  79  80   81  82  83  84  85  86  87  88  89  90 
	A	B	C	D	E	F	G	H	I	J	K	L	M	N	O	P	Q	R	S	T	U	V	W	X	Y	Z 
	Z	Y	X	W	V	U	T	S	R	Q	P	O	N	M	L	K	J	I	H	G	F	E	D	C	B	A
	90	89  88  87  86  85  84  83  82  81  80  79  78  77  76  75  74  73  72  71  70  69  68  67  66  65
	
	97  98  99 100 101 ~
	a	b	c	d	e	f	g	h	i	j	k	l	m	n	o	p	q	r	s	t	u	v	w	x	y	z 
	z	y	x	w	v	u	t	s	r	q	p	o	n	m	l	k	j	i	h	g	f	e	d	c	b	a
	���ѻ���
	word�� ���̰� 1 �̻� 1,000 ������ ���ڿ��Դϴ�.
	���ĺ� ���� ���ڴ� ��ȯ���� �ʽ��ϴ�.
	���ĺ� �빮�ڴ� ���ĺ� �빮�ڷ�, ���ĺ� �ҹ��ڴ� ���ĺ� �ҹ��ڷ� ��ȯ�մϴ�.
	����� ��
	word	result
	I love you	R olev blf
	����� �� ����
	����� �� #1
	
	'I'�� ���ĺ� �빮���̹Ƿ� 'R'�� ��ȯ�� �� �ֽ��ϴ�.
	����(�����̽� ��)�� ���ĺ� ���� �����̹Ƿ� ��ȯ���� �ʽ��ϴ�.
	'l'�� ���ĺ� �ҹ����̹Ƿ� 'o'�� ��ȯ�� �� �ֽ��ϴ�.
	'o'�� ���ĺ� �ҹ����̹Ƿ� 'l'�� ��ȯ�� �� �ֽ��ϴ�.
	'v'�� ���ĺ� �ҹ����̹Ƿ� 'e'�� ��ȯ�� �� �ֽ��ϴ�.
	'e'�� ���ĺ� �ҹ����̹Ƿ� 'v'�� ��ȯ�� �� �ֽ��ϴ�.
	����(�����̽� ��)�� ���ĺ� ���� �����̹Ƿ� ��ȯ���� �ʽ��ϴ�.
	'y'�� ���ĺ� �ҹ����̹Ƿ� 'b'�� ��ȯ�� �� �ֽ��ϴ�.
	'o'�� ���ĺ� �ҹ����̹Ƿ� 'l'�� ��ȯ�� �� �ֽ��ϴ�.
	'u'�� ���ĺ� �ҹ����̹Ƿ� 'f'�� ��ȯ�� �� �ֽ��ϴ�.
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
			
			if(ch>=65 && ch<=90) {	// �빮��
				result+= String.valueOf((char)(90 - Math.abs(65-ch)));

			} else if(ch>=97 && ch <= 122) {	// �ҹ���
				result += String.valueOf((char)(122 - Math.abs(97-ch)));
			} else {
				result+= ch;
			}
			
		}
		System.out.println(result);
	
	}
}
