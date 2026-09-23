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

public class AnalyzePrototypeProperties_process_194761923611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8951;
     Object term9021;

    public AnalyzePrototypeProperties_process_194761923611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8951 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setBooleanField(term8951, term8951.getClass(), "canModifyExterns", false);
        setField(term8951, term8951.getClass(), "compiler", null);
        term9021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9021, term9021.getClass(), "type", 0);
        setField(term9021, term9021.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term9021;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term8951, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


