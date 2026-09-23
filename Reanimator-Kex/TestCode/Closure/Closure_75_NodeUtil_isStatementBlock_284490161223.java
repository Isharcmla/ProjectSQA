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

public class NodeUtil_isStatementBlock_284490161223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1838;
     Object term13368;

    public NodeUtil_isStatementBlock_284490161223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1851 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1861 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1838, term1838.getClass(), "type", -1723168189);
        setIntField(term1840, term1840.getClass(), "type", 532666604);
        setIntField(term1842, term1842.getClass(), "type", 0);
        setField(term1842, term1842.getClass(), "next", null);
        setField(term1842, term1842.getClass(), "first", null);
        setField(term1842, term1842.getClass(), "last", null);
        setField(term1842, term1842.getClass(), "propListHead", null);
        setIntField(term1842, term1842.getClass(), "sourcePosition", 0);
        setField(term1842, term1842.getClass(), "jsType", null);
        setField(term1842, term1842.getClass(), "parent", null);
        setField(term1840, term1840.getClass(), "next", term1842);
        setIntField(term1845, term1845.getClass(), "type", 0);
        setField(term1845, term1845.getClass(), "next", null);
        setField(term1845, term1845.getClass(), "first", null);
        setField(term1845, term1845.getClass(), "last", null);
        setField(term1845, term1845.getClass(), "propListHead", null);
        setIntField(term1845, term1845.getClass(), "sourcePosition", 0);
        setField(term1845, term1845.getClass(), "jsType", null);
        setField(term1845, term1845.getClass(), "parent", null);
        setField(term1840, term1840.getClass(), "first", term1845);
        setIntField(term1848, term1848.getClass(), "type", 0);
        setField(term1848, term1848.getClass(), "next", null);
        setField(term1848, term1848.getClass(), "first", null);
        setField(term1848, term1848.getClass(), "last", null);
        setField(term1848, term1848.getClass(), "propListHead", null);
        setIntField(term1848, term1848.getClass(), "sourcePosition", 0);
        setField(term1848, term1848.getClass(), "jsType", null);
        setField(term1848, term1848.getClass(), "parent", null);
        setField(term1840, term1840.getClass(), "last", term1848);
        setField(term1851, term1851.getClass(), "next", null);
        setIntField(term1851, term1851.getClass(), "type", 0);
        setIntField(term1851, term1851.getClass(), "intValue", 0);
        setField(term1851, term1851.getClass(), "objectValue", null);
        setField(term1840, term1840.getClass(), "propListHead", term1851);
        setIntField(term1840, term1840.getClass(), "sourcePosition", 63677360);
        setField(term1840, term1840.getClass(), "jsType", null);
        setField(term1840, term1840.getClass(), "parent", null);
        setField(term1838, term1838.getClass(), "next", term1840);
        setIntField(term1855, term1855.getClass(), "type", 0);
        setField(term1855, term1855.getClass(), "next", null);
        setField(term1855, term1855.getClass(), "first", null);
        setField(term1855, term1855.getClass(), "last", null);
        setField(term1855, term1855.getClass(), "propListHead", null);
        setIntField(term1855, term1855.getClass(), "sourcePosition", 0);
        setField(term1855, term1855.getClass(), "jsType", null);
        setField(term1855, term1855.getClass(), "parent", null);
        setField(term1838, term1838.getClass(), "first", term1855);
        setIntField(term1858, term1858.getClass(), "type", 0);
        setField(term1858, term1858.getClass(), "next", null);
        setField(term1858, term1858.getClass(), "first", null);
        setField(term1858, term1858.getClass(), "last", null);
        setField(term1858, term1858.getClass(), "propListHead", null);
        setIntField(term1858, term1858.getClass(), "sourcePosition", 0);
        setField(term1858, term1858.getClass(), "jsType", null);
        setField(term1858, term1858.getClass(), "parent", null);
        setField(term1838, term1838.getClass(), "last", term1858);
        setField(term1861, term1861.getClass(), "next", null);
        setIntField(term1861, term1861.getClass(), "type", 0);
        setIntField(term1861, term1861.getClass(), "intValue", 0);
        setField(term1861, term1861.getClass(), "objectValue", null);
        setField(term1838, term1838.getClass(), "propListHead", term1861);
        setIntField(term1838, term1838.getClass(), "sourcePosition", 1478914037);
        setField(term1838, term1838.getClass(), "jsType", null);
        setField(term1838, term1838.getClass(), "parent", null);
        term13368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13373 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13376 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13368, term13368.getClass(), "type", -1723168189);
        setIntField(term13369, term13369.getClass(), "type", 532666604);
        setIntField(term13370, term13370.getClass(), "type", 0);
        setField(term13370, term13370.getClass(), "next", null);
        setField(term13370, term13370.getClass(), "first", null);
        setField(term13370, term13370.getClass(), "last", null);
        setField(term13370, term13370.getClass(), "propListHead", null);
        setIntField(term13370, term13370.getClass(), "sourcePosition", 0);
        setField(term13370, term13370.getClass(), "jsType", null);
        setField(term13370, term13370.getClass(), "parent", null);
        setField(term13369, term13369.getClass(), "next", term13370);
        setIntField(term13371, term13371.getClass(), "type", 0);
        setField(term13371, term13371.getClass(), "next", null);
        setField(term13371, term13371.getClass(), "first", null);
        setField(term13371, term13371.getClass(), "last", null);
        setField(term13371, term13371.getClass(), "propListHead", null);
        setIntField(term13371, term13371.getClass(), "sourcePosition", 0);
        setField(term13371, term13371.getClass(), "jsType", null);
        setField(term13371, term13371.getClass(), "parent", null);
        setField(term13369, term13369.getClass(), "first", term13371);
        setIntField(term13372, term13372.getClass(), "type", 0);
        setField(term13372, term13372.getClass(), "next", null);
        setField(term13372, term13372.getClass(), "first", null);
        setField(term13372, term13372.getClass(), "last", null);
        setField(term13372, term13372.getClass(), "propListHead", null);
        setIntField(term13372, term13372.getClass(), "sourcePosition", 0);
        setField(term13372, term13372.getClass(), "jsType", null);
        setField(term13372, term13372.getClass(), "parent", null);
        setField(term13369, term13369.getClass(), "last", term13372);
        setField(term13373, term13373.getClass(), "next", null);
        setIntField(term13373, term13373.getClass(), "type", 0);
        setIntField(term13373, term13373.getClass(), "intValue", 0);
        setField(term13373, term13373.getClass(), "objectValue", null);
        setField(term13369, term13369.getClass(), "propListHead", term13373);
        setIntField(term13369, term13369.getClass(), "sourcePosition", 63677360);
        setField(term13369, term13369.getClass(), "jsType", null);
        setField(term13369, term13369.getClass(), "parent", null);
        setField(term13368, term13368.getClass(), "next", term13369);
        setIntField(term13374, term13374.getClass(), "type", 0);
        setField(term13374, term13374.getClass(), "next", null);
        setField(term13374, term13374.getClass(), "first", null);
        setField(term13374, term13374.getClass(), "last", null);
        setField(term13374, term13374.getClass(), "propListHead", null);
        setIntField(term13374, term13374.getClass(), "sourcePosition", 0);
        setField(term13374, term13374.getClass(), "jsType", null);
        setField(term13374, term13374.getClass(), "parent", null);
        setField(term13368, term13368.getClass(), "first", term13374);
        setIntField(term13375, term13375.getClass(), "type", 0);
        setField(term13375, term13375.getClass(), "next", null);
        setField(term13375, term13375.getClass(), "first", null);
        setField(term13375, term13375.getClass(), "last", null);
        setField(term13375, term13375.getClass(), "propListHead", null);
        setIntField(term13375, term13375.getClass(), "sourcePosition", 0);
        setField(term13375, term13375.getClass(), "jsType", null);
        setField(term13375, term13375.getClass(), "parent", null);
        setField(term13368, term13368.getClass(), "last", term13375);
        setField(term13376, term13376.getClass(), "next", null);
        setIntField(term13376, term13376.getClass(), "type", 0);
        setIntField(term13376, term13376.getClass(), "intValue", 0);
        setField(term13376, term13376.getClass(), "objectValue", null);
        setField(term13368, term13368.getClass(), "propListHead", term13376);
        setIntField(term13368, term13368.getClass(), "sourcePosition", 1478914037);
        setField(term13368, term13368.getClass(), "jsType", null);
        setField(term13368, term13368.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1838;
        Object retValue = callMethod(klass, "isStatementBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term1838, term13368));
        assertTrue(recursiveEquals(retValue, false));
    }

};


