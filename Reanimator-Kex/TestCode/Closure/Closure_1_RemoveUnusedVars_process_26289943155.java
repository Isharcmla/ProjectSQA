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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RemoveUnusedVars_process_26289943155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15057;
     Object term15127;

    public RemoveUnusedVars_process_26289943155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15057 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setBooleanField(term15057, term15057.getClass(), "modifyCallSites", false);
        setField(term15057, term15057.getClass(), "compiler", null);
        setBooleanField(term15057, term15057.getClass(), "removeGlobals", false);
        term15127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15127, term15127.getClass(), "type", 0);
        setIntField(term15197, term15197.getClass(), "type", 0);
        setIntField(term15267, term15267.getClass(), "type", 0);
        setField(term15267, term15267.getClass(), "first", null);
        setField(term15267, term15267.getClass(), "next", null);
        setField(term15197, term15197.getClass(), "first", term15267);
        setIntField(term15337, term15337.getClass(), "type", 0);
        setField(term15337, term15337.getClass(), "first", null);
        setField(term15337, term15337.getClass(), "next", null);
        setField(term15197, term15197.getClass(), "next", term15337);
        setField(term15127, term15127.getClass(), "first", term15197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term15127;
        args[2] = null;
        callMethod(klass, "process", argTypes, term15057, args);
    }

};
