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

public class RecordType_getGreatestSubtypeHelper_1520580184172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74022;
     Object term74224;

    public RecordType_getGreatestSubtypeHelper_1520580184172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74022 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term74126 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term74022, term74022.getClass(), "registry", term74126);
        term74224 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term74324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term74420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setField(term74324, term74324.getClass(), "referencedType", term74420);
        setField(term74224, term74224.getClass(), "referencedType", term74324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term74224;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term74022, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


