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

public class MakeDeclaredNamesUnique_findDeclaredNames_160439403027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2693;
     Object term2763;
     Object term2903;

    public MakeDeclaredNamesUnique_findDeclaredNames_160439403027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2693 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        term2763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2763, term2763.getClass(), "type", -765206803);
        setIntField(term2833, term2833.getClass(), "type", 765206802);
        setField(term2833, term2833.getClass(), "first", term2833);
        setField(term2763, term2763.getClass(), "first", term2833);
        term2903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2903, term2903.getClass(), "type", -765206803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Object[] args = new Object[3];
        args[0] = term2763;
        args[1] = term2903;
        args[2] = null;
        try {
            callMethod(klass, "findDeclaredNames", argTypes, term2693, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


