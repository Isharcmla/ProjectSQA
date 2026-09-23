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

public class RecordType_getImplicitPrototype_75180610019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1345;

    public RecordType_getImplicitPrototype_75180610019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1345 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1345, term1345.getClass(), "properties", null);
        setBooleanField(term1345, term1345.getClass(), "isFrozen", false);
        setField(term1345, term1345.getClass(), "className", null);
        setField(term1345, term1345.getClass(), "properties", null);
        setBooleanField(term1345, term1345.getClass(), "nativeType", false);
        setField(term1345, term1345.getClass(), "implicitPrototypeFallback", null);
        setField(term1345, term1345.getClass(), "ownerFunction", null);
        setBooleanField(term1345, term1345.getClass(), "prettyPrint", false);
        setBooleanField(term1345, term1345.getClass(), "visited", false);
        setField(term1345, term1345.getClass(), "docInfo", null);
        setBooleanField(term1345, term1345.getClass(), "unknown", false);
        setBooleanField(term1345, term1345.getClass(), "resolved", false);
        setField(term1345, term1345.getClass(), "resolveResult", null);
        setField(term1345, term1345.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getImplicitPrototype", argTypes, term1345, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


