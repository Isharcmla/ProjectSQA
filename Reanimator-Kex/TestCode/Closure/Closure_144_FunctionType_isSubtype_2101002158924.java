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

public class FunctionType_isSubtype_2101002158924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1129044;
     Object term1129498;

    public FunctionType_isSubtype_2101002158924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1132609 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1132608 = ((Class) term1132609).getDeclaredField((String) "ORDINARY");
        ((Field) term1132608).setAccessible(true);
        Object enum2033 = ((Field) term1132608).get((Object) null);
        term1129044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1129292 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1129388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1129044, term1129044.getClass(), "kind", enum2033);
        setField(term1129292, term1129292.getClass(), "kind", enum2033);
        setField(term1129292, term1129292.getClass(), "typeOfThis", term1129388);
        setField(term1129292, term1129292.getClass(), "call", null);
        setField(term1129044, term1129044.getClass(), "typeOfThis", term1129292);
        Class<? extends Object> term1132900 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1132899 = ((Class) term1132900).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1132899).setAccessible(true);
        Object enum2034 = ((Field) term1132899).get((Object) null);
        term1129498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1129682 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1129930 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1130024 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1129498, term1129498.getClass(), "kind", enum2033);
        setField(term1129682, term1129682.getClass(), "kind", enum2034);
        setField(term1129682, term1129682.getClass(), "typeOfThis", term1129930);
        setField(term1129682, term1129682.getClass(), "call", term1130024);
        setField(term1129498, term1129498.getClass(), "typeOfThis", term1129682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1129498;
        try {
            callMethod(klass, "isSubtype", argTypes, term1129044, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


