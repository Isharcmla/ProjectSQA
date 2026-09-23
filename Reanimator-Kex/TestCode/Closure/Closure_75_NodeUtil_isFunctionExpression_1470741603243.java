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

public class NodeUtil_isFunctionExpression_1470741603243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2432;
     Object term15847;

    public NodeUtil_isFunctionExpression_1470741603243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2445 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2455 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2432, term2432.getClass(), "type", -460657407);
        setIntField(term2434, term2434.getClass(), "type", 355911655);
        setIntField(term2436, term2436.getClass(), "type", 0);
        setField(term2436, term2436.getClass(), "next", null);
        setField(term2436, term2436.getClass(), "first", null);
        setField(term2436, term2436.getClass(), "last", null);
        setField(term2436, term2436.getClass(), "propListHead", null);
        setIntField(term2436, term2436.getClass(), "sourcePosition", 0);
        setField(term2436, term2436.getClass(), "jsType", null);
        setField(term2436, term2436.getClass(), "parent", null);
        setField(term2434, term2434.getClass(), "next", term2436);
        setIntField(term2439, term2439.getClass(), "type", 0);
        setField(term2439, term2439.getClass(), "next", null);
        setField(term2439, term2439.getClass(), "first", null);
        setField(term2439, term2439.getClass(), "last", null);
        setField(term2439, term2439.getClass(), "propListHead", null);
        setIntField(term2439, term2439.getClass(), "sourcePosition", 0);
        setField(term2439, term2439.getClass(), "jsType", null);
        setField(term2439, term2439.getClass(), "parent", null);
        setField(term2434, term2434.getClass(), "first", term2439);
        setIntField(term2442, term2442.getClass(), "type", 0);
        setField(term2442, term2442.getClass(), "next", null);
        setField(term2442, term2442.getClass(), "first", null);
        setField(term2442, term2442.getClass(), "last", null);
        setField(term2442, term2442.getClass(), "propListHead", null);
        setIntField(term2442, term2442.getClass(), "sourcePosition", 0);
        setField(term2442, term2442.getClass(), "jsType", null);
        setField(term2442, term2442.getClass(), "parent", null);
        setField(term2434, term2434.getClass(), "last", term2442);
        setField(term2445, term2445.getClass(), "next", null);
        setIntField(term2445, term2445.getClass(), "type", 0);
        setIntField(term2445, term2445.getClass(), "intValue", 0);
        setField(term2445, term2445.getClass(), "objectValue", null);
        setField(term2434, term2434.getClass(), "propListHead", term2445);
        setIntField(term2434, term2434.getClass(), "sourcePosition", -1784072578);
        setField(term2434, term2434.getClass(), "jsType", null);
        setField(term2434, term2434.getClass(), "parent", null);
        setField(term2432, term2432.getClass(), "next", term2434);
        setIntField(term2449, term2449.getClass(), "type", 0);
        setField(term2449, term2449.getClass(), "next", null);
        setField(term2449, term2449.getClass(), "first", null);
        setField(term2449, term2449.getClass(), "last", null);
        setField(term2449, term2449.getClass(), "propListHead", null);
        setIntField(term2449, term2449.getClass(), "sourcePosition", 0);
        setField(term2449, term2449.getClass(), "jsType", null);
        setField(term2449, term2449.getClass(), "parent", null);
        setField(term2432, term2432.getClass(), "first", term2449);
        setIntField(term2452, term2452.getClass(), "type", 0);
        setField(term2452, term2452.getClass(), "next", null);
        setField(term2452, term2452.getClass(), "first", null);
        setField(term2452, term2452.getClass(), "last", null);
        setField(term2452, term2452.getClass(), "propListHead", null);
        setIntField(term2452, term2452.getClass(), "sourcePosition", 0);
        setField(term2452, term2452.getClass(), "jsType", null);
        setField(term2452, term2452.getClass(), "parent", null);
        setField(term2432, term2432.getClass(), "last", term2452);
        setField(term2455, term2455.getClass(), "next", null);
        setIntField(term2455, term2455.getClass(), "type", 0);
        setIntField(term2455, term2455.getClass(), "intValue", 0);
        setField(term2455, term2455.getClass(), "objectValue", null);
        setField(term2432, term2432.getClass(), "propListHead", term2455);
        setIntField(term2432, term2432.getClass(), "sourcePosition", 2011764585);
        setField(term2432, term2432.getClass(), "jsType", null);
        setField(term2432, term2432.getClass(), "parent", null);
        term15847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15852 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15855 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15847, term15847.getClass(), "type", -460657407);
        setIntField(term15848, term15848.getClass(), "type", 355911655);
        setIntField(term15849, term15849.getClass(), "type", 0);
        setField(term15849, term15849.getClass(), "next", null);
        setField(term15849, term15849.getClass(), "first", null);
        setField(term15849, term15849.getClass(), "last", null);
        setField(term15849, term15849.getClass(), "propListHead", null);
        setIntField(term15849, term15849.getClass(), "sourcePosition", 0);
        setField(term15849, term15849.getClass(), "jsType", null);
        setField(term15849, term15849.getClass(), "parent", null);
        setField(term15848, term15848.getClass(), "next", term15849);
        setIntField(term15850, term15850.getClass(), "type", 0);
        setField(term15850, term15850.getClass(), "next", null);
        setField(term15850, term15850.getClass(), "first", null);
        setField(term15850, term15850.getClass(), "last", null);
        setField(term15850, term15850.getClass(), "propListHead", null);
        setIntField(term15850, term15850.getClass(), "sourcePosition", 0);
        setField(term15850, term15850.getClass(), "jsType", null);
        setField(term15850, term15850.getClass(), "parent", null);
        setField(term15848, term15848.getClass(), "first", term15850);
        setIntField(term15851, term15851.getClass(), "type", 0);
        setField(term15851, term15851.getClass(), "next", null);
        setField(term15851, term15851.getClass(), "first", null);
        setField(term15851, term15851.getClass(), "last", null);
        setField(term15851, term15851.getClass(), "propListHead", null);
        setIntField(term15851, term15851.getClass(), "sourcePosition", 0);
        setField(term15851, term15851.getClass(), "jsType", null);
        setField(term15851, term15851.getClass(), "parent", null);
        setField(term15848, term15848.getClass(), "last", term15851);
        setField(term15852, term15852.getClass(), "next", null);
        setIntField(term15852, term15852.getClass(), "type", 0);
        setIntField(term15852, term15852.getClass(), "intValue", 0);
        setField(term15852, term15852.getClass(), "objectValue", null);
        setField(term15848, term15848.getClass(), "propListHead", term15852);
        setIntField(term15848, term15848.getClass(), "sourcePosition", -1784072578);
        setField(term15848, term15848.getClass(), "jsType", null);
        setField(term15848, term15848.getClass(), "parent", null);
        setField(term15847, term15847.getClass(), "next", term15848);
        setIntField(term15853, term15853.getClass(), "type", 0);
        setField(term15853, term15853.getClass(), "next", null);
        setField(term15853, term15853.getClass(), "first", null);
        setField(term15853, term15853.getClass(), "last", null);
        setField(term15853, term15853.getClass(), "propListHead", null);
        setIntField(term15853, term15853.getClass(), "sourcePosition", 0);
        setField(term15853, term15853.getClass(), "jsType", null);
        setField(term15853, term15853.getClass(), "parent", null);
        setField(term15847, term15847.getClass(), "first", term15853);
        setIntField(term15854, term15854.getClass(), "type", 0);
        setField(term15854, term15854.getClass(), "next", null);
        setField(term15854, term15854.getClass(), "first", null);
        setField(term15854, term15854.getClass(), "last", null);
        setField(term15854, term15854.getClass(), "propListHead", null);
        setIntField(term15854, term15854.getClass(), "sourcePosition", 0);
        setField(term15854, term15854.getClass(), "jsType", null);
        setField(term15854, term15854.getClass(), "parent", null);
        setField(term15847, term15847.getClass(), "last", term15854);
        setField(term15855, term15855.getClass(), "next", null);
        setIntField(term15855, term15855.getClass(), "type", 0);
        setIntField(term15855, term15855.getClass(), "intValue", 0);
        setField(term15855, term15855.getClass(), "objectValue", null);
        setField(term15847, term15847.getClass(), "propListHead", term15855);
        setIntField(term15847, term15847.getClass(), "sourcePosition", 2011764585);
        setField(term15847, term15847.getClass(), "jsType", null);
        setField(term15847, term15847.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2432;
        Object retValue = callMethod(klass, "isFunctionExpression", argTypes, null, args);
        assertTrue(recursiveEquals(term2432, term15847));
        assertTrue(recursiveEquals(retValue, false));
    }

};


