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

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_15119671809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1967;
     Object term2177;
     Object term2818;
     Object term2820;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_15119671809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1967 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object term2107 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(term1967, term1967.getClass(), "nextLink", term2107);
        term2177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2177, term2177.getClass(), "type", -38);
        term2818 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object term2819 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(term2818, term2818.getClass(), "restrictToArrayVisitor", null);
        setField(term2818, term2818.getClass(), "restrictToNotArrayVisitor", null);
        setField(term2818, term2818.getClass(), "restrictToObjectVisitor", null);
        setField(term2818, term2818.getClass(), "restrictToNotObjectVisitor", null);
        setField(term2818, term2818.getClass(), "restricters", null);
        setField(term2818, term2818.getClass(), "convention", null);
        setField(term2818, term2818.getClass(), "typeRegistry", null);
        setField(term2818, term2818.getClass(), "firstLink", null);
        setField(term2819, term2819.getClass(), "restrictToArrayVisitor", null);
        setField(term2819, term2819.getClass(), "restrictToNotArrayVisitor", null);
        setField(term2819, term2819.getClass(), "restrictToObjectVisitor", null);
        setField(term2819, term2819.getClass(), "restrictToNotObjectVisitor", null);
        setField(term2819, term2819.getClass(), "restricters", null);
        setField(term2819, term2819.getClass(), "convention", null);
        setField(term2819, term2819.getClass(), "typeRegistry", null);
        setField(term2819, term2819.getClass(), "firstLink", null);
        setField(term2819, term2819.getClass(), "nextLink", null);
        setField(term2819, term2819.getClass(), "restrictUndefinedVisitor", null);
        setField(term2819, term2819.getClass(), "restrictNullVisitor", null);
        setField(term2818, term2818.getClass(), "nextLink", term2819);
        setField(term2818, term2818.getClass(), "restrictUndefinedVisitor", null);
        setField(term2818, term2818.getClass(), "restrictNullVisitor", null);
        term2820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2820, term2820.getClass(), "type", -38);
        setField(term2820, term2820.getClass(), "next", null);
        setField(term2820, term2820.getClass(), "first", null);
        setField(term2820, term2820.getClass(), "last", null);
        setField(term2820, term2820.getClass(), "propListHead", null);
        setIntField(term2820, term2820.getClass(), "sourcePosition", 0);
        setField(term2820, term2820.getClass(), "jsType", null);
        setField(term2820, term2820.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term2177;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term1967, args);
        assertTrue(recursiveEquals(term1967, term2818));
        assertTrue(recursiveEquals(term2177, term2820));
        assertTrue(recursiveEquals(retValue, null));
    }

};


