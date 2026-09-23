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

public class PrepareAst_process_67029103021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1661;
     Object term22324;

    public PrepareAst_process_67029103021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1661 = newInstance(Class.forName("com.google.javascript.jscomp.PrepareAst"));
        setBooleanField(term1661, term1661.getClass(), "checkOnly", false);
        term22324 = newInstance(Class.forName("com.google.javascript.jscomp.PrepareAst"));
        setField(term22324, term22324.getClass(), "compiler", null);
        setBooleanField(term22324, term22324.getClass(), "checkOnly", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "process", argTypes, term1661, args);
        assertTrue(recursiveEquals(term1661, term22324));
    }

};


