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

public class FunctionType_tryMergeFunctionPiecewise_2003411845515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466967;
     Object term467655;

    public FunctionType_tryMergeFunctionPiecewise_2003411845515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term469175 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term469174 = ((Class) term469175).getDeclaredField((String) "ORDINARY");
        ((Field) term469174).setAccessible(true);
        Object enum762 = ((Field) term469174).get((Object) null);
        term466967 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term467061 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term467854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term467889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term467301 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term467545 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term467889, term467889.getClass(), "jsType", null);
        setField(term467889, term467889.getClass(), "next", null);
        setField(term467854, term467854.getClass(), "first", term467889);
        setField(term467854, term467854.getClass(), "jsType", null);
        setField(term467854, term467854.getClass(), "next", null);
        setField(term467061, term467061.getClass(), "parameters", term467854);
        setField(term467301, term467301.getClass(), "kind", enum762);
        setField(term467301, term467301.getClass(), "typeOfThis", term467545);
        setField(term467061, term467061.getClass(), "returnType", term467301);
        setField(term466967, term466967.getClass(), "call", term467061);
        Class<? extends Object> term469466 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term469465 = ((Class) term469466).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term469465).setAccessible(true);
        Object enum763 = ((Field) term469465).get((Object) null);
        term467655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term467749 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term467819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term467989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term467819, term467819.getClass(), "first", term467854);
        setField(term467749, term467749.getClass(), "parameters", term467819);
        setField(term467989, term467989.getClass(), "kind", enum763);
        setField(term467989, term467989.getClass(), "typeOfThis", null);
        setField(term467749, term467749.getClass(), "returnType", term467989);
        setField(term467655, term467655.getClass(), "call", term467749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term467655;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term466967, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


