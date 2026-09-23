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

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4103;
     Object term4195;
     Object term4221;
     Object term4222;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4103 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        term4195 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term4221 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term4221, term4221.getClass(), "restrictToArrayVisitor", null);
        setField(term4221, term4221.getClass(), "restrictToNotArrayVisitor", null);
        setField(term4221, term4221.getClass(), "restrictToObjectVisitor", null);
        setField(term4221, term4221.getClass(), "restrictToNotObjectVisitor", null);
        setField(term4221, term4221.getClass(), "restricters", null);
        setField(term4221, term4221.getClass(), "convention", null);
        setField(term4221, term4221.getClass(), "typeRegistry", null);
        setField(term4221, term4221.getClass(), "firstLink", null);
        setField(term4221, term4221.getClass(), "nextLink", null);
        setField(term4221, term4221.getClass(), "restrictUndefinedVisitor", null);
        setField(term4221, term4221.getClass(), "restrictNullVisitor", null);
        term4222 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term4222, term4222.getClass(), "number", 0.0);
        setIntField(term4222, term4222.getClass(), "type", 0);
        setField(term4222, term4222.getClass(), "next", null);
        setField(term4222, term4222.getClass(), "first", null);
        setField(term4222, term4222.getClass(), "last", null);
        setField(term4222, term4222.getClass(), "propListHead", null);
        setIntField(term4222, term4222.getClass(), "sourcePosition", 0);
        setField(term4222, term4222.getClass(), "jsType", null);
        setField(term4222, term4222.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term4195;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term4103, args);
        assertTrue(recursiveEquals(term4103, term4221));
        assertTrue(recursiveEquals(term4195, term4222));
        assertTrue(recursiveEquals(retValue, null));
    }

};


