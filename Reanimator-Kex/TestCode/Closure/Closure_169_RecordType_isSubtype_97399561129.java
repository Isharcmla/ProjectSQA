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

public class RecordType_isSubtype_97399561129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2240;

    public RecordType_isSubtype_97399561129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2240 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term2240, term2240.getClass(), "properties", null);
        setBooleanField(term2240, term2240.getClass(), "declared", false);
        setBooleanField(term2240, term2240.getClass(), "isFrozen", false);
        setField(term2240, term2240.getClass(), "className", null);
        setField(term2240, term2240.getClass(), "properties", null);
        setBooleanField(term2240, term2240.getClass(), "nativeType", false);
        setField(term2240, term2240.getClass(), "implicitPrototypeFallback", null);
        setField(term2240, term2240.getClass(), "ownerFunction", null);
        setBooleanField(term2240, term2240.getClass(), "prettyPrint", false);
        setBooleanField(term2240, term2240.getClass(), "visited", false);
        setField(term2240, term2240.getClass(), "docInfo", null);
        setBooleanField(term2240, term2240.getClass(), "unknown", false);
        setBooleanField(term2240, term2240.getClass(), "resolved", false);
        setField(term2240, term2240.getClass(), "resolveResult", null);
        setBooleanField(term2240, term2240.getClass(), "inTemplatedCheckVisit", false);
        setField(term2240, term2240.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "isSubtype", argTypes, term2240, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


