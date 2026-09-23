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

public class ProcessCommonJSModules_process_62786604761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32618;
     Object term32710;

    public ProcessCommonJSModules_process_62786604761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32618 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term32618, term32618.getClass(), "compiler", null);
        term32710 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term32780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32710, term32710.getClass(), "type", 0);
        setField(term32710, term32710.getClass(), "parent", null);
        setField(term32780, term32780.getClass(), "next", null);
        setIntField(term32780, term32780.getClass(), "type", 0);
        setField(term32850, term32850.getClass(), "next", null);
        setIntField(term32850, term32850.getClass(), "type", 33);
        setField(term32850, term32850.getClass(), "first", null);
        setField(term32780, term32780.getClass(), "first", term32850);
        setField(term32710, term32710.getClass(), "first", term32780);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term32710;
        try {
            callMethod(klass, "process", argTypes, term32618, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


