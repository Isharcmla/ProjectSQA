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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118527;
     Object term118619;
     Object term119612;
     Object term119613;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118527 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term118619 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term118711 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term118811 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setIntField(term118619, term118619.getClass(), "type", 45);
        setIntField(term118711, term118711.getClass(), "type", 0);
        setField(term118711, term118711.getClass(), "jsType", null);
        setField(term118619, term118619.getClass(), "first", term118711);
        setField(term118619, term118619.getClass(), "last", term118619);
        setField(term118619, term118619.getClass(), "jsType", term118811);
        term119612 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term119612, term119612.getClass(), "INEQ", null);
        setField(term119612, term119612.getClass(), "convention", null);
        setField(term119612, term119612.getClass(), "typeRegistry", null);
        setField(term119612, term119612.getClass(), "firstLink", null);
        setField(term119612, term119612.getClass(), "nextLink", null);
        setField(term119612, term119612.getClass(), "restrictUndefinedVisitor", null);
        setField(term119612, term119612.getClass(), "restrictNullVisitor", null);
        term119613 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term119614 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term119615 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setDoubleField(term119613, term119613.getClass(), "number", 0.0);
        setIntField(term119613, term119613.getClass(), "type", 45);
        setField(term119613, term119613.getClass(), "next", null);
        setField(term119614, term119614.getClass(), "str", null);
        setIntField(term119614, term119614.getClass(), "type", 0);
        setField(term119614, term119614.getClass(), "next", null);
        setField(term119614, term119614.getClass(), "first", null);
        setField(term119614, term119614.getClass(), "last", null);
        setField(term119614, term119614.getClass(), "propListHead", null);
        setIntField(term119614, term119614.getClass(), "sourcePosition", 0);
        setField(term119614, term119614.getClass(), "jsType", null);
        setField(term119614, term119614.getClass(), "parent", null);
        setField(term119613, term119613.getClass(), "first", term119614);
        setField(term119613, term119613.getClass(), "last", term119613);
        setField(term119613, term119613.getClass(), "propListHead", null);
        setIntField(term119613, term119613.getClass(), "sourcePosition", 0);
        setField(term119615, term119615.getClass(), "name", null);
        setField(term119615, term119615.getClass(), "referencedType", null);
        setField(term119615, term119615.getClass(), "referencedObjType", null);
        setBooleanField(term119615, term119615.getClass(), "visited", false);
        setField(term119615, term119615.getClass(), "docInfo", null);
        setBooleanField(term119615, term119615.getClass(), "unknown", false);
        setBooleanField(term119615, term119615.getClass(), "resolved", false);
        setField(term119615, term119615.getClass(), "resolveResult", null);
        setBooleanField(term119615, term119615.getClass(), "inTemplatedCheckVisit", false);
        setField(term119615, term119615.getClass(), "registry", null);
        setField(term119613, term119613.getClass(), "jsType", term119615);
        setField(term119613, term119613.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term118619;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term118527, args);
        assertTrue(recursiveEquals(term118527, term119612));
        assertTrue(recursiveEquals(term118619, term119613));
        assertTrue(recursiveEquals(retValue, null));
    }

};


