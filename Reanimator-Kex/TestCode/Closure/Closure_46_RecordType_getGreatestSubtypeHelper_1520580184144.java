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

public class RecordType_getGreatestSubtypeHelper_1520580184144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38247;
     Object term38345;

    public RecordType_getGreatestSubtypeHelper_1520580184144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38247 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term38345 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term38441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setField(term38345, term38345.getClass(), "referencedType", term38441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term38345;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term38247, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


