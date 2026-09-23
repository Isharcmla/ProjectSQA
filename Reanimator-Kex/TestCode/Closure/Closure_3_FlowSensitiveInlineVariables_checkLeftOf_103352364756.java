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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13994;
     Object term14204;
     Object term14310;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term14064, term14064.getClass(), "parent", term14064);
        setIntField(term14134, term14134.getClass(), "type", 112);
        setField(term14134, term14134.getClass(), "next", term14064);
        setField(term14064, term14064.getClass(), "first", term14134);
        setField(term13994, term13994.getClass(), "parent", term14064);
        term14204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term14310 = newInstance(Class.forName("com.google.javascript.jscomp.SideEffectsAnalysis$2"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term13994;
        args[1] = term14204;
        args[2] = term14310;
        callMethod(klass, "checkLeftOf", argTypes, null, args);
    }

};


