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

public class FlowSensitiveInlineVariables_checkRightOf_146623795673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19465;
     Object term19605;
     Object term19705;

    public FlowSensitiveInlineVariables_checkRightOf_146623795673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19535, term19535.getClass(), "type", 0);
        setField(term19535, term19535.getClass(), "next", term19535);
        setField(term19465, term19465.getClass(), "next", term19535);
        term19605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term19705 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector$2"));
        setBooleanField(term19705, term19705.getClass(), "val$assumeMinimumCapture", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term19465;
        args[1] = term19605;
        args[2] = term19705;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


