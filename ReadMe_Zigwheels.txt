************************************************PROJECT DESCRIPTION*****************************************************************
 
Problem Statement : Identify New Bikes
1. Display "Upcoming" bikes details like bike name, price and expected launch date in India, for manufacturer 'Honda' & Bike price should be less than 4Lac.
2. For Used cars in Chennai, extract all the popular models in a List; Display the same
3. Try to 'Login' with google, give invalid account details & capture the error message

Detailed Description: Hackathon Project
1.Launch the browser.
2.Go to "https://zigwheels.com".
3.Cick on upcoming bikes.
4.Select manufacturer Honda.
5.Display upcoming bikes with price less than 4 lakhs.
6.Click on used cars and select city Chennai.
7.Display all popular models in a list.
8.Click on each popular model and display the details of the car.
9.Click on Signin/Register button
10.Select google and give invalid email.
11.Capture the error message.
12.Navigate back to homepage.
13.Close the browser.

 
Key Automation Scope:
 
Capturing the screenshot
Navigation to new page
Printing all the values in console and excel sheet

 
 
**********************************************************STEPS TO EXECUTE*************************************************************
 
-unzip the folder
-On eclipse, goto file->import->select the maven->click on existing maven project->next->browse the location where u unzip the folder-> click on finish
-Now go to the TestNG.xml file and run as TestNGSuite.
-Now the file will Execute and we get the expected output as shown below.
 
*******************************************************FILES DESCRIPTION**************************************************************
 
1.src/test/java- There are five packages in this folder.

-> com.zigwheels.Factory   :In this package there is one class Baseclass.

->com.zigwheels.PageObjects : In this file, the BasePage,HomePage,Login,UpcomingBikes and UsedCars classes are defined.

->com.zigwheels.StepDefinitions : In this file, EndtoEnd, Hooks,RegressionTesting and SmokeTesting classes are defined.

->com.zigwheels.TestNG:In this file,TestNG class is defined.

->TestRunner  : In this file, TestRunner class is defined.

->com.zigwheels.ExcelUtils   : In this file, ExcelUtils class is defined.
 
2.src/test/resources- There are two folders in this folder.

-> Features  : In this folder, there are Regression,Zigwheels and smoke feature files are defined.

->Excel  : In this folder, there are Book1.xlsx, config.properties, extent.properties and log4j2.xml are defined.

3.JRE System Library: In this File we have all dependencies of JAR.files.         
 
4.Maven Dependencies: In this File we have all the directory on the local machine, where all the project artifacts are stored. when a Maven build is executed,
Maven automatically downloads all the dependency jars into the local repository. Usually, this directory is named.

5.logs:In this folder automation.log report is present. 
 
6.reports: In this folder the myreport.html is present which is the report of the project
 
7.src: In this, there are two folders
	-main:It is an empty folder
	-test:It is an empty folder
 
8.target: It this folder generated-sources,generated-test-sources,maven-status and surefir-reports are present.

9.test-output:In this spark report is present. 

10.pom.xml: The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies,
build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, then executes the goal.

11.testng.xml : In this file, xml code is there.

12.testzigwheels.xml :In this file, xml code is there.
 

***************************************************************************************************************************************
 
                                                        OUTPUT ON CONSOLE
 
***************************************************************************************************************************************
 
Scenario: Display upcoming bikes details for Honda with price less than four Lakhs                            # src/test/resources/Features/ZigWheels.feature:3
  Given user is on the zig wheels site                                                                        # com.zigwheels.StepDefinition.EndtoEnd.user_is_on_the_zig_wheels_site()

    Embedding Display upcoming bikes details for Honda with price less than four Lakhs [image/png 849978 bytes]

  When user hover on New bikes                                                                                # com.zigwheels.StepDefinition.EndtoEnd.user_hover_on_new_bikes()

    Embedding Display upcoming bikes details for Honda with price less than four Lakhs [image/png 755677 bytes]

  And click on upcoming bikes                                                                                 # com.zigwheels.StepDefinition.EndtoEnd.click_on_upcoming_bikes()

    Embedding Display upcoming bikes details for Honda with price less than four Lakhs [image/png 737736 bytes]

  And filter upcoming bikes for Honda                                                                         # com.zigwheels.StepDefinition.EndtoEnd.filter_upcoming_bikes_for_honda()

    Embedding Display upcoming bikes details for Honda with price less than four Lakhs [image/png 737908 bytes]

******Upcoming Bikes for Honda Price Less than 4 Lakhs********
Honda CRF300L
Rs. 3.30 Lakh
Launch Date : 30 Mar 2024
Honda Activa Electric
Rs. 1.10 Lakh
Launch Date : Mar 2024
Honda Forza 350
Rs. 3.70 Lakh
Launch Date : Mar 2024
Honda CB350 Cruiser
Rs. 2.30 Lakh
Launch Date : Mar 2024
Honda Activa 7G
Rs. 79,000
Launch Date : Apr 2024
Honda PCX160
Rs. 1.20 Lakh
Launch Date : Jun 2024
Honda CBR150R
Rs. 1.70 Lakh
Launch Date : Unrevealed
Honda Rebel 300
Rs. 2.30 Lakh
Launch Date : Unrevealed
  Then display the bike name, price, and expected launch date for each result with price less than four Lakhs # com.zigwheels.StepDefinition.EndtoEnd.display_the_bike_name_price_and_expected_launch_date_for_each_result_with_price_less_than_four_lakhs()

    Embedding Display upcoming bikes details for Honda with price less than four Lakhs [image/png 253558 bytes]


Scenario: Displaying popular models for used  cars in chennai # src/test/resources/Features/ZigWheels.feature:10
  Given user is on the zigwheels website                      # com.zigwheels.StepDefinition.EndtoEnd.user_is_on_the_zigwheels_website()

    Embedding Displaying popular models for used  cars in chennai [image/png 253007 bytes]

  When user hovers over used cars                             # com.zigwheels.StepDefinition.EndtoEnd.user_hovers_over_used_cars()

    Embedding Displaying popular models for used  cars in chennai [image/png 152733 bytes]

  And click on chennai                                        # com.zigwheels.StepDefinition.EndtoEnd.click_on_chennai()

    Embedding Displaying popular models for used  cars in chennai [image/png 369324 bytes]

