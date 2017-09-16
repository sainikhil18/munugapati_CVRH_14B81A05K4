import java.util.Arrays;
import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		try{
			if(students==null)
				throw new IllegalArgumentException();
			else
				this.students=students;
		}
		catch(IllegalArgumentException iae){
			
		}
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try{
			if(index<0 || index>=students.length)
				throw new IllegalArgumentException();
			else{
				return students[index];
			}
		}
		catch(IllegalArgumentException iae){
			
		}
		
	}

	@Override
	public void setStudent(Student student, int index) {
		try{
			if(index<0 || index>=students.length || student==null)
				throw new IllegalArgumentException();
			else{
				this.students[index]=student;
			}
		}
		catch(IllegalArgumentException iae){
			
		}
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		try{
			if(student==null)
				throw new IllegalArgumentException();
			else{
				Student[] t=Arrays.copyOf(this.students, this.students.length);
				int len=this.students.length;
				this.students=new Student[len+1];
				this.students[0]=student;
				for(int i=1;i<len;i++){
					this.students[i]=t[i-1];
				}
			}
		}
		catch(IllegalArgumentException iae){
		}
	}

	@Override
	public void addLast(Student student) {
		try{
			if(student==null)
				throw new IllegalArgumentException();
			else{
				Student[] t=Arrays.copyOf(this.students, this.students.length);
				int len=this.students.length;
				this.students=new Student[len+1];
				this.students[len]=student;
				for(int i=0;i<len;i++){
					this.students[i]=t[i];
				}
			}
		}
		catch(IllegalArgumentException iae){
			
		}
			// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		try{
			if(index<0 || index>=students.length || student==null)
				throw new IllegalArgumentException();
			else{
				this.students[index]=student;
			}
		}
		catch(IllegalArgumentException iae){
			
		}
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		try{
			if(index<0 || index>=students.length)
				throw new IllegalArgumentException();
			else{
				Student[] t=Arrays.copyOf(this.students, this.students.length);
				int len=this.students.length;
				this.students=new Student[len-1];
				for(int i=0;i<index;i++)
					this.students[i]=t[i];
				for(int i=index+1;i<len;i++)
					this.students[i-1]=t[i];
			}
		}
		catch(IllegalArgumentException iae){
			
		}
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		try{
			if(student==null)
				throw new IllegalArgumentException();
			else{
				int index;
				for(int i=0;i<this.students.length;i++){
					if(this.students[i].equals(student)){
						index=i;
						break;
					}
				}
				if(i==this.students.length)
					throw new IllegalArgumentException();
				else
					this.remove(index);
			}
		}
		catch(IllegalArgumentException iae){
			
		}
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		try{
			if(index<0 || index>=students.length)
				throw new IllegalArgumentException();
			else{
				Student[] t=Arrays.copyOf(this.students, index+1);
				this.students=new Student[index+1];
				for(int i=0;i<=index;i++)
					this.students[i]=t[i];
			}
		}
		catch(IllegalArgumentException iae){
			
		}
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		try{
			if(student==null)
				throw new IllegalArgumentException();
			else{
				int index;
				for(int i=0;i<this.students.length;i++){
					if(this.students[i].equals(student)){
						index=i;
						break;
					}
				}
				if(i==this.students.length)
					throw new IllegalArgumentException();
				else
					this.removeFromIndex(index);
			}
		}
		catch(IllegalArgumentException iae){
			
		}
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		try{
			if(index<0 || index>=students.length)
				throw new IllegalArgumentException();
			else{
				Student[] t=Arrays.copyOf(this.students, this.students.length);
				int len=this.students.length;
				this.students=new Student[len-index];
				int j=0;
				for(int i=index;i<len;i++)
					this.students[j++]=t[i];
			}
		}
		catch(IllegalArgumentException iae){
			
		}
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		try{
			if(student==null)
				throw new IllegalArgumentException();
			else{
				int index;
				for(int i=0;i<this.students.length;i++){
					if(this.students[i].equals(student)){
						index=i;
						break;
					}
				}
				if(i==this.students.length)
					throw new IllegalArgumentException();
				else
					this.removeToIndex(index);
			}
		}
		catch(IllegalArgumentException iae){
			
		}
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		int i=0;
		int len=this.students.length;
		for(i=0;i<len;i++){
			for(int j=0;j<len-i-1;j++){
				if(this.students[j].compareTo(this.students[j+1])>0){
					Student t=this.students[j];
					this.students[j]=this.students[j+1];
					this.students[j+1]=j;
				}
			}
		}
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
