#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_iamkatrechko_drafts_ndk_MainActivity_getStringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
