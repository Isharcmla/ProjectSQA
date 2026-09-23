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

public class RecordType_getGreatestSubtypeHelper_152058018421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1361;

    public RecordType_getGreatestSubtypeHelper_152058018421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1361 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1361, term1361.getClass(), "properties", null);
        setBooleanField(term1361, term1361.getClass(), "isFrozen", false);
        setField(term1361, term1361.getClass(), "className", null);
        setField(term1361, term1361.getClass(), "properties", null);
        setBooleanField(term1361, term1361.getClass(), "nativeType", false);
        setField(term1361, term1361.getClass(), "implicitPrototypeFallback", null);
        setField(term1361, term1361.getClass(), "ownerFunction", null);
        setBooleanField(term1361, term1361.getClass(), "prettyPrint", false);
        setBooleanField(term1361, term1361.getClass(), "visited", false);
        setField(term1361, term1361.getClass(), "docInfo", null);
        setBooleanField(term1361, term1361.getClass(), "unknown", false);
        setBooleanField(term1361, term1361.getClass(), "resolved", false);
        setField(term1361, term1361.getClass(), "resolveResult", null);
        setField(term1361, term1361.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term1361, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


