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

public class RecordType_isEquivalentTo_94816737254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9913;
     Object term9926;
     Object term9927;

    public RecordType_isEquivalentTo_94816737254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9913 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term9926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term9926, term9926.getClass(), "properties", null);
        setBooleanField(term9926, term9926.getClass(), "isFrozen", false);
        setField(term9926, term9926.getClass(), "className", null);
        setField(term9926, term9926.getClass(), "properties", null);
        setBooleanField(term9926, term9926.getClass(), "nativeType", false);
        setField(term9926, term9926.getClass(), "implicitPrototypeFallback", null);
        setField(term9926, term9926.getClass(), "ownerFunction", null);
        setBooleanField(term9926, term9926.getClass(), "prettyPrint", false);
        setBooleanField(term9926, term9926.getClass(), "visited", false);
        setField(term9926, term9926.getClass(), "docInfo", null);
        setBooleanField(term9926, term9926.getClass(), "unknown", false);
        setBooleanField(term9926, term9926.getClass(), "resolved", false);
        setField(term9926, term9926.getClass(), "resolveResult", null);
        setField(term9926, term9926.getClass(), "registry", null);
        term9927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term9927, term9927.getClass(), "properties", null);
        setBooleanField(term9927, term9927.getClass(), "isFrozen", false);
        setField(term9927, term9927.getClass(), "className", null);
        setField(term9927, term9927.getClass(), "properties", null);
        setBooleanField(term9927, term9927.getClass(), "nativeType", false);
        setField(term9927, term9927.getClass(), "implicitPrototypeFallback", null);
        setField(term9927, term9927.getClass(), "ownerFunction", null);
        setBooleanField(term9927, term9927.getClass(), "prettyPrint", false);
        setBooleanField(term9927, term9927.getClass(), "visited", false);
        setField(term9927, term9927.getClass(), "docInfo", null);
        setBooleanField(term9927, term9927.getClass(), "unknown", false);
        setBooleanField(term9927, term9927.getClass(), "resolved", false);
        setField(term9927, term9927.getClass(), "resolveResult", null);
        setField(term9927, term9927.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term9913;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term9913, args);
        assertTrue(recursiveEquals(term9913, term9926));
        assertTrue(recursiveEquals(term9913, term9927));
        assertTrue(recursiveEquals(retValue, true));
    }

};


