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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271947;
     Object term272039;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271947 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term272039 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term272131 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term272255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term272347 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term272445 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setIntField(term272039, term272039.getClass(), "type", 46);
        setIntField(term272131, term272131.getClass(), "type", 34);
        setField(term272131, term272131.getClass(), "jsType", term272255);
        setField(term272039, term272039.getClass(), "first", term272131);
        setIntField(term272347, term272347.getClass(), "type", -8227);
        setField(term272347, term272347.getClass(), "jsType", term272445);
        setField(term272039, term272039.getClass(), "last", term272347);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term272039;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term271947, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


