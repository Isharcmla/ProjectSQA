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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410596;
     Object term410688;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410596 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term410688 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term410780 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term410872 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term410996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term411088 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term411212 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setIntField(term410688, term410688.getClass(), "type", 111);
        setIntField(term410872, term410872.getClass(), "type", 0);
        setField(term410872, term410872.getClass(), "jsType", term410996);
        setField(term410780, term410780.getClass(), "first", term410872);
        setField(term410688, term410688.getClass(), "parent", term410780);
        setIntField(term411088, term411088.getClass(), "type", 0);
        setField(term411088, term411088.getClass(), "jsType", term411212);
        setField(term410688, term410688.getClass(), "first", term411088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term410688;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term410596, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


