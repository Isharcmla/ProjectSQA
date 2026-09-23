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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256700;
     Object term256792;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256700 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term256792 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term256884 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term256982 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term257052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term257156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term256792, term256792.getClass(), "type", 12);
        setIntField(term256884, term256884.getClass(), "type", 1);
        setField(term256884, term256884.getClass(), "jsType", term256982);
        setField(term256792, term256792.getClass(), "first", term256884);
        setIntField(term257052, term257052.getClass(), "type", -16386);
        setField(term257052, term257052.getClass(), "jsType", term257156);
        setField(term256792, term256792.getClass(), "last", term257052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term256792;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term256700, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


