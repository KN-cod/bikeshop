# Customize the HTML user interface for your customer’s application
Added the customization in the mainscreen.html file where i added details and stylings as well as displaying the shop name
# Add an “About” page to the application
Created new file about.html in the templates folder and added code to display information about the shop also added a controller and a  link in the mainscreen.html to handle the shift to and fro the about page.
# Add a sample inventory appropriate
In the bootstrap data file added the inventory required for the shop each item with its amount. this modification was done from line 28 to 61. this checks if the parts and products are empty so as to help not overwrite the current existing database.
# Add a “Buy Now” button to your product list
Added a buy now buttton in the mainscreen.html file in the products table in line 111 just belowthe delete button. Also added the script code to send the data to the backend for proceesing on successful purchase an alert occurs that informs users the purchase was successful. Also the inventory amount reduces.
# Modify the parts to track maximum and minimum inventory
Added minimum and maximum fields this will help to have a concise number of parts. this modification occurs in the inhouse and the outsorced html and domain files such that they are able to recieve input about the max values and the min values of the inventory.
# Add validation for between or at the maximum and minimum fields
Validatiion to keep the fields in check. this occurs in the htmlfiles of the code where javascript code is used to valldate the input files before pushing it to the backend. the code is in the head section of the inhouse and outsourced files in the templates folder.

# Add at least two unit tests for the maximum and minimum fields to the PartTest
Added the tests in the Part test file in the test folder

