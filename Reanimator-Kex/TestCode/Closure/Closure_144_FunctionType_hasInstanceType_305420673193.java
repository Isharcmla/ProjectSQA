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

public class FunctionType_hasInstanceType_305420673193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97353;
     Object term98735;

    public FunctionType_hasInstanceType_305420673193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term98741 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term98740 = ((Class) term98741).getDeclaredField((String) "ORDINARY");
        ((Field) term98740).setAccessible(true);
        Object enum210 = ((Field) term98740).get((Object) null);
        term97353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term97353, term97353.getClass(), "kind", enum210);
        Class<? extends Object> term99032 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term99031 = ((Class) term99032).getDeclaredField((String) "ORDINARY");
        ((Field) term99031).setAccessible(true);
        Object enum211 = ((Field) term99031).get((Object) null);
        term98735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term98735, term98735.getClass(), "call", null);
        setField(term98735, term98735.getClass(), "prototype", null);
        setField(term98735, term98735.getClass(), "kind", enum211);
        setField(term98735, term98735.getClass(), "typeOfThis", null);
        setField(term98735, term98735.getClass(), "source", null);
        setField(term98735, term98735.getClass(), "implementedInterfaces", null);
        setField(term98735, term98735.getClass(), "subTypes", null);
        setField(term98735, term98735.getClass(), "templateTypeName", null);
        setField(term98735, term98735.getClass(), "className", null);
        setField(term98735, term98735.getClass(), "properties", null);
        setField(term98735, term98735.getClass(), "implicitPrototype", null);
        setBooleanField(term98735, term98735.getClass(), "nativeType", false);
        setBooleanField(term98735, term98735.getClass(), "prettyPrint", false);
        setBooleanField(term98735, term98735.getClass(), "visited", false);
        setField(term98735, term98735.getClass(), "docInfo", null);
        setBooleanField(term98735, term98735.getClass(), "unknown", false);
        setBooleanField(term98735, term98735.getClass(), "resolved", false);
        setField(term98735, term98735.getClass(), "resolveResult", null);
        setField(term98735, term98735.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasInstanceType", argTypes, term97353, args);
        assertTrue(recursiveEquals(term97353, term98735));
        assertTrue(recursiveEquals(retValue, false));
    }

};


