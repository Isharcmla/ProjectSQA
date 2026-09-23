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

public class FunctionType_clearCachedValues_1343537339552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term528393;

    public FunctionType_clearCachedValues_1343537339552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term528445 = new ArrayList();
        Class<? extends Object> term529344 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term529343 = ((Class) term529344).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term529343).setAccessible(true);
        Object enum867 = ((Field) term529343).get((Object) null);
        term528393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term528701 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setBooleanField(term528393, term528393.getClass(), "unknown", false);
        setField(term528393, term528393.getClass(), "subTypes", term528445);
        setBooleanField(term528393, term528393.getClass(), "nativeType", false);
        setField(term528393, term528393.getClass(), "kind", enum867);
        setBooleanField(term528701, term528701.getClass(), "unknown", false);
        setField(term528701, term528701.getClass(), "subTypes", null);
        setBooleanField(term528701, term528701.getClass(), "nativeType", false);
        setField(term528701, term528701.getClass(), "kind", enum867);
        setField(term528393, term528393.getClass(), "typeOfThis", term528701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearCachedValues", argTypes, term528393, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


