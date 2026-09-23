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

public class FunctionType_isConstructor_1260630010115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62201;
     Object term63551;

    public FunctionType_isConstructor_1260630010115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63557 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term63556 = ((Class) term63557).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term63556).setAccessible(true);
        Object enum159 = ((Field) term63556).get((Object) null);
        term62201 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term62201, term62201.getClass(), "kind", enum159);
        Class<? extends Object> term63857 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term63856 = ((Class) term63857).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term63856).setAccessible(true);
        Object enum160 = ((Field) term63856).get((Object) null);
        term63551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term63551, term63551.getClass(), "call", null);
        setField(term63551, term63551.getClass(), "prototype", null);
        setField(term63551, term63551.getClass(), "kind", enum160);
        setField(term63551, term63551.getClass(), "typeOfThis", null);
        setField(term63551, term63551.getClass(), "source", null);
        setField(term63551, term63551.getClass(), "implementedInterfaces", null);
        setField(term63551, term63551.getClass(), "subTypes", null);
        setField(term63551, term63551.getClass(), "templateTypeName", null);
        setField(term63551, term63551.getClass(), "className", null);
        setField(term63551, term63551.getClass(), "properties", null);
        setBooleanField(term63551, term63551.getClass(), "nativeType", false);
        setField(term63551, term63551.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term63551, term63551.getClass(), "prettyPrint", false);
        setBooleanField(term63551, term63551.getClass(), "visited", false);
        setField(term63551, term63551.getClass(), "docInfo", null);
        setBooleanField(term63551, term63551.getClass(), "unknown", false);
        setBooleanField(term63551, term63551.getClass(), "resolved", false);
        setField(term63551, term63551.getClass(), "resolveResult", null);
        setField(term63551, term63551.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isConstructor", argTypes, term62201, args);
        assertTrue(recursiveEquals(term62201, term63551));
        assertTrue(recursiveEquals(retValue, true));
    }

};


