This is the HL7 Demo for Quest Diagnostics.  It relies on three or four components, 
maybe five, depending on how you count.

IIB 10 + Healthcare Pack for HL7 DFDL transform capabilities
ODM 8.8.1
IBM BPM 8.6.7 CF
MQ 9 supports the IIB flows and helps with dev and debugging.

There is a file folder containing sample data for HL7 ORM and ORU records.  
When IIB is configured properly you can drop files into these folders
and IIB will pick them up and process them, passing the package to BPM.

You can also use something like RHUtil to drop individual data files into 
queues managed by MQ, these will behave the same as file drops.


-- what follows is boilerplate from hub.jazz.net --

We have created an empty license.txt file for you. Well, actually, it says,
"<Replace this text with the license you've chosen for your project.>" We 
recommend you edit this and include text for license terms under which you're
making your code available. A good resource for open source licenses is the 
[Open Source Initiative](http://opensource.org/).

Be sure to update your project's profile with a short description and 
eye-catching graphic.

Finally, consider defining some sprints and work items in Track & Plan to give 
interested developers a sense of your cadence and upcoming enhancements.
