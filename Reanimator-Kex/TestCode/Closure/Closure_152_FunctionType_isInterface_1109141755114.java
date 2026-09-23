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

public class FunctionType_isInterface_1109141755114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61591;
     Object term62935;

    public FunctionType_isInterface_1109141755114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62941 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term62940 = ((Class) term62941).getDeclaredField((String) "INTERFACE");
        ((Field) term62940).setAccessible(true);
        Object enum157 = ((Field) term62940).get((Object) null);
        term61591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term61591, term61591.getClass(), "kind", enum157);
        Class<? extends Object> term63235 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term63234 = ((Class) term63235).getDeclaredField((String) "INTERFACE");
        ((Field) term63234).setAccessible(true);
        Object enum158 = ((Field) term63234).get((Object) null);
        term62935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term62935, term62935.getClass(), "call", null);
        setField(term62935, term62935.getClass(), "prototype", null);
        setField(term62935, term62935.getClass(), "kind", enum158);
        setField(term62935, term62935.getClass(), "typeOfThis", null);
        setField(term62935, term62935.getClass(), "source", null);
        setField(term62935, term62935.getClass(), "implementedInterfaces", null);
        setField(term62935, term62935.getClass(), "subTypes", null);
        setField(term62935, term62935.getClass(), "templateTypeName", null);
        setField(term62935, term62935.getClass(), "className", null);
        setField(term62935, term62935.getClass(), "properties", null);
        setBooleanField(term62935, term62935.getClass(), "nativeType", false);
        setField(term62935, term62935.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term62935, term62935.getClass(), "prettyPrint", false);
        setBooleanField(term62935, term62935.getClass(), "visited", false);
        setField(term62935, term62935.getClass(), "docInfo", null);
        setBooleanField(term62935, term62935.getClass(), "unknown", false);
        setBooleanField(term62935, term62935.getClass(), "resolved", false);
        setField(term62935, term62935.getClass(), "resolveResult", null);
        setField(term62935, term62935.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInterface", argTypes, term61591, args);
        assertTrue(recursiveEquals(term61591, term62935));
        assertTrue(recursiveEquals(retValue, true));
    }

};


