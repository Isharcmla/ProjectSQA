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

public class FunctionType_getAllImplementedInterfaces_572683533695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term694769;

    public FunctionType_getAllImplementedInterfaces_572683533695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term695233 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term695232 = ((Class) term695233).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term695232).setAccessible(true);
        Object enum1134 = ((Field) term695232).get((Object) null);
        term694769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term695031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term695131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term695231 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term694769, term694769.getClass(), "kind", enum1134);
        setField(term695131, term695131.getClass(), "implicitPrototypeFallback", term695231);
        setField(term695031, term695031.getClass(), "type", term695131);
        setField(term694769, term694769.getClass(), "prototypeSlot", term695031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllImplementedInterfaces", argTypes, term694769, args);
    }

};


