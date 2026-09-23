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

public class FunctionType_tryMergeFunctionPiecewise_2003411845667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term684635;
     Object term684421;

    public FunctionType_tryMergeFunctionPiecewise_2003411845667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term685979 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term685978 = ((Class) term685979).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term685978).setAccessible(true);
        Object enum1042 = ((Field) term685978).get((Object) null);
        Class<? extends Object> term686279 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term686278 = ((Class) term686279).getDeclaredField((String) "ORDINARY");
        ((Field) term686278).setAccessible(true);
        Object enum1043 = ((Field) term686278).get((Object) null);
        term684635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term684682 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term684717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684772 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term684585, term684585.getClass(), "jsType", null);
        setField(term684585, term684585.getClass(), "next", null);
        setField(term684550, term684550.getClass(), "first", term684585);
        setField(term684550, term684550.getClass(), "jsType", null);
        setField(term684550, term684550.getClass(), "next", null);
        setField(term684717, term684717.getClass(), "first", term684550);
        setField(term684682, term684682.getClass(), "parameters", term684717);
        setField(term684772, term684772.getClass(), "kind", enum1042);
        setField(term684682, term684682.getClass(), "returnType", term684772);
        setField(term684635, term684635.getClass(), "call", term684682);
        setField(term684635, term684635.getClass(), "kind", enum1043);
        term684421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term684515 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term684515, term684515.getClass(), "parameters", term684550);
        setField(term684515, term684515.getClass(), "returnType", term684635);
        setField(term684421, term684421.getClass(), "call", term684515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term684421;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term684635, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


