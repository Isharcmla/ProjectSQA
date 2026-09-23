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

public class RenameLabels_process_15092268045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21535;
     Object term21621;

    public RenameLabels_process_15092268045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21535 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term21535, term21535.getClass(), "compiler", null);
        term21621 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term21707 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term21777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21621, term21621.getClass(), "type", 0);
        setField(term21707, term21707.getClass(), "next", term21777);
        setIntField(term21707, term21707.getClass(), "type", 105);
        setField(term21621, term21621.getClass(), "first", term21707);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term21621;
        try {
            callMethod(klass, "process", argTypes, term21535, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


