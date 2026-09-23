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

public class AnalyzePrototypeProperties_process_194761923621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25738;
     Object term25808;
     Object term25948;

    public AnalyzePrototypeProperties_process_194761923621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25738 = newInstance(Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setBooleanField(term25738, term25738.getClass(), "canModifyExterns", false);
        setField(term25738, term25738.getClass(), "compiler", null);
        setField(term25738, term25738.getClass(), "globalNode", null);
        term25808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25808, term25808.getClass(), "type", 0);
        setField(term25878, term25878.getClass(), "next", null);
        setIntField(term25878, term25878.getClass(), "type", 0);
        setField(term25878, term25878.getClass(), "first", null);
        setField(term25808, term25808.getClass(), "first", term25878);
        term25948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term25808;
        args[1] = term25948;
        try {
            callMethod(klass, "process", argTypes, term25738, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


