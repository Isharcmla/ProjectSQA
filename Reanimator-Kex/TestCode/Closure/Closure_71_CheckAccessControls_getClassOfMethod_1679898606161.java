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

public class CheckAccessControls_getClassOfMethod_1679898606161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43864;
     Object term43956;
     Object term44048;
     Object term44583;
     Object term44584;
     Object term44585;

    public CheckAccessControls_getClassOfMethod_1679898606161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43864 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term43956 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term43956, term43956.getClass(), "type", 38);
        term44048 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term44048, term44048.getClass(), "type", 38);
        term44583 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term44583, term44583.getClass(), "compiler", null);
        setField(term44583, term44583.getClass(), "validator", null);
        setIntField(term44583, term44583.getClass(), "deprecatedDepth", 0);
        setIntField(term44583, term44583.getClass(), "methodDepth", 0);
        setField(term44583, term44583.getClass(), "currentClass", null);
        setField(term44583, term44583.getClass(), "initializedConstantProperties", null);
        term44584 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term44584, term44584.getClass(), "number", 0.0);
        setIntField(term44584, term44584.getClass(), "type", 38);
        setField(term44584, term44584.getClass(), "next", null);
        setField(term44584, term44584.getClass(), "first", null);
        setField(term44584, term44584.getClass(), "last", null);
        setField(term44584, term44584.getClass(), "propListHead", null);
        setIntField(term44584, term44584.getClass(), "sourcePosition", 0);
        setField(term44584, term44584.getClass(), "jsType", null);
        setField(term44584, term44584.getClass(), "parent", null);
        term44585 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term44585, term44585.getClass(), "number", 0.0);
        setIntField(term44585, term44585.getClass(), "type", 38);
        setField(term44585, term44585.getClass(), "next", null);
        setField(term44585, term44585.getClass(), "first", null);
        setField(term44585, term44585.getClass(), "last", null);
        setField(term44585, term44585.getClass(), "propListHead", null);
        setIntField(term44585, term44585.getClass(), "sourcePosition", 0);
        setField(term44585, term44585.getClass(), "jsType", null);
        setField(term44585, term44585.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term43956;
        args[1] = term44048;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term43864, args);
        assertTrue(recursiveEquals(term43864, term44583));
        assertTrue(recursiveEquals(term43956, term44584));
        assertTrue(recursiveEquals(term44048, term44585));
        assertTrue(recursiveEquals(retValue, null));
    }

};


