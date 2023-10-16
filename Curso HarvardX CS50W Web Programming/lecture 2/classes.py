# class Point():
#     def __init__(self, x, y):
#         self.valor1 = x
#         self.valor2 = y
# p = Point(2,8)
# print(p.valor1)

from sre_constants import SUCCESS


class Flight():
    def __init__(self, capacity) -> None:
        self.capacity = capacity
        self.passengers = []
        
    def add_passenger(self, name):
        if self.open_seats() ==0:
            return False
        self.passengers.append(name)
        return True
        
    def open_seats(self):
        return self.capacity - len(self.passengers)
flight = Flight(3)

people = ["Harry", "Ron", "Hermione", "Ginny"]

for person in people:
    success = flight.add_passenger(person)
    if success:
        print(f"Added {person} to flight successfully.")
    else:
        print(f"No available seats for that person.")