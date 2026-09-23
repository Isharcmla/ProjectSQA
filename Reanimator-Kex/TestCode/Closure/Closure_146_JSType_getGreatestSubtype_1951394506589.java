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
import java.lang.Object;

public class JSType_getGreatestSubtype_1951394506589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164188;
     Object term164398;

    public JSType_getGreatestSubtype_1951394506589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164188 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term164300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setBooleanField(term164300, term164300.getClass(), "unknown", false);
        setField(term164188, term164188.getClass(), "referencedType", term164300);
        term164398 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term164508 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term164398, term164398.getClass(), "referencedType", term164508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term164188;
        args[1] = term164398;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


