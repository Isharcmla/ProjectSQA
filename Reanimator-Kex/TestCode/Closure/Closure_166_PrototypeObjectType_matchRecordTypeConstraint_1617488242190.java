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
import java.util.HashMap;

public class PrototypeObjectType_matchRecordTypeConstraint_1617488242190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33461;
     Object term33575;
     Object term62633;
     Object term62634;

    public PrototypeObjectType_matchRecordTypeConstraint_1617488242190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        HashMap term33623 = new HashMap();
        term33575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term33575, term33575.getClass(), "properties", term33623);
        term62633 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term62633, term62633.getClass(), "className", null);
        setField(term62633, term62633.getClass(), "properties", null);
        setBooleanField(term62633, term62633.getClass(), "nativeType", false);
        setField(term62633, term62633.getClass(), "implicitPrototypeFallback", null);
        setField(term62633, term62633.getClass(), "ownerFunction", null);
        setBooleanField(term62633, term62633.getClass(), "prettyPrint", false);
        setBooleanField(term62633, term62633.getClass(), "visited", false);
        setField(term62633, term62633.getClass(), "docInfo", null);
        setBooleanField(term62633, term62633.getClass(), "unknown", false);
        setBooleanField(term62633, term62633.getClass(), "resolved", false);
        setField(term62633, term62633.getClass(), "resolveResult", null);
        setBooleanField(term62633, term62633.getClass(), "inTemplatedCheckVisit", false);
        setField(term62633, term62633.getClass(), "registry", null);
        HashMap term62635 = new HashMap();
        term62634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term62634, term62634.getClass(), "className", null);
        setField(term62634, term62634.getClass(), "properties", term62635);
        setBooleanField(term62634, term62634.getClass(), "nativeType", false);
        setField(term62634, term62634.getClass(), "implicitPrototypeFallback", null);
        setField(term62634, term62634.getClass(), "ownerFunction", null);
        setBooleanField(term62634, term62634.getClass(), "prettyPrint", false);
        setBooleanField(term62634, term62634.getClass(), "visited", false);
        setField(term62634, term62634.getClass(), "docInfo", null);
        setBooleanField(term62634, term62634.getClass(), "unknown", false);
        setBooleanField(term62634, term62634.getClass(), "resolved", false);
        setField(term62634, term62634.getClass(), "resolveResult", null);
        setBooleanField(term62634, term62634.getClass(), "inTemplatedCheckVisit", false);
        setField(term62634, term62634.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term33575;
        callMethod(klass, "matchRecordTypeConstraint", argTypes, term33461, args);
        assertTrue(recursiveEquals(term33461, term62633));
        assertTrue(recursiveEquals(term33575, term62634));
    }

};


