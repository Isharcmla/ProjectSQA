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

public class RecordType_toMaybeRecordType_2997245722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1368;
     Object term2397;

    public RecordType_toMaybeRecordType_2997245722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1368, term1368.getClass(), "properties", null);
        setBooleanField(term1368, term1368.getClass(), "isFrozen", false);
        setField(term1368, term1368.getClass(), "className", null);
        setField(term1368, term1368.getClass(), "properties", null);
        setBooleanField(term1368, term1368.getClass(), "nativeType", false);
        setField(term1368, term1368.getClass(), "implicitPrototypeFallback", null);
        setField(term1368, term1368.getClass(), "ownerFunction", null);
        setBooleanField(term1368, term1368.getClass(), "prettyPrint", false);
        setBooleanField(term1368, term1368.getClass(), "visited", false);
        setField(term1368, term1368.getClass(), "docInfo", null);
        setBooleanField(term1368, term1368.getClass(), "unknown", false);
        setBooleanField(term1368, term1368.getClass(), "resolved", false);
        setField(term1368, term1368.getClass(), "resolveResult", null);
        setField(term1368, term1368.getClass(), "registry", null);
        term2397 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term2397, term2397.getClass(), "properties", null);
        setBooleanField(term2397, term2397.getClass(), "isFrozen", false);
        setField(term2397, term2397.getClass(), "className", null);
        setField(term2397, term2397.getClass(), "properties", null);
        setBooleanField(term2397, term2397.getClass(), "nativeType", false);
        setField(term2397, term2397.getClass(), "implicitPrototypeFallback", null);
        setField(term2397, term2397.getClass(), "ownerFunction", null);
        setBooleanField(term2397, term2397.getClass(), "prettyPrint", false);
        setBooleanField(term2397, term2397.getClass(), "visited", false);
        setField(term2397, term2397.getClass(), "docInfo", null);
        setBooleanField(term2397, term2397.getClass(), "unknown", false);
        setBooleanField(term2397, term2397.getClass(), "resolved", false);
        setField(term2397, term2397.getClass(), "resolveResult", null);
        setField(term2397, term2397.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toMaybeRecordType", argTypes, term1368, args);
        assertTrue(recursiveEquals(term1368, term2397));
    }

};


