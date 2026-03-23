# TritechGemini

PAMGuard Plugin to interract with Tritech SeaTec UDP data and datafiles. 

Legacy: now replaced by the [https://github.com/douggillespie/TritechAcquisitionPlugin](https://github.com/douggillespie/TritechAcquisitionPlugin) which is better in 1000001 ways. 

this was written prior to a deploymnet using the now out of date Tritech SeaTec software which we were going to use to acquire sonar data and would send UDP detection messages to PAMGuard. The system wasn't stable and by the time our system was deployed Tritech had replaced SeaTec with thier newer Genesis software. I would delete this, apart from there are a couple of image transformations in here that I might need to copy across to the other plugin at some point !

During real time data collection it receives UDP messages and adds status info and targets to the databse
Offline it can display targets and also read and display ECD file data (soon to be updated to also work with GLF files)
