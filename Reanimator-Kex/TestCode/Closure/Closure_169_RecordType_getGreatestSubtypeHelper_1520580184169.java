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
import java.lang.StackOverflowError;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RecordType_getGreatestSubtypeHelper_1520580184169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71588;
     Object term71686;

    public RecordType_getGreatestSubtypeHelper_1520580184169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term71686 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term71784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term71784, term71784.getClass(), "referencedType", term71784);
        setField(term71686, term71686.getClass(), "referencedType", term71784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term71686;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term71588, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


