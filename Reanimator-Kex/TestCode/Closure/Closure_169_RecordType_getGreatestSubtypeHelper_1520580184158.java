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

public class RecordType_getGreatestSubtypeHelper_1520580184158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68001;
     Object term68099;

    public RecordType_getGreatestSubtypeHelper_1520580184158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term68099 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term68199 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term68291 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term68199, term68199.getClass(), "referencedType", term68291);
        setField(term68099, term68099.getClass(), "referencedType", term68199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term68099;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term68001, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


