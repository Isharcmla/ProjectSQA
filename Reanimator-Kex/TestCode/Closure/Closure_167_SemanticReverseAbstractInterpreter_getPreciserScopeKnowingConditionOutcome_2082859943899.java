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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285790;
     Object term285882;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285790 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term285882 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term285974 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term286068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term286160 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term286252 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setIntField(term285882, term285882.getClass(), "type", 46);
        setIntField(term285974, term285974.getClass(), "type", 1);
        setField(term285974, term285974.getClass(), "jsType", term286068);
        setField(term285882, term285882.getClass(), "first", term285974);
        setIntField(term286160, term286160.getClass(), "type", 46);
        setField(term286160, term286160.getClass(), "jsType", term286252);
        setField(term285882, term285882.getClass(), "last", term286160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term285882;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term285790, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


