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

public class FunctionType_tryMergeFunctionPiecewise_2003411845485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419886;
     Object term420554;

    public FunctionType_tryMergeFunctionPiecewise_2003411845485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term421686 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term421685 = ((Class) term421686).getDeclaredField((String) "ORDINARY");
        ((Field) term421685).setAccessible(true);
        Object enum692 = ((Field) term421685).get((Object) null);
        term419886 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term419980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term420753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term420788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term420230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term420466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term420788, term420788.getClass(), "jsType", null);
        setField(term420788, term420788.getClass(), "next", null);
        setField(term420753, term420753.getClass(), "first", term420788);
        setField(term420753, term420753.getClass(), "jsType", null);
        setField(term420753, term420753.getClass(), "next", null);
        setField(term419980, term419980.getClass(), "parameters", term420753);
        setField(term420230, term420230.getClass(), "kind", enum692);
        setField(term420230, term420230.getClass(), "typeOfThis", term420466);
        setField(term419980, term419980.getClass(), "returnType", term420230);
        setField(term419886, term419886.getClass(), "call", term419980);
        term420554 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term420648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term420718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term420898 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term420718, term420718.getClass(), "first", term420753);
        setField(term420648, term420648.getClass(), "parameters", term420718);
        setField(term420898, term420898.getClass(), "kind", enum692);
        setField(term420898, term420898.getClass(), "typeOfThis", null);
        setField(term420648, term420648.getClass(), "returnType", term420898);
        setField(term420554, term420554.getClass(), "call", term420648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term420554;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term419886, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


