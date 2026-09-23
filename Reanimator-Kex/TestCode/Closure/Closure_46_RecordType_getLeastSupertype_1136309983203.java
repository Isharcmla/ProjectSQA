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

public class RecordType_getLeastSupertype_1136309983203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70083;
     Object term70181;

    public RecordType_getLeastSupertype_1136309983203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term70181 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term70279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term70367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term70279, term70279.getClass(), "referencedType", term70367);
        setField(term70181, term70181.getClass(), "referencedType", term70279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term70181;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term70083, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


