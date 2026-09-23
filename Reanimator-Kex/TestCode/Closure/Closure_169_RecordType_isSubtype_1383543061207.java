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

public class RecordType_isSubtype_1383543061207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89833;
     Object term89933;

    public RecordType_isSubtype_1383543061207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term89933 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term90033 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setBooleanField(term89933, term89933.getClass(), "unknown", true);
        setField(term89933, term89933.getClass(), "ownerFunction", term90033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term89933;
        try {
            callMethod(klass, "isSubtype", argTypes, term89833, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


