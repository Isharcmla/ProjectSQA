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

public class RenameLabels_process_15092268030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11855;
     Object term11925;

    public RenameLabels_process_15092268030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11855 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term11855, term11855.getClass(), "compiler", null);
        term11925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11925, term11925.getClass(), "type", 0);
        setField(term12065, term12065.getClass(), "next", null);
        setIntField(term12065, term12065.getClass(), "type", 126);
        setField(term12065, term12065.getClass(), "first", term12135);
        setField(term11995, term11995.getClass(), "next", term12065);
        setIntField(term11995, term11995.getClass(), "type", 117);
        setField(term11995, term11995.getClass(), "first", null);
        setField(term11925, term11925.getClass(), "first", term11995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11925;
        try {
            callMethod(klass, "process", argTypes, term11855, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


