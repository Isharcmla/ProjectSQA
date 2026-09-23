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

public class FunctionType_tryMergeFunctionPiecewise_2003411845359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254716;
     Object term254432;

    public FunctionType_tryMergeFunctionPiecewise_2003411845359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term256163 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term256162 = ((Class) term256163).getDeclaredField((String) "ORDINARY");
        ((Field) term256162).setAccessible(true);
        Object enum443 = ((Field) term256162).get((Object) null);
        Class<? extends Object> term256454 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term256453 = ((Class) term256454).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term256453).setAccessible(true);
        Object enum444 = ((Field) term256453).get((Object) null);
        term254716 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term254763 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term254798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term254833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term254883 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term255011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term254833, term254833.getClass(), "jsType", null);
        setField(term254833, term254833.getClass(), "next", null);
        setField(term254798, term254798.getClass(), "first", term254833);
        setField(term254763, term254763.getClass(), "parameters", term254798);
        setField(term254883, term254883.getClass(), "kind", enum443);
        setField(term254883, term254883.getClass(), "typeOfThis", term255011);
        setField(term254763, term254763.getClass(), "returnType", term254883);
        setField(term254716, term254716.getClass(), "call", term254763);
        setField(term254716, term254716.getClass(), "kind", enum444);
        setField(term254716, term254716.getClass(), "typeOfThis", null);
        term254432 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term254526 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term254596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term254666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term254666, term254666.getClass(), "jsType", null);
        setField(term254666, term254666.getClass(), "next", null);
        setField(term254596, term254596.getClass(), "first", term254666);
        setField(term254526, term254526.getClass(), "parameters", term254596);
        setField(term254526, term254526.getClass(), "returnType", term254716);
        setField(term254432, term254432.getClass(), "call", term254526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term254432;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term254716, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


