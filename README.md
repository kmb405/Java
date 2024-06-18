# COSC540-Grocery
Grocery group project

Setting Up the Development Environment
You'll first need to set up your development environment to integrate React with Django. This involves installing Django and creating a new Django project. You can install Django using pip, Python's package manager, with the following command:

  pip install django

Once Django is installed, you can create a new Django project by running:

  django-admin startproject myproject
  
For the React part, you'll typically use create-react-app, a command-line tool that sets up the structure of a new React application. Install it globally using npm and then create your React app:

  npm install -g create-react-app
  create-react-app myfrontend
  
Python's virtual environments are a crucial part of Python development. They allow you to manage dependencies for your projects separately, avoiding conflicts between packages. Before starting your Django project, it's a good practice to create a virtual environment:

  python -m venv myenv
  source myenv/bin/activate  # On Windows use `myenv\\\\Scripts\\\\activate`
  
With your development environment set up, you can start building your full-stack application with React and Django.
