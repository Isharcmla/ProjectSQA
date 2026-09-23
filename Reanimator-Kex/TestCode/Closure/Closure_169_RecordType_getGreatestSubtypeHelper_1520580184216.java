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

public class RecordType_getGreatestSubtypeHelper_1520580184216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188561;
     Object term188763;

    public RecordType_getGreatestSubtypeHelper_1520580184216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188561 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term188665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term188561, term188561.getClass(), "registry", term188665);
        term188763 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term188863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term188959 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term188863, term188863.getClass(), "referencedType", term188959);
        setField(term188763, term188763.getClass(), "referencedType", term188863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term188763;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term188561, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


