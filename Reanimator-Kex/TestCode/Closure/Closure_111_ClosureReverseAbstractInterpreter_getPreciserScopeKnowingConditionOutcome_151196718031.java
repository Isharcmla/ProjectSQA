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

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_151196718031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116803;
     Object term117295;
     Object term117327;
     Object term117331;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_151196718031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116803 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object term116943 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object term117083 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object term117225 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term117083, term117083.getClass(), "nextLink", term117225);
        setField(term116943, term116943.getClass(), "nextLink", term117083);
        setField(term116803, term116803.getClass(), "nextLink", term116943);
        term117295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term117295, term117295.getClass(), "type", -38);
        term117327 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object term117328 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object term117329 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        Object term117330 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term117327, term117327.getClass(), "restrictToArrayVisitor", null);
        setField(term117327, term117327.getClass(), "restrictToNotArrayVisitor", null);
        setField(term117327, term117327.getClass(), "restrictToObjectVisitor", null);
        setField(term117327, term117327.getClass(), "restrictToNotObjectVisitor", null);
        setField(term117327, term117327.getClass(), "restricters", null);
        setField(term117327, term117327.getClass(), "convention", null);
        setField(term117327, term117327.getClass(), "typeRegistry", null);
        setField(term117327, term117327.getClass(), "firstLink", null);
        setField(term117328, term117328.getClass(), "restrictToArrayVisitor", null);
        setField(term117328, term117328.getClass(), "restrictToNotArrayVisitor", null);
        setField(term117328, term117328.getClass(), "restrictToObjectVisitor", null);
        setField(term117328, term117328.getClass(), "restrictToNotObjectVisitor", null);
        setField(term117328, term117328.getClass(), "restricters", null);
        setField(term117328, term117328.getClass(), "convention", null);
        setField(term117328, term117328.getClass(), "typeRegistry", null);
        setField(term117328, term117328.getClass(), "firstLink", null);
        setField(term117329, term117329.getClass(), "restrictToArrayVisitor", null);
        setField(term117329, term117329.getClass(), "restrictToNotArrayVisitor", null);
        setField(term117329, term117329.getClass(), "restrictToObjectVisitor", null);
        setField(term117329, term117329.getClass(), "restrictToNotObjectVisitor", null);
        setField(term117329, term117329.getClass(), "restricters", null);
        setField(term117329, term117329.getClass(), "convention", null);
        setField(term117329, term117329.getClass(), "typeRegistry", null);
        setField(term117329, term117329.getClass(), "firstLink", null);
        setField(term117330, term117330.getClass(), "ineq", null);
        setField(term117330, term117330.getClass(), "convention", null);
        setField(term117330, term117330.getClass(), "typeRegistry", null);
        setField(term117330, term117330.getClass(), "firstLink", null);
        setField(term117330, term117330.getClass(), "nextLink", null);
        setField(term117330, term117330.getClass(), "restrictUndefinedVisitor", null);
        setField(term117330, term117330.getClass(), "restrictNullVisitor", null);
        setField(term117329, term117329.getClass(), "nextLink", term117330);
        setField(term117329, term117329.getClass(), "restrictUndefinedVisitor", null);
        setField(term117329, term117329.getClass(), "restrictNullVisitor", null);
        setField(term117328, term117328.getClass(), "nextLink", term117329);
        setField(term117328, term117328.getClass(), "restrictUndefinedVisitor", null);
        setField(term117328, term117328.getClass(), "restrictNullVisitor", null);
        setField(term117327, term117327.getClass(), "nextLink", term117328);
        setField(term117327, term117327.getClass(), "restrictUndefinedVisitor", null);
        setField(term117327, term117327.getClass(), "restrictNullVisitor", null);
        term117331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term117331, term117331.getClass(), "type", -38);
        setField(term117331, term117331.getClass(), "next", null);
        setField(term117331, term117331.getClass(), "first", null);
        setField(term117331, term117331.getClass(), "last", null);
        setField(term117331, term117331.getClass(), "propListHead", null);
        setIntField(term117331, term117331.getClass(), "sourcePosition", 0);
        setField(term117331, term117331.getClass(), "jsType", null);
        setField(term117331, term117331.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term117295;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term116803, args);
        assertTrue(recursiveEquals(term116803, term117327));
        assertTrue(recursiveEquals(term117295, term117331));
        assertTrue(recursiveEquals(retValue, null));
    }

};


