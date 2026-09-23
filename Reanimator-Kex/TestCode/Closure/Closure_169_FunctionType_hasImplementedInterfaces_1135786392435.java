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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class FunctionType_hasImplementedInterfaces_1135786392435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399143;

    public FunctionType_hasImplementedInterfaces_1135786392435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term399195 = new ArrayList();
        Class<? extends Object> term400048 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term400047 = ((Class) term400048).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term400047).setAccessible(true);
        Object enum660 = ((Field) term400047).get((Object) null);
        term399143 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term399447 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term399143, term399143.getClass(), "implementedInterfaces", term399195);
        setField(term399143, term399143.getClass(), "kind", enum660);
        setField(term399143, term399143.getClass(), "prototypeSlot", null);
        setField(term399143, term399143.getClass(), "className", null);
        setField(term399143, term399143.getClass(), "ownerFunction", null);
        setField(term399143, term399143.getClass(), "registry", term399447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hasImplementedInterfaces", argTypes, term399143, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


