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

public class MakeDeclaredNamesUnique_findDeclaredNames_160439403039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6212;
     Object term6282;
     Object term6422;

    public MakeDeclaredNamesUnique_findDeclaredNames_160439403039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6212 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        term6282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6282, term6282.getClass(), "type", -765206803);
        setIntField(term6352, term6352.getClass(), "type", 765206802);
        setField(term6352, term6352.getClass(), "first", term6352);
        setField(term6282, term6282.getClass(), "first", term6352);
        term6422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6422, term6422.getClass(), "type", -765206803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Object[] args = new Object[3];
        args[0] = term6282;
        args[1] = term6422;
        args[2] = null;
        try {
            callMethod(klass, "findDeclaredNames", argTypes, term6212, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


