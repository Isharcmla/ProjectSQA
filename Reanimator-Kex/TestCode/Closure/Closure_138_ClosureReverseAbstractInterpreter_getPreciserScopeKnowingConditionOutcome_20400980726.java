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

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4757;
     Object term4849;
     Object term5232;
     Object term5233;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4757 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        term4849 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term4849, term4849.getClass(), "type", 37);
        term5232 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term5232, term5232.getClass(), "restrictToArrayVisitor", null);
        setField(term5232, term5232.getClass(), "restrictToNotArrayVisitor", null);
        setField(term5232, term5232.getClass(), "restrictToObjectVisitor", null);
        setField(term5232, term5232.getClass(), "restrictToNotObjectVisitor", null);
        setField(term5232, term5232.getClass(), "restricters", null);
        setField(term5232, term5232.getClass(), "convention", null);
        setField(term5232, term5232.getClass(), "typeRegistry", null);
        setField(term5232, term5232.getClass(), "firstLink", null);
        setField(term5232, term5232.getClass(), "nextLink", null);
        setField(term5232, term5232.getClass(), "restrictUndefinedVisitor", null);
        setField(term5232, term5232.getClass(), "restrictNullVisitor", null);
        term5233 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term5233, term5233.getClass(), "str", null);
        setIntField(term5233, term5233.getClass(), "type", 37);
        setField(term5233, term5233.getClass(), "next", null);
        setField(term5233, term5233.getClass(), "first", null);
        setField(term5233, term5233.getClass(), "last", null);
        setField(term5233, term5233.getClass(), "propListHead", null);
        setIntField(term5233, term5233.getClass(), "sourcePosition", 0);
        setField(term5233, term5233.getClass(), "jsType", null);
        setField(term5233, term5233.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term4849;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term4757, args);
        assertTrue(recursiveEquals(term4757, term5232));
        assertTrue(recursiveEquals(term4849, term5233));
        assertTrue(recursiveEquals(retValue, null));
    }

};


