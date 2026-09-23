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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13679;
     Object term13959;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term13819, term13819.getClass(), "first", term13749);
        setField(term13819, term13819.getClass(), "parent", term13889);
        setField(term13749, term13749.getClass(), "parent", term13819);
        setField(term13679, term13679.getClass(), "parent", term13749);
        term13959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term13679;
        args[1] = term13959;
        args[2] = null;
        callMethod(klass, "checkLeftOf", argTypes, null, args);
    }

};


