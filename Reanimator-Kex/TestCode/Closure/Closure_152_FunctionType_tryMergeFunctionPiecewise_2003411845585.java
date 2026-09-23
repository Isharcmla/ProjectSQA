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
import java.lang.Object;
import java.lang.String;

public class FunctionType_tryMergeFunctionPiecewise_2003411845585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566546;
     Object term567222;

    public FunctionType_tryMergeFunctionPiecewise_2003411845585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term568749 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term568748 = ((Class) term568749).getDeclaredField((String) "ORDINARY");
        ((Field) term568748).setAccessible(true);
        Object enum881 = ((Field) term568748).get((Object) null);
        term566546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term566640 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term566710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term566780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term566890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term567134 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term566780, term566780.getClass(), "jsType", null);
        setField(term566780, term566780.getClass(), "next", null);
        setField(term566710, term566710.getClass(), "first", term566780);
        setField(term566640, term566640.getClass(), "parameters", term566710);
        setField(term566890, term566890.getClass(), "kind", enum881);
        setField(term566890, term566890.getClass(), "typeOfThis", term567134);
        setField(term566640, term566640.getClass(), "returnType", term566890);
        setField(term566546, term566546.getClass(), "call", term566640);
        Class<? extends Object> term569040 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term569039 = ((Class) term569040).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term569039).setAccessible(true);
        Object enum882 = ((Field) term569039).get((Object) null);
        term567222 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term567316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term567386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term567456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term567566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term567456, term567456.getClass(), "jsType", null);
        setField(term567456, term567456.getClass(), "next", null);
        setField(term567386, term567386.getClass(), "first", term567456);
        setField(term567316, term567316.getClass(), "parameters", term567386);
        setField(term567566, term567566.getClass(), "kind", enum882);
        setField(term567566, term567566.getClass(), "typeOfThis", null);
        setField(term567316, term567316.getClass(), "returnType", term567566);
        setField(term567222, term567222.getClass(), "call", term567316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term567222;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term566546, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


