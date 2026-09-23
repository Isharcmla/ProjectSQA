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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233506;
     Object term233598;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233506 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term233598 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term233690 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term233786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term233878 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term233974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setIntField(term233598, term233598.getClass(), "type", 46);
        setIntField(term233690, term233690.getClass(), "type", 1);
        setField(term233690, term233690.getClass(), "jsType", term233786);
        setField(term233598, term233598.getClass(), "first", term233690);
        setIntField(term233878, term233878.getClass(), "type", 46);
        setField(term233878, term233878.getClass(), "jsType", term233974);
        setField(term233598, term233598.getClass(), "last", term233878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term233598;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term233506, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


