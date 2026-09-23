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

public class FunctionType_getAllImplementedInterfaces_572683533355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323834;

    public FunctionType_getAllImplementedInterfaces_572683533355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term324687 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term324686 = ((Class) term324687).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term324686).setAccessible(true);
        Object enum561 = ((Field) term324686).get((Object) null);
        term323834 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term324086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term323834, term323834.getClass(), "kind", enum561);
        setField(term323834, term323834.getClass(), "prototypeSlot", null);
        setField(term323834, term323834.getClass(), "className", null);
        setField(term323834, term323834.getClass(), "ownerFunction", null);
        setField(term323834, term323834.getClass(), "registry", term324086);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term323834, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


