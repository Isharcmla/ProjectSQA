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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133041;
     Object term133133;
     Object term133380;
     Object term133381;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133041 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term133133 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133225 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term133317 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term133133, term133133.getClass(), "type", 13);
        setIntField(term133225, term133225.getClass(), "type", -14);
        setField(term133133, term133133.getClass(), "first", term133225);
        setIntField(term133317, term133317.getClass(), "type", 13);
        setField(term133133, term133133.getClass(), "last", term133317);
        term133380 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term133380, term133380.getClass(), "INEQ", null);
        setField(term133380, term133380.getClass(), "convention", null);
        setField(term133380, term133380.getClass(), "typeRegistry", null);
        setField(term133380, term133380.getClass(), "firstLink", null);
        setField(term133380, term133380.getClass(), "nextLink", null);
        setField(term133380, term133380.getClass(), "restrictUndefinedVisitor", null);
        setField(term133380, term133380.getClass(), "restrictNullVisitor", null);
        term133381 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term133382 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term133383 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term133381, term133381.getClass(), "number", 0.0);
        setIntField(term133381, term133381.getClass(), "type", 13);
        setField(term133381, term133381.getClass(), "next", null);
        setField(term133382, term133382.getClass(), "str", null);
        setIntField(term133382, term133382.getClass(), "type", -14);
        setField(term133382, term133382.getClass(), "next", null);
        setField(term133382, term133382.getClass(), "first", null);
        setField(term133382, term133382.getClass(), "last", null);
        setField(term133382, term133382.getClass(), "propListHead", null);
        setIntField(term133382, term133382.getClass(), "sourcePosition", 0);
        setField(term133382, term133382.getClass(), "jsType", null);
        setField(term133382, term133382.getClass(), "parent", null);
        setField(term133381, term133381.getClass(), "first", term133382);
        setDoubleField(term133383, term133383.getClass(), "number", 0.0);
        setIntField(term133383, term133383.getClass(), "type", 13);
        setField(term133383, term133383.getClass(), "next", null);
        setField(term133383, term133383.getClass(), "first", null);
        setField(term133383, term133383.getClass(), "last", null);
        setField(term133383, term133383.getClass(), "propListHead", null);
        setIntField(term133383, term133383.getClass(), "sourcePosition", 0);
        setField(term133383, term133383.getClass(), "jsType", null);
        setField(term133383, term133383.getClass(), "parent", null);
        setField(term133381, term133381.getClass(), "last", term133383);
        setField(term133381, term133381.getClass(), "propListHead", null);
        setIntField(term133381, term133381.getClass(), "sourcePosition", 0);
        setField(term133381, term133381.getClass(), "jsType", null);
        setField(term133381, term133381.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term133133;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term133041, args);
        assertTrue(recursiveEquals(term133041, term133380));
        assertTrue(recursiveEquals(term133133, term133381));
        assertTrue(recursiveEquals(retValue, null));
    }

};


