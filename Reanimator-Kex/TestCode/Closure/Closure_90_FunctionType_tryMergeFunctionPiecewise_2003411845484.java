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

public class FunctionType_tryMergeFunctionPiecewise_2003411845484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402708;
     Object term403042;

    public FunctionType_tryMergeFunctionPiecewise_2003411845484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term402708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term402802 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term403171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term403206, term403206.getClass(), "jsType", null);
        setField(term403206, term403206.getClass(), "next", null);
        setField(term403171, term403171.getClass(), "first", term403206);
        setField(term402802, term402802.getClass(), "parameters", term403171);
        setField(term402708, term402708.getClass(), "call", term402802);
        term403042 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term403136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term403136, term403136.getClass(), "parameters", term403171);
        setField(term403042, term403042.getClass(), "call", term403136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term403042;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term402708, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


