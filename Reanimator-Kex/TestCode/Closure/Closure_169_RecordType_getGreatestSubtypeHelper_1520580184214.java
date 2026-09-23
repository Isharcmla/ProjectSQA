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

public class RecordType_getGreatestSubtypeHelper_1520580184214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186204;
     Object term186406;

    public RecordType_getGreatestSubtypeHelper_1520580184214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term186308 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term186204, term186204.getClass(), "registry", term186308);
        term186406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term186506 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term186598 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term186506, term186506.getClass(), "referencedType", term186598);
        setField(term186406, term186406.getClass(), "referencedType", term186506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term186406;
        try {
            callMethod(klass, "getGreatestSubtypeHelper", argTypes, term186204, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


