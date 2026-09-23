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

public class FunctionType_isEquivalentTo_230708275397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299190;
     Object term299448;
     Object term299882;
     Object term299886;

    public FunctionType_isEquivalentTo_230708275397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term299892 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term299891 = ((Class) term299892).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term299891).setAccessible(true);
        Object enum549 = ((Field) term299891).get((Object) null);
        term299190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term299190, term299190.getClass(), "kind", enum549);
        term299448 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term299448, term299448.getClass(), "kind", enum549);
        Class<? extends Object> term300192 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term300191 = ((Class) term300192).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term300191).setAccessible(true);
        Object enum550 = ((Field) term300191).get((Object) null);
        term299882 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term299882, term299882.getClass(), "call", null);
        setField(term299882, term299882.getClass(), "prototype", null);
        setField(term299882, term299882.getClass(), "kind", enum550);
        setField(term299882, term299882.getClass(), "typeOfThis", null);
        setField(term299882, term299882.getClass(), "source", null);
        setField(term299882, term299882.getClass(), "implementedInterfaces", null);
        setField(term299882, term299882.getClass(), "subTypes", null);
        setField(term299882, term299882.getClass(), "templateTypeName", null);
        setField(term299882, term299882.getClass(), "className", null);
        setField(term299882, term299882.getClass(), "properties", null);
        setField(term299882, term299882.getClass(), "implicitPrototype", null);
        setBooleanField(term299882, term299882.getClass(), "nativeType", false);
        setBooleanField(term299882, term299882.getClass(), "prettyPrint", false);
        setBooleanField(term299882, term299882.getClass(), "visited", false);
        setField(term299882, term299882.getClass(), "docInfo", null);
        setBooleanField(term299882, term299882.getClass(), "unknown", false);
        setBooleanField(term299882, term299882.getClass(), "resolved", false);
        setField(term299882, term299882.getClass(), "resolveResult", null);
        setField(term299882, term299882.getClass(), "registry", null);
        Class<? extends Object> term300492 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term300491 = ((Class) term300492).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term300491).setAccessible(true);
        Object enum551 = ((Field) term300491).get((Object) null);
        term299886 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term299886, term299886.getClass(), "call", null);
        setField(term299886, term299886.getClass(), "prototype", null);
        setField(term299886, term299886.getClass(), "kind", enum551);
        setField(term299886, term299886.getClass(), "typeOfThis", null);
        setField(term299886, term299886.getClass(), "source", null);
        setField(term299886, term299886.getClass(), "implementedInterfaces", null);
        setField(term299886, term299886.getClass(), "subTypes", null);
        setField(term299886, term299886.getClass(), "templateTypeName", null);
        setField(term299886, term299886.getClass(), "className", null);
        setField(term299886, term299886.getClass(), "properties", null);
        setField(term299886, term299886.getClass(), "implicitPrototype", null);
        setBooleanField(term299886, term299886.getClass(), "nativeType", false);
        setBooleanField(term299886, term299886.getClass(), "prettyPrint", false);
        setBooleanField(term299886, term299886.getClass(), "visited", false);
        setField(term299886, term299886.getClass(), "docInfo", null);
        setBooleanField(term299886, term299886.getClass(), "unknown", false);
        setBooleanField(term299886, term299886.getClass(), "resolved", false);
        setField(term299886, term299886.getClass(), "resolveResult", null);
        setField(term299886, term299886.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term299448;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term299190, args);
        assertTrue(recursiveEquals(term299190, term299882));
        assertTrue(recursiveEquals(term299448, term299886));
        assertTrue(recursiveEquals(retValue, false));
    }

};


