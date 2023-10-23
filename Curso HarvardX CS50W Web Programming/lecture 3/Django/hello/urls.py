from django.urls import path
from . import views
urlpatterns = [
    path("", views.index, name="index"),
    path("emanuel", views.emanuel, name="emanuel"),
    path("david", views.david, name='david'),
    
]