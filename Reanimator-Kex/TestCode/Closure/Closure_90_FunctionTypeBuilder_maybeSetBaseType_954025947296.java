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

public class FunctionTypeBuilder_maybeSetBaseType_954025947296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112617;
     Object term112817;

    public FunctionTypeBuilder_maybeSetBaseType_954025947296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112617 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term112717 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term112617, term112617.getClass(), "baseType", term112717);
        term112817 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term112935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term112817, term112817.getClass(), "prototype", term112935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term112817;
        callMethod(klass, "maybeSetBaseType", argTypes, term112617, args);
    }

};


