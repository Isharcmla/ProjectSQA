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

public class FunctionType_clearCachedValues_1343537339177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87712;

    public FunctionType_clearCachedValues_1343537339177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88268 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term88267 = ((Class) term88268).getDeclaredField((String) "INTERFACE");
        ((Field) term88267).setAccessible(true);
        Object enum184 = ((Field) term88267).get((Object) null);
        term87712 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term88266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term87712, term87712.getClass(), "unknown", false);
        setField(term87712, term87712.getClass(), "subTypes", null);
        setBooleanField(term87712, term87712.getClass(), "nativeType", false);
        setField(term87712, term87712.getClass(), "kind", enum184);
        setField(term87712, term87712.getClass(), "prototype", term88266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term87712, args);
    }

};


