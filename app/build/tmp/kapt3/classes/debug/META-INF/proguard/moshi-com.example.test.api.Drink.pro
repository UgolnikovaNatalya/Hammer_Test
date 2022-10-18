-if class com.example.test.api.Drink
-keepnames class com.example.test.api.Drink
-if class com.example.test.api.Drink
-keep class com.example.test.api.DrinkJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.example.test.api.Drink
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.example.test.api.Drink
-keepclassmembers class com.example.test.api.Drink {
    public synthetic <init>(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
