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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class FunctionTypeBuilder_isFunctionTypeDeclaration_141263269355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18613;
     Object term20036;

    public FunctionTypeBuilder_isFunctionTypeDeclaration_141263269355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18613 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term20036 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term20036, term20036.getClass(), "info", null);
        setField(term20036, term20036.getClass(), "documentation", null);
        setField(term20036, term20036.getClass(), "associatedNode", null);
        setField(term20036, term20036.getClass(), "visibility", null);
        setIntField(term20036, term20036.getClass(), "bitset", 0);
        setField(term20036, term20036.getClass(), "type", null);
        setField(term20036, term20036.getClass(), "thisType", null);
        setBooleanField(term20036, term20036.getClass(), "includeDocumentation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term18613;
        Object retValue = callMethod(klass, "isFunctionTypeDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term18613, term20036));
        assertTrue(recursiveEquals(retValue, false));
    }

};


