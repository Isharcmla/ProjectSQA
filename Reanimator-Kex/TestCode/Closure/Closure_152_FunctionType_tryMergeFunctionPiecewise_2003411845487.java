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

public class FunctionType_tryMergeFunctionPiecewise_2003411845487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422214;
     Object term422794;

    public FunctionType_tryMergeFunctionPiecewise_2003411845487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term423891 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term423890 = ((Class) term423891).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term423890).setAccessible(true);
        Object enum694 = ((Field) term423890).get((Object) null);
        term422214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term422308 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term422378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term422448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term422448, term422448.getClass(), "jsType", null);
        setField(term422448, term422448.getClass(), "next", null);
        setField(term422378, term422378.getClass(), "first", term422448);
        setField(term422308, term422308.getClass(), "parameters", term422378);
        setField(term423083, term423083.getClass(), "kind", enum694);
        setField(term422308, term422308.getClass(), "returnType", term423083);
        setField(term422214, term422214.getClass(), "call", term422308);
        term422794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term422888 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term422958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term423028, term423028.getClass(), "jsType", null);
        setField(term423028, term423028.getClass(), "next", null);
        setField(term422958, term422958.getClass(), "first", term423028);
        setField(term422888, term422888.getClass(), "parameters", term422958);
        setField(term422888, term422888.getClass(), "returnType", term423083);
        setField(term422794, term422794.getClass(), "call", term422888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term422794;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term422214, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


