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

public class RecordType_resolveInternal_72326652325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1389;

    public RecordType_resolveInternal_72326652325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1389, term1389.getClass(), "properties", null);
        setBooleanField(term1389, term1389.getClass(), "isFrozen", false);
        setField(term1389, term1389.getClass(), "className", null);
        setField(term1389, term1389.getClass(), "properties", null);
        setBooleanField(term1389, term1389.getClass(), "nativeType", false);
        setField(term1389, term1389.getClass(), "implicitPrototypeFallback", null);
        setField(term1389, term1389.getClass(), "ownerFunction", null);
        setBooleanField(term1389, term1389.getClass(), "prettyPrint", false);
        setBooleanField(term1389, term1389.getClass(), "visited", false);
        setField(term1389, term1389.getClass(), "docInfo", null);
        setBooleanField(term1389, term1389.getClass(), "unknown", false);
        setBooleanField(term1389, term1389.getClass(), "resolved", false);
        setField(term1389, term1389.getClass(), "resolveResult", null);
        setField(term1389, term1389.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "resolveInternal", argTypes, term1389, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


