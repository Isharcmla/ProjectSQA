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

public class NamedType_checkEnumElementCycle_596165816139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31102;

    public NamedType_checkEnumElementCycle_596165816139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31102 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term31208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term31312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term31208, term31208.getClass(), "primitiveType", term31102);
        setField(term31102, term31102.getClass(), "referencedType", term31208);
        setField(term31102, term31102.getClass(), "registry", term31312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "checkEnumElementCycle", argTypes, term31102, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


