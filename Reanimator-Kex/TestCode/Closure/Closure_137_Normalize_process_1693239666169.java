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

public class Normalize_process_1693239666169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2440434;
     Object term2440600;

    public Normalize_process_1693239666169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2440434 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2440514 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2440434, term2440434.getClass(), "compiler", term2440514);
        setBooleanField(term2440434, term2440434.getClass(), "assertOnChange", false);
        term2440600 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2440692 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2440600, term2440600.getClass(), "type", 126);
        setIntField(term2440692, term2440692.getClass(), "type", 117);
        setField(term2440600, term2440600.getClass(), "last", term2440692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2440600;
        try {
            callMethod(klass, "process", argTypes, term2440434, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


