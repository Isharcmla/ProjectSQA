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

public class FunctionBuilder_build_175921649046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43758;

    public FunctionBuilder_build_175921649046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term43828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term43758, term43758.getClass(), "registry", null);
        setField(term43758, term43758.getClass(), "name", null);
        setField(term43758, term43758.getClass(), "sourceNode", null);
        setField(term43758, term43758.getClass(), "parametersNode", term43828);
        setField(term43758, term43758.getClass(), "returnType", term43928);
        setBooleanField(term43758, term43758.getClass(), "inferredReturnType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "build", argTypes, term43758, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


