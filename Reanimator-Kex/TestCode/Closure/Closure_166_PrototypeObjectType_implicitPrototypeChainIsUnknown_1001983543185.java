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
import java.lang.Object;

public class PrototypeObjectType_implicitPrototypeChainIsUnknown_1001983543185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31393;
     Object term61587;

    public PrototypeObjectType_implicitPrototypeChainIsUnknown_1001983543185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term31507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term31393, term31393.getClass(), "implicitPrototypeFallback", term31507);
        term61587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term61588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term61587, term61587.getClass(), "className", null);
        setField(term61587, term61587.getClass(), "properties", null);
        setBooleanField(term61587, term61587.getClass(), "nativeType", false);
        setField(term61588, term61588.getClass(), "className", null);
        setField(term61588, term61588.getClass(), "properties", null);
        setBooleanField(term61588, term61588.getClass(), "nativeType", false);
        setField(term61588, term61588.getClass(), "implicitPrototypeFallback", null);
        setField(term61588, term61588.getClass(), "ownerFunction", null);
        setBooleanField(term61588, term61588.getClass(), "prettyPrint", false);
        setBooleanField(term61588, term61588.getClass(), "visited", false);
        setField(term61588, term61588.getClass(), "docInfo", null);
        setBooleanField(term61588, term61588.getClass(), "unknown", false);
        setBooleanField(term61588, term61588.getClass(), "resolved", false);
        setField(term61588, term61588.getClass(), "resolveResult", null);
        setBooleanField(term61588, term61588.getClass(), "inTemplatedCheckVisit", false);
        setField(term61588, term61588.getClass(), "registry", null);
        setField(term61587, term61587.getClass(), "implicitPrototypeFallback", term61588);
        setField(term61587, term61587.getClass(), "ownerFunction", null);
        setBooleanField(term61587, term61587.getClass(), "prettyPrint", false);
        setBooleanField(term61587, term61587.getClass(), "visited", false);
        setField(term61587, term61587.getClass(), "docInfo", null);
        setBooleanField(term61587, term61587.getClass(), "unknown", false);
        setBooleanField(term61587, term61587.getClass(), "resolved", false);
        setField(term61587, term61587.getClass(), "resolveResult", null);
        setBooleanField(term61587, term61587.getClass(), "inTemplatedCheckVisit", false);
        setField(term61587, term61587.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "implicitPrototypeChainIsUnknown", argTypes, term31393, args);
        assertTrue(recursiveEquals(term31393, term61587));
        assertTrue(recursiveEquals(retValue, false));
    }

};


