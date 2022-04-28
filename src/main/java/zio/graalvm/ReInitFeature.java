package zio.graalvm;

import org.graalvm.nativeimage.ImageSingletons;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.impl.RuntimeClassInitializationSupport;

public class ReInitFeature implements Feature {

 @Override
 public void afterRegistration(AfterRegistrationAccess access) {
     RuntimeClassInitializationSupport rci = ImageSingletons.lookup(RuntimeClassInitializationSupport.class);
     rci.initializeAtBuildTime("zio.Random", "Needs to be optimized");
     rci.rerunInitialization("zio.Random", "Contains Random instance");
 }

}
