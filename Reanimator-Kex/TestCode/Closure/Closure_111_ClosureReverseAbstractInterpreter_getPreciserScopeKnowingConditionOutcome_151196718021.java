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

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_151196718021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46076;
     Object term46308;
     Object term46327;
     Object term46329;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_151196718021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46076 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object term46216 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(term46076, term46076.getClass(), "nextLink", term46216);
        term46308 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term46308, term46308.getClass(), "type", -38);
        term46327 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object term46328 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(term46327, term46327.getClass(), "restrictToArrayVisitor", null);
        setField(term46327, term46327.getClass(), "restrictToNotArrayVisitor", null);
        setField(term46327, term46327.getClass(), "restrictToObjectVisitor", null);
        setField(term46327, term46327.getClass(), "restrictToNotObjectVisitor", null);
        setField(term46327, term46327.getClass(), "restricters", null);
        setField(term46327, term46327.getClass(), "convention", null);
        setField(term46327, term46327.getClass(), "typeRegistry", null);
        setField(term46327, term46327.getClass(), "firstLink", null);
        setField(term46328, term46328.getClass(), "restrictToArrayVisitor", null);
        setField(term46328, term46328.getClass(), "restrictToNotArrayVisitor", null);
        setField(term46328, term46328.getClass(), "restrictToObjectVisitor", null);
        setField(term46328, term46328.getClass(), "restrictToNotObjectVisitor", null);
        setField(term46328, term46328.getClass(), "restricters", null);
        setField(term46328, term46328.getClass(), "convention", null);
        setField(term46328, term46328.getClass(), "typeRegistry", null);
        setField(term46328, term46328.getClass(), "firstLink", null);
        setField(term46328, term46328.getClass(), "nextLink", null);
        setField(term46328, term46328.getClass(), "restrictUndefinedVisitor", null);
        setField(term46328, term46328.getClass(), "restrictNullVisitor", null);
        setField(term46327, term46327.getClass(), "nextLink", term46328);
        setField(term46327, term46327.getClass(), "restrictUndefinedVisitor", null);
        setField(term46327, term46327.getClass(), "restrictNullVisitor", null);
        term46329 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term46329, term46329.getClass(), "number", 0.0);
        setIntField(term46329, term46329.getClass(), "type", -38);
        setField(term46329, term46329.getClass(), "next", null);
        setField(term46329, term46329.getClass(), "first", null);
        setField(term46329, term46329.getClass(), "last", null);
        setField(term46329, term46329.getClass(), "propListHead", null);
        setIntField(term46329, term46329.getClass(), "sourcePosition", 0);
        setField(term46329, term46329.getClass(), "jsType", null);
        setField(term46329, term46329.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term46308;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term46076, args);
        assertTrue(recursiveEquals(term46076, term46327));
        assertTrue(recursiveEquals(term46308, term46329));
        assertTrue(recursiveEquals(retValue, null));
    }

};


