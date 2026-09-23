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

public class ProcessClosurePrimitives_verifyLastArgumentIsString_1105485228160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45754;
     Object term45824;
     Object term46301;
     Object term46302;

    public ProcessClosurePrimitives_verifyLastArgumentIsString_1105485228160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45754 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term45824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45824, term45824.getClass(), "type", 40);
        term46301 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term46301, term46301.getClass(), "compiler", null);
        setField(term46301, term46301.getClass(), "moduleGraph", null);
        setField(term46301, term46301.getClass(), "providedNames", null);
        setField(term46301, term46301.getClass(), "unrecognizedRequires", null);
        setField(term46301, term46301.getClass(), "exportedVariables", null);
        setField(term46301, term46301.getClass(), "requiresLevel", null);
        setField(term46301, term46301.getClass(), "preprocessorSymbolTable", null);
        setField(term46301, term46301.getClass(), "defineCalls", null);
        term46302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46302, term46302.getClass(), "type", 40);
        setField(term46302, term46302.getClass(), "next", null);
        setField(term46302, term46302.getClass(), "first", null);
        setField(term46302, term46302.getClass(), "last", null);
        setField(term46302, term46302.getClass(), "propListHead", null);
        setIntField(term46302, term46302.getClass(), "sourcePosition", 0);
        setField(term46302, term46302.getClass(), "jsType", null);
        setField(term46302, term46302.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term45824;
        Object retValue = callMethod(klass, "verifyLastArgumentIsString", argTypes, term45754, args);
        assertTrue(recursiveEquals(term45754, term46301));
        assertTrue(recursiveEquals(term45824, term46302));
        assertTrue(recursiveEquals(retValue, true));
    }

};


