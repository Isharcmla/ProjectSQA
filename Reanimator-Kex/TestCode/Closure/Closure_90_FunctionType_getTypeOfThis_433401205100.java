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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_getTypeOfThis_433401205100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17819;

    public FunctionType_getTypeOfThis_433401205100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53893 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term53892 = ((Class) term53893).getDeclaredField((String) "INTERFACE");
        ((Field) term53892).setAccessible(true);
        Object enum135 = ((Field) term53892).get((Object) null);
        term17819 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term17820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term17821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17834 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term17838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17844 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term17850 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term17821, term17821.getClass(), "type", -516303035);
        setIntField(term17823, term17823.getClass(), "type", -27944011);
        setIntField(term17825, term17825.getClass(), "type", 0);
        setField(term17825, term17825.getClass(), "next", null);
        setField(term17825, term17825.getClass(), "first", null);
        setField(term17825, term17825.getClass(), "last", null);
        setField(term17825, term17825.getClass(), "propListHead", null);
        setIntField(term17825, term17825.getClass(), "sourcePosition", 0);
        setField(term17825, term17825.getClass(), "jsType", null);
        setField(term17825, term17825.getClass(), "parent", null);
        setField(term17823, term17823.getClass(), "next", term17825);
        setIntField(term17828, term17828.getClass(), "type", 0);
        setField(term17828, term17828.getClass(), "next", null);
        setField(term17828, term17828.getClass(), "first", null);
        setField(term17828, term17828.getClass(), "last", null);
        setField(term17828, term17828.getClass(), "propListHead", null);
        setIntField(term17828, term17828.getClass(), "sourcePosition", 0);
        setField(term17828, term17828.getClass(), "jsType", null);
        setField(term17828, term17828.getClass(), "parent", null);
        setField(term17823, term17823.getClass(), "first", term17828);
        setIntField(term17831, term17831.getClass(), "type", 0);
        setField(term17831, term17831.getClass(), "next", null);
        setField(term17831, term17831.getClass(), "first", null);
        setField(term17831, term17831.getClass(), "last", null);
        setField(term17831, term17831.getClass(), "propListHead", null);
        setIntField(term17831, term17831.getClass(), "sourcePosition", 0);
        setField(term17831, term17831.getClass(), "jsType", null);
        setField(term17831, term17831.getClass(), "parent", null);
        setField(term17823, term17823.getClass(), "last", term17831);
        setField(term17834, term17834.getClass(), "next", null);
        setIntField(term17834, term17834.getClass(), "type", 0);
        setIntField(term17834, term17834.getClass(), "intValue", 0);
        setField(term17834, term17834.getClass(), "objectValue", null);
        setField(term17823, term17823.getClass(), "propListHead", term17834);
        setIntField(term17823, term17823.getClass(), "sourcePosition", -20614472);
        setField(term17823, term17823.getClass(), "jsType", null);
        setField(term17823, term17823.getClass(), "parent", null);
        setField(term17821, term17821.getClass(), "next", term17823);
        setIntField(term17838, term17838.getClass(), "type", 0);
        setField(term17838, term17838.getClass(), "next", null);
        setField(term17838, term17838.getClass(), "first", null);
        setField(term17838, term17838.getClass(), "last", null);
        setField(term17838, term17838.getClass(), "propListHead", null);
        setIntField(term17838, term17838.getClass(), "sourcePosition", 0);
        setField(term17838, term17838.getClass(), "jsType", null);
        setField(term17838, term17838.getClass(), "parent", null);
        setField(term17821, term17821.getClass(), "first", term17838);
        setIntField(term17841, term17841.getClass(), "type", 0);
        setField(term17841, term17841.getClass(), "next", null);
        setField(term17841, term17841.getClass(), "first", null);
        setField(term17841, term17841.getClass(), "last", null);
        setField(term17841, term17841.getClass(), "propListHead", null);
        setIntField(term17841, term17841.getClass(), "sourcePosition", 0);
        setField(term17841, term17841.getClass(), "jsType", null);
        setField(term17841, term17841.getClass(), "parent", null);
        setField(term17821, term17821.getClass(), "last", term17841);
        setField(term17844, term17844.getClass(), "next", null);
        setIntField(term17844, term17844.getClass(), "type", 0);
        setIntField(term17844, term17844.getClass(), "intValue", 0);
        setField(term17844, term17844.getClass(), "objectValue", null);
        setField(term17821, term17821.getClass(), "propListHead", term17844);
        setIntField(term17821, term17821.getClass(), "sourcePosition", 1126618861);
        setField(term17821, term17821.getClass(), "jsType", null);
        setField(term17821, term17821.getClass(), "parent", null);
        setField(term17820, term17820.getClass(), "parameters", term17821);
        setField(term17820, term17820.getClass(), "returnType", null);
        setBooleanField(term17820, term17820.getClass(), "returnTypeInferred", false);
        setBooleanField(term17820, term17820.getClass(), "resolved", false);
        setField(term17820, term17820.getClass(), "resolveResult", null);
        setField(term17820, term17820.getClass(), "registry", null);
        setField(term17819, term17819.getClass(), "call", term17820);
        setField(term17850, term17850.getClass(), "ownerFunction", null);
        setField(term17850, term17850.getClass(), "className", null);
        setField(term17850, term17850.getClass(), "properties", null);
        setBooleanField(term17850, term17850.getClass(), "nativeType", false);
        setField(term17850, term17850.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term17850, term17850.getClass(), "prettyPrint", false);
        setBooleanField(term17850, term17850.getClass(), "visited", false);
        setField(term17850, term17850.getClass(), "docInfo", null);
        setBooleanField(term17850, term17850.getClass(), "unknown", false);
        setBooleanField(term17850, term17850.getClass(), "resolved", false);
        setField(term17850, term17850.getClass(), "resolveResult", null);
        setField(term17850, term17850.getClass(), "registry", null);
        setField(term17819, term17819.getClass(), "prototype", term17850);
        setField(term17819, term17819.getClass(), "kind", enum135);
        setField(term17819, term17819.getClass(), "typeOfThis", null);
        setField(term17819, term17819.getClass(), "source", null);
        setField(term17819, term17819.getClass(), "implementedInterfaces", null);
        setField(term17819, term17819.getClass(), "subTypes", null);
        setField(term17819, term17819.getClass(), "templateTypeName", null);
        setField(term17819, term17819.getClass(), "className", null);
        setField(term17819, term17819.getClass(), "properties", null);
        setBooleanField(term17819, term17819.getClass(), "nativeType", false);
        setField(term17819, term17819.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term17819, term17819.getClass(), "prettyPrint", false);
        setBooleanField(term17819, term17819.getClass(), "visited", false);
        setField(term17819, term17819.getClass(), "docInfo", null);
        setBooleanField(term17819, term17819.getClass(), "unknown", false);
        setBooleanField(term17819, term17819.getClass(), "resolved", false);
        setField(term17819, term17819.getClass(), "resolveResult", null);
        setField(term17819, term17819.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getTypeOfThis", argTypes, term17819, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


