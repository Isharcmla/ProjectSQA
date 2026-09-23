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

public class FunctionType_getSuperClassConstructor_1927670470190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94690;

    public FunctionType_getSuperClassConstructor_1927670470190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term94948 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term94947 = ((Class) term94948).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term94947).setAccessible(true);
        Object enum187 = ((Field) term94947).get((Object) null);
        term94690 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term94946 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term94690, term94690.getClass(), "kind", enum187);
        setField(term94690, term94690.getClass(), "prototype", term94946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuperClassConstructor", argTypes, term94690, args);
    }

};


