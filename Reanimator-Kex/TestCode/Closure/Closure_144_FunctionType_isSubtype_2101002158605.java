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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_isSubtype_2101002158605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583171;
     Object term583623;

    public FunctionType_isSubtype_2101002158605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term584819 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term584818 = ((Class) term584819).getDeclaredField((String) "ORDINARY");
        ((Field) term584818).setAccessible(true);
        Object enum1061 = ((Field) term584818).get((Object) null);
        term583171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term583419 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term583513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term583171, term583171.getClass(), "kind", enum1061);
        setField(term583171, term583171.getClass(), "typeOfThis", term583419);
        setField(term583171, term583171.getClass(), "call", term583513);
        Class<? extends Object> term585110 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term585109 = ((Class) term585110).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term585109).setAccessible(true);
        Object enum1062 = ((Field) term585109).get((Object) null);
        term583623 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term583881 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term583623, term583623.getClass(), "kind", enum1062);
        setField(term583623, term583623.getClass(), "typeOfThis", term583881);
        setField(term583623, term583623.getClass(), "call", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term583623;
        try {
            callMethod(klass, "isSubtype", argTypes, term583171, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


