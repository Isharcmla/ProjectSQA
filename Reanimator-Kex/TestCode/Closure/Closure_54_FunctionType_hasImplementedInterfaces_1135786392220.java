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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class FunctionType_hasImplementedInterfaces_1135786392220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112381;

    public FunctionType_hasImplementedInterfaces_1135786392220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term112433 = new ArrayList();
        Class<? extends Object> term112583 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term112582 = ((Class) term112583).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term112582).setAccessible(true);
        Object enum202 = ((Field) term112582).get((Object) null);
        term112381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term112381, term112381.getClass(), "implementedInterfaces", term112433);
        setField(term112381, term112381.getClass(), "kind", enum202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasImplementedInterfaces", argTypes, term112381, args);
    }

};


