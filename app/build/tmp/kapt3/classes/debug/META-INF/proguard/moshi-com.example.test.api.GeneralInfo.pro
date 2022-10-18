-if class com.example.test.api.GeneralInfo
-keepnames class com.example.test.api.GeneralInfo
-if class com.example.test.api.GeneralInfo
-keep class com.example.test.api.GeneralInfoJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.example.test.api.GeneralInfo
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.example.test.api.GeneralInfo
-keepclassmembers class com.example.test.api.GeneralInfo {
    public synthetic <init>(java.util.List,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
