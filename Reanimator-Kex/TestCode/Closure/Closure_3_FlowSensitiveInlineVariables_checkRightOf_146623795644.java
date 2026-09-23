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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FlowSensitiveInlineVariables_checkRightOf_146623795644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7114;
     Object term7254;
     Object term7366;

    public FlowSensitiveInlineVariables_checkRightOf_146623795644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term7114, term7114.getClass(), "next", term7184);
        term7254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Class<? extends Object> term7402 = Class.forName((String) "org.apache.tools.ant.types.selectors.SelectorUtils");
        term7366 = newInstance(Class.forName("com.google.common.base.Predicates$InstanceOfPredicate"));
        setField(term7366, term7366.getClass(), "clazz", term7402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term7114;
        args[1] = term7254;
        args[2] = term7366;
        try {
            callMethod(klass, "checkRightOf", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


