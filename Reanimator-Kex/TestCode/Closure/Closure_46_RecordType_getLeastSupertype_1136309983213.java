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

public class RecordType_getLeastSupertype_1136309983213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134441;
     Object term134539;

    public RecordType_getLeastSupertype_1136309983213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term134539 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term134637 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term134761 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term134637, term134637.getClass(), "referencedType", term134761);
        setField(term134539, term134539.getClass(), "referencedType", term134637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term134539;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term134441, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


