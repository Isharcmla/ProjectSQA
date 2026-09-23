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

public class RecordType_isEquivalentTo_948167372128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36354;
     Object term36452;

    public RecordType_isEquivalentTo_948167372128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36354 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term36452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term36550 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term36452, term36452.getClass(), "referencedType", term36550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term36452;
        try {
            callMethod(klass, "isEquivalentTo", argTypes, term36354, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


