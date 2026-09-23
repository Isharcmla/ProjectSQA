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

public class FunctionType_clearCachedValues_1343537339361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329682;

    public FunctionType_clearCachedValues_1343537339361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term329734 = new ArrayList();
        Class<? extends Object> term330893 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term330892 = ((Class) term330893).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term330892).setAccessible(true);
        Object enum571 = ((Field) term330892).get((Object) null);
        term329682 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term330292 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setBooleanField(term329682, term329682.getClass(), "unknown", false);
        setField(term329682, term329682.getClass(), "subTypes", term329734);
        setBooleanField(term329682, term329682.getClass(), "nativeType", false);
        setField(term329682, term329682.getClass(), "kind", enum571);
        setField(term329682, term329682.getClass(), "prototypeSlot", term330292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearCachedValues", argTypes, term329682, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


