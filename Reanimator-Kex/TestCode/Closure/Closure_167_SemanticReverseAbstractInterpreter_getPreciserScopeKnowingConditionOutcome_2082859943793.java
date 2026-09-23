package com.google.javascript.jscomp.type;

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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239684;
     Object term239890;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239684 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term239798 = newInstance(Class.forName("com.google.common.collect.Ordering$ArbitraryOrdering$1"));
        setField(term239684, term239684.getClass(), "INEQ", term239798);
        term239890 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term239982 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term240076 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setIntField(term239890, term239890.getClass(), "type", 16);
        setIntField(term239982, term239982.getClass(), "type", 16);
        setField(term239982, term239982.getClass(), "jsType", term240076);
        setField(term239890, term239890.getClass(), "first", term239982);
        setField(term239890, term239890.getClass(), "last", term239890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term239890;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term239684, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


