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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382345;
     Object term382437;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term382345 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term382437 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term382529 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term382621 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term382719 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term382811 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term382917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setIntField(term382437, term382437.getClass(), "type", 111);
        setIntField(term382621, term382621.getClass(), "type", 0);
        setField(term382621, term382621.getClass(), "jsType", term382719);
        setField(term382529, term382529.getClass(), "first", term382621);
        setField(term382437, term382437.getClass(), "parent", term382529);
        setIntField(term382811, term382811.getClass(), "type", 111);
        setField(term382811, term382811.getClass(), "jsType", term382917);
        setField(term382437, term382437.getClass(), "first", term382811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term382437;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term382345, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


