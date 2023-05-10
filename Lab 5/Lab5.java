class Student:
    def __init__(self, reg_no, name, email, phone, _class, department):
        self.reg_no = reg_no
        self.name = name
        self.email = email
        self.phone = phone
        self.class_ = _class
        self.department = department

    def print_details(self):
        print(f"Reg. No.: {self.reg_no}")
        print(f"Name: {self.name}")
        print(f"Email: {self.email}")
        print(f"Phone: {self.phone}")
        print(f"Class: {self.class_}")
        print(f"Department: {self.department}")

class StudentManager:
    def __init__(self):
        self.students = []

    def add_student(self):
        reg_no = input("Enter Reg. No.: ")
        name = input("Enter Name: ")
        email = input("Enter Email: ")
        phone = input("Enter Phone: ")
        _class = input("Enter Class: ")
        department = input("Enter Department: ")

        student = Student(reg_no, name, email, phone, _class, department)
        self.students.append(student)
        print("Student added successfully.")

    def search_student(self):
        search_query = input("Enter name or reg. no. of the student: ")
        found_students = []

        for student in self.students:
            if search_query.lower() in student.name.lower() or search_query == student.reg_no:
                found_students.append(student)

        if not found_students:
            print("No student found with the given search query.")
        else:
            print(f"Found {len(found_students)} student(s):")
            for student in found_students:
                student.print_details()

    def display_students(self):
        if not self.students:
            print("No student added yet.")
        else:
            print(f"Total students: {len(self.students)}")
            for student in self.students:
                student.print_details()

    def menu(self):
        while True:
            print("1. Add a student")
            print("2. Search for a student")
            print("3. Display all students")
            print("4. Exit")

            choice = input("Enter your choice: ")

            if choice == "1":
                self.add_student()
            elif choice == "2":
                self.search_student()
            elif choice == "3":
                self.display_students()
            elif choice == "4":
                break
            else:
                print("Invalid choice. Please try again.")

if __name__ == "__main__":
    student_manager = StudentManager()
    student_manager.menu()
