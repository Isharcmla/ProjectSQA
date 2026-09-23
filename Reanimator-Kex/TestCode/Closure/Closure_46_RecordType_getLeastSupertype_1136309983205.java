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

public class RecordType_getLeastSupertype_1136309983205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70816;
     Object term70914;

    public RecordType_getLeastSupertype_1136309983205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70816 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term70914 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term71012 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term71104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term71012, term71012.getClass(), "referencedType", term71104);
        setField(term70914, term70914.getClass(), "referencedType", term71012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term70914;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term70816, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


