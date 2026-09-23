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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RecordType_isSubtype_1383543061146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64577;
     Object term64789;

    public RecordType_isSubtype_1383543061146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64577 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term64681 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term64577, term64577.getClass(), "unknown", false);
        setField(term64577, term64577.getClass(), "registry", term64681);
        term64789 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term64893 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term64789, term64789.getClass(), "unknown", true);
        setBooleanField(term64893, term64893.getClass(), "nativeType", false);
        setBooleanField(term64893, term64893.getClass(), "unknown", false);
        setField(term64789, term64789.getClass(), "implicitPrototypeFallback", term64893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term64789;
        try {
            callMethod(klass, "isSubtype", argTypes, term64577, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


