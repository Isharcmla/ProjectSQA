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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_getImplementedInterfaces_281458626239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242020;

    public FunctionType_getImplementedInterfaces_281458626239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term242866 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term242865 = ((Class) term242866).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term242865).setAccessible(true);
        Object enum449 = ((Field) term242865).get((Object) null);
        term242020 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term242272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term242020, term242020.getClass(), "kind", enum449);
        setField(term242020, term242020.getClass(), "prototypeSlot", null);
        setField(term242020, term242020.getClass(), "className", null);
        setField(term242020, term242020.getClass(), "ownerFunction", null);
        setField(term242020, term242020.getClass(), "registry", term242272);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getImplementedInterfaces", argTypes, term242020, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


