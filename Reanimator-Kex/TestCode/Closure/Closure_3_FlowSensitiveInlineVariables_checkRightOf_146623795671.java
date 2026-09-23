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
import java.lang.String;

public class FlowSensitiveInlineVariables_checkRightOf_146623795671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19551;
     Object term19755;

    public FlowSensitiveInlineVariables_checkRightOf_146623795671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19643 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term19551, term19551.getClass(), "next", term19643);
        Class<? extends Object> term19791 = Class.forName((String) "org.apache.tools.ant.taskdefs.optional.jsp.JspC");
        term19755 = newInstance(Class.forName("com.google.common.base.Predicates$InstanceOfPredicate"));
        setField(term19755, term19755.getClass(), "clazz", term19791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term19551;
        args[1] = null;
        args[2] = term19755;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


