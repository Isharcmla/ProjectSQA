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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.type.EqualityUtils.*;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82477;
     Object term82569;
     Object term83186;
     Object term83187;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82477 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term82569 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term82661 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term82757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term82827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82569, term82569.getClass(), "type", 13);
        setIntField(term82661, term82661.getClass(), "type", -458766);
        setField(term82661, term82661.getClass(), "jsType", term82757);
        setField(term82569, term82569.getClass(), "first", term82661);
        setIntField(term82827, term82827.getClass(), "type", 13);
        setField(term82827, term82827.getClass(), "jsType", null);
        setField(term82569, term82569.getClass(), "last", term82827);
        term83186 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term83186, term83186.getClass(), "INEQ", null);
        setField(term83186, term83186.getClass(), "convention", null);
        setField(term83186, term83186.getClass(), "typeRegistry", null);
        setField(term83186, term83186.getClass(), "firstLink", null);
        setField(term83186, term83186.getClass(), "nextLink", null);
        setField(term83186, term83186.getClass(), "restrictUndefinedVisitor", null);
        setField(term83186, term83186.getClass(), "restrictNullVisitor", null);
        term83187 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term83188 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term83189 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term83190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term83187, term83187.getClass(), "number", 0.0);
        setIntField(term83187, term83187.getClass(), "type", 13);
        setField(term83187, term83187.getClass(), "next", null);
        setField(term83188, term83188.getClass(), "str", null);
        setIntField(term83188, term83188.getClass(), "type", -458766);
        setField(term83188, term83188.getClass(), "next", null);
        setField(term83188, term83188.getClass(), "first", null);
        setField(term83188, term83188.getClass(), "last", null);
        setField(term83188, term83188.getClass(), "propListHead", null);
        setIntField(term83188, term83188.getClass(), "sourcePosition", 0);
        setBooleanField(term83189, term83189.getClass(), "resolved", false);
        setField(term83189, term83189.getClass(), "resolveResult", null);
        setBooleanField(term83189, term83189.getClass(), "inTemplatedCheckVisit", false);
        setField(term83189, term83189.getClass(), "registry", null);
        setField(term83188, term83188.getClass(), "jsType", term83189);
        setField(term83188, term83188.getClass(), "parent", null);
        setField(term83187, term83187.getClass(), "first", term83188);
        setIntField(term83190, term83190.getClass(), "type", 13);
        setField(term83190, term83190.getClass(), "next", null);
        setField(term83190, term83190.getClass(), "first", null);
        setField(term83190, term83190.getClass(), "last", null);
        setField(term83190, term83190.getClass(), "propListHead", null);
        setIntField(term83190, term83190.getClass(), "sourcePosition", 0);
        setField(term83190, term83190.getClass(), "jsType", null);
        setField(term83190, term83190.getClass(), "parent", null);
        setField(term83187, term83187.getClass(), "last", term83190);
        setField(term83187, term83187.getClass(), "propListHead", null);
        setIntField(term83187, term83187.getClass(), "sourcePosition", 0);
        setField(term83187, term83187.getClass(), "jsType", null);
        setField(term83187, term83187.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term82569;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term82477, args);
        assertTrue(recursiveEquals(term82477, term83186));
        assertTrue(recursiveEquals(term82569, term83187));
        assertTrue(recursiveEquals(retValue, null));
    }

};


