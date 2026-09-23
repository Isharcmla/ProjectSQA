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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23156;
     Object term23366;
     Object term23472;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term23226, term23226.getClass(), "parent", term23226);
        setIntField(term23296, term23296.getClass(), "type", 117);
        setField(term23226, term23226.getClass(), "first", term23296);
        setField(term23156, term23156.getClass(), "parent", term23226);
        term23366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term23472 = newInstance(Class.forName("com.google.javascript.jscomp.SideEffectsAnalysis$2"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term23156;
        args[1] = term23366;
        args[2] = term23472;
        callMethod(klass, "checkLeftOf", argTypes, null, args);
    }

};


