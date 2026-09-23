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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_supAndInfHelper_1915298734706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term706901;
     Object term707149;

    public FunctionType_supAndInfHelper_1915298734706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term707225 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term707224 = ((Class) term707225).getDeclaredField((String) "INTERFACE");
        ((Field) term707224).setAccessible(true);
        Object enum1146 = ((Field) term707224).get((Object) null);
        term706901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term706901, term706901.getClass(), "unknown", false);
        setField(term706901, term706901.getClass(), "kind", enum1146);
        term707149 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term707149, term707149.getClass(), "unknown", false);
        setField(term707149, term707149.getClass(), "kind", enum1146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term707149;
        args[1] = false;
        callMethod(klass, "supAndInfHelper", argTypes, term706901, args);
    }

};


