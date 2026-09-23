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

public class RecordType_getImplicitPrototype_75180610024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2193;

    public RecordType_getImplicitPrototype_75180610024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term2193, term2193.getClass(), "properties", null);
        setBooleanField(term2193, term2193.getClass(), "declared", false);
        setBooleanField(term2193, term2193.getClass(), "isFrozen", false);
        setField(term2193, term2193.getClass(), "className", null);
        setField(term2193, term2193.getClass(), "properties", null);
        setBooleanField(term2193, term2193.getClass(), "nativeType", false);
        setField(term2193, term2193.getClass(), "implicitPrototypeFallback", null);
        setField(term2193, term2193.getClass(), "ownerFunction", null);
        setBooleanField(term2193, term2193.getClass(), "prettyPrint", false);
        setBooleanField(term2193, term2193.getClass(), "visited", false);
        setField(term2193, term2193.getClass(), "docInfo", null);
        setBooleanField(term2193, term2193.getClass(), "unknown", false);
        setBooleanField(term2193, term2193.getClass(), "resolved", false);
        setField(term2193, term2193.getClass(), "resolveResult", null);
        setBooleanField(term2193, term2193.getClass(), "inTemplatedCheckVisit", false);
        setField(term2193, term2193.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getImplicitPrototype", argTypes, term2193, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


