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

public class RecordType_getGreatestSubtypeHelper_1520580184152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45796;
     Object term45932;

    public RecordType_getGreatestSubtypeHelper_1520580184152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term45836 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term45796, term45796.getClass(), "registry", null);
        setField(term45796, term45796.getClass(), "properties", term45836);
        term45932 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term45972 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term45932, term45932.getClass(), "properties", term45972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term45932;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term45796, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


