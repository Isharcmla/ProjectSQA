package com.google.javascript.rhino.jstype;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class FunctionType_isSubtype_2101002158685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term620357;
     Object term621017;
     Object term621914;
     Object term621922;

    public FunctionType_isSubtype_2101002158685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term621929 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term621928 = ((Class) term621929).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term621928).setAccessible(true);
        Object enum1154 = ((Field) term621928).get((Object) null);
        Class<? extends Object> term622229 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term622228 = ((Class) term622229).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term622228).setAccessible(true);
        Object enum1155 = ((Field) term622228).get((Object) null);
        term620357 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term620909 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term620357, term620357.getClass(), "kind", enum1154);
        setField(term620909, term620909.getClass(), "kind", enum1155);
        setField(term620357, term620357.getClass(), "typeOfThis", term620909);
        term621017 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term621199 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term621017, term621017.getClass(), "kind", enum1155);
        setField(term621199, term621199.getClass(), "kind", enum1155);
        setField(term621017, term621017.getClass(), "typeOfThis", term621199);
        Class<? extends Object> term622529 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term622528 = ((Class) term622529).getDeclaredField((String) "INTERFACE");
        ((Field) term622528).setAccessible(true);
        Object enum1156 = ((Field) term622528).get((Object) null);
        Class<? extends Object> term622823 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term622822 = ((Class) term622823).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term622822).setAccessible(true);
        Object enum1157 = ((Field) term622822).get((Object) null);
        term621914 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term621918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term621914, term621914.getClass(), "call", null);
        setField(term621914, term621914.getClass(), "prototype", null);
        setField(term621914, term621914.getClass(), "kind", enum1156);
        setField(term621918, term621918.getClass(), "this$0", null);
        setField(term621918, term621918.getClass(), "call", null);
        setField(term621918, term621918.getClass(), "prototype", null);
        setField(term621918, term621918.getClass(), "kind", enum1157);
        setField(term621918, term621918.getClass(), "typeOfThis", null);
        setField(term621918, term621918.getClass(), "source", null);
        setField(term621918, term621918.getClass(), "implementedInterfaces", null);
        setField(term621918, term621918.getClass(), "subTypes", null);
        setField(term621918, term621918.getClass(), "templateTypeName", null);
        setField(term621918, term621918.getClass(), "className", null);
        setField(term621918, term621918.getClass(), "properties", null);
        setField(term621918, term621918.getClass(), "implicitPrototype", null);
        setBooleanField(term621918, term621918.getClass(), "nativeType", false);
        setBooleanField(term621918, term621918.getClass(), "visited", false);
        setField(term621918, term621918.getClass(), "docInfo", null);
        setBooleanField(term621918, term621918.getClass(), "unknown", false);
        setBooleanField(term621918, term621918.getClass(), "resolved", false);
        setField(term621918, term621918.getClass(), "resolveResult", null);
        setField(term621918, term621918.getClass(), "registry", null);
        setField(term621914, term621914.getClass(), "typeOfThis", term621918);
        setField(term621914, term621914.getClass(), "source", null);
        setField(term621914, term621914.getClass(), "implementedInterfaces", null);
        setField(term621914, term621914.getClass(), "subTypes", null);
        setField(term621914, term621914.getClass(), "templateTypeName", null);
        setField(term621914, term621914.getClass(), "className", null);
        setField(term621914, term621914.getClass(), "properties", null);
        setField(term621914, term621914.getClass(), "implicitPrototype", null);
        setBooleanField(term621914, term621914.getClass(), "nativeType", false);
        setBooleanField(term621914, term621914.getClass(), "visited", false);
        setField(term621914, term621914.getClass(), "docInfo", null);
        setBooleanField(term621914, term621914.getClass(), "unknown", false);
        setBooleanField(term621914, term621914.getClass(), "resolved", false);
        setField(term621914, term621914.getClass(), "resolveResult", null);
        setField(term621914, term621914.getClass(), "registry", null);
        Class<? extends Object> term623123 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term623122 = ((Class) term623123).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term623122).setAccessible(true);
        Object enum1158 = ((Field) term623122).get((Object) null);
        term621922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term621926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term621922, term621922.getClass(), "this$0", null);
        setField(term621922, term621922.getClass(), "call", null);
        setField(term621922, term621922.getClass(), "prototype", null);
        setField(term621922, term621922.getClass(), "kind", enum1158);
        setField(term621926, term621926.getClass(), "this$0", null);
        setField(term621926, term621926.getClass(), "call", null);
        setField(term621926, term621926.getClass(), "prototype", null);
        setField(term621926, term621926.getClass(), "kind", enum1158);
        setField(term621926, term621926.getClass(), "typeOfThis", null);
        setField(term621926, term621926.getClass(), "source", null);
        setField(term621926, term621926.getClass(), "implementedInterfaces", null);
        setField(term621926, term621926.getClass(), "subTypes", null);
        setField(term621926, term621926.getClass(), "templateTypeName", null);
        setField(term621926, term621926.getClass(), "className", null);
        setField(term621926, term621926.getClass(), "properties", null);
        setField(term621926, term621926.getClass(), "implicitPrototype", null);
        setBooleanField(term621926, term621926.getClass(), "nativeType", false);
        setBooleanField(term621926, term621926.getClass(), "visited", false);
        setField(term621926, term621926.getClass(), "docInfo", null);
        setBooleanField(term621926, term621926.getClass(), "unknown", false);
        setBooleanField(term621926, term621926.getClass(), "resolved", false);
        setField(term621926, term621926.getClass(), "resolveResult", null);
        setField(term621926, term621926.getClass(), "registry", null);
        setField(term621922, term621922.getClass(), "typeOfThis", term621926);
        setField(term621922, term621922.getClass(), "source", null);
        setField(term621922, term621922.getClass(), "implementedInterfaces", null);
        setField(term621922, term621922.getClass(), "subTypes", null);
        setField(term621922, term621922.getClass(), "templateTypeName", null);
        setField(term621922, term621922.getClass(), "className", null);
        setField(term621922, term621922.getClass(), "properties", null);
        setField(term621922, term621922.getClass(), "implicitPrototype", null);
        setBooleanField(term621922, term621922.getClass(), "nativeType", false);
        setBooleanField(term621922, term621922.getClass(), "visited", false);
        setField(term621922, term621922.getClass(), "docInfo", null);
        setBooleanField(term621922, term621922.getClass(), "unknown", false);
        setBooleanField(term621922, term621922.getClass(), "resolved", false);
        setField(term621922, term621922.getClass(), "resolveResult", null);
        setField(term621922, term621922.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term621017;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term620357, args);
        assertTrue(recursiveEquals(term620357, term621914));
        assertTrue(recursiveEquals(term621017, term621922));
        assertTrue(recursiveEquals(retValue, false));
    }

};


