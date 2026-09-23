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
import static com.google.javascript.rhino.jstype.EqualityUtils.*;

public class PrototypeObjectType_toStringHelper_1837898364125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16561;
     Object term41062;

    public PrototypeObjectType_toStringHelper_1837898364125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16561 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term41062 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term41062, term41062.getClass(), "properties", null);
        setBooleanField(term41062, term41062.getClass(), "isFrozen", false);
        setField(term41062, term41062.getClass(), "className", null);
        setField(term41062, term41062.getClass(), "properties", null);
        setBooleanField(term41062, term41062.getClass(), "nativeType", false);
        setField(term41062, term41062.getClass(), "implicitPrototypeFallback", null);
        setField(term41062, term41062.getClass(), "ownerFunction", null);
        setBooleanField(term41062, term41062.getClass(), "prettyPrint", false);
        setBooleanField(term41062, term41062.getClass(), "visited", false);
        setField(term41062, term41062.getClass(), "docInfo", null);
        setBooleanField(term41062, term41062.getClass(), "unknown", false);
        setBooleanField(term41062, term41062.getClass(), "resolved", false);
        setField(term41062, term41062.getClass(), "resolveResult", null);
        setField(term41062, term41062.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        Object retValue = callMethod(klass, "toStringHelper", argTypes, term16561, args);
        assertTrue(recursiveEquals(term16561, term41062));
        assertTrue(recursiveEquals(retValue, "{...}"));
    }

};


