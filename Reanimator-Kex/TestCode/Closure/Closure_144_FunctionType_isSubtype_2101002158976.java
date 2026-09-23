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

public class FunctionType_isSubtype_2101002158976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1214672;
     Object term1215178;

    public FunctionType_isSubtype_2101002158976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1218519 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1218518 = ((Class) term1218519).getDeclaredField((String) "ORDINARY");
        ((Field) term1218518).setAccessible(true);
        Object enum2183 = ((Field) term1218518).get((Object) null);
        Class<? extends Object> term1218810 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1218809 = ((Class) term1218810).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1218809).setAccessible(true);
        Object enum2184 = ((Field) term1218809).get((Object) null);
        term1214672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1214920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1214672, term1214672.getClass(), "kind", enum2183);
        setField(term1214920, term1214920.getClass(), "kind", enum2184);
        setField(term1214920, term1214920.getClass(), "call", null);
        setField(term1214672, term1214672.getClass(), "typeOfThis", term1214920);
        term1215178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1215362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1215530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1215178, term1215178.getClass(), "kind", enum2183);
        setField(term1215362, term1215362.getClass(), "kind", enum2184);
        setField(term1215362, term1215362.getClass(), "call", term1215530);
        setField(term1215178, term1215178.getClass(), "typeOfThis", term1215362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1215178;
        try {
            callMethod(klass, "isSubtype", argTypes, term1214672, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


