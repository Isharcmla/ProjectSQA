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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class VarCheck_process_146632422065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20879;
     Object term20949;

    public VarCheck_process_146632422065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20879 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        setBooleanField(term20879, term20879.getClass(), "sanityCheck", false);
        setField(term20879, term20879.getClass(), "compiler", null);
        term20949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20949, term20949.getClass(), "type", 0);
        setField(term21089, term21089.getClass(), "next", term21159);
        setIntField(term21089, term21089.getClass(), "type", 0);
        setField(term21089, term21089.getClass(), "first", term21089);
        setField(term21019, term21019.getClass(), "next", term21089);
        setIntField(term21019, term21019.getClass(), "type", 0);
        setField(term21019, term21019.getClass(), "first", null);
        setField(term20949, term20949.getClass(), "first", term21019);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term20949;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term20879, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


