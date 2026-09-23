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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119693;
     Object term119793;
     Object term120043;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119693 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term119693, term119693.getClass(), "returnType", null);
        setField(term119693, term119693.getClass(), "typeRegistry", null);
        term119793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term119887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term120078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term119887, term119887.getClass(), "returnType", null);
        setField(term120078, term120078.getClass(), "first", null);
        setField(term119887, term119887.getClass(), "parameters", term120078);
        setField(term119793, term119793.getClass(), "call", term119887);
        term120043 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term120043, term120043.getClass(), "first", term120078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term119793;
        args[1] = term120043;
        callMethod(klass, "inferFromOverriddenFunction", argTypes, term119693, args);
    }

};


