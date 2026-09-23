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

public class NamedType_checkEnumElementCycle_59616581693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17851;

    public NamedType_checkEnumElementCycle_59616581693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17851 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term17957 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term17957, term17957.getClass(), "primitiveType", term17851);
        setField(term17851, term17851.getClass(), "referencedType", term17957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "checkEnumElementCycle", argTypes, term17851, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


