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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7625;
     Object term7905;
     Object term8011;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term7765, term7765.getClass(), "first", term7835);
        setField(term7695, term7695.getClass(), "parent", term7765);
        setField(term7625, term7625.getClass(), "parent", term7695);
        term7905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term8011 = newInstance(Class.forName("com.google.javascript.jscomp.SideEffectsAnalysis$2"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term7625;
        args[1] = term7905;
        args[2] = term8011;
        try {
            callMethod(klass, "checkLeftOf", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


