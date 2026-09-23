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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257735;
     Object term257973;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257735 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term257881 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$3"));
        setField(term257735, term257735.getClass(), "INEQ", term257881);
        term257973 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term258065 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term258173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term258265 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term258375 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term257973, term257973.getClass(), "type", 14);
        setIntField(term258065, term258065.getClass(), "type", 1907221824);
        setField(term258065, term258065.getClass(), "jsType", term258173);
        setField(term257973, term257973.getClass(), "first", term258065);
        setIntField(term258265, term258265.getClass(), "type", -1907226577);
        setField(term258265, term258265.getClass(), "jsType", term258375);
        setField(term257973, term257973.getClass(), "last", term258265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term257973;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term257735, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


