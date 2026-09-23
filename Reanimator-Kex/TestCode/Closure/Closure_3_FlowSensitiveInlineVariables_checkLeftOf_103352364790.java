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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27374;
     Object term27644;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27444, term27444.getClass(), "parent", term27444);
        setField(term27444, term27444.getClass(), "first", term27514);
        setField(term27374, term27374.getClass(), "parent", term27444);
        term27644 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables$IdentifyConstants"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term27374;
        args[1] = null;
        args[2] = term27644;
        callMethod(klass, "checkLeftOf", argTypes, null, args);
    }

};


