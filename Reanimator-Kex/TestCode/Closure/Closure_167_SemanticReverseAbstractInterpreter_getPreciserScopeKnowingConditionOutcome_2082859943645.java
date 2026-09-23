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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184684;
     Object term184776;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184684 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term184776 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term184868 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term184960 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term185066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term185136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term184776, term184776.getClass(), "type", 111);
        setIntField(term184960, term184960.getClass(), "type", 4);
        setField(term184960, term184960.getClass(), "jsType", term185066);
        setField(term184868, term184868.getClass(), "first", term184960);
        setField(term184776, term184776.getClass(), "parent", term184868);
        setIntField(term185136, term185136.getClass(), "type", -4194317);
        setField(term185136, term185136.getClass(), "jsType", term185066);
        setField(term184776, term184776.getClass(), "first", term185136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term184776;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term184684, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


