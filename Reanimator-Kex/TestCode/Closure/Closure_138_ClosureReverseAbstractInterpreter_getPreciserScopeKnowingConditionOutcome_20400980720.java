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

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3738;
     Object term3938;
     Object term4209;
     Object term4211;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3738 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object term3868 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term3738, term3738.getClass(), "nextLink", term3868);
        term3938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3938, term3938.getClass(), "type", -38);
        term4209 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object term4210 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term4209, term4209.getClass(), "restrictToArrayVisitor", null);
        setField(term4209, term4209.getClass(), "restrictToNotArrayVisitor", null);
        setField(term4209, term4209.getClass(), "restrictToObjectVisitor", null);
        setField(term4209, term4209.getClass(), "restrictToNotObjectVisitor", null);
        setField(term4209, term4209.getClass(), "restricters", null);
        setField(term4209, term4209.getClass(), "convention", null);
        setField(term4209, term4209.getClass(), "typeRegistry", null);
        setField(term4209, term4209.getClass(), "firstLink", null);
        setField(term4210, term4210.getClass(), "restrictToArrayVisitor", null);
        setField(term4210, term4210.getClass(), "restrictToNotArrayVisitor", null);
        setField(term4210, term4210.getClass(), "restrictToObjectVisitor", null);
        setField(term4210, term4210.getClass(), "restrictToNotObjectVisitor", null);
        setField(term4210, term4210.getClass(), "restricters", null);
        setField(term4210, term4210.getClass(), "convention", null);
        setField(term4210, term4210.getClass(), "typeRegistry", null);
        setField(term4210, term4210.getClass(), "firstLink", null);
        setField(term4210, term4210.getClass(), "nextLink", null);
        setField(term4210, term4210.getClass(), "restrictUndefinedVisitor", null);
        setField(term4210, term4210.getClass(), "restrictNullVisitor", null);
        setField(term4209, term4209.getClass(), "nextLink", term4210);
        setField(term4209, term4209.getClass(), "restrictUndefinedVisitor", null);
        setField(term4209, term4209.getClass(), "restrictNullVisitor", null);
        term4211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4211, term4211.getClass(), "type", -38);
        setField(term4211, term4211.getClass(), "next", null);
        setField(term4211, term4211.getClass(), "first", null);
        setField(term4211, term4211.getClass(), "last", null);
        setField(term4211, term4211.getClass(), "propListHead", null);
        setIntField(term4211, term4211.getClass(), "sourcePosition", 0);
        setField(term4211, term4211.getClass(), "jsType", null);
        setField(term4211, term4211.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term3938;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term3738, args);
        assertTrue(recursiveEquals(term3738, term4209));
        assertTrue(recursiveEquals(term3938, term4211));
        assertTrue(recursiveEquals(retValue, null));
    }

};


