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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class FunctionType_clearCachedValues_1343537339717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term722626;

    public FunctionType_clearCachedValues_1343537339717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term722678 = new ArrayList();
        Class<? extends Object> term722988 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term722987 = ((Class) term722988).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term722987).setAccessible(true);
        Object enum1161 = ((Field) term722987).get((Object) null);
        ArrayList term722986 = new ArrayList();
        term722626 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term722934 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setBooleanField(term722626, term722626.getClass(), "unknown", false);
        setField(term722626, term722626.getClass(), "subTypes", term722678);
        setBooleanField(term722626, term722626.getClass(), "nativeType", false);
        setField(term722626, term722626.getClass(), "kind", enum1161);
        setBooleanField(term722934, term722934.getClass(), "unknown", false);
        setField(term722934, term722934.getClass(), "subTypes", term722986);
        setField(term722626, term722626.getClass(), "typeOfThis", term722934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term722626, args);
    }

};


