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

public class RecordType_getGreatestSubtypeHelper_1520580184160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49830;
     Object term50032;

    public RecordType_getGreatestSubtypeHelper_1520580184160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49830 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term49934 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term49830, term49830.getClass(), "registry", term49934);
        term50032 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term50124 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term50032, term50032.getClass(), "referencedType", term50124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term50032;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term49830, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


