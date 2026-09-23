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
import java.util.ArrayList;

public class FunctionType_getAllImplementedInterfaces_572683533171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84046;

    public FunctionType_getAllImplementedInterfaces_572683533171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84348 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term84347 = ((Class) term84348).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term84347).setAccessible(true);
        Object enum180 = ((Field) term84347).get((Object) null);
        ArrayList term84346 = new ArrayList();
        term84046 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term84294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term84046, term84046.getClass(), "kind", enum180);
        setField(term84294, term84294.getClass(), "implicitPrototypeFallback", null);
        setField(term84046, term84046.getClass(), "prototype", term84294);
        setField(term84046, term84046.getClass(), "implementedInterfaces", term84346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllImplementedInterfaces", argTypes, term84046, args);
    }

};


