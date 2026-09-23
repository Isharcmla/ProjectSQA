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

public class FunctionType_getAllImplementedInterfaces_572683533183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91927;

    public FunctionType_getAllImplementedInterfaces_572683533183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92277 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term92276 = ((Class) term92277).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term92276).setAccessible(true);
        Object enum185 = ((Field) term92276).get((Object) null);
        term91927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term92175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term92275 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term91927, term91927.getClass(), "kind", enum185);
        setField(term92175, term92175.getClass(), "implicitPrototypeFallback", term92275);
        setField(term91927, term91927.getClass(), "prototype", term92175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllImplementedInterfaces", argTypes, term91927, args);
    }

};


