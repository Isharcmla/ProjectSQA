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

public class FunctionType_resolveInternal_58074261697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2303475;

    public FunctionType_resolveInternal_58074261697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2303475 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2303569 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2303639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term2303569, term2303569.getClass(), "resolved", false);
        setField(term2303569, term2303569.getClass(), "returnType", null);
        setField(term2303639, term2303639.getClass(), "first", null);
        setField(term2303569, term2303569.getClass(), "parameters", term2303639);
        setField(term2303475, term2303475.getClass(), "call", term2303569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "resolveInternal", argTypes, term2303475, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


