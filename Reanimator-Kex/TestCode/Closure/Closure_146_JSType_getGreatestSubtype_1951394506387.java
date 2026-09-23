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

public class JSType_getGreatestSubtype_1951394506387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92570;
     Object term92760;

    public JSType_getGreatestSubtype_1951394506387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92570 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term92662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setBooleanField(term92662, term92662.getClass(), "unknown", false);
        setField(term92570, term92570.getClass(), "referencedType", term92662);
        term92760 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term92860 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term92760, term92760.getClass(), "referencedType", term92860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term92570;
        args[1] = term92760;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


