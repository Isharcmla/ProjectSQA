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

public class FlowSensitiveInlineVariables_process_55946046580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22866;
     Object term22936;

    public FlowSensitiveInlineVariables_process_55946046580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22866 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term22866, term22866.getClass(), "compiler", null);
        term22936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22936, term22936.getClass(), "type", 0);
        setField(term22936, term22936.getClass(), "parent", null);
        setField(term23076, term23076.getClass(), "next", null);
        setIntField(term23076, term23076.getClass(), "type", 105);
        setField(term23076, term23076.getClass(), "first", null);
        setField(term23006, term23006.getClass(), "next", term23076);
        setIntField(term23006, term23006.getClass(), "type", 0);
        setField(term23146, term23146.getClass(), "next", null);
        setIntField(term23146, term23146.getClass(), "type", 0);
        setField(term23146, term23146.getClass(), "first", null);
        setField(term23006, term23006.getClass(), "first", term23146);
        setField(term22936, term22936.getClass(), "first", term23006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term22936;
        callMethod(klass, "process", argTypes, term22866, args);
    }

};


