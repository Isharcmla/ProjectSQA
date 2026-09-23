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

public class FlowSensitiveInlineVariables_checkRightOf_146623795686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25509;
     Object term25649;
     Object term25741;

    public FlowSensitiveInlineVariables_checkRightOf_146623795686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25579, term25579.getClass(), "type", 37);
        setField(term25509, term25509.getClass(), "next", term25579);
        term25649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term25741 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term25509;
        args[1] = term25649;
        args[2] = term25741;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


