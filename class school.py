class school:
	def __init__(self,name,principal,size,location,grades):
		self.name = name
		self.principal = principal
		self.size = size
		self.location = location
		self.grades = grades
	def add_grade(self, grade):
		self.grades = self.grades.append(grade)

school1 = school("name1", "principal1", 8, "ca", [9, 9, 9])
school1.add_grade(10)
