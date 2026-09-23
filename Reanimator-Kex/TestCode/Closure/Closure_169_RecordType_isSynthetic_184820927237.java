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

public class RecordType_isSynthetic_184820927237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4918;
     Object term5081;

    public RecordType_isSynthetic_184820927237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setBooleanField(term4918, term4918.getClass(), "declared", true);
        term5081 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term5081, term5081.getClass(), "properties", null);
        setBooleanField(term5081, term5081.getClass(), "declared", true);
        setBooleanField(term5081, term5081.getClass(), "isFrozen", false);
        setField(term5081, term5081.getClass(), "className", null);
        setField(term5081, term5081.getClass(), "properties", null);
        setBooleanField(term5081, term5081.getClass(), "nativeType", false);
        setField(term5081, term5081.getClass(), "implicitPrototypeFallback", null);
        setField(term5081, term5081.getClass(), "ownerFunction", null);
        setBooleanField(term5081, term5081.getClass(), "prettyPrint", false);
        setBooleanField(term5081, term5081.getClass(), "visited", false);
        setField(term5081, term5081.getClass(), "docInfo", null);
        setBooleanField(term5081, term5081.getClass(), "unknown", false);
        setBooleanField(term5081, term5081.getClass(), "resolved", false);
        setField(term5081, term5081.getClass(), "resolveResult", null);
        setBooleanField(term5081, term5081.getClass(), "inTemplatedCheckVisit", false);
        setField(term5081, term5081.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSynthetic", argTypes, term4918, args);
        assertTrue(recursiveEquals(term4918, term5081));
        assertTrue(recursiveEquals(retValue, false));
    }

};


