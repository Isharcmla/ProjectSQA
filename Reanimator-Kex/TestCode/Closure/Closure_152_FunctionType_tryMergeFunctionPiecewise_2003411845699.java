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

public class FunctionType_tryMergeFunctionPiecewise_2003411845699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term735902;
     Object term736608;

    public FunctionType_tryMergeFunctionPiecewise_2003411845699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term737740 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term737739 = ((Class) term737740).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term737739).setAccessible(true);
        Object enum1113 = ((Field) term737739).get((Object) null);
        term735902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term735996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term736066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term736136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term736246 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term736498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term736136, term736136.getClass(), "jsType", null);
        setField(term736136, term736136.getClass(), "next", null);
        setField(term736066, term736066.getClass(), "first", term736136);
        setField(term735996, term735996.getClass(), "parameters", term736066);
        setField(term736246, term736246.getClass(), "kind", enum1113);
        setField(term736246, term736246.getClass(), "registry", term736498);
        setField(term735996, term735996.getClass(), "returnType", term736246);
        setField(term735902, term735902.getClass(), "call", term735996);
        term736608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term736702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term736772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term736842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term736952 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term736842, term736842.getClass(), "jsType", null);
        setField(term736842, term736842.getClass(), "next", null);
        setField(term736772, term736772.getClass(), "first", term736842);
        setField(term736702, term736702.getClass(), "parameters", term736772);
        setField(term736952, term736952.getClass(), "kind", enum1113);
        setField(term736702, term736702.getClass(), "returnType", term736952);
        setField(term736608, term736608.getClass(), "call", term736702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term736608;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term735902, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


