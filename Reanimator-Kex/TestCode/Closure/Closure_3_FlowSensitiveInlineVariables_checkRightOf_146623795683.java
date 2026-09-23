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

public class FlowSensitiveInlineVariables_checkRightOf_146623795683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24544;
     Object term24684;
     Object term24764;

    public FlowSensitiveInlineVariables_checkRightOf_146623795683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term24544, term24544.getClass(), "next", term24614);
        term24684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term24764 = newInstance(Class.forName("com.google.common.base.CharMatcher$13"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term24544;
        args[1] = term24684;
        args[2] = term24764;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


