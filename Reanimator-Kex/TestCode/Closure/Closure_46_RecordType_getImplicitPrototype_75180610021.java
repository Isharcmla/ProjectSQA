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

public class RecordType_getImplicitPrototype_75180610021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1421;

    public RecordType_getImplicitPrototype_75180610021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1421, term1421.getClass(), "properties", null);
        setBooleanField(term1421, term1421.getClass(), "isFrozen", false);
        setField(term1421, term1421.getClass(), "className", null);
        setField(term1421, term1421.getClass(), "properties", null);
        setBooleanField(term1421, term1421.getClass(), "nativeType", false);
        setField(term1421, term1421.getClass(), "implicitPrototypeFallback", null);
        setField(term1421, term1421.getClass(), "ownerFunction", null);
        setBooleanField(term1421, term1421.getClass(), "prettyPrint", false);
        setBooleanField(term1421, term1421.getClass(), "visited", false);
        setField(term1421, term1421.getClass(), "docInfo", null);
        setBooleanField(term1421, term1421.getClass(), "unknown", false);
        setBooleanField(term1421, term1421.getClass(), "resolved", false);
        setField(term1421, term1421.getClass(), "resolveResult", null);
        setField(term1421, term1421.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getImplicitPrototype", argTypes, term1421, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


