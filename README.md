# Poker
The "cards" directory contains the backend code,</br>
whereas the "front" directory contains the frontend code.</br>

Once you cloned the repository, open a terminal window in the "cards" directory,</br>
and run the following command line (requires maven):</br>

`mvn clean install`

The application is to be run on an application server,</br>
in my case it was an Apache Tomcat embedded in my Eclipse IDE.</br>

Once the application is Running, simply open the "front" folder and open the "index.html"</br>
file on a web browser, and **Voilà!**</br>

That application is simply about clicking on the "Cliquez ici pour une main de dix cartes"</br>
that randomly picks 10 poker cards, firstly shows them unsorted in the "MAIN NON TRIEE" section,</br>
and then shows them sorted in the "MAIN TRIEE" section.
