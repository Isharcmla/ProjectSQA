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

public class FunctionType_isSubtype_2101002158845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term994703;
     Object term995133;
     Object term995137;

    public FunctionType_isSubtype_2101002158845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term995143 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term995142 = ((Class) term995143).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term995142).setAccessible(true);
        Object enum1800 = ((Field) term995142).get((Object) null);
        term994703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term994703, term994703.getClass(), "kind", enum1800);
        Class<? extends Object> term995443 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term995442 = ((Class) term995443).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term995442).setAccessible(true);
        Object enum1801 = ((Field) term995442).get((Object) null);
        term995133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term995133, term995133.getClass(), "call", null);
        setField(term995133, term995133.getClass(), "prototype", null);
        setField(term995133, term995133.getClass(), "kind", enum1801);
        setField(term995133, term995133.getClass(), "typeOfThis", null);
        setField(term995133, term995133.getClass(), "source", null);
        setField(term995133, term995133.getClass(), "implementedInterfaces", null);
        setField(term995133, term995133.getClass(), "subTypes", null);
        setField(term995133, term995133.getClass(), "templateTypeName", null);
        setField(term995133, term995133.getClass(), "className", null);
        setField(term995133, term995133.getClass(), "properties", null);
        setField(term995133, term995133.getClass(), "implicitPrototype", null);
        setBooleanField(term995133, term995133.getClass(), "nativeType", false);
        setBooleanField(term995133, term995133.getClass(), "prettyPrint", false);
        setBooleanField(term995133, term995133.getClass(), "visited", false);
        setField(term995133, term995133.getClass(), "docInfo", null);
        setBooleanField(term995133, term995133.getClass(), "unknown", false);
        setBooleanField(term995133, term995133.getClass(), "resolved", false);
        setField(term995133, term995133.getClass(), "resolveResult", null);
        setField(term995133, term995133.getClass(), "registry", null);
        Class<? extends Object> term995743 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term995742 = ((Class) term995743).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term995742).setAccessible(true);
        Object enum1802 = ((Field) term995742).get((Object) null);
        term995137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term995137, term995137.getClass(), "call", null);
        setField(term995137, term995137.getClass(), "prototype", null);
        setField(term995137, term995137.getClass(), "kind", enum1802);
        setField(term995137, term995137.getClass(), "typeOfThis", null);
        setField(term995137, term995137.getClass(), "source", null);
        setField(term995137, term995137.getClass(), "implementedInterfaces", null);
        setField(term995137, term995137.getClass(), "subTypes", null);
        setField(term995137, term995137.getClass(), "templateTypeName", null);
        setField(term995137, term995137.getClass(), "className", null);
        setField(term995137, term995137.getClass(), "properties", null);
        setField(term995137, term995137.getClass(), "implicitPrototype", null);
        setBooleanField(term995137, term995137.getClass(), "nativeType", false);
        setBooleanField(term995137, term995137.getClass(), "prettyPrint", false);
        setBooleanField(term995137, term995137.getClass(), "visited", false);
        setField(term995137, term995137.getClass(), "docInfo", null);
        setBooleanField(term995137, term995137.getClass(), "unknown", false);
        setBooleanField(term995137, term995137.getClass(), "resolved", false);
        setField(term995137, term995137.getClass(), "resolveResult", null);
        setField(term995137, term995137.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term994703;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term994703, args);
        assertTrue(recursiveEquals(term994703, term995133));
        assertTrue(recursiveEquals(term994703, term995137));
        assertTrue(recursiveEquals(retValue, true));
    }

};


