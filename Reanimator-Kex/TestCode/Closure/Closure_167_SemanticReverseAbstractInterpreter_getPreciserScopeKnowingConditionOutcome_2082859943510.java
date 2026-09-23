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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138954;
     Object term139046;
     Object term139735;
     Object term139736;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138954 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term139046 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term139138 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term139208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term139046, term139046.getClass(), "type", 12);
        setIntField(term139138, term139138.getClass(), "type", -13);
        setField(term139046, term139046.getClass(), "first", term139138);
        setIntField(term139208, term139208.getClass(), "type", 12);
        setField(term139046, term139046.getClass(), "last", term139208);
        term139735 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term139735, term139735.getClass(), "INEQ", null);
        setField(term139735, term139735.getClass(), "convention", null);
        setField(term139735, term139735.getClass(), "typeRegistry", null);
        setField(term139735, term139735.getClass(), "firstLink", null);
        setField(term139735, term139735.getClass(), "nextLink", null);
        setField(term139735, term139735.getClass(), "restrictUndefinedVisitor", null);
        setField(term139735, term139735.getClass(), "restrictNullVisitor", null);
        term139736 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term139737 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term139738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term139736, term139736.getClass(), "str", null);
        setIntField(term139736, term139736.getClass(), "type", 12);
        setField(term139736, term139736.getClass(), "next", null);
        setDoubleField(term139737, term139737.getClass(), "number", 0.0);
        setIntField(term139737, term139737.getClass(), "type", -13);
        setField(term139737, term139737.getClass(), "next", null);
        setField(term139737, term139737.getClass(), "first", null);
        setField(term139737, term139737.getClass(), "last", null);
        setField(term139737, term139737.getClass(), "propListHead", null);
        setIntField(term139737, term139737.getClass(), "sourcePosition", 0);
        setField(term139737, term139737.getClass(), "jsType", null);
        setField(term139737, term139737.getClass(), "parent", null);
        setField(term139736, term139736.getClass(), "first", term139737);
        setIntField(term139738, term139738.getClass(), "type", 12);
        setField(term139738, term139738.getClass(), "next", null);
        setField(term139738, term139738.getClass(), "first", null);
        setField(term139738, term139738.getClass(), "last", null);
        setField(term139738, term139738.getClass(), "propListHead", null);
        setIntField(term139738, term139738.getClass(), "sourcePosition", 0);
        setField(term139738, term139738.getClass(), "jsType", null);
        setField(term139738, term139738.getClass(), "parent", null);
        setField(term139736, term139736.getClass(), "last", term139738);
        setField(term139736, term139736.getClass(), "propListHead", null);
        setIntField(term139736, term139736.getClass(), "sourcePosition", 0);
        setField(term139736, term139736.getClass(), "jsType", null);
        setField(term139736, term139736.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term139046;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term138954, args);
        assertTrue(recursiveEquals(term138954, term139735));
        assertTrue(recursiveEquals(term139046, term139736));
        assertTrue(recursiveEquals(retValue, null));
    }

};


