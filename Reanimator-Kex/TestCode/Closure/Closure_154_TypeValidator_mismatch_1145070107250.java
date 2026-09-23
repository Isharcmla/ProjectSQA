package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeValidator_mismatch_1145070107250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80682;
     Object term80772;
     Object term80908;
     Object term81124;

    public TypeValidator_mismatch_1145070107250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80682 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term80772 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term80772, term80772.getClass(), "sourceName", "");
        term80908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term81026 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term80908, term80908.getClass(), "referencedType", term81026);
        term81124 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = term80772;
        args[1] = null;
        args[2] = null;
        args[3] = term80908;
        args[4] = term81124;
        try {
            callMethod(klass, "mismatch", argTypes, term80682, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


