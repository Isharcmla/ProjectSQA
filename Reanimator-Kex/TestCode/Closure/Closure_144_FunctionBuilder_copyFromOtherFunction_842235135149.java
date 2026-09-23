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

public class FunctionBuilder_copyFromOtherFunction_842235135149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102512;
     Object term102888;

    public FunctionBuilder_copyFromOtherFunction_842235135149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term102620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term102512, term102512.getClass(), "name", "");
        setField(term102512, term102512.getClass(), "sourceNode", term102620);
        setField(term102512, term102512.getClass(), "parametersNode", term102690);
        setField(term102512, term102512.getClass(), "returnType", term102780);
        term102888 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term103020 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term103108 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term103208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term102888, term102888.getClass(), "className", "");
        setField(term102888, term102888.getClass(), "source", null);
        setField(term103020, term103020.getClass(), "parameters", null);
        setField(term103020, term103020.getClass(), "returnType", term103108);
        setField(term102888, term102888.getClass(), "call", term103020);
        setField(term102888, term102888.getClass(), "typeOfThis", term103208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term102888;
        try {
            callMethod(klass, "copyFromOtherFunction", argTypes, term102512, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


