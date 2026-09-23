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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22781;
     Object term23057;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22781 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term22873 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term22965 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term22873, term22873.getClass(), "parent", term22965);
        setField(term22781, term22781.getClass(), "parent", term22873);
        term23057 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term22781;
        args[1] = term23057;
        args[2] = null;
        callMethod(klass, "checkLeftOf", argTypes, null, args);
    }

};


