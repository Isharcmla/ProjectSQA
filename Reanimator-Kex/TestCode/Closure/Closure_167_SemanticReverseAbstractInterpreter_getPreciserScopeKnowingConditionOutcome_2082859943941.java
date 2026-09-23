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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365631;
     Object term365723;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365631 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term365723 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term365815 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term365913 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term366005 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term366111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setIntField(term365723, term365723.getClass(), "type", 111);
        setField(term365815, term365815.getClass(), "first", term365815);
        setIntField(term365815, term365815.getClass(), "type", 111);
        setField(term365815, term365815.getClass(), "jsType", term365913);
        setField(term365723, term365723.getClass(), "parent", term365815);
        setIntField(term366005, term366005.getClass(), "type", 0);
        setField(term366005, term366005.getClass(), "jsType", term366111);
        setField(term365723, term365723.getClass(), "first", term366005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term365723;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term365631, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


