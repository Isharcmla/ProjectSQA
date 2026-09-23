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

public class FlowSensitiveInlineVariables_checkRightOf_146623795681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23784;
     Object term23994;
     Object term24106;

    public FlowSensitiveInlineVariables_checkRightOf_146623795681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term23854, term23854.getClass(), "next", null);
        setField(term23784, term23784.getClass(), "next", term23854);
        setField(term23784, term23784.getClass(), "parent", term23924);
        term23994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Class<? extends Object> term24142 = Class.forName((String) "java.util.SimpleTimeZone");
        term24106 = newInstance(Class.forName("com.google.common.base.Predicates$InstanceOfPredicate"));
        setField(term24106, term24106.getClass(), "clazz", term24142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term23784;
        args[1] = term23994;
        args[2] = term24106;
        callMethod(klass, "checkRightOf", argTypes, null, args);
    }

};


