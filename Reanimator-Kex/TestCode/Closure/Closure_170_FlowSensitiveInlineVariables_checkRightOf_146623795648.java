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

public class FlowSensitiveInlineVariables_checkRightOf_146623795648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9459;
     Object term9599;
     Object term9677;

    public FlowSensitiveInlineVariables_checkRightOf_146623795648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term9459, term9459.getClass(), "next", term9529);
        term9599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term9677 = newInstance(Class.forName("com.google.common.base.CharMatcher$4"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term9459;
        args[1] = term9599;
        args[2] = term9677;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


