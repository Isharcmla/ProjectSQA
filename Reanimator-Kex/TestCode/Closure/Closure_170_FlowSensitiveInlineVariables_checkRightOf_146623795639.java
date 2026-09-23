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

public class FlowSensitiveInlineVariables_checkRightOf_146623795639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6431;
     Object term6641;
     Object term6741;

    public FlowSensitiveInlineVariables_checkRightOf_146623795639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6501, term6501.getClass(), "type", 0);
        setField(term6501, term6501.getClass(), "next", null);
        setField(term6431, term6431.getClass(), "next", term6501);
        setField(term6431, term6431.getClass(), "parent", term6571);
        term6641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term6741 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector$2"));
        setBooleanField(term6741, term6741.getClass(), "val$assumeMinimumCapture", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term6431;
        args[1] = term6641;
        args[2] = term6741;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


