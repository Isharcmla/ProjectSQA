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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359738;
     Object term359830;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359738 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term359830 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term359922 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term360014 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term360124 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term360216 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term360310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setIntField(term359830, term359830.getClass(), "type", 111);
        setIntField(term360014, term360014.getClass(), "type", 0);
        setField(term360014, term360014.getClass(), "jsType", term360124);
        setField(term359922, term359922.getClass(), "first", term360014);
        setField(term359830, term359830.getClass(), "parent", term359922);
        setIntField(term360216, term360216.getClass(), "type", -201326593);
        setField(term360216, term360216.getClass(), "jsType", term360310);
        setField(term359830, term359830.getClass(), "first", term360216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term359830;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term359738, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


