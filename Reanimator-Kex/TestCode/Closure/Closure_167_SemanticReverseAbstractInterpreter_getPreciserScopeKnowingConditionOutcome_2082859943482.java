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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129696;
     Object term129788;
     Object term130641;
     Object term130642;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129696 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term129788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term129880 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term129972 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term130070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setIntField(term129788, term129788.getClass(), "type", 111);
        setIntField(term129972, term129972.getClass(), "type", -112);
        setField(term129972, term129972.getClass(), "jsType", term130070);
        setField(term129880, term129880.getClass(), "first", term129972);
        setField(term129788, term129788.getClass(), "parent", term129880);
        setField(term129788, term129788.getClass(), "first", term129788);
        setField(term129788, term129788.getClass(), "jsType", null);
        term130641 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term130641, term130641.getClass(), "INEQ", null);
        setField(term130641, term130641.getClass(), "convention", null);
        setField(term130641, term130641.getClass(), "typeRegistry", null);
        setField(term130641, term130641.getClass(), "firstLink", null);
        setField(term130641, term130641.getClass(), "nextLink", null);
        setField(term130641, term130641.getClass(), "restrictUndefinedVisitor", null);
        setField(term130641, term130641.getClass(), "restrictNullVisitor", null);
        term130642 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term130643 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term130644 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term130645 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term130642, term130642.getClass(), "str", null);
        setIntField(term130642, term130642.getClass(), "type", 111);
        setField(term130642, term130642.getClass(), "next", null);
        setField(term130642, term130642.getClass(), "first", term130642);
        setField(term130642, term130642.getClass(), "last", null);
        setField(term130642, term130642.getClass(), "propListHead", null);
        setIntField(term130642, term130642.getClass(), "sourcePosition", 0);
        setField(term130642, term130642.getClass(), "jsType", null);
        setField(term130643, term130643.getClass(), "str", null);
        setIntField(term130643, term130643.getClass(), "type", 0);
        setField(term130643, term130643.getClass(), "next", null);
        setDoubleField(term130644, term130644.getClass(), "number", 0.0);
        setIntField(term130644, term130644.getClass(), "type", -112);
        setField(term130644, term130644.getClass(), "next", null);
        setField(term130644, term130644.getClass(), "first", null);
        setField(term130644, term130644.getClass(), "last", null);
        setField(term130644, term130644.getClass(), "propListHead", null);
        setIntField(term130644, term130644.getClass(), "sourcePosition", 0);
        setBooleanField(term130645, term130645.getClass(), "isChecked", false);
        setBooleanField(term130645, term130645.getClass(), "visited", false);
        setField(term130645, term130645.getClass(), "docInfo", null);
        setBooleanField(term130645, term130645.getClass(), "unknown", false);
        setBooleanField(term130645, term130645.getClass(), "resolved", false);
        setField(term130645, term130645.getClass(), "resolveResult", null);
        setBooleanField(term130645, term130645.getClass(), "inTemplatedCheckVisit", false);
        setField(term130645, term130645.getClass(), "registry", null);
        setField(term130644, term130644.getClass(), "jsType", term130645);
        setField(term130644, term130644.getClass(), "parent", null);
        setField(term130643, term130643.getClass(), "first", term130644);
        setField(term130643, term130643.getClass(), "last", null);
        setField(term130643, term130643.getClass(), "propListHead", null);
        setIntField(term130643, term130643.getClass(), "sourcePosition", 0);
        setField(term130643, term130643.getClass(), "jsType", null);
        setField(term130643, term130643.getClass(), "parent", null);
        setField(term130642, term130642.getClass(), "parent", term130643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term129788;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term129696, args);
        assertTrue(recursiveEquals(term129696, term130641));
        assertTrue(recursiveEquals(term129788, term130642));
        assertTrue(recursiveEquals(retValue, null));
    }

};


