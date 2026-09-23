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

public class FunctionType_isSubtype_2101002158745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term813941;
     Object term814495;
     Object term815249;
     Object term815253;

    public FunctionType_isSubtype_2101002158745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term815259 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term815258 = ((Class) term815259).getDeclaredField((String) "ORDINARY");
        ((Field) term815258).setAccessible(true);
        Object enum1467 = ((Field) term815258).get((Object) null);
        term813941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term813941, term813941.getClass(), "kind", enum1467);
        Class<? extends Object> term815550 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term815549 = ((Class) term815550).getDeclaredField((String) "INTERFACE");
        ((Field) term815549).setAccessible(true);
        Object enum1468 = ((Field) term815549).get((Object) null);
        term814495 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term814495, term814495.getClass(), "kind", enum1468);
        Class<? extends Object> term815844 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term815843 = ((Class) term815844).getDeclaredField((String) "ORDINARY");
        ((Field) term815843).setAccessible(true);
        Object enum1469 = ((Field) term815843).get((Object) null);
        term815249 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term815249, term815249.getClass(), "this$0", null);
        setField(term815249, term815249.getClass(), "call", null);
        setField(term815249, term815249.getClass(), "prototype", null);
        setField(term815249, term815249.getClass(), "kind", enum1469);
        setField(term815249, term815249.getClass(), "typeOfThis", null);
        setField(term815249, term815249.getClass(), "source", null);
        setField(term815249, term815249.getClass(), "implementedInterfaces", null);
        setField(term815249, term815249.getClass(), "subTypes", null);
        setField(term815249, term815249.getClass(), "templateTypeName", null);
        setField(term815249, term815249.getClass(), "className", null);
        setField(term815249, term815249.getClass(), "properties", null);
        setField(term815249, term815249.getClass(), "implicitPrototype", null);
        setBooleanField(term815249, term815249.getClass(), "nativeType", false);
        setBooleanField(term815249, term815249.getClass(), "prettyPrint", false);
        setBooleanField(term815249, term815249.getClass(), "visited", false);
        setField(term815249, term815249.getClass(), "docInfo", null);
        setBooleanField(term815249, term815249.getClass(), "unknown", false);
        setBooleanField(term815249, term815249.getClass(), "resolved", false);
        setField(term815249, term815249.getClass(), "resolveResult", null);
        setField(term815249, term815249.getClass(), "registry", null);
        Class<? extends Object> term816135 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term816134 = ((Class) term816135).getDeclaredField((String) "INTERFACE");
        ((Field) term816134).setAccessible(true);
        Object enum1470 = ((Field) term816134).get((Object) null);
        term815253 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term815253, term815253.getClass(), "call", null);
        setField(term815253, term815253.getClass(), "prototype", null);
        setField(term815253, term815253.getClass(), "kind", enum1470);
        setField(term815253, term815253.getClass(), "typeOfThis", null);
        setField(term815253, term815253.getClass(), "source", null);
        setField(term815253, term815253.getClass(), "implementedInterfaces", null);
        setField(term815253, term815253.getClass(), "subTypes", null);
        setField(term815253, term815253.getClass(), "templateTypeName", null);
        setField(term815253, term815253.getClass(), "className", null);
        setField(term815253, term815253.getClass(), "properties", null);
        setField(term815253, term815253.getClass(), "implicitPrototype", null);
        setBooleanField(term815253, term815253.getClass(), "nativeType", false);
        setBooleanField(term815253, term815253.getClass(), "prettyPrint", false);
        setBooleanField(term815253, term815253.getClass(), "visited", false);
        setField(term815253, term815253.getClass(), "docInfo", null);
        setBooleanField(term815253, term815253.getClass(), "unknown", false);
        setBooleanField(term815253, term815253.getClass(), "resolved", false);
        setField(term815253, term815253.getClass(), "resolveResult", null);
        setField(term815253, term815253.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term814495;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term813941, args);
        assertTrue(recursiveEquals(term813941, term815249));
        assertTrue(recursiveEquals(term814495, term815253));
        assertTrue(recursiveEquals(retValue, true));
    }

};


