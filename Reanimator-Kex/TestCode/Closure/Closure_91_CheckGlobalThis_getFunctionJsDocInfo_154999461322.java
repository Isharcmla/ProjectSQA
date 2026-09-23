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

public class CheckGlobalThis_getFunctionJsDocInfo_154999461322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6846;
     Object term6916;
     Object term7473;
     Object term7474;

    public CheckGlobalThis_getFunctionJsDocInfo_154999461322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6846 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        term6916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7012 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7012, term7012.getClass(), "type", 29);
        setField(term7012, term7012.getClass(), "objectValue", null);
        setField(term6916, term6916.getClass(), "propListHead", term7012);
        setField(term6916, term6916.getClass(), "parent", term7082);
        term7473 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        setField(term7473, term7473.getClass(), "compiler", null);
        setField(term7473, term7473.getClass(), "level", null);
        setField(term7473, term7473.getClass(), "assignLhsChild", null);
        term7474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7475 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7474, term7474.getClass(), "type", 0);
        setField(term7474, term7474.getClass(), "next", null);
        setField(term7474, term7474.getClass(), "first", null);
        setField(term7474, term7474.getClass(), "last", null);
        setField(term7475, term7475.getClass(), "next", null);
        setIntField(term7475, term7475.getClass(), "type", 29);
        setIntField(term7475, term7475.getClass(), "intValue", 0);
        setField(term7475, term7475.getClass(), "objectValue", null);
        setField(term7474, term7474.getClass(), "propListHead", term7475);
        setIntField(term7474, term7474.getClass(), "sourcePosition", 0);
        setField(term7474, term7474.getClass(), "jsType", null);
        setIntField(term7476, term7476.getClass(), "type", 0);
        setField(term7476, term7476.getClass(), "next", null);
        setField(term7476, term7476.getClass(), "first", null);
        setField(term7476, term7476.getClass(), "last", null);
        setField(term7476, term7476.getClass(), "propListHead", null);
        setIntField(term7476, term7476.getClass(), "sourcePosition", 0);
        setField(term7476, term7476.getClass(), "jsType", null);
        setField(term7476, term7476.getClass(), "parent", null);
        setField(term7474, term7474.getClass(), "parent", term7476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term6916;
        Object retValue = callMethod(klass, "getFunctionJsDocInfo", argTypes, term6846, args);
        assertTrue(recursiveEquals(term6846, term7473));
        assertTrue(recursiveEquals(term6916, term7474));
        assertTrue(recursiveEquals(retValue, null));
    }

};


