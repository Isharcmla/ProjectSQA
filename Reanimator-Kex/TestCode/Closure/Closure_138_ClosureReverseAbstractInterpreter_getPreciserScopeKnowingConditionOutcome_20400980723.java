package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4373;
     Object term4595;
     Object term4609;
     Object term4611;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4373 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object term4503 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term4373, term4373.getClass(), "nextLink", term4503);
        term4595 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term4595, term4595.getClass(), "type", -38);
        term4609 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object term4610 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term4609, term4609.getClass(), "restrictToArrayVisitor", null);
        setField(term4609, term4609.getClass(), "restrictToNotArrayVisitor", null);
        setField(term4609, term4609.getClass(), "restrictToObjectVisitor", null);
        setField(term4609, term4609.getClass(), "restrictToNotObjectVisitor", null);
        setField(term4609, term4609.getClass(), "restricters", null);
        setField(term4609, term4609.getClass(), "convention", null);
        setField(term4609, term4609.getClass(), "typeRegistry", null);
        setField(term4609, term4609.getClass(), "firstLink", null);
        setField(term4610, term4610.getClass(), "restrictToArrayVisitor", null);
        setField(term4610, term4610.getClass(), "restrictToNotArrayVisitor", null);
        setField(term4610, term4610.getClass(), "restrictToObjectVisitor", null);
        setField(term4610, term4610.getClass(), "restrictToNotObjectVisitor", null);
        setField(term4610, term4610.getClass(), "restricters", null);
        setField(term4610, term4610.getClass(), "convention", null);
        setField(term4610, term4610.getClass(), "typeRegistry", null);
        setField(term4610, term4610.getClass(), "firstLink", null);
        setField(term4610, term4610.getClass(), "nextLink", null);
        setField(term4610, term4610.getClass(), "restrictUndefinedVisitor", null);
        setField(term4610, term4610.getClass(), "restrictNullVisitor", null);
        setField(term4609, term4609.getClass(), "nextLink", term4610);
        setField(term4609, term4609.getClass(), "restrictUndefinedVisitor", null);
        setField(term4609, term4609.getClass(), "restrictNullVisitor", null);
        term4611 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4611, term4611.getClass(), "str", null);
        setIntField(term4611, term4611.getClass(), "type", -38);
        setField(term4611, term4611.getClass(), "next", null);
        setField(term4611, term4611.getClass(), "first", null);
        setField(term4611, term4611.getClass(), "last", null);
        setField(term4611, term4611.getClass(), "propListHead", null);
        setIntField(term4611, term4611.getClass(), "sourcePosition", 0);
        setField(term4611, term4611.getClass(), "jsType", null);
        setField(term4611, term4611.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term4595;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term4373, args);
        assertTrue(recursiveEquals(term4373, term4609));
        assertTrue(recursiveEquals(term4595, term4611));
        assertTrue(recursiveEquals(retValue, null));
    }

};


