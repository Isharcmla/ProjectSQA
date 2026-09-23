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

public class FunctionType_makesDicts_1455599566313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287823;

    public FunctionType_makesDicts_1455599566313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term289158 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term289157 = ((Class) term289158).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term289157).setAccessible(true);
        Object enum508 = ((Field) term289157).get((Object) null);
        Class<? extends Object> term289458 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term289457 = ((Class) term289458).getDeclaredField((String) "STRUCT");
        ((Field) term289457).setAccessible(true);
        Object enum509 = ((Field) term289457).get((Object) null);
        term287823 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term288235 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term287823, term287823.getClass(), "kind", enum508);
        setField(term287823, term287823.getClass(), "propAccess", enum509);
        setField(term287823, term287823.getClass(), "prototypeSlot", null);
        setField(term287823, term287823.getClass(), "className", null);
        setField(term287823, term287823.getClass(), "ownerFunction", null);
        setField(term287823, term287823.getClass(), "registry", term288235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "makesDicts", argTypes, term287823, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


