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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FlowSensitiveInlineVariables_checkRightOf_146623795624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3620;
     Object term3760;
     Object term3830;

    public FlowSensitiveInlineVariables_checkRightOf_146623795624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3620, term3620.getClass(), "next", term3690);
        term3760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term3830 = newInstance(Class.forName("com.google.common.collect.Maps$4"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3620;
        args[1] = term3760;
        args[2] = term3830;
        try {
            callMethod(klass, "checkRightOf", argTypes, null, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


