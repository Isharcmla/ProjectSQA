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

public class NodeUtil_isPrototypeProperty_1449633110275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3557;
     Object term20847;

    public NodeUtil_isPrototypeProperty_1449633110275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3570 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3580 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3557, term3557.getClass(), "type", 1432187207);
        setIntField(term3559, term3559.getClass(), "type", -134092543);
        setIntField(term3561, term3561.getClass(), "type", 0);
        setField(term3561, term3561.getClass(), "next", null);
        setField(term3561, term3561.getClass(), "first", null);
        setField(term3561, term3561.getClass(), "last", null);
        setField(term3561, term3561.getClass(), "propListHead", null);
        setIntField(term3561, term3561.getClass(), "sourcePosition", 0);
        setField(term3561, term3561.getClass(), "jsType", null);
        setField(term3561, term3561.getClass(), "parent", null);
        setField(term3559, term3559.getClass(), "next", term3561);
        setIntField(term3564, term3564.getClass(), "type", 0);
        setField(term3564, term3564.getClass(), "next", null);
        setField(term3564, term3564.getClass(), "first", null);
        setField(term3564, term3564.getClass(), "last", null);
        setField(term3564, term3564.getClass(), "propListHead", null);
        setIntField(term3564, term3564.getClass(), "sourcePosition", 0);
        setField(term3564, term3564.getClass(), "jsType", null);
        setField(term3564, term3564.getClass(), "parent", null);
        setField(term3559, term3559.getClass(), "first", term3564);
        setIntField(term3567, term3567.getClass(), "type", 0);
        setField(term3567, term3567.getClass(), "next", null);
        setField(term3567, term3567.getClass(), "first", null);
        setField(term3567, term3567.getClass(), "last", null);
        setField(term3567, term3567.getClass(), "propListHead", null);
        setIntField(term3567, term3567.getClass(), "sourcePosition", 0);
        setField(term3567, term3567.getClass(), "jsType", null);
        setField(term3567, term3567.getClass(), "parent", null);
        setField(term3559, term3559.getClass(), "last", term3567);
        setField(term3570, term3570.getClass(), "next", null);
        setIntField(term3570, term3570.getClass(), "type", 0);
        setIntField(term3570, term3570.getClass(), "intValue", 0);
        setField(term3570, term3570.getClass(), "objectValue", null);
        setField(term3559, term3559.getClass(), "propListHead", term3570);
        setIntField(term3559, term3559.getClass(), "sourcePosition", 2092881418);
        setField(term3559, term3559.getClass(), "jsType", null);
        setField(term3559, term3559.getClass(), "parent", null);
        setField(term3557, term3557.getClass(), "next", term3559);
        setIntField(term3574, term3574.getClass(), "type", 0);
        setField(term3574, term3574.getClass(), "next", null);
        setField(term3574, term3574.getClass(), "first", null);
        setField(term3574, term3574.getClass(), "last", null);
        setField(term3574, term3574.getClass(), "propListHead", null);
        setIntField(term3574, term3574.getClass(), "sourcePosition", 0);
        setField(term3574, term3574.getClass(), "jsType", null);
        setField(term3574, term3574.getClass(), "parent", null);
        setField(term3557, term3557.getClass(), "first", term3574);
        setIntField(term3577, term3577.getClass(), "type", 0);
        setField(term3577, term3577.getClass(), "next", null);
        setField(term3577, term3577.getClass(), "first", null);
        setField(term3577, term3577.getClass(), "last", null);
        setField(term3577, term3577.getClass(), "propListHead", null);
        setIntField(term3577, term3577.getClass(), "sourcePosition", 0);
        setField(term3577, term3577.getClass(), "jsType", null);
        setField(term3577, term3577.getClass(), "parent", null);
        setField(term3557, term3557.getClass(), "last", term3577);
        setField(term3580, term3580.getClass(), "next", null);
        setIntField(term3580, term3580.getClass(), "type", 0);
        setIntField(term3580, term3580.getClass(), "intValue", 0);
        setField(term3580, term3580.getClass(), "objectValue", null);
        setField(term3557, term3557.getClass(), "propListHead", term3580);
        setIntField(term3557, term3557.getClass(), "sourcePosition", 1732410866);
        setField(term3557, term3557.getClass(), "jsType", null);
        setField(term3557, term3557.getClass(), "parent", null);
        term20847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20852 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term20853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20855 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term20847, term20847.getClass(), "type", 1432187207);
        setIntField(term20848, term20848.getClass(), "type", -134092543);
        setIntField(term20849, term20849.getClass(), "type", 0);
        setField(term20849, term20849.getClass(), "next", null);
        setField(term20849, term20849.getClass(), "first", null);
        setField(term20849, term20849.getClass(), "last", null);
        setField(term20849, term20849.getClass(), "propListHead", null);
        setIntField(term20849, term20849.getClass(), "sourcePosition", 0);
        setField(term20849, term20849.getClass(), "jsType", null);
        setField(term20849, term20849.getClass(), "parent", null);
        setField(term20848, term20848.getClass(), "next", term20849);
        setIntField(term20850, term20850.getClass(), "type", 0);
        setField(term20850, term20850.getClass(), "next", null);
        setField(term20850, term20850.getClass(), "first", null);
        setField(term20850, term20850.getClass(), "last", null);
        setField(term20850, term20850.getClass(), "propListHead", null);
        setIntField(term20850, term20850.getClass(), "sourcePosition", 0);
        setField(term20850, term20850.getClass(), "jsType", null);
        setField(term20850, term20850.getClass(), "parent", null);
        setField(term20848, term20848.getClass(), "first", term20850);
        setIntField(term20851, term20851.getClass(), "type", 0);
        setField(term20851, term20851.getClass(), "next", null);
        setField(term20851, term20851.getClass(), "first", null);
        setField(term20851, term20851.getClass(), "last", null);
        setField(term20851, term20851.getClass(), "propListHead", null);
        setIntField(term20851, term20851.getClass(), "sourcePosition", 0);
        setField(term20851, term20851.getClass(), "jsType", null);
        setField(term20851, term20851.getClass(), "parent", null);
        setField(term20848, term20848.getClass(), "last", term20851);
        setField(term20852, term20852.getClass(), "next", null);
        setIntField(term20852, term20852.getClass(), "type", 0);
        setIntField(term20852, term20852.getClass(), "intValue", 0);
        setField(term20852, term20852.getClass(), "objectValue", null);
        setField(term20848, term20848.getClass(), "propListHead", term20852);
        setIntField(term20848, term20848.getClass(), "sourcePosition", 2092881418);
        setField(term20848, term20848.getClass(), "jsType", null);
        setField(term20848, term20848.getClass(), "parent", null);
        setField(term20847, term20847.getClass(), "next", term20848);
        setIntField(term20853, term20853.getClass(), "type", 0);
        setField(term20853, term20853.getClass(), "next", null);
        setField(term20853, term20853.getClass(), "first", null);
        setField(term20853, term20853.getClass(), "last", null);
        setField(term20853, term20853.getClass(), "propListHead", null);
        setIntField(term20853, term20853.getClass(), "sourcePosition", 0);
        setField(term20853, term20853.getClass(), "jsType", null);
        setField(term20853, term20853.getClass(), "parent", null);
        setField(term20847, term20847.getClass(), "first", term20853);
        setIntField(term20854, term20854.getClass(), "type", 0);
        setField(term20854, term20854.getClass(), "next", null);
        setField(term20854, term20854.getClass(), "first", null);
        setField(term20854, term20854.getClass(), "last", null);
        setField(term20854, term20854.getClass(), "propListHead", null);
        setIntField(term20854, term20854.getClass(), "sourcePosition", 0);
        setField(term20854, term20854.getClass(), "jsType", null);
        setField(term20854, term20854.getClass(), "parent", null);
        setField(term20847, term20847.getClass(), "last", term20854);
        setField(term20855, term20855.getClass(), "next", null);
        setIntField(term20855, term20855.getClass(), "type", 0);
        setIntField(term20855, term20855.getClass(), "intValue", 0);
        setField(term20855, term20855.getClass(), "objectValue", null);
        setField(term20847, term20847.getClass(), "propListHead", term20855);
        setIntField(term20847, term20847.getClass(), "sourcePosition", 1732410866);
        setField(term20847, term20847.getClass(), "jsType", null);
        setField(term20847, term20847.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3557;
        Object retValue = callMethod(klass, "isPrototypeProperty", argTypes, null, args);
        assertTrue(recursiveEquals(term3557, term20847));
        assertTrue(recursiveEquals(retValue, false));
    }

};


