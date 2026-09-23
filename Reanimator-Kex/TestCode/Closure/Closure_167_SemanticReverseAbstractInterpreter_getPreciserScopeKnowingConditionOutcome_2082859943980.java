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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384733;
     Object term384825;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term384733 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term384825 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term384917 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term385013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term385105 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term385201 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setIntField(term384825, term384825.getClass(), "type", 45);
        setIntField(term384917, term384917.getClass(), "type", 0);
        setField(term384917, term384917.getClass(), "jsType", term385013);
        setField(term384825, term384825.getClass(), "first", term384917);
        setIntField(term385105, term385105.getClass(), "type", 0);
        setField(term385105, term385105.getClass(), "jsType", term385201);
        setField(term384825, term384825.getClass(), "last", term385105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term384825;
        args[1] = null;
        args[2] = true;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term384733, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


