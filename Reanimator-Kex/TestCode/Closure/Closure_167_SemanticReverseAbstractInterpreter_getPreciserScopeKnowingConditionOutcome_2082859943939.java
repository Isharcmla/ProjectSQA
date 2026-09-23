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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364418;
     Object term364510;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term364418 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term364510 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term364602 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term364716 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term364808 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term364914 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setIntField(term364510, term364510.getClass(), "type", 46);
        setIntField(term364602, term364602.getClass(), "type", 1689570495);
        setField(term364602, term364602.getClass(), "jsType", term364716);
        setField(term364510, term364510.getClass(), "first", term364602);
        setIntField(term364808, term364808.getClass(), "type", -1744109504);
        setField(term364808, term364808.getClass(), "jsType", term364914);
        setField(term364510, term364510.getClass(), "last", term364808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term364510;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term364418, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


