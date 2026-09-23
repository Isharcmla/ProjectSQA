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

public class FunctionTypeBuilder_inferInheritance_965613355307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118958;
     Object term119148;

    public FunctionTypeBuilder_inferInheritance_965613355307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118958 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term119068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term118958, term118958.getClass(), "isConstructor", false);
        setBooleanField(term118958, term118958.getClass(), "isInterface", false);
        setField(term118958, term118958.getClass(), "implementedInterfaces", null);
        setField(term118958, term118958.getClass(), "baseType", term119068);
        term119148 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term119148, term119148.getClass(), "bitset", 512);
        setField(term119148, term119148.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term119148;
        callMethod(klass, "inferInheritance", argTypes, term118958, args);
    }

};


