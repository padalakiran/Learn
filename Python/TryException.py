try:
    print(99/0)
except Exception as e:
    print(e)
finally:
    print("Finally Block")
