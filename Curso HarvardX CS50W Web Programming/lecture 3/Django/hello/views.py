from django.shortcuts import render
from django.http import HttpResponse
# Create your views here.
def index(request):
    return HttpResponse("Hello, worlds!")

def emanuel(request):
    return HttpResponse("Hello, Emanuel")
def david(request):
    return HttpResponse("Hello David")