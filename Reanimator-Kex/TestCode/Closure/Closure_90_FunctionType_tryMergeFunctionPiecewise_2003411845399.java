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

public class FunctionType_tryMergeFunctionPiecewise_2003411845399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302861;
     Object term302647;

    public FunctionType_tryMergeFunctionPiecewise_2003411845399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term303957 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term303956 = ((Class) term303957).getDeclaredField((String) "ORDINARY");
        ((Field) term303956).setAccessible(true);
        Object enum525 = ((Field) term303956).get((Object) null);
        term302861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term302908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term302943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term302978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term303028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term303156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term303206 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term302978, term302978.getClass(), "jsType", null);
        setField(term302978, term302978.getClass(), "next", null);
        setField(term302943, term302943.getClass(), "first", term302978);
        setField(term302908, term302908.getClass(), "parameters", term302943);
        setField(term303028, term303028.getClass(), "kind", enum525);
        setField(term303028, term303028.getClass(), "typeOfThis", term303156);
        setField(term302908, term302908.getClass(), "returnType", term303028);
        setField(term302861, term302861.getClass(), "call", term302908);
        setField(term302861, term302861.getClass(), "kind", enum525);
        setField(term302861, term302861.getClass(), "typeOfThis", term303206);
        term302647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term302741 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term302811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term302811, term302811.getClass(), "first", term302811);
        setField(term302811, term302811.getClass(), "jsType", null);
        setField(term302811, term302811.getClass(), "next", null);
        setField(term302741, term302741.getClass(), "parameters", term302811);
        setField(term302741, term302741.getClass(), "returnType", term302861);
        setField(term302647, term302647.getClass(), "call", term302741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term302647;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term302861, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


