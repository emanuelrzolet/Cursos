people = [
    {"name": "Harry", "House": "Gryffindor"},
    {"name": "Cho", "House": "Ravenclaw"},
    {"name": "Hermione", "House": "Gryffindor"}]

people.sort(key=lambda person:person["name"])
print(people)