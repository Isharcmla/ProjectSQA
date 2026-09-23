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
import java.util.HashSet;
import java.util.HashMap;

public class AmbiguateProperties_process_91500793150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190630;
     Object term191281;
     Object term191386;

    public AmbiguateProperties_process_91500793150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term190758 = new HashSet();
        HashSet term190906 = new HashSet();
        HashMap term191002 = new HashMap();
        term190630 = newInstance(Class.forName("com.google.javascript.jscomp.AmbiguateProperties"));
        Object term190710 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term190630, term190630.getClass(), "compiler", term190710);
        setField(term190630, term190630.getClass(), "externedNames", term190758);
        setField(term190630, term190630.getClass(), "quotedNames", term190906);
        setField(term190630, term190630.getClass(), "propertyMap", term191002);
        term191281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term191316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term191281, term191281.getClass(), "type", 0);
        setField(term191316, term191316.getClass(), "next", null);
        setIntField(term191316, term191316.getClass(), "type", 0);
        setField(term191316, term191316.getClass(), "first", null);
        setField(term191281, term191281.getClass(), "first", term191316);
        term191386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term191456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term191386, term191386.getClass(), "type", 0);
        setField(term191456, term191456.getClass(), "next", null);
        setIntField(term191456, term191456.getClass(), "type", 0);
        setField(term191456, term191456.getClass(), "first", null);
        setField(term191386, term191386.getClass(), "first", term191456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term191281;
        args[1] = term191386;
        try {
            callMethod(klass, "process", argTypes, term190630, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


