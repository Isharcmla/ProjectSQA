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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99623;
     Object term99715;
     Object term99962;
     Object term99963;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99623 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term99715 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term99807 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term99899 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term99715, term99715.getClass(), "type", 12);
        setIntField(term99807, term99807.getClass(), "type", -13);
        setField(term99715, term99715.getClass(), "first", term99807);
        setIntField(term99899, term99899.getClass(), "type", 12);
        setField(term99715, term99715.getClass(), "last", term99899);
        term99962 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term99962, term99962.getClass(), "INEQ", null);
        setField(term99962, term99962.getClass(), "convention", null);
        setField(term99962, term99962.getClass(), "typeRegistry", null);
        setField(term99962, term99962.getClass(), "firstLink", null);
        setField(term99962, term99962.getClass(), "nextLink", null);
        setField(term99962, term99962.getClass(), "restrictUndefinedVisitor", null);
        setField(term99962, term99962.getClass(), "restrictNullVisitor", null);
        term99963 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term99964 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term99965 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term99963, term99963.getClass(), "number", 0.0);
        setIntField(term99963, term99963.getClass(), "type", 12);
        setField(term99963, term99963.getClass(), "next", null);
        setDoubleField(term99964, term99964.getClass(), "number", 0.0);
        setIntField(term99964, term99964.getClass(), "type", -13);
        setField(term99964, term99964.getClass(), "next", null);
        setField(term99964, term99964.getClass(), "first", null);
        setField(term99964, term99964.getClass(), "last", null);
        setField(term99964, term99964.getClass(), "propListHead", null);
        setIntField(term99964, term99964.getClass(), "sourcePosition", 0);
        setField(term99964, term99964.getClass(), "jsType", null);
        setField(term99964, term99964.getClass(), "parent", null);
        setField(term99963, term99963.getClass(), "first", term99964);
        setField(term99965, term99965.getClass(), "str", null);
        setIntField(term99965, term99965.getClass(), "type", 12);
        setField(term99965, term99965.getClass(), "next", null);
        setField(term99965, term99965.getClass(), "first", null);
        setField(term99965, term99965.getClass(), "last", null);
        setField(term99965, term99965.getClass(), "propListHead", null);
        setIntField(term99965, term99965.getClass(), "sourcePosition", 0);
        setField(term99965, term99965.getClass(), "jsType", null);
        setField(term99965, term99965.getClass(), "parent", null);
        setField(term99963, term99963.getClass(), "last", term99965);
        setField(term99963, term99963.getClass(), "propListHead", null);
        setIntField(term99963, term99963.getClass(), "sourcePosition", 0);
        setField(term99963, term99963.getClass(), "jsType", null);
        setField(term99963, term99963.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term99715;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term99623, args);
        assertTrue(recursiveEquals(term99623, term99962));
        assertTrue(recursiveEquals(term99715, term99963));
        assertTrue(recursiveEquals(retValue, null));
    }

};


