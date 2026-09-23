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

public class RecordType_getGreatestSubtypeHelper_1520580184156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47014;
     Object term47216;

    public RecordType_getGreatestSubtypeHelper_1520580184156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term47118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term47014, term47014.getClass(), "registry", term47118);
        term47216 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term47322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term47216, term47216.getClass(), "referencedType", term47322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term47216;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term47014, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


