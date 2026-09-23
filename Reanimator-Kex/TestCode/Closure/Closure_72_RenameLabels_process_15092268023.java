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

public class RenameLabels_process_15092268023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8034;
     Object term8104;

    public RenameLabels_process_15092268023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8034 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term8034, term8034.getClass(), "compiler", null);
        term8104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8104, term8104.getClass(), "type", 0);
        setField(term8244, term8244.getClass(), "next", term8174);
        setIntField(term8244, term8244.getClass(), "type", 126);
        setField(term8174, term8174.getClass(), "next", term8244);
        setIntField(term8174, term8174.getClass(), "type", 117);
        setField(term8174, term8174.getClass(), "first", null);
        setField(term8104, term8104.getClass(), "first", term8174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term8104;
        try {
            callMethod(klass, "process", argTypes, term8034, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


