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

public class RecordType_getGreatestSubtypeHelper_1520580184150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41659;
     Object term41861;

    public RecordType_getGreatestSubtypeHelper_1520580184150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41659 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term41763 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term41659, term41659.getClass(), "registry", term41763);
        term41861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term41965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term41861, term41861.getClass(), "referencedType", term41965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term41861;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term41659, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


