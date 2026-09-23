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
import java.lang.Boolean;

public class RecordType_checkRecordEquivalenceHelper_1934915223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2182;
     Object term2191;

    public RecordType_checkRecordEquivalenceHelper_1934915223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term2182, term2182.getClass(), "properties", null);
        setBooleanField(term2182, term2182.getClass(), "declared", false);
        setBooleanField(term2182, term2182.getClass(), "isFrozen", false);
        setField(term2182, term2182.getClass(), "className", null);
        setField(term2182, term2182.getClass(), "properties", null);
        setBooleanField(term2182, term2182.getClass(), "nativeType", false);
        setField(term2182, term2182.getClass(), "implicitPrototypeFallback", null);
        setField(term2182, term2182.getClass(), "ownerFunction", null);
        setBooleanField(term2182, term2182.getClass(), "prettyPrint", false);
        setBooleanField(term2182, term2182.getClass(), "visited", false);
        setField(term2182, term2182.getClass(), "docInfo", null);
        setBooleanField(term2182, term2182.getClass(), "unknown", false);
        setBooleanField(term2182, term2182.getClass(), "resolved", false);
        setField(term2182, term2182.getClass(), "resolveResult", null);
        setBooleanField(term2182, term2182.getClass(), "inTemplatedCheckVisit", false);
        setField(term2182, term2182.getClass(), "registry", null);
        term2191 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2191;
        try {
            callMethod(klass, "checkRecordEquivalenceHelper", argTypes, term2182, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


