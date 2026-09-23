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

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2866;
     Object term2958;
     Object term3199;
     Object term3200;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2866 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        term2958 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term3199 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term3199, term3199.getClass(), "restrictToArrayVisitor", null);
        setField(term3199, term3199.getClass(), "restrictToNotArrayVisitor", null);
        setField(term3199, term3199.getClass(), "restrictToObjectVisitor", null);
        setField(term3199, term3199.getClass(), "restrictToNotObjectVisitor", null);
        setField(term3199, term3199.getClass(), "restricters", null);
        setField(term3199, term3199.getClass(), "convention", null);
        setField(term3199, term3199.getClass(), "typeRegistry", null);
        setField(term3199, term3199.getClass(), "firstLink", null);
        setField(term3199, term3199.getClass(), "nextLink", null);
        setField(term3199, term3199.getClass(), "restrictUndefinedVisitor", null);
        setField(term3199, term3199.getClass(), "restrictNullVisitor", null);
        term3200 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3200, term3200.getClass(), "str", null);
        setIntField(term3200, term3200.getClass(), "type", 0);
        setField(term3200, term3200.getClass(), "next", null);
        setField(term3200, term3200.getClass(), "first", null);
        setField(term3200, term3200.getClass(), "last", null);
        setField(term3200, term3200.getClass(), "propListHead", null);
        setIntField(term3200, term3200.getClass(), "sourcePosition", 0);
        setField(term3200, term3200.getClass(), "jsType", null);
        setField(term3200, term3200.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term2958;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term2866, args);
        assertTrue(recursiveEquals(term2866, term3199));
        assertTrue(recursiveEquals(term2958, term3200));
        assertTrue(recursiveEquals(retValue, null));
    }

};


