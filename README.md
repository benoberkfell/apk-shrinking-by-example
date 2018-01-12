# apk-shrinking-by-example
Demo app for APK Shrinking By Example, my Windy City DevFest talk

## The Presentation

[Check out the slide deck](https://github.com/benoberkfell/apk-shrinking-by-example/blob/master/ShrinkingYourAPK.pdf) as delivered at Windy City DevFest 2018

## What's inside

* A cat picture app with free and paid flavors, one flavor gets only one cat picture while the other gets two.

We shrink the APK by employing numerous strategies of increasing difficulty and commitment:

1. Remove altogether unused resources by examining the lint report
2. Convert resources to WebP, a smaller format
3. Employ Proguard to reduce code
4. Turn on `shrinkResources` to shrink out unused resources in the free version
5. Tune our `AndroidManifest.xml` so our unused resources actually get shrunk out
6. Turn on APK splits by density to generate density-specific packages for the Play Store.
