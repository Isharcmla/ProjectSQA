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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491168;
     Object term491260;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term491168 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term491260 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term491352 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term491458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term491528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term491640 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setIntField(term491260, term491260.getClass(), "type", 45);
        setIntField(term491352, term491352.getClass(), "type", 1);
        setField(term491352, term491352.getClass(), "jsType", term491458);
        setField(term491260, term491260.getClass(), "first", term491352);
        setIntField(term491528, term491528.getClass(), "type", -16386);
        setField(term491528, term491528.getClass(), "jsType", term491640);
        setField(term491260, term491260.getClass(), "last", term491528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term491260;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term491168, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


