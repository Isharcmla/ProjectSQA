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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119027;
     Object term119119;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119027 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term119119 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term119211 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term119311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term119403 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term119499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setIntField(term119119, term119119.getClass(), "type", 13);
        setIntField(term119211, term119211.getClass(), "type", 0);
        setField(term119311, term119311.getClass(), "referencedType", term119311);
        setField(term119211, term119211.getClass(), "jsType", term119311);
        setField(term119119, term119119.getClass(), "first", term119211);
        setIntField(term119403, term119403.getClass(), "type", 0);
        setField(term119403, term119403.getClass(), "jsType", term119499);
        setField(term119119, term119119.getClass(), "last", term119403);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term119119;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term119027, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


