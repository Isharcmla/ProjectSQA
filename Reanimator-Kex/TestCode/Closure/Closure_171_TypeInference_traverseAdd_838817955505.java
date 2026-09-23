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

public class TypeInference_traverseAdd_838817955505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1534571;
     Object term1534641;
     Object term1537954;
     Object term1537955;

    public TypeInference_traverseAdd_838817955505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1534571 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1534641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1534711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1534641, term1534641.getClass(), "first", term1534641);
        setIntField(term1534711, term1534711.getClass(), "type", 121);
        setField(term1534641, term1534641.getClass(), "next", term1534711);
        setIntField(term1534641, term1534641.getClass(), "type", 1045547089);
        term1537954 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term1537954, term1537954.getClass(), "compiler", null);
        setField(term1537954, term1537954.getClass(), "registry", null);
        setField(term1537954, term1537954.getClass(), "reverseInterpreter", null);
        setField(term1537954, term1537954.getClass(), "syntacticScope", null);
        setField(term1537954, term1537954.getClass(), "functionScope", null);
        setField(term1537954, term1537954.getClass(), "bottomScope", null);
        setField(term1537954, term1537954.getClass(), "assertionFunctionsMap", null);
        setField(term1537954, term1537954.getClass(), "unknownType", null);
        setField(term1537954, term1537954.getClass(), "cfg", null);
        setField(term1537954, term1537954.getClass(), "joinOp", null);
        setField(term1537954, term1537954.getClass(), "orderedWorkSet", null);
        term1537955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1537956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1537955, term1537955.getClass(), "type", 1045547089);
        setIntField(term1537956, term1537956.getClass(), "type", 121);
        setField(term1537956, term1537956.getClass(), "next", null);
        setField(term1537956, term1537956.getClass(), "first", null);
        setField(term1537956, term1537956.getClass(), "last", null);
        setField(term1537956, term1537956.getClass(), "propListHead", null);
        setIntField(term1537956, term1537956.getClass(), "sourcePosition", 0);
        setField(term1537956, term1537956.getClass(), "jsType", null);
        setField(term1537956, term1537956.getClass(), "parent", null);
        setField(term1537955, term1537955.getClass(), "next", term1537956);
        setField(term1537955, term1537955.getClass(), "first", term1537955);
        setField(term1537955, term1537955.getClass(), "last", null);
        setField(term1537955, term1537955.getClass(), "propListHead", null);
        setIntField(term1537955, term1537955.getClass(), "sourcePosition", 0);
        setField(term1537955, term1537955.getClass(), "jsType", null);
        setField(term1537955, term1537955.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1534641;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseAdd", argTypes, term1534571, args);
        assertTrue(recursiveEquals(term1534571, term1537954));
        assertTrue(recursiveEquals(term1534641, term1537955));
        assertTrue(recursiveEquals(retValue, null));
    }

};


