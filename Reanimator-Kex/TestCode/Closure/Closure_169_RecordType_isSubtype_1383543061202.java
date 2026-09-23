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

public class RecordType_isSubtype_1383543061202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86796;
     Object term86896;

    public RecordType_isSubtype_1383543061202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setBooleanField(term86796, term86796.getClass(), "unknown", true);
        term86896 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term86996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term86896, term86896.getClass(), "unknown", true);
        setBooleanField(term86996, term86996.getClass(), "nativeType", false);
        setBooleanField(term86996, term86996.getClass(), "unknown", false);
        setField(term86896, term86896.getClass(), "implicitPrototypeFallback", term86996);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term86896;
        try {
            callMethod(klass, "isSubtype", argTypes, term86796, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


