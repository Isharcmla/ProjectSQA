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

public class FunctionType_setPrototypeBasedOn_1012666130385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349420;
     Object term349672;

    public FunctionType_setPrototypeBasedOn_1012666130385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term350506 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term350505 = ((Class) term350506).getDeclaredField((String) "INTERFACE");
        ((Field) term350505).setAccessible(true);
        Object enum597 = ((Field) term350505).get((Object) null);
        term349420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term349420, term349420.getClass(), "nativeType", false);
        setField(term349420, term349420.getClass(), "kind", enum597);
        setField(term349420, term349420.getClass(), "prototypeSlot", null);
        setField(term349420, term349420.getClass(), "source", null);
        term349672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term349672, term349672.getClass(), "className", null);
        setField(term349672, term349672.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term349672;
        try {
            callMethod(klass, "setPrototypeBasedOn", argTypes, term349420, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


