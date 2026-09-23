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

public class FunctionType_isSubtype_21010021581714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2331993;
     Object term2332645;
     Object term2334001;
     Object term2334006;

    public FunctionType_isSubtype_21010021581714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2334016 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2334015 = ((Class) term2334016).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2334015).setAccessible(true);
        Object enum4360 = ((Field) term2334015).get((Object) null);
        Class<? extends Object> term2334316 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2334315 = ((Class) term2334316).getDeclaredField((String) "INTERFACE");
        ((Field) term2334315).setAccessible(true);
        Object enum4361 = ((Field) term2334315).get((Object) null);
        term2331993 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2332537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2331993, term2331993.getClass(), "kind", enum4360);
        setField(term2332537, term2332537.getClass(), "kind", enum4361);
        setField(term2331993, term2331993.getClass(), "typeOfThis", term2332537);
        Class<? extends Object> term2334610 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2334609 = ((Class) term2334610).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2334609).setAccessible(true);
        Object enum4362 = ((Field) term2334609).get((Object) null);
        term2332645 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2332975 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2332645, term2332645.getClass(), "kind", enum4360);
        setField(term2332975, term2332975.getClass(), "kind", enum4362);
        setField(term2332645, term2332645.getClass(), "typeOfThis", term2332975);
        Class<? extends Object> term2334910 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2334909 = ((Class) term2334910).getDeclaredField((String) "INTERFACE");
        ((Field) term2334909).setAccessible(true);
        Object enum4363 = ((Field) term2334909).get((Object) null);
        term2334001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2334005 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2334001, term2334001.getClass(), "this$0", null);
        setField(term2334001, term2334001.getClass(), "call", null);
        setField(term2334001, term2334001.getClass(), "prototype", null);
        setField(term2334001, term2334001.getClass(), "kind", enum4363);
        setField(term2334005, term2334005.getClass(), "call", null);
        setField(term2334005, term2334005.getClass(), "prototype", null);
        setField(term2334005, term2334005.getClass(), "kind", enum4363);
        setField(term2334005, term2334005.getClass(), "typeOfThis", null);
        setField(term2334005, term2334005.getClass(), "source", null);
        setField(term2334005, term2334005.getClass(), "implementedInterfaces", null);
        setField(term2334005, term2334005.getClass(), "subTypes", null);
        setField(term2334005, term2334005.getClass(), "templateTypeName", null);
        setField(term2334005, term2334005.getClass(), "className", null);
        setField(term2334005, term2334005.getClass(), "properties", null);
        setField(term2334005, term2334005.getClass(), "implicitPrototype", null);
        setBooleanField(term2334005, term2334005.getClass(), "nativeType", false);
        setBooleanField(term2334005, term2334005.getClass(), "visited", false);
        setField(term2334005, term2334005.getClass(), "docInfo", null);
        setBooleanField(term2334005, term2334005.getClass(), "unknown", false);
        setBooleanField(term2334005, term2334005.getClass(), "resolved", false);
        setField(term2334005, term2334005.getClass(), "resolveResult", null);
        setField(term2334005, term2334005.getClass(), "registry", null);
        setField(term2334001, term2334001.getClass(), "typeOfThis", term2334005);
        setField(term2334001, term2334001.getClass(), "source", null);
        setField(term2334001, term2334001.getClass(), "implementedInterfaces", null);
        setField(term2334001, term2334001.getClass(), "subTypes", null);
        setField(term2334001, term2334001.getClass(), "templateTypeName", null);
        setField(term2334001, term2334001.getClass(), "className", null);
        setField(term2334001, term2334001.getClass(), "properties", null);
        setField(term2334001, term2334001.getClass(), "implicitPrototype", null);
        setBooleanField(term2334001, term2334001.getClass(), "nativeType", false);
        setBooleanField(term2334001, term2334001.getClass(), "visited", false);
        setField(term2334001, term2334001.getClass(), "docInfo", null);
        setBooleanField(term2334001, term2334001.getClass(), "unknown", false);
        setBooleanField(term2334001, term2334001.getClass(), "resolved", false);
        setField(term2334001, term2334001.getClass(), "resolveResult", null);
        setField(term2334001, term2334001.getClass(), "registry", null);
        Class<? extends Object> term2335204 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2335203 = ((Class) term2335204).getDeclaredField((String) "INTERFACE");
        ((Field) term2335203).setAccessible(true);
        Object enum4364 = ((Field) term2335203).get((Object) null);
        Class<? extends Object> term2335498 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2335497 = ((Class) term2335498).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2335497).setAccessible(true);
        Object enum4365 = ((Field) term2335497).get((Object) null);
        term2334006 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2334010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2334006, term2334006.getClass(), "this$0", null);
        setField(term2334006, term2334006.getClass(), "call", null);
        setField(term2334006, term2334006.getClass(), "prototype", null);
        setField(term2334006, term2334006.getClass(), "kind", enum4364);
        setField(term2334010, term2334010.getClass(), "this$0", null);
        setField(term2334010, term2334010.getClass(), "call", null);
        setField(term2334010, term2334010.getClass(), "prototype", null);
        setField(term2334010, term2334010.getClass(), "kind", enum4365);
        setField(term2334010, term2334010.getClass(), "typeOfThis", null);
        setField(term2334010, term2334010.getClass(), "source", null);
        setField(term2334010, term2334010.getClass(), "implementedInterfaces", null);
        setField(term2334010, term2334010.getClass(), "subTypes", null);
        setField(term2334010, term2334010.getClass(), "templateTypeName", null);
        setField(term2334010, term2334010.getClass(), "className", null);
        setField(term2334010, term2334010.getClass(), "properties", null);
        setField(term2334010, term2334010.getClass(), "implicitPrototype", null);
        setBooleanField(term2334010, term2334010.getClass(), "nativeType", false);
        setBooleanField(term2334010, term2334010.getClass(), "visited", false);
        setField(term2334010, term2334010.getClass(), "docInfo", null);
        setBooleanField(term2334010, term2334010.getClass(), "unknown", false);
        setBooleanField(term2334010, term2334010.getClass(), "resolved", false);
        setField(term2334010, term2334010.getClass(), "resolveResult", null);
        setField(term2334010, term2334010.getClass(), "registry", null);
        setField(term2334006, term2334006.getClass(), "typeOfThis", term2334010);
        setField(term2334006, term2334006.getClass(), "source", null);
        setField(term2334006, term2334006.getClass(), "implementedInterfaces", null);
        setField(term2334006, term2334006.getClass(), "subTypes", null);
        setField(term2334006, term2334006.getClass(), "templateTypeName", null);
        setField(term2334006, term2334006.getClass(), "className", null);
        setField(term2334006, term2334006.getClass(), "properties", null);
        setField(term2334006, term2334006.getClass(), "implicitPrototype", null);
        setBooleanField(term2334006, term2334006.getClass(), "nativeType", false);
        setBooleanField(term2334006, term2334006.getClass(), "visited", false);
        setField(term2334006, term2334006.getClass(), "docInfo", null);
        setBooleanField(term2334006, term2334006.getClass(), "unknown", false);
        setBooleanField(term2334006, term2334006.getClass(), "resolved", false);
        setField(term2334006, term2334006.getClass(), "resolveResult", null);
        setField(term2334006, term2334006.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2332645;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2331993, args);
        assertTrue(recursiveEquals(term2331993, term2334001));
        assertTrue(recursiveEquals(term2332645, term2334006));
        assertTrue(recursiveEquals(retValue, true));
    }

};


