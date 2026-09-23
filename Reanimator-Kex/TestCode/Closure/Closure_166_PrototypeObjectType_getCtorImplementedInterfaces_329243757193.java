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

public class PrototypeObjectType_getCtorImplementedInterfaces_329243757193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34733;
     Object term63834;
     Object term63833;

    public PrototypeObjectType_getCtorImplementedInterfaces_329243757193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term34733, term34733.getClass(), "ownerFunction", null);
        term63834 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term63834, term63834.getClass(), "className", null);
        setField(term63834, term63834.getClass(), "properties", null);
        setBooleanField(term63834, term63834.getClass(), "nativeType", false);
        setField(term63834, term63834.getClass(), "implicitPrototypeFallback", null);
        setField(term63834, term63834.getClass(), "ownerFunction", null);
        setBooleanField(term63834, term63834.getClass(), "prettyPrint", false);
        setBooleanField(term63834, term63834.getClass(), "visited", false);
        setField(term63834, term63834.getClass(), "docInfo", null);
        setBooleanField(term63834, term63834.getClass(), "unknown", false);
        setBooleanField(term63834, term63834.getClass(), "resolved", false);
        setField(term63834, term63834.getClass(), "resolveResult", null);
        setBooleanField(term63834, term63834.getClass(), "inTemplatedCheckVisit", false);
        setField(term63834, term63834.getClass(), "registry", null);
        term63833 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableList"));
        setField(term63833, term63833.getClass(), "asList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCtorImplementedInterfaces", argTypes, term34733, args);
        assertTrue(recursiveEquals(term34733, term63834));
        assertTrue(recursiveEquals(retValue, term63833));
    }

};


