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

public class FunctionType_isEquivalentTo_230708275281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169771;
     Object term170029;
     Object term170373;
     Object term170377;

    public FunctionType_isEquivalentTo_230708275281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term170380 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term170379 = ((Class) term170380).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term170379).setAccessible(true);
        Object enum313 = ((Field) term170379).get((Object) null);
        term169771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term169771, term169771.getClass(), "kind", enum313);
        term170029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term170680 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term170679 = ((Class) term170680).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term170679).setAccessible(true);
        Object enum314 = ((Field) term170679).get((Object) null);
        term170373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term170373, term170373.getClass(), "call", null);
        setField(term170373, term170373.getClass(), "prototype", null);
        setField(term170373, term170373.getClass(), "kind", enum314);
        setField(term170373, term170373.getClass(), "typeOfThis", null);
        setField(term170373, term170373.getClass(), "source", null);
        setField(term170373, term170373.getClass(), "implementedInterfaces", null);
        setField(term170373, term170373.getClass(), "subTypes", null);
        setField(term170373, term170373.getClass(), "templateTypeName", null);
        setField(term170373, term170373.getClass(), "className", null);
        setField(term170373, term170373.getClass(), "properties", null);
        setBooleanField(term170373, term170373.getClass(), "nativeType", false);
        setField(term170373, term170373.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term170373, term170373.getClass(), "prettyPrint", false);
        setBooleanField(term170373, term170373.getClass(), "visited", false);
        setField(term170373, term170373.getClass(), "docInfo", null);
        setBooleanField(term170373, term170373.getClass(), "unknown", false);
        setBooleanField(term170373, term170373.getClass(), "resolved", false);
        setField(term170373, term170373.getClass(), "resolveResult", null);
        setField(term170373, term170373.getClass(), "registry", null);
        term170377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term170377, term170377.getClass(), "call", null);
        setField(term170377, term170377.getClass(), "prototype", null);
        setField(term170377, term170377.getClass(), "kind", null);
        setField(term170377, term170377.getClass(), "typeOfThis", null);
        setField(term170377, term170377.getClass(), "source", null);
        setField(term170377, term170377.getClass(), "implementedInterfaces", null);
        setField(term170377, term170377.getClass(), "subTypes", null);
        setField(term170377, term170377.getClass(), "templateTypeName", null);
        setField(term170377, term170377.getClass(), "className", null);
        setField(term170377, term170377.getClass(), "properties", null);
        setBooleanField(term170377, term170377.getClass(), "nativeType", false);
        setField(term170377, term170377.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term170377, term170377.getClass(), "prettyPrint", false);
        setBooleanField(term170377, term170377.getClass(), "visited", false);
        setField(term170377, term170377.getClass(), "docInfo", null);
        setBooleanField(term170377, term170377.getClass(), "unknown", false);
        setBooleanField(term170377, term170377.getClass(), "resolved", false);
        setField(term170377, term170377.getClass(), "resolveResult", null);
        setField(term170377, term170377.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term170029;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term169771, args);
        assertTrue(recursiveEquals(term169771, term170373));
        assertTrue(recursiveEquals(term170029, term170377));
        assertTrue(recursiveEquals(retValue, false));
    }

};


