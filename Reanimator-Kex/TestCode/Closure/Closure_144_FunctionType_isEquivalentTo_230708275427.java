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

public class FunctionType_isEquivalentTo_230708275427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337536;
     Object term337794;
     Object term338133;
     Object term338137;

    public FunctionType_isEquivalentTo_230708275427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term338140 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term338139 = ((Class) term338140).getDeclaredField((String) "INTERFACE");
        ((Field) term338139).setAccessible(true);
        Object enum614 = ((Field) term338139).get((Object) null);
        term337536 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term337536, term337536.getClass(), "kind", enum614);
        term337794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term338434 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term338433 = ((Class) term338434).getDeclaredField((String) "INTERFACE");
        ((Field) term338433).setAccessible(true);
        Object enum615 = ((Field) term338433).get((Object) null);
        term338133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term338133, term338133.getClass(), "call", null);
        setField(term338133, term338133.getClass(), "prototype", null);
        setField(term338133, term338133.getClass(), "kind", enum615);
        setField(term338133, term338133.getClass(), "typeOfThis", null);
        setField(term338133, term338133.getClass(), "source", null);
        setField(term338133, term338133.getClass(), "implementedInterfaces", null);
        setField(term338133, term338133.getClass(), "subTypes", null);
        setField(term338133, term338133.getClass(), "templateTypeName", null);
        setField(term338133, term338133.getClass(), "className", null);
        setField(term338133, term338133.getClass(), "properties", null);
        setField(term338133, term338133.getClass(), "implicitPrototype", null);
        setBooleanField(term338133, term338133.getClass(), "nativeType", false);
        setBooleanField(term338133, term338133.getClass(), "prettyPrint", false);
        setBooleanField(term338133, term338133.getClass(), "visited", false);
        setField(term338133, term338133.getClass(), "docInfo", null);
        setBooleanField(term338133, term338133.getClass(), "unknown", false);
        setBooleanField(term338133, term338133.getClass(), "resolved", false);
        setField(term338133, term338133.getClass(), "resolveResult", null);
        setField(term338133, term338133.getClass(), "registry", null);
        term338137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term338137, term338137.getClass(), "call", null);
        setField(term338137, term338137.getClass(), "prototype", null);
        setField(term338137, term338137.getClass(), "kind", null);
        setField(term338137, term338137.getClass(), "typeOfThis", null);
        setField(term338137, term338137.getClass(), "source", null);
        setField(term338137, term338137.getClass(), "implementedInterfaces", null);
        setField(term338137, term338137.getClass(), "subTypes", null);
        setField(term338137, term338137.getClass(), "templateTypeName", null);
        setField(term338137, term338137.getClass(), "className", null);
        setField(term338137, term338137.getClass(), "properties", null);
        setField(term338137, term338137.getClass(), "implicitPrototype", null);
        setBooleanField(term338137, term338137.getClass(), "nativeType", false);
        setBooleanField(term338137, term338137.getClass(), "prettyPrint", false);
        setBooleanField(term338137, term338137.getClass(), "visited", false);
        setField(term338137, term338137.getClass(), "docInfo", null);
        setBooleanField(term338137, term338137.getClass(), "unknown", false);
        setBooleanField(term338137, term338137.getClass(), "resolved", false);
        setField(term338137, term338137.getClass(), "resolveResult", null);
        setField(term338137, term338137.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term337794;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term337536, args);
        assertTrue(recursiveEquals(term337536, term338133));
        assertTrue(recursiveEquals(term337794, term338137));
        assertTrue(recursiveEquals(retValue, false));
    }

};


