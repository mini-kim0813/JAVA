package study01;

public class Car {

	String company = "�����ڵ���";
	String model;
	int cs;
	int ms;
	int gas;
	
	Car(String m, int ms)
	{
		this.model = m;
		this.ms = ms;
	}//�ڵ��� ���ϰ� �ְ����ǵ� ����(�ʱ�ȭ)
	
	void sg(int g)
	{
		this.gas = g;
	}//�������� ����(�ʱ�ȭ)
	
	boolean isEmpty()
	{
		if(gas == 0)
		{
			return false;
		}else {
			return true;
		}
	}
	
	void scs(int c)
	{
		cs = c;
	}
	
	void run()
	{
		while(true)
		{
			System.out.printf("���� %dkm/h�� �ӵ��� �����մϴ�. gas �ܷ� : %d����\n", cs, gas);
			if( gas > 0 )
			{
				if(cs<60)
				{
					cs += 10;
					gas--;
				}
				else {
					gas--;
				}
			}
			else
			{
				System.out.println("==== ������ �����ϴ�. �����մϴ�. gas �ܷ� : 0����");
				break;
			}
		}
	}
		
		void downrun() {
			while(true)
			{
				if(cs>=0)
				{
					System.out.printf("====�ӵ��� �پ��ϴ�. �ӵ� %d gas �ܷ� : 0����\n",cs);
					cs-=10;
				}
				else
				{
					System.out.println("====���� ����ϴ�.====");
					return;
				}
			}
		}
	}
	
