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

public class RecordType_isSubtype_1383543061208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90156;
     Object term90256;

    public RecordType_isSubtype_1383543061208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term90256 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term90356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term90256, term90256.getClass(), "unknown", true);
        setBooleanField(term90356, term90356.getClass(), "nativeType", true);
        setField(term90256, term90256.getClass(), "implicitPrototypeFallback", term90356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term90256;
        try {
            callMethod(klass, "isSubtype", argTypes, term90156, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


