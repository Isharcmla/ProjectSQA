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

public class FunctionType_tryMergeFunctionPiecewise_2003411845689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term719307;
     Object term720185;

    public FunctionType_tryMergeFunctionPiecewise_2003411845689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term721335 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term721334 = ((Class) term721335).getDeclaredField((String) "ORDINARY");
        ((Field) term721334).setAccessible(true);
        Object enum1088 = ((Field) term721334).get((Object) null);
        term719307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term719401 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term719471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term719541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term719651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term719887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term719981 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term720085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term719541, term719541.getClass(), "jsType", null);
        setField(term719541, term719541.getClass(), "next", null);
        setField(term719471, term719471.getClass(), "first", term719541);
        setField(term719401, term719401.getClass(), "parameters", term719471);
        setField(term719651, term719651.getClass(), "kind", enum1088);
        setField(term719651, term719651.getClass(), "typeOfThis", term719887);
        setField(term719981, term719981.getClass(), "parameters", null);
        setField(term719981, term719981.getClass(), "returnType", null);
        setField(term719651, term719651.getClass(), "call", term719981);
        setField(term719651, term719651.getClass(), "registry", term720085);
        setField(term719401, term719401.getClass(), "returnType", term719651);
        setField(term719307, term719307.getClass(), "call", term719401);
        term720185 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term720279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term720349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term720419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term720529 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term720419, term720419.getClass(), "jsType", null);
        setField(term720419, term720419.getClass(), "next", null);
        setField(term720349, term720349.getClass(), "first", term720419);
        setField(term720279, term720279.getClass(), "parameters", term720349);
        setField(term720529, term720529.getClass(), "kind", enum1088);
        setField(term720529, term720529.getClass(), "typeOfThis", null);
        setField(term720279, term720279.getClass(), "returnType", term720529);
        setField(term720185, term720185.getClass(), "call", term720279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term720185;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term719307, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


