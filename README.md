# ISSTracker

![alt text](/images/ISS-tracker.JPG "ISS")

The ISSTracker is my very first Spring boot project.

It tracks the location of the International Space Station (ISS) by connecting to [Open Notify](http://open-notify.org/) using the RestTemplate. The latitude and longitude are then used to plot the location of the ISS with some help from the [OpenMaps API](https://www.openstreetmap.org/).

The location is updated to the map every 5 seconds and leaves a neat trail of the path the ISS has travelled:

![alt text](/images/map.JPG "Map")
