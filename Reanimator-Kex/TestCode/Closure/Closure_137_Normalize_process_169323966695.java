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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Normalize_process_169323966695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2003760;
     Object term2003910;

    public Normalize_process_169323966695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2003760 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2003840 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2003760, term2003760.getClass(), "compiler", term2003840);
        setBooleanField(term2003760, term2003760.getClass(), "assertOnChange", false);
        term2003910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2004050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2003910, term2003910.getClass(), "type", 126);
        setIntField(term2003980, term2003980.getClass(), "type", 0);
        setField(term2003980, term2003980.getClass(), "propListHead", null);
        setIntField(term2003980, term2003980.getClass(), "sourcePosition", 0);
        setField(term2003980, term2003980.getClass(), "next", term2004050);
        setField(term2003910, term2003910.getClass(), "last", term2003980);
        setField(term2003910, term2003910.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2003910;
        try {
            callMethod(klass, "process", argTypes, term2003760, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