Maruti 800
Maruti Swift Dzire
Maruti Swift
Hyundai I10
Hyundai Santro Xing
Honda City
Toyota Innova
Toyota Fortuner
Mahindra XUV500
*************All the cars of clicked popular model************
Maruti 800
....................................
1 .Maruti 800 Maruti 800 AC
Rs. 1.00 Lakh
2 .Maruti 800 Maruti 800 Std
Rs. 70,000
3 .Maruti 800 Maruti 800 AC
Rs. 30,000
4 .Maruti 800 Maruti 800 AC
Rs. 55,000
5 .Maruti 800 Maruti 800 AC
Rs. 80,000
6 .Maruti 800 Maruti 800 AC
Rs. 30,000
7 .Maruti 800 Maruti 800 Std
Rs. 1.40 Lakh
............................
Maruti Swift Dzire
....................................
1 .Maruti Swift Dzire 2015-2017 Maruti Swift Dzire ZXI
Rs. 5.75 Lakh
Nandanam
2 .Maruti Dzire 2017-2020 Maruti Swift Dzire ZXI 1.2
Rs. 6.83 Lakh
Ganapathipuram
3 .Maruti Dzire 2017-2020 Maruti Swift Dzire AMT ZDI
Rs. 7.62 Lakh
Ganapathipuram
4 .Maruti Dzire 2017-2020 Maruti Swift Dzire VXI 1.2
Rs. 5.70 Lakh
Nandanam
5 .Maruti Dzire 2017-2020 Maruti Swift Dzire VXI 1.2
Rs. 6.49 Lakh
Thiruverkadu
6 .Maruti Swift Dzire 2015-2017 Maruti Swift Dzire ZXI
Rs. 5.75 Lakh
Meenambakkam
7 .Maruti Swift Dzire 2015-2017 Maruti Swift Dzire LDI
Rs. 4.20 Lakh
Thiruverkadu
8 .Maruti Dzire 2017-2020 Maruti Swift Dzire AMT VXI
Rs. 6.66 Lakh
Ganapathipuram
9 .Maruti Dzire 2017-2020 Maruti Swift Dzire AMT ZXI Plus
Rs. 6.41 Lakh
Meenambakkam
10 .Maruti Swift Dzire 2011-2014 Maruti Swift Dzire VDI
Rs. 5.50 Lakh
Thiruverkadu
11 .Maruti Dzire 2017-2020 Maruti Swift Dzire VXI 1.2
Rs. 5.70 Lakh
Ganapathipuram
12 .Maruti Dzire 2017-2020 Maruti Swift Dzire AMT ZXI Plus
Rs. 7.16 Lakh
Anna Nagar
13 .Maruti Dzire 2017-2020 Maruti Swift Dzire AMT VXI
Rs. 5.89 Lakh
MEENAMBAKKAM
14 .Maruti Dzire 2017-2020 Maruti Swift Dzire LDI
Rs. 4.80 Lakh
Thiruverkadu
15 .Maruti Swift Dzire 2015-2017 Maruti Swift Dzire ZXI
Rs. 7.50 Lakh
Ganapathipuram
16 .Maruti Swift Dzire 2015-2017 Maruti Swift Dzire ZXI
Rs. 5.75 Lakh
Thiruverkadu
17 .Maruti Dzire 2017-2020 Maruti Swift Dzire AMT ZDI
Rs. 6.74 Lakh
Nungambakkam
18 .Maruti Swift Dzire Maruti Swift Dzire ZXI AT BSVI
Rs. 8.21 Lakh
Kolathur
19 .Maruti Swift Dzire Maruti Swift Dzire VXI AT BSVI
Rs. 7.41 Lakh
Meenambakkam
20 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VDi
Rs. 3.10 Lakh
Nungambakkam
21 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire ZDi
Rs. 3.65 Lakh
Thygaraya Nagar
22 .Maruti Swift Dzire 2015-2017 Maruti Swift Dzire VXI
Rs. 5.25 Lakh
Medavakkam
23 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VXi
Rs. 3.75 Lakh
Medavakkam
24 .Maruti Swift Dzire 2015-2017 Maruti Swift Dzire VXI
Rs. 3.50 Lakh
Thiruverkadu
25 .Maruti Swift Dzire Maruti Swift Dzire VXI BSVI
Rs. 7.10 Lakh
Thiruverkadu
26 .Maruti Dzire 2017-2020 Maruti Swift Dzire AMT ZDI
Rs. 7.50 Lakh
Ambattur
27 .Maruti Dzire 2017-2020 Maruti Swift Dzire VXI 1.2 BS IV
Rs. 5.76 Lakh
Ambattur
28 .Maruti Swift Dzire Maruti Swift Dzire ZXI AT BSVI
Rs. 8.25 Lakh
MEENAMBAKKAM
29 .Maruti Dzire 2017-2020 Maruti Swift Dzire AMT VXI BS IV
Rs. 7.45 Lakh
Porur
30 .Maruti Swift Dzire Maruti Swift Dzire ZXI Plus BSVI
Rs. 8.75 Lakh
Ambattur
31 .Maruti Swift Dzire 2011-2014 Maruti Swift Dzire LDI
Rs. 3.18 Lakh
Kottivakkam
32 .Maruti Swift Dzire Maruti Swift Dzire ZXI AT BSVI
Rs. 7.30 Lakh
Anna Nagar
33 .Maruti Swift Dzire Maruti Swift Dzire ZXI Plus BSVI
Rs. 7.65 Lakh
Anna Nagar
34 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VXi
Rs. 3.55 Lakh
Thiruverkadu
35 .Maruti Swift Dzire 2011-2014 Maruti Swift Dzire VDI
Rs. 5.08 Lakh
Porur
36 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VXi
Rs. 2.97 Lakh
Porur
37 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire LXi
Rs. 4.95 Lakh
MEENAMBAKKAM
38 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VXi
Rs. 3.10 Lakh
Anna Nagar
39 .Maruti Swift Dzire 2015-2017 Maruti Swift Dzire VXI
Rs. 2.45 Lakh
Porur
40 .Maruti Swift Dzire 2015-2017 Maruti Swift Dzire VXi AT
Rs. 5.75 Lakh
41 .Maruti Dzire 2017-2020 Maruti Swift Dzire AMT VXI
Rs. 5.50 Lakh
42 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VXi
Rs. 3.60 Lakh
43 .Maruti Swift Dzire 2015-2017 Maruti Swift Dzire VXI
Rs. 5.80 Lakh
44 .Maruti Swift Dzire 2015-2017 Maruti Swift Dzire ZDI
Rs. 7.00 Lakh
45 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VDi
Rs. 4.24 Lakh
46 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire ZXi
Rs. 6.95 Lakh
47 .Maruti Swift Dzire Maruti Swift Dzire VXI BSVI
Rs. 4.10 Lakh
48 .Maruti Swift Dzire Tour 2012-2018 Maruti Swift Dzire LXI
Rs. 4.10 Lakh
49 .Maruti Swift Dzire 2011-2014 Maruti Swift Dzire VXI
Rs. 4.00 Lakh
50 .Maruti Swift Dzire 2011-2014 Maruti Swift Dzire ZDI
Rs. 5.00 Lakh
51 .Maruti Swift Dzire 2011-2014 Maruti Swift Dzire ZXI
Rs. 7.50 Lakh
52 .Maruti Dzire 2017-2020 Maruti Swift Dzire AMT ZXI Plus
Rs. 6.50 Lakh
53 .Maruti Swift Dzire 2011-2014 Maruti Swift Dzire VXI
Rs. 3.50 Lakh
54 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VDi
Rs. 3.50 Lakh
55 .Maruti Dzire 2017-2020 Maruti Swift Dzire ZXI 1.2 BS IV
Rs. 6.00 Lakh
56 .Maruti Dzire 2017-2020 Maruti Swift Dzire AMT ZXI BS IV
Rs. 7.04 Lakh
57 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VDi
Rs. 3.00 Lakh
58 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VXi
Rs. 2.50 Lakh
59 .Maruti Swift Dzire 2011-2014 Maruti Swift Dzire VDI
Rs. 5.00 Lakh
60 .Maruti Swift Dzire Tour 2012-2018 Maruti Swift Dzire S
Rs. 4.00 Lakh
61 .Maruti Swift Dzire 2011-2014 Maruti Swift Dzire ZDI
Rs. 4.50 Lakh
62 .Maruti Dzire 2017-2020 Maruti Swift Dzire VXI 1.2
Rs. 6.20 Lakh
63 .Maruti Swift Dzire Maruti Swift Dzire VXI BSVI
Rs. 7.00 Lakh
64 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VDi
Rs. 3.50 Lakh
65 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VDi
Rs. 3.50 Lakh
66 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire LXi
Rs. 3.20 Lakh
67 .Maruti Swift Dzire 2015-2017 Maruti Swift Dzire ZXI
Rs. 4.50 Lakh
68 .Maruti Swift Dzire 2015-2017 Maruti Swift Dzire VXI
Rs. 5.00 Lakh
69 .Maruti Swift Dzire Maruti Swift Dzire VXI AT
Rs. 8.25 Lakh
70 .Maruti Swift Dzire 2015-2017 Maruti Swift Dzire VXI
Rs. 4.50 Lakh
71 .Maruti Swift Dzire 2011-2014 Maruti Swift Dzire LDI
Rs. 4.00 Lakh
72 .Maruti Swift Dzire 2011-2014 Maruti Swift Dzire VDI
Rs. 5.00 Lakh
73 .Maruti Swift Dzire Maruti Swift Dzire VXI CNG BSVI
Rs. 7.66 Lakh
74 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire VXi
Rs. 4.00 Lakh
75 .Maruti Swift Dzire 2015-2017 Maruti Swift Dzire LDI
Rs. 3.95 Lakh
76 .Maruti Swift Dzire 2011-2014 Maruti Swift Dzire ZDI
Rs. 5.50 Lakh
77 .Maruti Swift Dzire Maruti Swift Dzire VXI AT BSVI
Rs. 8.00 Lakh
78 .Maruti Swift Dzire 2008-2012 Maruti Swift Dzire 1.2 Lxi BSIV
Rs. 3.50 Lakh
79 .Maruti Swift Dzire 2015-2017 Maruti Swift Dzire VXI Optional
Rs. 5.00 Lakh
80 .Maruti Dzire 2017-2020 Maruti Swift Dzire AMT VDI
Rs. 6.00 Lakh
81 .Maruti Dzire 2017-2020 Maruti Swift Dzire ZDI Plus
Rs. 6.00 Lakh
82 .Maruti Swift Dzire Maruti Swift Dzire VXI AT BSVI
Rs. 7.50 Lakh
83 .Maruti Swift Dzire 2011-2014 Maruti Swift Dzire LXI
Rs. 4.50 Lakh
84 .Maruti Dzire 2017-2020 Maruti Swift Dzire AMT VXI
Rs. 7.00 Lakh
85 .Maruti Swift Dzire 2011-2014 Maruti Swift Dzire VXi AT
Rs. 4.75 Lakh
............................
Maruti Swift
....................................
1 .Maruti Swift 2004-2010 Maruti Swift 1.3 VXi
Rs. 2.80 Lakh
Nungambakkam
2 .Maruti Swift 2014-2021 Maruti Swift ZXI BSIV
Rs. 5.00 Lakh
Meenambakkam
3 .Maruti Swift 2010-2014 Maruti Swift ZXI
Rs. 5.00 Lakh
Meenambakkam
4 .Maruti Swift 2014-2021 Maruti Swift VXI BSIV
Rs. 6.05 Lakh
Anna Nagar
5 .Maruti Swift Maruti Swift VXI
Rs. 7.07 Lakh
Thiruverkadu
6 .Maruti Swift 2014-2021 Maruti Swift DDiS VDI
Rs. 5.95 Lakh
Kottivakkam
7 .Maruti Swift 2014-2021 Maruti Swift VVT ZXI
Rs. 6.10 Lakh
Nandanam
8 .Maruti Swift 2018 Maruti Swift AMT VXI
Rs. 6.50 Lakh
Kottivakkam
9 .Maruti Swift 2014-2021 Maruti Swift ZXI
Rs. 6.95 Lakh
Nungambakkam
10 .Maruti Swift 2010-2014 Maruti Swift LDI
Rs. 3.40 Lakh
Nandanam
11 .Maruti Swift 2014-2021 Maruti Swift VDI BSIV
Rs. 4.99 Lakh
Anna Nagar
12 .Maruti Swift 2010-2014 Maruti Swift VXI
Rs. 7.25 Lakh
Anna Nagar
13 .Maruti Swift 2014-2021 Maruti Swift ZXI
Rs. 6.50 Lakh
Thiruverkadu
14 .Maruti Swift 2014-2021 Maruti Swift VXI Optional
Rs. 4.94 Lakh
Thiruverkadu
15 .Maruti Swift Maruti Swift VXI
Rs. 3.99 Lakh
Thiruverkadu
16 .Maruti Swift Maruti Swift VXI
Rs. 4.37 Lakh
Ganapathipuram
17 .Maruti Swift Maruti Swift VXI
Rs. 4.98 Lakh
Ganapathipuram
18 .Maruti Swift Maruti Swift ZXI Plus DT AMT BSVI
Rs. 7.76 Lakh
Thiruverkadu
19 .Maruti Swift 2014-2021 Maruti Swift VDI BSIV
Rs. 4.51 Lakh
Kottivakkam
20 .Maruti Swift 2014-2021 Maruti Swift AMT VXI
Rs. 6.50 Lakh
Anna Nagar
21 .Maruti Swift 2018 Maruti Swift VXI
Rs. 4.80 Lakh
Porur
22 .Maruti Swift 2010-2014 Maruti Swift VXI
Rs. 4.60 Lakh
Nandanam
23 .Maruti Swift 2014-2021 Maruti Swift LXI Option SP Limited Edition
Rs. 3.25 Lakh
Nandanam
24 .Maruti Swift 2014-2021 Maruti Swift VXI
Rs. 5.30 Lakh
Thiruverkadu
25 .Maruti Swift 2014-2021 Maruti Swift AMT VXI
Rs. 6.40 Lakh
Thiruverkadu
26 .Maruti Swift Maruti Swift VXI
Rs. 4.51 Lakh
Kottivakkam
27 .Maruti Swift Maruti Swift ZXI Plus
Rs. 6.67 Lakh
Nandanam
28 .Maruti Swift 2014-2021 Maruti Swift VVT VXI
Rs. 4.75 Lakh
Thiruverkadu
29 .Maruti Swift 2014-2021 Maruti Swift VVT VXI
Rs. 6.20 Lakh
Thiruverkadu
30 .Maruti Swift Maruti Swift ZXI
Rs. 4.83 Lakh
Thiruverkadu
31 .Maruti Swift Maruti Swift VXI
Rs. 4.57 Lakh
Thiruverkadu
32 .Maruti Swift Maruti Swift VXI
Rs. 4.79 Lakh
Thiruverkadu
33 .Maruti Swift Maruti Swift VXI
Rs. 4.28 Lakh
Thiruverkadu
34 .Maruti Swift Maruti Swift ZXI
Rs. 4.43 Lakh
Meenambakkam
35 .Maruti Swift Maruti Swift VXI
Rs. 4.22 Lakh
Anna Nagar
36 .Maruti Swift 2014-2021 Maruti Swift AMT VXI
Rs. 6.25 Lakh
Thiruverkadu
37 .Maruti Swift 2010-2014 Maruti Swift VXI
Rs. 3.85 Lakh
Thiruverkadu
38 .Maruti Swift Maruti Swift ZXI
Rs. 5.12 Lakh
Ganapathipuram
39 .Maruti Swift Maruti Swift VXI
Rs. 3.84 Lakh
Thiruverkadu
40 .Maruti Swift Maruti Swift VXI
Rs. 6.41 Lakh
Thiruverkadu
41 .Maruti Swift Maruti Swift VXI
Rs. 4.62 Lakh
Chromepet
42 .Maruti Swift Maruti Swift VXI
Rs. 6.75 Lakh
Thiruverkadu
43 .Maruti Swift 2014-2021 Maruti Swift VVT VXI
Rs. 5.95 Lakh
Porur
44 .Maruti Swift Maruti Swift VXI
Rs. 5.18 Lakh
Thygaraya Nagar
45 .Maruti Swift 2010-2014 Maruti Swift VXI
Rs. 4.55 Lakh
Meenambakkam
46 .Maruti Swift 2004-2010 Maruti Swift 1.3 VXi
Rs. 3.95 Lakh
Thiruverkadu
47 .Maruti Swift 2014-2021 Maruti Swift VXI 2018
Rs. 5.60 Lakh
Thygaraya Nagar
48 .Maruti Swift 2010-2014 Maruti Swift VXI
Rs. 3.75 Lakh
Thiruverkadu
49 .Maruti Swift 2014-2021 Maruti Swift VXI Optional
Rs. 5.26 Lakh
Ambattur
50 .Maruti Swift 2014-2021 Maruti Swift VDI BSIV
Rs. 6.25 Lakh
Ganapathipuram
51 .Maruti Swift Maruti Swift VXI
Rs. 4.94 Lakh
MEENAMBAKKAM
52 .Maruti Swift 2014-2021 Maruti Swift VDI BSIV
Rs. 5.95 Lakh
Anna Nagar
53 .Maruti Swift 2014-2021 Maruti Swift VDI BSIV
Rs. 6.00 Lakh
Thiruverkadu
54 .Maruti Swift Maruti Swift VXI BSVI
Rs. 7.00 Lakh
Ambattur
55 .Maruti Swift 2014-2021 Maruti Swift LXI
Rs. 6.15 Lakh
Thiruverkadu
56 .Maruti Swift 2010-2014 Maruti Swift VXI
Rs. 4.60 Lakh
Thiruverkadu
57 .Maruti Swift 2010-2014 Maruti Swift RS VXI
Rs. 4.00 Lakh
Thygaraya Nagar
58 .Maruti Swift 2018 Maruti Swift VXI
Rs. 5.30 Lakh
Anna Nagar
59 .Maruti Swift 2004-2010 Maruti Swift 1.2 VXi BSII
Rs. 1.90 Lakh
MEENAMBAKKAM
60 .Maruti Swift Maruti Swift VXI
Rs. 7.02 Lakh
MEENAMBAKKAM
61 .Maruti Swift 2004-2010 Maruti Swift VXI with ABS
Rs. 2.50 Lakh
Ganapathipuram
62 .Maruti Swift 2010-2014 Maruti Swift LXI
Rs. 4.75 Lakh
Ambattur
63 .Maruti Swift 2010-2014 Maruti Swift VXI
Rs. 4.95 Lakh
Anna Nagar
64 .Maruti Swift 2014-2021 Maruti Swift VXI
Rs. 6.60 Lakh
65 .Maruti Swift 2004-2010 Maruti Swift 1.3 VXI ABS
Rs. 2.50 Lakh
66 .Maruti Swift 2004-2010 Maruti Swift 1.3 VXI ABS
Rs. 2.75 Lakh
67 .Maruti Swift Maruti Swift VXI
Rs. 4.65 Lakh
68 .Maruti Swift 2014-2021 Maruti Swift VDI
Rs. 5.25 Lakh
69 .Maruti Swift 2014-2021 Maruti Swift LXI
Rs. 6.45 Lakh
70 .Maruti Swift Maruti Swift VXI
Rs. 4.24 Lakh
71 .Maruti Swift Maruti Swift ZXI
Rs. 4.79 Lakh
72 .Maruti Swift 2014-2021 Maruti Swift ZXI Plus
Rs. 8.25 Lakh
73 .Maruti Swift 2011-2014 Maruti Swift VXI
Rs. 7.60 Lakh
74 .Maruti Swift 2011-2014 Maruti Swift VXI
Rs. 4.75 Lakh
75 .Maruti Swift 2011-2014 Maruti Swift ZDi
Rs. 4.55 Lakh
76 .Maruti Swift 2014-2021 Maruti Swift VDI Optional
Rs. 6.00 Lakh
77 .Maruti Swift 2004-2010 Maruti Swift 1.2 Ldi BSIII
Rs. 2.35 Lakh
78 .Maruti Swift 2014-2021 Maruti Swift VDI
Rs. 6.75 Lakh
79 .Maruti Swift 2014-2021 Maruti Swift VDI
Rs. 7.00 Lakh
80 .Maruti Swift 2004-2010 Maruti Swift 1.2 VDI BSII
Rs. 2.70 Lakh
81 .Maruti Swift 2010-2014 Maruti Swift VDI
Rs. 3.50 Lakh
82 .Maruti Swift 2010-2014 Maruti Swift ZXI
Rs. 3.25 Lakh
83 .Maruti Swift 2014-2021 Maruti Swift VDI Optional
Rs. 5.20 Lakh
84 .Maruti Swift 2014-2021 Maruti Swift VXI
Rs. 4.50 Lakh
85 .Maruti Swift 2014-2021 Maruti Swift VXI
Rs. 5.70 Lakh
86 .Maruti Swift Maruti Swift VXI
Rs. 7.50 Lakh
87 .Maruti Swift 2010-2014 Maruti Swift RS VDI
Rs. 4.50 Lakh
88 .Maruti Swift 2014-2021 Maruti Swift VXI
Rs. 3.85 Lakh
89 .Maruti Swift 2018 Maruti Swift ZXI Plus
Rs. 6.50 Lakh
90 .Maruti Swift 2010-2014 Maruti Swift ZDi
Rs. 5.50 Lakh
91 .Maruti Swift 2014-2021 Maruti Swift AMT VDI
Rs. 6.00 Lakh
92 .Maruti Swift 2014-2021 Maruti Swift VXI
Rs. 5.80 Lakh
93 .Maruti Swift 2014-2021 Maruti Swift LXI Option
Rs. 4.90 Lakh
94 .Maruti Swift 2004-2010 Maruti Swift 1.2 VDI BSII W ABS
Rs. 1.50 Lakh
95 .Maruti Swift 2014-2021 Maruti Swift VXI Optional
Rs. 5.45 Lakh
96 .Maruti Swift 2004-2010 Maruti Swift VXI BSII
Rs. 3.00 Lakh
97 .Maruti Swift 2014-2021 Maruti Swift VXI
Rs. 5.00 Lakh
98 .Maruti Swift 2010-2014 Maruti Swift RS VXI
Rs. 4.80 Lakh
99 .Maruti Swift 2014-2021 Maruti Swift ZXI
Rs. 6.90 Lakh
100 .Maruti Swift 2004-2010 Maruti Swift 1.2 VDI BSII
Rs. 4.50 Lakh
101 .Maruti Swift 2014-2021 Maruti Swift VDI
Rs. 6.00 Lakh
102 .Maruti Swift 2004-2010 Maruti Swift 1.2 VDI BSII
Rs. 2.00 Lakh
103 .Maruti Swift Maruti Swift LXI BSVI
Rs. 5.50 Lakh
104 .Maruti Swift 2014-2021 Maruti Swift VDI
Rs. 4.50 Lakh
105 .Maruti Swift 2004-2010 Maruti Swift 1.3 VXi
Rs. 3.00 Lakh
106 .Maruti Swift Maruti Swift ZXI BSVI
Rs. 5.40 Lakh
107 .Maruti Swift 2018 Maruti Swift VDI
Rs. 4.50 Lakh
............................
Hyundai I10
....................................
1 .Hyundai i10 Hyundai i10 Magna
Rs. 3.70 Lakh
Chromepet
2 .Hyundai i10 Hyundai i10 Sportz
Rs. 3.11 Lakh
Thiruverkadu
3 .Hyundai i10 Hyundai i10 Magna
Rs. 2.50 Lakh
Ambattur
4 .Hyundai i10 Hyundai i10 Magna 1.1L
Rs. 3.37 Lakh
Thiruverkadu
5 .Hyundai i10 Hyundai i10 Magna
Rs. 2.80 Lakh
Thiruverkadu
6 .Hyundai i10 Hyundai i10 Sportz
Rs. 3.65 Lakh
Kilpauk
7 .Hyundai i10 Hyundai i10 Asta
Rs. 2.70 Lakh
Ambattur
8 .Hyundai i10 Hyundai i10 Sportz 1.1L
Rs. 3.10 Lakh
Nandanam
9 .Hyundai i10 Hyundai i10 Magna
Rs. 2.77 Lakh
Ganapathipuram
10 .Hyundai i10 2007-2010 Hyundai i10 Sportz 1.2 AT
Rs. 2.75 Lakh
Anna Nagar
11 .Hyundai i10 2007-2010 Hyundai i10 Magna 1.2
Rs. 2.60 Lakh
Anna Nagar
12 .Hyundai i10 Hyundai i10 Magna 1.1L
Rs. 3.13 Lakh
Thiruverkadu
13 .Hyundai i10 Hyundai i10 Magna
Rs. 3.20 Lakh
Ambattur
14 .Hyundai i10 2007-2010 Hyundai i10 Asta 1.2
Rs. 2.90 Lakh
MEENAMBAKKAM
15 .Hyundai i10 Hyundai i10 Magna
Rs. 3.10 Lakh
Nungambakkam
16 .Hyundai i10 Hyundai i10 Sportz
Rs. 2.85 Lakh
Anna Nagar
17 .Hyundai i10 Hyundai i10 Asta
Rs. 2.70 Lakh
Meenambakkam
18 .Hyundai i10 Hyundai i10 Magna 1.1L
Rs. 3.03 Lakh
Thiruverkadu
19 .Hyundai i10 Hyundai i10 Magna
Rs. 2.15 Lakh
Nungambakkam
20 .Hyundai i10 Hyundai i10 Magna
Rs. 2.50 Lakh
Kolathur
21 .Hyundai i10 Hyundai i10 Sportz
Rs. 2.90 Lakh
Ambattur
22 .Hyundai i10 2007-2010 Hyundai i10 Sportz 1.2
Rs. 2.35 Lakh
Thygaraya Nagar
23 .Hyundai i10 Hyundai i10 Magna
Rs. 2.75 Lakh
Thygaraya Nagar
24 .Hyundai i10 Hyundai i10 Magna
Rs. 2.88 Lakh
Meenambakkam
25 .Hyundai i10 2007-2010 Hyundai i10 Sportz 1.2
Rs. 2.10 Lakh
Nungambakkam
26 .Hyundai i10 Hyundai i10 Magna
Rs. 1.70 Lakh
Thygaraya Nagar
27 .Hyundai i10 Hyundai i10 Sportz AT
Rs. 3.10 Lakh
Thygaraya Nagar
28 .Hyundai i10 2007-2010 Hyundai i10 Magna AT
Rs. 3.15 Lakh
MEENAMBAKKAM
29 .Hyundai i10 2007-2010 Hyundai i10 Sportz 1.2
Rs. 2.80 Lakh
Thiruverkadu
30 .Hyundai i10 Hyundai i10 Asta
Rs. 2.20 Lakh
MEENAMBAKKAM
31 .Hyundai i10 2007-2010 Hyundai i10 Magna AT
Rs. 2.50 Lakh
MEENAMBAKKAM
32 .Hyundai i10 Hyundai i10 Sportz AT
Rs. 2.75 Lakh
Ambattur
33 .Hyundai i10 2007-2010 Hyundai i10 Magna 1.2
Rs. 2.40 Lakh
34 .Hyundai i10 2007-2010 Hyundai i10 Magna AT
Rs. 2.60 Lakh
35 .Hyundai i10 Hyundai i10 Magna
Rs. 2.80 Lakh
36 .Hyundai i10 2007-2010 Hyundai i10 Sportz 1.2
Rs. 1.65 Lakh
37 .Hyundai i10 Hyundai i10 Era
Rs. 2.40 Lakh
38 .Hyundai i10 Hyundai i10 Era
Rs. 2.40 Lakh
39 .Hyundai i10 2007-2010 Hyundai i10 Magna 1.1
Rs. 3.40 Lakh
40 .Hyundai i10 Hyundai i10 Magna
Rs. 2.71 Lakh
41 .Hyundai i10 Hyundai i10 Magna
Rs. 2.70 Lakh
42 .Hyundai i10 Hyundai i10 Era
Rs. 2.25 Lakh
43 .Hyundai i10 2007-2010 Hyundai i10 Sportz 1.2
Rs. 2.02 Lakh
44 .Hyundai i10 Hyundai i10 Magna
Rs. 2.50 Lakh
45 .Hyundai i10 2007-2010 Hyundai i10 Sportz 1.2
Rs. 2.10 Lakh
46 .Hyundai i10 Hyundai i10 Magna
Rs. 2.50 Lakh
47 .Hyundai i10 Hyundai i10 Era
Rs. 2.00 Lakh
48 .Hyundai i10 Hyundai i10 Sportz
Rs. 3.25 Lakh
49 .Hyundai i10 Hyundai i10 Magna 1.2 iTech SE
Rs. 3.00 Lakh
50 .Hyundai i10 Hyundai i10 Magna 1.1 iTech SE
Rs. 3.50 Lakh
51 .Hyundai i10 Hyundai i10 Sportz
Rs. 2.10 Lakh
52 .Hyundai i10 Hyundai i10 Era
Rs. 2.00 Lakh
53 .Hyundai i10 Hyundai i10 Magna
Rs. 2.50 Lakh
54 .Hyundai i10 2007-2010 Hyundai i10 Sportz 1.2
Rs. 2.30 Lakh
55 .Hyundai i10 2007-2010 Hyundai i10 Magna 1.1
Rs. 1.80 Lakh
56 .Hyundai i10 2007-2010 Hyundai i10 Magna 1.1
Rs. 1.80 Lakh
57 .Hyundai i10 Hyundai i10 Magna
Rs. 2.50 Lakh
58 .Hyundai i10 Hyundai i10 Magna
Rs. 2.80 Lakh
59 .Hyundai i10 Hyundai i10 Magna
Rs. 3.00 Lakh
60 .Hyundai i10 Hyundai i10 Magna 1.1L
Rs. 3.00 Lakh
61 .Hyundai i10 Hyundai i10 Sportz 1.1L
Rs. 2.70 Lakh
62 .Hyundai i10 Hyundai i10 Magna
Rs. 3.20 Lakh
63 .Hyundai i10 Hyundai i10 Sportz 1.1L
Rs. 5.00 Lakh
64 .Hyundai i10 Hyundai i10 Magna
Rs. 2.15 Lakh
65 .Hyundai i10 2007-2010 Hyundai i10 Magna 1.1
Rs. 1.00 Lakh
66 .Hyundai i10 Hyundai i10 Magna
Rs. 2.90 Lakh
67 .Hyundai i10 Hyundai i10 Magna
Rs. 3.00 Lakh
68 .Hyundai i10 Hyundai i10 Magna
Rs. 2.40 Lakh
69 .Hyundai i10 Hyundai i10 Sportz 1.1L LPG
Rs. 2.50 Lakh
70 .Hyundai i10 Hyundai i10 Magna
Rs. 2.40 Lakh
71 .Hyundai i10 Hyundai i10 Magna
Rs. 2.43 Lakh
72 .Hyundai i10 2007-2010 Hyundai i10 Magna 1.2
Rs. 1.80 Lakh
73 .Hyundai i10 2007-2010 Hyundai i10 Magna 1.1
Rs. 2.00 Lakh
............................
Hyundai Santro Xing
....................................
1 .Hyundai Santro Xing Hyundai Santro Xing GL Plus
Rs. 2.50 Lakh
Anna Nagar
2 .Hyundai Santro Xing Hyundai Santro Xing XL
Rs. 1.10 Lakh
MEENAMBAKKAM
3 .Hyundai Santro Xing Hyundai Santro Xing XL
Rs. 1.50 Lakh
4 .Hyundai Santro Xing Hyundai Santro Xing XO eRLX Euro II
Rs. 1.85 Lakh
5 .Hyundai Santro Xing Hyundai Santro Xing XL
Rs. 1.20 Lakh
6 .Hyundai Santro Xing Hyundai Santro Xing XO
Rs. 1.30 Lakh
7 .Hyundai Santro Xing Hyundai Santro Xing GLS
Rs. 2.00 Lakh
8 .Hyundai Santro Xing Hyundai Santro Xing GL
Rs. 3.00 Lakh
9 .Hyundai Santro Xing Hyundai Santro Xing XG eRLX Euro II
Rs. 1.30 Lakh
10 .Hyundai Santro Xing Hyundai Santro Xing GL
Rs. 1.00 Lakh
11 .Hyundai Santro Xing Hyundai Santro Xing XL
Rs. 60,000
12 .Hyundai Santro Xing Hyundai Santro Xing GLS LPG
Rs. 75,000
13 .Hyundai Santro Xing Hyundai Santro Xing XL
Rs. 50,000
............................
Honda City
....................................
1 .Honda City 2015-2017 Honda City i VTEC CVT SV
Rs. 5.25 Lakh
Meenambakkam
2 .Honda City 4th Generation Honda City i-VTEC CVT ZX
Rs. 14.40 Lakh
Nungambakkam
3 .Honda City 2014-2015 Honda City i VTEC CVT SV
Rs. 5.25 Lakh
Meenambakkam
4 .Honda City 2015-2017 Honda City i VTEC SV
Rs. 5.65 Lakh
Anna Nagar West Extension
5 .Honda City 2015-2017 Honda City i VTEC V
Rs. 8.10 Lakh
Thiruverkadu
6 .Honda City 2015-2017 Honda City i VTEC VX
Rs. 6.85 Lakh
Nandanam
7 .Honda City 2015-2017 Honda City i VTEC VX Option BL
Rs. 6.95 Lakh
Kilpauk
8 .Honda City 2015-2017 Honda City i VTEC CVT VX
Rs. 7.18 Lakh
Thiruverkadu
9 .Honda City 2014-2015 Honda City i DTEC V
Rs. 6.19 Lakh
Thiruverkadu
10 .Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Rs. 6.00 Lakh
Anna Nagar
11 .Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Rs. 5.55 Lakh
Anna Nagar
12 .Honda City 2014-2015 Honda City i VTEC CVT VX
Rs. 7.50 Lakh
Nungambakkam
13 .Honda City 4th Generation Honda City VX MT
Rs. 6.00 Lakh
Anna Nagar
14 .Honda City 2014-2015 Honda City i VTEC CVT SV
Rs. 5.73 Lakh
Thiruverkadu
15 .Honda City 2015-2017 Honda City i VTEC V
Rs. 7.81 Lakh
Thiruverkadu
16 .Honda City 4th Generation Honda City i-VTEC VX
Rs. 10.25 Lakh
Anna Nagar
17 .Honda City 2014-2015 Honda City i VTEC CVT SV
Rs. 5.71 Lakh
Thiruverkadu
18 .Honda City 2015-2017 Honda City i VTEC V
Rs. 5.78 Lakh
Ganapathipuram
19 .Honda City 2015-2017 Honda City i VTEC V
Rs. 5.59 Lakh
Thiruverkadu
20 .Honda City 2014-2015 Honda City i VTEC V
Rs. 7.10 Lakh
Ambattur
21 .Honda City 2011-2013 Honda City V MT
Rs. 4.73 Lakh
Thiruverkadu
22 .Honda City 2015-2017 Honda City i VTEC V
Rs. 7.29 Lakh
Thiruverkadu
23 .Honda City 2020-2023 Honda City ZX MT
Rs. 12.94 Lakh
Ganapathipuram
24 .Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Rs. 5.80 Lakh
Anna Nagar
25 .Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Rs. 6.90 Lakh
Anna Nagar
26 .Honda City 2015-2017 Honda City i VTEC VX
Rs. 6.80 Lakh
Nungambakkam
27 .Honda City 2020-2023 Honda City ZX CVT
Rs. 12.08 Lakh
Thiruverkadu
28 .Honda City 2014-2015 Honda City i VTEC CVT SV
Rs. 6.35 Lakh
Nandanam
29 .Honda City 2014-2015 Honda City i VTEC CVT SV
Rs. 6.35 Lakh
Kottivakkam
30 .Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Rs. 8.50 Lakh
Anna Nagar
31 .Honda City 2015-2017 Honda City i VTEC V
Rs. 6.90 Lakh
Meenambakkam
32 .Honda City 4th Generation Honda City i-VTEC CVT ZX
Rs. 7.69 Lakh
Ganapathipuram
33 .Honda City 2014-2015 Honda City i VTEC CVT SV
Rs. 7.00 Lakh
Anna Nagar
34 .Honda City 4th Generation Honda City i-VTEC ZX
Rs. 12.90 Lakh
Medavakkam
35 .Honda City 2015-2017 Honda City i VTEC CVT VX
Rs. 8.26 Lakh
Ganapathipuram
36 .Honda City 2015-2017 Honda City i VTEC V
Rs. 6.60 Lakh
Thiruverkadu
37 .Honda City 2020-2023 Honda City ZX MT
Rs. 11.81 Lakh
Thiruverkadu
38 .Honda City 4th Generation Honda City i-VTEC CVT ZX
Rs. 10.75 Lakh
Ganapathipuram
39 .Honda City 2014-2015 Honda City i VTEC VX
Rs. 5.95 Lakh
Kottivakkam
40 .Honda City 2008-2011 Honda City 1.5 S MT
Rs. 6.10 Lakh
Anna Nagar
41 .Honda City 4th Generation Honda City SV MT
Rs. 7.72 Lakh
Anna Nagar
42 .Honda City 2015-2017 Honda City i VTEC SV
Rs. 5.23 Lakh
Ganapathipuram
43 .Honda City 2015-2017 Honda City i VTEC CVT VX
Rs. 6.50 Lakh
MEENAMBAKKAM
44 .Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Rs. 6.90 Lakh
Thiruverkadu
45 .Honda City 4th Generation Honda City V MT
Rs. 9.40 Lakh
Chromepet
46 .Honda City 2011-2013 Honda City V AT
Rs. 4.75 Lakh
Thiruverkadu
47 .Honda City 2015-2017 Honda City i VTEC V
Rs. 7.43 Lakh
Ganapathipuram
48 .Honda City 4th Generation Honda City i-VTEC CVT ZX
Rs. 10.88 Lakh
Thiruverkadu
49 .Honda City 2014-2015 Honda City i VTEC CVT SV
Rs. 5.69 Lakh
Ganapathipuram
50 .Honda City 2014-2015 Honda City i VTEC CVT VX
Rs. 6.46 Lakh
Thiruverkadu
51 .Honda City 2008-2011 Honda City 1.5 V MT
Rs. 4.07 Lakh
Thiruverkadu
52 .Honda City 2015-2017 Honda City i VTEC V
Rs. 5.51 Lakh
Thiruverkadu
53 .Honda City 2020-2023 Honda City V MT
Rs. 8.85 Lakh
Thiruverkadu
54 .Honda City 2015-2017 Honda City i VTEC SV
Rs. 5.51 Lakh
Ganapathipuram
55 .Honda City 2015-2017 Honda City i VTEC S
Rs. 5.41 Lakh
Thiruverkadu
56 .Honda City 4th Generation Honda City ZX CVT
Rs. 10.88 Lakh
Ganapathipuram
57 .Honda City 2015-2017 Honda City i VTEC V
Rs. 6.75 Lakh
Thiruverkadu
58 .Honda City 4th Generation Honda City i-DTEC ZX
Rs. 8.17 Lakh
Thiruverkadu
59 .Honda City 2014-2015 Honda City i VTEC V
Rs. 6.21 Lakh
Thiruverkadu
60 .Honda City 2020-2023 Honda City VX MT
Rs. 9.82 Lakh
Nungambakkam
61 .Honda City 4th Generation Honda City i-VTEC CVT ZX
Rs. 13.60 Lakh
Kolathur
62 .Honda City 4th Generation Honda City SV MT
Rs. 7.80 Lakh
Chromepet
63 .Honda City 2015-2017 Honda City i VTEC V
Rs. 6.80 Lakh
Meenambakkam
64 .Honda City 2014-2015 Honda City i VTEC VX
Rs. 5.60 Lakh
Meenambakkam
65 .Honda City 2014-2015 Honda City i VTEC V
Rs. 5.90 Lakh
Ganapathipuram
66 .Honda City 2015-2017 Honda City i VTEC CVT VX
Rs. 7.36 Lakh
Kottivakkam
67 .Honda City 4th Generation Honda City i-VTEC V
Rs. 6.96 Lakh
Kottivakkam
68 .Honda City 2014-2015 Honda City i VTEC VX
Rs. 5.60 Lakh
Kottivakkam
69 .Honda City 2014-2015 Honda City i DTEC V
Rs. 5.90 Lakh
Thygaraya Nagar
70 .Honda City 4th Generation Honda City Anniversary i-VTEC CVT ZX
Rs. 11.00 Lakh
Ganapathipuram
71 .Honda City 2020-2023 Honda City ZX CVT
Rs. 13.25 Lakh
Ganapathipuram
72 .Honda City 2014-2015 Honda City i VTEC SV
Rs. 5.30 Lakh
Meenambakkam
73 .Honda City 2000-2003 Honda City 1.5 EXI S
Rs. 2.50 Lakh
Thiruverkadu
74 .Honda City 2015-2017 Honda City i VTEC V
Rs. 6.31 Lakh
Nandanam
75 .Honda City 2003-2005 Honda City 1.5 GXI
Rs. 1.30 Lakh
Thygaraya Nagar
76 .Honda City 2014-2015 Honda City i VTEC SV
Rs. 5.90 Lakh
Thygaraya Nagar
77 .Honda City 2014-2015 Honda City V AT
Rs. 3.96 Lakh
Anna Nagar West Extension
78 .Honda City 2015-2017 Honda City i DTec VX
Rs. 8.75 Lakh
Kottivakkam
79 .Honda City 4th Generation Honda City ZX MT
Rs. 12.30 Lakh
Meenambakkam
80 .Honda City 4th Generation Honda City Anniversary i-VTEC CVT ZX
Rs. 9.80 Lakh
Ambattur
81 .Honda City 2014-2015 Honda City i VTEC E
Rs. 6.05 Lakh
Anna Nagar
82 .Honda City 2020-2023 Honda City V MT
Rs. 10.00 Lakh
Anna Nagar
83 .Honda City 2015-2017 Honda City i DTec SV
Rs. 7.60 Lakh
Ganapathipuram
84 .Honda City 2015-2017 Honda City i VTEC E
Rs. 4.80 Lakh
MEENAMBAKKAM
85 .Honda City Honda City V CVT
Rs. 11.75 Lakh
Anna Nagar
86 .Honda City 4th Generation Honda City VX MT
Rs. 9.90 Lakh
Medavakkam
87 .Honda City 2008-2011 Honda City 1.5 V MT
Rs. 3.70 Lakh
Anna Nagar
88 .Honda City 4th Generation Honda City VX MT
Rs. 8.70 Lakh
Anna Nagar
89 .Honda City 2015-2017 Honda City i VTEC CVT SV
Rs. 5.99 Lakh
Anna Nagar
90 .Honda City 2014-2015 Honda City i VTEC SV
Rs. 5.90 Lakh
Anna Nagar
91 .Honda City 2020-2023 Honda City V CVT
Rs. 12.00 Lakh
MEENAMBAKKAM
92 .Honda City 2014-2015 Honda City i VTEC SV
Rs. 5.90 Lakh
Porur
93 .Honda City 2014-2015 Honda City i VTEC CVT VX
Rs. 7.35 Lakh
Porur
94 .Honda City 2015-2017 Honda City i VTEC V
Rs. 7.00 Lakh
Porur
95 .Honda City 4th Generation Honda City SV MT
Rs. 5.20 Lakh
Anna Nagar
96 .Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Rs. 5.60 Lakh
Porur
97 .Honda City 2015-2017 Honda City i VTEC VX
Rs. 7.34 Lakh
Anna Nagar
98 .Honda City 4th Generation Honda City VX MT
Rs. 5.70 Lakh
Chromepet
99 .Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Rs. 9.80 Lakh
Ambattur
100 .Honda City 4th Generation Honda City i-VTEC VX
Rs. 8.30 Lakh
101 .Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Rs. 9.00 Lakh
102 .Honda City 2015-2017 Honda City i VTEC CVT SV
Rs. 5.65 Lakh
103 .Honda City 2014-2015 Honda City i VTEC CVT SV
Rs. 7.00 Lakh
104 .Honda City 2014-2015 Honda City i VTEC CVT VX
Rs. 6.80 Lakh
105 .Honda City 4th Generation Honda City SV MT
Rs. 5.30 Lakh
106 .Honda City 4th Generation Honda City VX MT
Rs. 8.00 Lakh
107 .Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Rs. 7.50 Lakh
108 .Honda City 4th Generation Honda City ZX MT
Rs. 9.75 Lakh
109 .Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Rs. 5.70 Lakh
110 .Honda City 2008-2011 Honda City 1.5 V MT Exclusive
Rs. 4.55 Lakh
111 .Honda City 4th Generation Honda City SV MT
Rs. 7.55 Lakh
112 .Honda City 2015-2017 Honda City i VTEC CVT VX
Rs. 7.00 Lakh
113 .Honda City 2014-2015 Honda City i VTEC S
Rs. 5.50 Lakh
114 .Honda City 2014-2015 Honda City i VTEC CVT VX
Rs. 7.00 Lakh
115 .Honda City 4th Generation Honda City i-VTEC CVT V
Rs. 10.00 Lakh
116 .Honda City 4th Generation Honda City i-VTEC V
Rs. 7.55 Lakh
117 .Honda City 2008-2011 Honda City 1.5 S MT
Rs. 3.00 Lakh
118 .Honda City 2008-2011 Honda City 1.5 S MT
Rs. 4.00 Lakh
119 .Honda City 2014-2015 Honda City i VTEC CVT VX
Rs. 6.00 Lakh
120 .Honda City 2011-2013 Honda City S
Rs. 2.76 Lakh
121 .Honda City 2014-2015 Honda City i VTEC CVT VX
Rs. 6.83 Lakh
122 .Honda City 2014-2015 Honda City i DTEC SV
Rs. 5.00 Lakh
123 .Honda City 2014-2015 Honda City i VTEC CVT SV
Rs. 6.50 Lakh
124 .Honda City 2011-2013 Honda City 1.5 S AT
Rs. 4.15 Lakh
125 .Honda City 2015-2017 Honda City i VTEC V
Rs. 6.60 Lakh
126 .Honda City ZX 2005-2008 Honda City EXi
Rs. 1.50 Lakh
127 .Honda City 2014-2015 Honda City i VTEC V
Rs. 5.90 Lakh
128 .Honda City 2020-2023 Honda City ZX MT
Rs. 9.00 Lakh
............................
Toyota Innova
....................................
1 .Toyota Innova 2004-2011 Toyota Innova 2.5 G4 Diesel 8-seater
Rs. 4.65 Lakh
Kolathur
2 .Toyota Innova 2004-2011 Toyota Innova 2.5 V Diesel 7-seater
Rs. 5.40 Lakh
Kottivakkam
3 .Toyota Innova 2012-2013 Toyota Innova 2.5 G (Diesel) 7 Seater
Rs. 8.25 Lakh
4 .Toyota Innova Toyota Innova 2.5 G (Diesel) 7 Seater
Rs. 11.75 Lakh
5 .Toyota Innova Toyota Innova 2.5 VX (Diesel) 7 Seater BS IV
Rs. 12.69 Lakh
6 .Toyota Innova 2009-2012 Toyota Innova 2.5 VX 7 STR
Rs. 11.15 Lakh
7 .Toyota Innova 2004-2011 Toyota Innova 2.5 G (Diesel) 8 Seater BS III
Rs. 8.50 Lakh
8 .Toyota Innova 2012-2013 Toyota Innova 2.5 G (Diesel) 8 Seater BS IV
Rs. 12.00 Lakh
9 .Toyota Innova 2012-2013 Toyota Innova 2.5 G (Diesel) 8 Seater BS IV
Rs. 12.00 Lakh
10 .Toyota Innova 2004-2011 Toyota Innova 2.5 G4 Diesel 8-seater
Rs. 7.00 Lakh
11 .Toyota Innova Toyota Innova 2.5 G (Diesel) 8 Seater
Rs. 15.00 Lakh
12 .Toyota Innova 2012-2013 Toyota Innova 2.5 G (Diesel) 8 Seater
Rs. 7.50 Lakh
13 .Toyota Innova Toyota Innova 2.5 VX (Diesel) 8 Seater BS IV
Rs. 15.00 Lakh
14 .Toyota Innova 2004-2011 Toyota Innova 2.5 E
Rs. 6.99 Lakh
15 .Toyota Innova 2004-2011 Toyota Innova 2.5 G4 Diesel 8-seater
Rs. 6.50 Lakh
............................
Toyota Fortuner
....................................
1 .Toyota Fortuner 2011-2016 Toyota Fortuner 4x4 MT
Rs. 15.75 Lakh
Nungambakkam
2 .Toyota Fortuner 2016-2021 Toyota Fortuner TRD 4X4 AT
Rs. 31.90 Lakh
Nungambakkam
3 .Toyota Fortuner 2016-2021 Toyota Fortuner 2.8 4WD AT
Rs. 31.00 Lakh
Kottivakkam
4 .Toyota Fortuner 2011-2016 Toyota Fortuner 4x2 AT TRD Sportivo
Rs. 29.49 Lakh
Porur
5 .Toyota Fortuner 2009-2011 Toyota Fortuner 3.0 Diesel
Rs. 10.75 Lakh
Nungambakkam
6 .Toyota Fortuner Toyota Fortuner 4X4 Diesel
Rs. 38.00 Lakh
Thygaraya Nagar
7 .Toyota Fortuner Toyota Fortuner 4X2 Diesel BSVI
Rs. 37.00 Lakh
8 .Toyota Fortuner Toyota Fortuner 4X2 Diesel AT
Rs. 41.00 Lakh
............................
Mahindra XUV500
....................................
1 .Mahindra XUV500 Mahindra XUV500 AT W6 2WD
Rs. 14.00 Lakh
Nungambakkam
2 .Mahindra XUV500 Mahindra XUV500 AT W9 2WD
Rs. 13.85 Lakh
Anna Nagar
3 .Mahindra XUV500 Mahindra XUV500 W9 1.99
Rs. 17.50 Lakh
Ashoknagar
4 .Mahindra XUV500 Mahindra XUV500 W7
Rs. 12.29 Lakh
Ganapathipuram
5 .Mahindra XUV500 2011-2015 Mahindra XUV500 W6 2WD
Rs. 6.80 Lakh
Ganapathipuram
6 .Mahindra XUV500 Mahindra XUV500 W11 Option AT BSIV
Rs. 15.45 Lakh
Porur
7 .Mahindra XUV500 2011-2015 Mahindra XUV500 W6 2WD
Rs. 5.65 Lakh
Thiruverkadu
8 .Mahindra XUV500 2011-2015 Mahindra XUV500 W4
Rs. 8.75 Lakh
Thygaraya Nagar
9 .Mahindra XUV500 Mahindra XUV500 W4
Rs. 6.30 Lakh
Thygaraya Nagar
10 .Mahindra XUV500 2011-2015 Mahindra XUV500 W6 2WD
Rs. 7.95 Lakh
11 .Mahindra XUV500 2011-2015 Mahindra XUV500 W8 2WD
Rs. 8.50 Lakh
12 .Mahindra XUV500 Mahindra XUV500 W9
Rs. 16.35 Lakh
13 .Mahindra XUV500 Mahindra XUV500 W4 1.99 mHawk
Rs. 5.75 Lakh
14 .Mahindra XUV500 Mahindra XUV500 W7 AT
Rs. 14.50 Lakh
15 .Mahindra XUV500 Mahindra XUV500 AT W6 2WD
Rs. 14.50 Lakh
16 .Mahindra XUV500 Mahindra XUV500 W6 2WD
Rs. 9.50 Lakh
17 .Mahindra XUV500 Mahindra XUV500 W11 Option BSIV
Rs. 18.00 Lakh
18 .Mahindra XUV500 Mahindra XUV500 W10 AWD
Rs. 9.50 Lakh
19 .Mahindra XUV500 2011-2015 Mahindra XUV500 W8 FWD
Rs. 8.00 Lakh
20 .Mahindra XUV500 Mahindra XUV500 W6 2WD
Rs. 9.50 Lakh
21 .Mahindra XUV500 Mahindra XUV500 W5 BSIV
Rs. 11.00 Lakh
............................
  Then display all the popular models in a list               # com.zigwheels.StepDefinition.EndtoEnd.display_all_the_popular_models_in_a_list()

    Embedding Displaying popular models for used  cars in chennai [image/png 385420 bytes]


