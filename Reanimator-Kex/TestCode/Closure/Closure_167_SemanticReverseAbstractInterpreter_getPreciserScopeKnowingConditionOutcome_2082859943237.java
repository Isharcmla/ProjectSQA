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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57103;
     Object term57195;
     Object term57509;
     Object term57510;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57103 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term57195 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57287 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setIntField(term57195, term57195.getClass(), "type", 13);
        setField(term57195, term57195.getClass(), "first", term57195);
        setIntField(term57287, term57287.getClass(), "type", -33554958);
        setField(term57287, term57287.getClass(), "jsType", null);
        setField(term57195, term57195.getClass(), "last", term57287);
        setField(term57195, term57195.getClass(), "jsType", term57387);
        term57509 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term57509, term57509.getClass(), "INEQ", null);
        setField(term57509, term57509.getClass(), "convention", null);
        setField(term57509, term57509.getClass(), "typeRegistry", null);
        setField(term57509, term57509.getClass(), "firstLink", null);
        setField(term57509, term57509.getClass(), "nextLink", null);
        setField(term57509, term57509.getClass(), "restrictUndefinedVisitor", null);
        setField(term57509, term57509.getClass(), "restrictNullVisitor", null);
        term57510 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57511 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setDoubleField(term57510, term57510.getClass(), "number", 0.0);
        setIntField(term57510, term57510.getClass(), "type", 13);
        setField(term57510, term57510.getClass(), "next", null);
        setField(term57510, term57510.getClass(), "first", term57510);
        setDoubleField(term57511, term57511.getClass(), "number", 0.0);
        setIntField(term57511, term57511.getClass(), "type", -33554958);
        setField(term57511, term57511.getClass(), "next", null);
        setField(term57511, term57511.getClass(), "first", null);
        setField(term57511, term57511.getClass(), "last", null);
        setField(term57511, term57511.getClass(), "propListHead", null);
        setIntField(term57511, term57511.getClass(), "sourcePosition", 0);
        setField(term57511, term57511.getClass(), "jsType", null);
        setField(term57511, term57511.getClass(), "parent", null);
        setField(term57510, term57510.getClass(), "last", term57511);
        setField(term57510, term57510.getClass(), "propListHead", null);
        setIntField(term57510, term57510.getClass(), "sourcePosition", 0);
        setField(term57512, term57512.getClass(), "name", null);
        setField(term57512, term57512.getClass(), "referencedType", null);
        setField(term57512, term57512.getClass(), "referencedObjType", null);
        setBooleanField(term57512, term57512.getClass(), "visited", false);
        setField(term57512, term57512.getClass(), "docInfo", null);
        setBooleanField(term57512, term57512.getClass(), "unknown", false);
        setBooleanField(term57512, term57512.getClass(), "resolved", false);
        setField(term57512, term57512.getClass(), "resolveResult", null);
        setBooleanField(term57512, term57512.getClass(), "inTemplatedCheckVisit", false);
        setField(term57512, term57512.getClass(), "registry", null);
        setField(term57510, term57510.getClass(), "jsType", term57512);
        setField(term57510, term57510.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term57195;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term57103, args);
        assertTrue(recursiveEquals(term57103, term57509));
        assertTrue(recursiveEquals(term57195, term57510));
        assertTrue(recursiveEquals(retValue, null));
    }

};


