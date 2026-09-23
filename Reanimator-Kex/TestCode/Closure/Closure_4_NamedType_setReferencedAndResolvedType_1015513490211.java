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

public class NamedType_setReferencedAndResolvedType_1015513490211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60767;
     Object term60720;

    public NamedType_setReferencedAndResolvedType_1015513490211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term60816 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term60865 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term60767, term60767.getClass(), "validator", null);
        setField(term60767, term60767.getClass(), "referencedType", term60816);
        setField(term60767, term60767.getClass(), "referencedObjType", term60865);
        term60720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term60720, term60720.getClass(), "primitiveType", term60767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term60720;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "setReferencedAndResolvedType", argTypes, term60767, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


