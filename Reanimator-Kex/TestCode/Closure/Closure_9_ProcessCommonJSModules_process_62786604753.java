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

public class ProcessCommonJSModules_process_62786604753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17165;
     Object term17235;

    public ProcessCommonJSModules_process_62786604753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17165 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term17165, term17165.getClass(), "compiler", null);
        term17235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17235, term17235.getClass(), "type", 37);
        setField(term17235, term17235.getClass(), "parent", null);
        setField(term17375, term17375.getClass(), "next", null);
        setIntField(term17375, term17375.getClass(), "type", 0);
        setField(term17375, term17375.getClass(), "first", null);
        setField(term17305, term17305.getClass(), "next", term17375);
        setIntField(term17305, term17305.getClass(), "type", 38);
        setField(term17445, term17445.getClass(), "next", null);
        setIntField(term17445, term17445.getClass(), "type", 0);
        setField(term17445, term17445.getClass(), "first", null);
        setField(term17305, term17305.getClass(), "first", term17445);
        setField(term17235, term17235.getClass(), "first", term17305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17235;
        try {
            callMethod(klass, "process", argTypes, term17165, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


