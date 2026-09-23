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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82613;
     Object term82713;
     Object term82947;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82613 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term82613, term82613.getClass(), "returnType", null);
        setBooleanField(term82613, term82613.getClass(), "returnTypeInferred", false);
        setField(term82613, term82613.getClass(), "typeRegistry", null);
        term82713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term82807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term82877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term82807, term82807.getClass(), "returnType", null);
        setBooleanField(term82807, term82807.getClass(), "returnTypeInferred", false);
        setField(term82877, term82877.getClass(), "first", null);
        setField(term82807, term82807.getClass(), "parameters", term82877);
        setField(term82713, term82713.getClass(), "call", term82807);
        term82947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term82947, term82947.getClass(), "first", term82947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term82713;
        args[1] = term82947;
        callMethod(klass, "inferFromOverriddenFunction", argTypes, term82613, args);
    }

};


