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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86592;
     Object term86796;
     Object term87130;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86592 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term86696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term86592, term86592.getClass(), "returnType", null);
        setBooleanField(term86592, term86592.getClass(), "returnTypeInferred", false);
        setField(term86592, term86592.getClass(), "typeRegistry", term86696);
        term86796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term86890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term86990 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term87060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term86890, term86890.getClass(), "returnType", term86990);
        setBooleanField(term86890, term86890.getClass(), "returnTypeInferred", false);
        setField(term87060, term87060.getClass(), "first", null);
        setField(term86890, term86890.getClass(), "parameters", term87060);
        setField(term86796, term86796.getClass(), "call", term86890);
        term87130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term87130, term87130.getClass(), "first", term87200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term86796;
        args[1] = term87130;
        callMethod(klass, "inferFromOverriddenFunction", argTypes, term86592, args);
    }

};


