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

public class FunctionType_tryMergeFunctionPiecewise_2003411845655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term666797;
     Object term667503;

    public FunctionType_tryMergeFunctionPiecewise_2003411845655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term668635 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term668634 = ((Class) term668635).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term668634).setAccessible(true);
        Object enum1025 = ((Field) term668634).get((Object) null);
        term666797 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term666891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term666961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term667031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term667141 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term667393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term667031, term667031.getClass(), "jsType", null);
        setField(term667031, term667031.getClass(), "next", null);
        setField(term666961, term666961.getClass(), "first", term667031);
        setField(term666891, term666891.getClass(), "parameters", term666961);
        setField(term667141, term667141.getClass(), "kind", enum1025);
        setField(term667141, term667141.getClass(), "registry", term667393);
        setField(term666891, term666891.getClass(), "returnType", term667141);
        setField(term666797, term666797.getClass(), "call", term666891);
        term667503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term667597 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term667667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term667737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term667847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term667737, term667737.getClass(), "jsType", null);
        setField(term667737, term667737.getClass(), "next", null);
        setField(term667667, term667667.getClass(), "first", term667737);
        setField(term667597, term667597.getClass(), "parameters", term667667);
        setField(term667847, term667847.getClass(), "kind", enum1025);
        setField(term667597, term667597.getClass(), "returnType", term667847);
        setField(term667503, term667503.getClass(), "call", term667597);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term667503;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term666797, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


