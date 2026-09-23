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

public class FunctionType_clearCachedValues_1343537339155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74101;

    public FunctionType_clearCachedValues_1343537339155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term74647 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term74646 = ((Class) term74647).getDeclaredField((String) "INTERFACE");
        ((Field) term74646).setAccessible(true);
        Object enum172 = ((Field) term74646).get((Object) null);
        term74101 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term74645 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setBooleanField(term74101, term74101.getClass(), "unknown", false);
        setField(term74101, term74101.getClass(), "subTypes", null);
        setBooleanField(term74101, term74101.getClass(), "nativeType", false);
        setField(term74101, term74101.getClass(), "kind", enum172);
        setField(term74101, term74101.getClass(), "prototype", term74645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term74101, args);
    }

};


