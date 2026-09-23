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

public class RecordType_isEquivalentTo_94816737256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10034;
     Object term10130;
     Object term10144;
     Object term10145;

    public RecordType_isEquivalentTo_94816737256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10034 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term10130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        term10144 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term10144, term10144.getClass(), "properties", null);
        setBooleanField(term10144, term10144.getClass(), "isFrozen", false);
        setField(term10144, term10144.getClass(), "className", null);
        setField(term10144, term10144.getClass(), "properties", null);
        setBooleanField(term10144, term10144.getClass(), "nativeType", false);
        setField(term10144, term10144.getClass(), "implicitPrototypeFallback", null);
        setField(term10144, term10144.getClass(), "ownerFunction", null);
        setBooleanField(term10144, term10144.getClass(), "prettyPrint", false);
        setBooleanField(term10144, term10144.getClass(), "visited", false);
        setField(term10144, term10144.getClass(), "docInfo", null);
        setBooleanField(term10144, term10144.getClass(), "unknown", false);
        setBooleanField(term10144, term10144.getClass(), "resolved", false);
        setField(term10144, term10144.getClass(), "resolveResult", null);
        setField(term10144, term10144.getClass(), "registry", null);
        term10145 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setBooleanField(term10145, term10145.getClass(), "resolved", false);
        setField(term10145, term10145.getClass(), "resolveResult", null);
        setField(term10145, term10145.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term10130;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term10034, args);
        assertTrue(recursiveEquals(term10034, term10144));
        assertTrue(recursiveEquals(term10130, term10145));
        assertTrue(recursiveEquals(retValue, false));
    }

};


