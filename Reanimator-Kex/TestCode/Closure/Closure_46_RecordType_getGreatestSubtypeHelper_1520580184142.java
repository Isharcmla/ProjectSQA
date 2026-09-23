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

public class RecordType_getGreatestSubtypeHelper_1520580184142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37668;
     Object term37766;

    public RecordType_getGreatestSubtypeHelper_1520580184142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term37766 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term37872 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term37766, term37766.getClass(), "referencedType", term37872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term37766;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term37668, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


