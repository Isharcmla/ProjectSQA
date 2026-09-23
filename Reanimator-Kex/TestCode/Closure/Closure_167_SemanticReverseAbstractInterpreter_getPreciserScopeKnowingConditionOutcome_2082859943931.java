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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360958;
     Object term361050;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term360958 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term361050 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term361142 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term361240 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term361332 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term361456 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setIntField(term361050, term361050.getClass(), "type", 13);
        setIntField(term361142, term361142.getClass(), "type", 0);
        setField(term361142, term361142.getClass(), "jsType", term361240);
        setField(term361050, term361050.getClass(), "first", term361142);
        setIntField(term361332, term361332.getClass(), "type", 13);
        setField(term361332, term361332.getClass(), "jsType", term361456);
        setField(term361050, term361050.getClass(), "last", term361332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term361050;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term360958, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


