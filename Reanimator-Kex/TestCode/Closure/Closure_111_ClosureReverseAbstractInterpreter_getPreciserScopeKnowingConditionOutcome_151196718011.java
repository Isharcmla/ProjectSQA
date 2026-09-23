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

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_151196718011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2971;
     Object term3063;
     Object term3075;
     Object term3076;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_151196718011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2971 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        term3063 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term3075 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(term3075, term3075.getClass(), "restrictToArrayVisitor", null);
        setField(term3075, term3075.getClass(), "restrictToNotArrayVisitor", null);
        setField(term3075, term3075.getClass(), "restrictToObjectVisitor", null);
        setField(term3075, term3075.getClass(), "restrictToNotObjectVisitor", null);
        setField(term3075, term3075.getClass(), "restricters", null);
        setField(term3075, term3075.getClass(), "convention", null);
        setField(term3075, term3075.getClass(), "typeRegistry", null);
        setField(term3075, term3075.getClass(), "firstLink", null);
        setField(term3075, term3075.getClass(), "nextLink", null);
        setField(term3075, term3075.getClass(), "restrictUndefinedVisitor", null);
        setField(term3075, term3075.getClass(), "restrictNullVisitor", null);
        term3076 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term3076, term3076.getClass(), "number", 0.0);
        setIntField(term3076, term3076.getClass(), "type", 0);
        setField(term3076, term3076.getClass(), "next", null);
        setField(term3076, term3076.getClass(), "first", null);
        setField(term3076, term3076.getClass(), "last", null);
        setField(term3076, term3076.getClass(), "propListHead", null);
        setIntField(term3076, term3076.getClass(), "sourcePosition", 0);
        setField(term3076, term3076.getClass(), "jsType", null);
        setField(term3076, term3076.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term3063;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term2971, args);
        assertTrue(recursiveEquals(term2971, term3075));
        assertTrue(recursiveEquals(term3063, term3076));
        assertTrue(recursiveEquals(retValue, null));
    }

};


