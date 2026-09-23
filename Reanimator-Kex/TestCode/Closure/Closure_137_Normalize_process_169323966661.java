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

public class Normalize_process_169323966661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1200355;
     Object term1200425;

    public Normalize_process_169323966661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1200355 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term1200355, term1200355.getClass(), "compiler", null);
        setBooleanField(term1200355, term1200355.getClass(), "assertOnChange", false);
        term1200425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1200495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1200425, term1200425.getClass(), "type", 105);
        setField(term1200495, term1200495.getClass(), "parent", null);
        setField(term1200425, term1200425.getClass(), "last", term1200495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1200425;
        try {
            callMethod(klass, "process", argTypes, term1200355, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


