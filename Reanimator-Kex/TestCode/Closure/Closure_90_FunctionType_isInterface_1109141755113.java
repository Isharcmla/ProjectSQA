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

public class FunctionType_isInterface_1109141755113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63132;
     Object term63596;

    public FunctionType_isInterface_1109141755113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63602 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term63601 = ((Class) term63602).getDeclaredField((String) "INTERFACE");
        ((Field) term63601).setAccessible(true);
        Object enum159 = ((Field) term63601).get((Object) null);
        term63132 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term63132, term63132.getClass(), "kind", enum159);
        Class<? extends Object> term63896 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term63895 = ((Class) term63896).getDeclaredField((String) "INTERFACE");
        ((Field) term63895).setAccessible(true);
        Object enum160 = ((Field) term63895).get((Object) null);
        term63596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term63596, term63596.getClass(), "call", null);
        setField(term63596, term63596.getClass(), "prototype", null);
        setField(term63596, term63596.getClass(), "kind", enum160);
        setField(term63596, term63596.getClass(), "typeOfThis", null);
        setField(term63596, term63596.getClass(), "source", null);
        setField(term63596, term63596.getClass(), "implementedInterfaces", null);
        setField(term63596, term63596.getClass(), "subTypes", null);
        setField(term63596, term63596.getClass(), "templateTypeName", null);
        setField(term63596, term63596.getClass(), "className", null);
        setField(term63596, term63596.getClass(), "properties", null);
        setBooleanField(term63596, term63596.getClass(), "nativeType", false);
        setField(term63596, term63596.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term63596, term63596.getClass(), "prettyPrint", false);
        setBooleanField(term63596, term63596.getClass(), "visited", false);
        setField(term63596, term63596.getClass(), "docInfo", null);
        setBooleanField(term63596, term63596.getClass(), "unknown", false);
        setBooleanField(term63596, term63596.getClass(), "resolved", false);
        setField(term63596, term63596.getClass(), "resolveResult", null);
        setField(term63596, term63596.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInterface", argTypes, term63132, args);
        assertTrue(recursiveEquals(term63132, term63596));
        assertTrue(recursiveEquals(retValue, true));
    }

};


