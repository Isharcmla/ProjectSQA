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

public class FunctionType_getInstanceType_1940487563131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69298;
     Object term69774;

    public FunctionType_getInstanceType_1940487563131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69779 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term69778 = ((Class) term69779).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term69778).setAccessible(true);
        Object enum171 = ((Field) term69778).get((Object) null);
        term69298 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term69298, term69298.getClass(), "kind", enum171);
        Class<? extends Object> term70079 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term70078 = ((Class) term70079).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term70078).setAccessible(true);
        Object enum172 = ((Field) term70078).get((Object) null);
        term69774 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term69774, term69774.getClass(), "call", null);
        setField(term69774, term69774.getClass(), "prototype", null);
        setField(term69774, term69774.getClass(), "kind", enum172);
        setField(term69774, term69774.getClass(), "typeOfThis", null);
        setField(term69774, term69774.getClass(), "source", null);
        setField(term69774, term69774.getClass(), "implementedInterfaces", null);
        setField(term69774, term69774.getClass(), "subTypes", null);
        setField(term69774, term69774.getClass(), "templateTypeName", null);
        setField(term69774, term69774.getClass(), "className", null);
        setField(term69774, term69774.getClass(), "properties", null);
        setField(term69774, term69774.getClass(), "implicitPrototype", null);
        setBooleanField(term69774, term69774.getClass(), "nativeType", false);
        setBooleanField(term69774, term69774.getClass(), "prettyPrint", false);
        setBooleanField(term69774, term69774.getClass(), "visited", false);
        setField(term69774, term69774.getClass(), "docInfo", null);
        setBooleanField(term69774, term69774.getClass(), "unknown", false);
        setBooleanField(term69774, term69774.getClass(), "resolved", false);
        setField(term69774, term69774.getClass(), "resolveResult", null);
        setField(term69774, term69774.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getInstanceType", argTypes, term69298, args);
        assertTrue(recursiveEquals(term69298, term69774));
        assertTrue(recursiveEquals(retValue, null));
    }

};


