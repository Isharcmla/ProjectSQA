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

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5386;
     Object term5586;
     Object term7891;
     Object term7893;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5386 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object term5516 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term5386, term5386.getClass(), "nextLink", term5516);
        term5586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5586, term5586.getClass(), "type", 37);
        setField(term5586, term5586.getClass(), "first", null);
        term7891 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object term7892 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term7891, term7891.getClass(), "restrictToArrayVisitor", null);
        setField(term7891, term7891.getClass(), "restrictToNotArrayVisitor", null);
        setField(term7891, term7891.getClass(), "restrictToObjectVisitor", null);
        setField(term7891, term7891.getClass(), "restrictToNotObjectVisitor", null);
        setField(term7891, term7891.getClass(), "restricters", null);
        setField(term7891, term7891.getClass(), "convention", null);
        setField(term7891, term7891.getClass(), "typeRegistry", null);
        setField(term7891, term7891.getClass(), "firstLink", null);
        setField(term7892, term7892.getClass(), "restrictToArrayVisitor", null);
        setField(term7892, term7892.getClass(), "restrictToNotArrayVisitor", null);
        setField(term7892, term7892.getClass(), "restrictToObjectVisitor", null);
        setField(term7892, term7892.getClass(), "restrictToNotObjectVisitor", null);
        setField(term7892, term7892.getClass(), "restricters", null);
        setField(term7892, term7892.getClass(), "convention", null);
        setField(term7892, term7892.getClass(), "typeRegistry", null);
        setField(term7892, term7892.getClass(), "firstLink", null);
        setField(term7892, term7892.getClass(), "nextLink", null);
        setField(term7892, term7892.getClass(), "restrictUndefinedVisitor", null);
        setField(term7892, term7892.getClass(), "restrictNullVisitor", null);
        setField(term7891, term7891.getClass(), "nextLink", term7892);
        setField(term7891, term7891.getClass(), "restrictUndefinedVisitor", null);
        setField(term7891, term7891.getClass(), "restrictNullVisitor", null);
        term7893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7893, term7893.getClass(), "type", 37);
        setField(term7893, term7893.getClass(), "next", null);
        setField(term7893, term7893.getClass(), "first", null);
        setField(term7893, term7893.getClass(), "last", null);
        setField(term7893, term7893.getClass(), "propListHead", null);
        setIntField(term7893, term7893.getClass(), "sourcePosition", 0);
        setField(term7893, term7893.getClass(), "jsType", null);
        setField(term7893, term7893.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term5586;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term5386, args);
        assertTrue(recursiveEquals(term5386, term7891));
        assertTrue(recursiveEquals(term5586, term7893));
        assertTrue(recursiveEquals(retValue, null));
    }

};


