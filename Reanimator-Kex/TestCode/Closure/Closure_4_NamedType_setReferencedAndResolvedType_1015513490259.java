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

public class NamedType_setReferencedAndResolvedType_1015513490259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83231;
     Object term83184;

    public NamedType_setReferencedAndResolvedType_1015513490259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83231 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term83284 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term83336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term83231, term83231.getClass(), "validator", null);
        setField(term83231, term83231.getClass(), "referencedType", term83284);
        setField(term83231, term83231.getClass(), "referencedObjType", null);
        setField(term83231, term83231.getClass(), "registry", term83336);
        term83184 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term83184, term83184.getClass(), "primitiveType", term83231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term83184;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "setReferencedAndResolvedType", argTypes, term83231, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


