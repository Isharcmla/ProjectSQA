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

public class AnalyzePrototypeProperties_process_194761923619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24560;
     Object term24630;

    public AnalyzePrototypeProperties_process_194761923619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24560 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setBooleanField(term24560, term24560.getClass(), "canModifyExterns", false);
        setField(term24560, term24560.getClass(), "compiler", null);
        setField(term24560, term24560.getClass(), "globalNode", null);
        term24630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24630, term24630.getClass(), "type", 0);
        setField(term24630, term24630.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term24630;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term24560, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


