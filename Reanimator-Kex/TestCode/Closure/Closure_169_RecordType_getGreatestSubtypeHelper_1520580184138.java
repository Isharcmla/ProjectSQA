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

public class RecordType_getGreatestSubtypeHelper_1520580184138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55884;
     Object term56086;

    public RecordType_getGreatestSubtypeHelper_1520580184138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55884 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term55988 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term55884, term55884.getClass(), "registry", term55988);
        term56086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term56190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term56086, term56086.getClass(), "referencedType", term56190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term56086;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term55884, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


