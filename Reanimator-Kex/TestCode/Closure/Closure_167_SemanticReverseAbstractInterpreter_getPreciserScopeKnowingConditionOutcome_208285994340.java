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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6876;
     Object term6946;
     Object term7522;
     Object term7523;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6876 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term6946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6946, term6946.getClass(), "type", 14);
        term7522 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term7522, term7522.getClass(), "INEQ", null);
        setField(term7522, term7522.getClass(), "convention", null);
        setField(term7522, term7522.getClass(), "typeRegistry", null);
        setField(term7522, term7522.getClass(), "firstLink", null);
        setField(term7522, term7522.getClass(), "nextLink", null);
        setField(term7522, term7522.getClass(), "restrictUndefinedVisitor", null);
        setField(term7522, term7522.getClass(), "restrictNullVisitor", null);
        term7523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7523, term7523.getClass(), "type", 14);
        setField(term7523, term7523.getClass(), "next", null);
        setField(term7523, term7523.getClass(), "first", null);
        setField(term7523, term7523.getClass(), "last", null);
        setField(term7523, term7523.getClass(), "propListHead", null);
        setIntField(term7523, term7523.getClass(), "sourcePosition", 0);
        setField(term7523, term7523.getClass(), "jsType", null);
        setField(term7523, term7523.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term6946;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term6876, args);
        assertTrue(recursiveEquals(term6876, term7522));
        assertTrue(recursiveEquals(term6946, term7523));
        assertTrue(recursiveEquals(retValue, null));
    }

};


