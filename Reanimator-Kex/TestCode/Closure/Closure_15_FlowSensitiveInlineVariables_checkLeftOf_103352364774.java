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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17753;
     Object term18009;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term17823, term17823.getClass(), "parent", term17823);
        setField(term17823, term17823.getClass(), "first", term17893);
        setField(term17753, term17753.getClass(), "parent", term17823);
        term18009 = newInstance(Class.forName("com.google.common.collect.StandardTable$Column$Values$2"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term17753;
        args[1] = null;
        args[2] = term18009;
        callMethod(klass, "checkLeftOf", argTypes, null, args);
    }

};


