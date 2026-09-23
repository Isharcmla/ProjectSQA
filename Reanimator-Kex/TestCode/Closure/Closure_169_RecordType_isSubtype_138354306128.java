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

public class RecordType_isSubtype_138354306128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2231;

    public RecordType_isSubtype_138354306128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2231 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term2231, term2231.getClass(), "properties", null);
        setBooleanField(term2231, term2231.getClass(), "declared", false);
        setBooleanField(term2231, term2231.getClass(), "isFrozen", false);
        setField(term2231, term2231.getClass(), "className", null);
        setField(term2231, term2231.getClass(), "properties", null);
        setBooleanField(term2231, term2231.getClass(), "nativeType", false);
        setField(term2231, term2231.getClass(), "implicitPrototypeFallback", null);
        setField(term2231, term2231.getClass(), "ownerFunction", null);
        setBooleanField(term2231, term2231.getClass(), "prettyPrint", false);
        setBooleanField(term2231, term2231.getClass(), "visited", false);
        setField(term2231, term2231.getClass(), "docInfo", null);
        setBooleanField(term2231, term2231.getClass(), "unknown", false);
        setBooleanField(term2231, term2231.getClass(), "resolved", false);
        setField(term2231, term2231.getClass(), "resolveResult", null);
        setBooleanField(term2231, term2231.getClass(), "inTemplatedCheckVisit", false);
        setField(term2231, term2231.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isSubtype", argTypes, term2231, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


