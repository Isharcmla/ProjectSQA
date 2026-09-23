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

public class FunctionType_isSubtype_21010021581497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2171038;
     Object term2171636;

    public FunctionType_isSubtype_21010021581497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2174614 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2174613 = ((Class) term2174614).getDeclaredField((String) "ORDINARY");
        ((Field) term2174613).setAccessible(true);
        Object enum3873 = ((Field) term2174613).get((Object) null);
        Class<? extends Object> term2174905 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2174904 = ((Class) term2174905).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2174904).setAccessible(true);
        Object enum3874 = ((Field) term2174904).get((Object) null);
        term2171038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2171286 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2171528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2171038, term2171038.getClass(), "kind", enum3873);
        setField(term2171286, term2171286.getClass(), "kind", enum3874);
        setField(term2171286, term2171286.getClass(), "typeOfThis", null);
        setField(term2171286, term2171286.getClass(), "call", term2171528);
        setField(term2171038, term2171038.getClass(), "typeOfThis", term2171286);
        term2171636 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2171818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2171918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2172012 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2171636, term2171636.getClass(), "kind", enum3873);
        setField(term2171818, term2171818.getClass(), "kind", enum3873);
        setField(term2171818, term2171818.getClass(), "typeOfThis", term2171918);
        setField(term2171818, term2171818.getClass(), "call", term2172012);
        setField(term2171636, term2171636.getClass(), "typeOfThis", term2171818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2171636;
        try {
            callMethod(klass, "isSubtype", argTypes, term2171038, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