Scenario: Account Validation with invalid Username    # src/test/resources/Features/ZigWheels.feature:16
  Given the user is on the  zig wheels page           # com.zigwheels.StepDefinition.EndtoEnd.the_user_is_on_the_zig_wheels_page()

    Embedding Account Validation with invalid Username [image/png 1098783 bytes]

  When user clicks on Signin/Register button          # com.zigwheels.StepDefinition.EndtoEnd.user_clicks_on_signin_register_button()

    Embedding Account Validation with invalid Username [image/png 582820 bytes]

  And login with invalid email account details        # com.zigwheels.StepDefinition.EndtoEnd.login_with_invalid_email_account_details()

    Embedding Account Validation with invalid Username [image/png 57502 bytes]

*************Error Message***********
Couldn’t find your Google Account
  Then display the error message for invalid username # com.zigwheels.StepDefinition.EndtoEnd.display_the_error_message_for_invalid_username()

    Embedding Account Validation with invalid Username [image/png 1038593 bytes]

  And Navigating back to homepage                     # com.zigwheels.StepDefinition.EndtoEnd.navigating_back_to_homepage()

    Embedding Account Validation with invalid Username [image/png 1099591 bytes]

┌──────────────────────────────────────────────────────────────────────────┐
│ View your Cucumber Report at:                                            │
│ https://reports.cucumber.io/reports/b15b02b3-166f-49e1-9267-95956dce1a53 │
│                                                                          │
│ This report will self-destruct in 24h.                                   │
│ Keep reports forever: https://reports.cucumber.io/profile                │
└──────────────────────────────────────────────────────────────────────────┘PASSED: io.cucumber.testng.AbstractTestNGCucumberTests.runScenario("Account Validation with invalid Username", "Zig Wheels")
        Runs Cucumber Scenarios
PASSED: io.cucumber.testng.AbstractTestNGCucumberTests.runScenario("Display upcoming bikes details for Honda with price less than four Lakhs", "Zig Wheels")
        Runs Cucumber Scenarios
PASSED: io.cucumber.testng.AbstractTestNGCucumberTests.runScenario("Displaying popular models for used  cars in chennai", "Zig Wheels")
        Runs Cucumber Scenarios

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 3, Passes: 3, Failures: 0, Skips: 0
===============================================


