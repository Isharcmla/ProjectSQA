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

public class FunctionType_tryMergeFunctionPiecewise_2003411845523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476142;
     Object term476710;

    public FunctionType_tryMergeFunctionPiecewise_2003411845523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term476142 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term476236 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term476306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term476376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term476476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term476610 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$2"));
        setField(term476376, term476376.getClass(), "jsType", null);
        setField(term476376, term476376.getClass(), "next", null);
        setField(term476306, term476306.getClass(), "first", term476376);
        setField(term476236, term476236.getClass(), "parameters", term476306);
        setField(term476476, term476476.getClass(), "leastSupertypeVisitor", term476610);
        setField(term476236, term476236.getClass(), "returnType", term476476);
        setField(term476142, term476142.getClass(), "call", term476236);
        term476710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term476804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term476874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term476944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term477052 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term476944, term476944.getClass(), "jsType", null);
        setField(term476944, term476944.getClass(), "next", null);
        setField(term476874, term476874.getClass(), "first", term476944);
        setField(term476804, term476804.getClass(), "parameters", term476874);
        setField(term476804, term476804.getClass(), "returnType", term477052);
        setField(term476710, term476710.getClass(), "call", term476804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term476710;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term476142, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


