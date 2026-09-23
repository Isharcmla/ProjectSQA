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

public class FunctionType_getAllImplementedInterfaces_572683533198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99060;

    public FunctionType_getAllImplementedInterfaces_572683533198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term99506 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term99505 = ((Class) term99506).getDeclaredField((String) "ORDINARY");
        ((Field) term99505).setAccessible(true);
        Object enum192 = ((Field) term99505).get((Object) null);
        term99060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term99060, term99060.getClass(), "kind", enum192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllImplementedInterfaces", argTypes, term99060, args);
    }

};


