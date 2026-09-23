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

public class RenameLabels_process_15092268033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14526;
     Object term14596;

    public RenameLabels_process_15092268033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14526 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term14526, term14526.getClass(), "compiler", null);
        term14596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14596, term14596.getClass(), "type", 0);
        setField(term14736, term14736.getClass(), "next", null);
        setIntField(term14736, term14736.getClass(), "type", 126);
        setField(term14666, term14666.getClass(), "next", term14736);
        setIntField(term14666, term14666.getClass(), "type", 117);
        setField(term14666, term14666.getClass(), "first", null);
        setField(term14596, term14596.getClass(), "first", term14666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term14596;
        try {
            callMethod(klass, "process", argTypes, term14526, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


