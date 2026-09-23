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

public class RecordType_isSubtype_1383543061222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195678;
     Object term195890;

    public RecordType_isSubtype_1383543061222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195678 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term195782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term195678, term195678.getClass(), "unknown", false);
        setField(term195678, term195678.getClass(), "registry", term195782);
        term195890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term195982 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setBooleanField(term195890, term195890.getClass(), "unknown", true);
        setBooleanField(term195982, term195982.getClass(), "nativeType", false);
        setBooleanField(term195982, term195982.getClass(), "unknown", false);
        setField(term195890, term195890.getClass(), "implicitPrototypeFallback", term195982);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term195890;
        try {
            callMethod(klass, "isSubtype", argTypes, term195678, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


