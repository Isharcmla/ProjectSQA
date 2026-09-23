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

public class Normalize_process_169323966687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1999169;
     Object term1999239;

    public Normalize_process_169323966687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1999169 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term1999169, term1999169.getClass(), "compiler", null);
        setBooleanField(term1999169, term1999169.getClass(), "assertOnChange", false);
        term1999239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1999331 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term1999239, term1999239.getClass(), "type", 126);
        setIntField(term1999331, term1999331.getClass(), "type", 113);
        setField(term1999239, term1999239.getClass(), "last", term1999331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1999239;
        try {
            callMethod(klass, "process", argTypes, term1999169, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


