package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionTypeBuilder_addParameter_1631834534297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113062;
     Object term113178;
     Object term113366;

    public FunctionTypeBuilder_addParameter_1631834534297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113062 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term113178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object term113270 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term113178, term113178.getClass(), "root", term113270);
        term113366 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term113178;
        args[1] = term113366;
        args[2] = false;
        args[3] = true;
        args[4] = false;
        callMethod(klass, "addParameter", argTypes, term113062, args);
    }

};


