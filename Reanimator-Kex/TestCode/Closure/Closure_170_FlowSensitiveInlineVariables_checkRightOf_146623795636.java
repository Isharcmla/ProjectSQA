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

public class FlowSensitiveInlineVariables_checkRightOf_146623795636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5203;
     Object term5343;
     Object term5443;

    public FlowSensitiveInlineVariables_checkRightOf_146623795636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5273, term5273.getClass(), "type", 0);
        setField(term5273, term5273.getClass(), "next", term5273);
        setField(term5203, term5203.getClass(), "next", term5273);
        term5343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term5443 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector$2"));
        setBooleanField(term5443, term5443.getClass(), "val$assumeMinimumCapture", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term5203;
        args[1] = term5343;
        args[2] = term5443;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


