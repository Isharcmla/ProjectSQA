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

public class RecordType_toMaybeRecordType_2997245725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1451;
     Object term2728;

    public RecordType_toMaybeRecordType_2997245725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1451 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1451, term1451.getClass(), "properties", null);
        setBooleanField(term1451, term1451.getClass(), "isFrozen", false);
        setField(term1451, term1451.getClass(), "className", null);
        setField(term1451, term1451.getClass(), "properties", null);
        setBooleanField(term1451, term1451.getClass(), "nativeType", false);
        setField(term1451, term1451.getClass(), "implicitPrototypeFallback", null);
        setField(term1451, term1451.getClass(), "ownerFunction", null);
        setBooleanField(term1451, term1451.getClass(), "prettyPrint", false);
        setBooleanField(term1451, term1451.getClass(), "visited", false);
        setField(term1451, term1451.getClass(), "docInfo", null);
        setBooleanField(term1451, term1451.getClass(), "unknown", false);
        setBooleanField(term1451, term1451.getClass(), "resolved", false);
        setField(term1451, term1451.getClass(), "resolveResult", null);
        setField(term1451, term1451.getClass(), "registry", null);
        term2728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term2728, term2728.getClass(), "properties", null);
        setBooleanField(term2728, term2728.getClass(), "isFrozen", false);
        setField(term2728, term2728.getClass(), "className", null);
        setField(term2728, term2728.getClass(), "properties", null);
        setBooleanField(term2728, term2728.getClass(), "nativeType", false);
        setField(term2728, term2728.getClass(), "implicitPrototypeFallback", null);
        setField(term2728, term2728.getClass(), "ownerFunction", null);
        setBooleanField(term2728, term2728.getClass(), "prettyPrint", false);
        setBooleanField(term2728, term2728.getClass(), "visited", false);
        setField(term2728, term2728.getClass(), "docInfo", null);
        setBooleanField(term2728, term2728.getClass(), "unknown", false);
        setBooleanField(term2728, term2728.getClass(), "resolved", false);
        setField(term2728, term2728.getClass(), "resolveResult", null);
        setField(term2728, term2728.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toMaybeRecordType", argTypes, term1451, args);
        assertTrue(recursiveEquals(term1451, term2728));
    }

};


