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

public class AnalyzePrototypeProperties_process_194761923623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27436;
     Object term27506;
     Object term27646;

    public AnalyzePrototypeProperties_process_194761923623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27436 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setBooleanField(term27436, term27436.getClass(), "canModifyExterns", false);
        setField(term27436, term27436.getClass(), "compiler", null);
        setField(term27436, term27436.getClass(), "globalNode", null);
        term27506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27506, term27506.getClass(), "type", 0);
        setField(term27576, term27576.getClass(), "next", null);
        setIntField(term27576, term27576.getClass(), "type", 0);
        setField(term27576, term27576.getClass(), "first", null);
        setField(term27506, term27506.getClass(), "first", term27576);
        term27646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term27506;
        args[1] = term27646;
        try {
            callMethod(klass, "process", argTypes, term27436, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


