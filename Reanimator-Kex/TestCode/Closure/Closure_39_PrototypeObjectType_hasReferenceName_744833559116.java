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

public class PrototypeObjectType_hasReferenceName_744833559116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16201;
     Object term41159;

    public PrototypeObjectType_hasReferenceName_744833559116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16201 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term16201, term16201.getClass(), "className", null);
        term41159 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term41159, term41159.getClass(), "className", null);
        setField(term41159, term41159.getClass(), "properties", null);
        setBooleanField(term41159, term41159.getClass(), "nativeType", false);
        setField(term41159, term41159.getClass(), "implicitPrototypeFallback", null);
        setField(term41159, term41159.getClass(), "ownerFunction", null);
        setBooleanField(term41159, term41159.getClass(), "prettyPrint", false);
        setBooleanField(term41159, term41159.getClass(), "visited", false);
        setField(term41159, term41159.getClass(), "docInfo", null);
        setBooleanField(term41159, term41159.getClass(), "unknown", false);
        setBooleanField(term41159, term41159.getClass(), "resolved", false);
        setField(term41159, term41159.getClass(), "resolveResult", null);
        setField(term41159, term41159.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasReferenceName", argTypes, term16201, args);
        assertTrue(recursiveEquals(term16201, term41159));
        assertTrue(recursiveEquals(retValue, false));
    }

};


