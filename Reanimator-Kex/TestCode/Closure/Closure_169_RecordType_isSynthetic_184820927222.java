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

public class RecordType_isSynthetic_184820927222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2173;
     Object term2437;

    public RecordType_isSynthetic_184820927222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term2173, term2173.getClass(), "properties", null);
        setBooleanField(term2173, term2173.getClass(), "declared", false);
        setBooleanField(term2173, term2173.getClass(), "isFrozen", false);
        setField(term2173, term2173.getClass(), "className", null);
        setField(term2173, term2173.getClass(), "properties", null);
        setBooleanField(term2173, term2173.getClass(), "nativeType", false);
        setField(term2173, term2173.getClass(), "implicitPrototypeFallback", null);
        setField(term2173, term2173.getClass(), "ownerFunction", null);
        setBooleanField(term2173, term2173.getClass(), "prettyPrint", false);
        setBooleanField(term2173, term2173.getClass(), "visited", false);
        setField(term2173, term2173.getClass(), "docInfo", null);
        setBooleanField(term2173, term2173.getClass(), "unknown", false);
        setBooleanField(term2173, term2173.getClass(), "resolved", false);
        setField(term2173, term2173.getClass(), "resolveResult", null);
        setBooleanField(term2173, term2173.getClass(), "inTemplatedCheckVisit", false);
        setField(term2173, term2173.getClass(), "registry", null);
        term2437 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term2437, term2437.getClass(), "properties", null);
        setBooleanField(term2437, term2437.getClass(), "declared", false);
        setBooleanField(term2437, term2437.getClass(), "isFrozen", false);
        setField(term2437, term2437.getClass(), "className", null);
        setField(term2437, term2437.getClass(), "properties", null);
        setBooleanField(term2437, term2437.getClass(), "nativeType", false);
        setField(term2437, term2437.getClass(), "implicitPrototypeFallback", null);
        setField(term2437, term2437.getClass(), "ownerFunction", null);
        setBooleanField(term2437, term2437.getClass(), "prettyPrint", false);
        setBooleanField(term2437, term2437.getClass(), "visited", false);
        setField(term2437, term2437.getClass(), "docInfo", null);
        setBooleanField(term2437, term2437.getClass(), "unknown", false);
        setBooleanField(term2437, term2437.getClass(), "resolved", false);
        setField(term2437, term2437.getClass(), "resolveResult", null);
        setBooleanField(term2437, term2437.getClass(), "inTemplatedCheckVisit", false);
        setField(term2437, term2437.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSynthetic", argTypes, term2173, args);
        assertTrue(recursiveEquals(term2173, term2437));
        assertTrue(recursiveEquals(retValue, true));
    }

};


