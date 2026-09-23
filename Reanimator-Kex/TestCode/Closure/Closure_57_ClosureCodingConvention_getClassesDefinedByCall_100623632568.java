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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ClosureCodingConvention_getClassesDefinedByCall_100623632568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43690;
     Object term43760;

    public ClosureCodingConvention_getClassesDefinedByCall_100623632568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43690 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term43760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term43760, term43760.getClass(), "first", term43760);
        setIntField(term43760, term43760.getClass(), "type", 38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43760;
        try {
            callMethod(klass, "getClassesDefinedByCall", argTypes, term43690, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


