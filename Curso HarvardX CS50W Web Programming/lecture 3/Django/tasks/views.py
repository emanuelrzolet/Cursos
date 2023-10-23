from django.shortcuts import render
from django.http import HttpResponseRedirect
from django import forms
from django.urls import reverse

class NewTaskForm(forms.Form):
    task = forms.CharField(label="New Task")
    priority = forms.IntegerField(label="Priority",min_value=0, max_value=10)


tasks = []


# Create your views here.
def index(request):
    if "tasks" not in request.session:
        request.session["tasks"] = []
    return render(request, "tasks/index.html",{"tasks":request.session["tasks"]})

def add(request):
    if request.method == "POST":
        forms = NewTaskForm(request.POST)
        if forms.is_valid():
            task = forms.cleaned_data["task"]
            request.session["tasks"] += [task]
            return HttpResponseRedirect(reverse("tasks:index"))
        else:
           return render(request, "tasks/add.html",{"forms": forms})
    return render(request,"tasks/add.html",{"forms": NewTaskForm()})