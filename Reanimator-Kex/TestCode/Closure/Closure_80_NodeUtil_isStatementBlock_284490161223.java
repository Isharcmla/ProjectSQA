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
     Object term13324;

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
        term13324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13329 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13332 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13324, term13324.getClass(), "type", -1723168189);
        setIntField(term13325, term13325.getClass(), "type", 532666604);
        setIntField(term13326, term13326.getClass(), "type", 0);
        setField(term13326, term13326.getClass(), "next", null);
        setField(term13326, term13326.getClass(), "first", null);
        setField(term13326, term13326.getClass(), "last", null);
        setField(term13326, term13326.getClass(), "propListHead", null);
        setIntField(term13326, term13326.getClass(), "sourcePosition", 0);
        setField(term13326, term13326.getClass(), "jsType", null);
        setField(term13326, term13326.getClass(), "parent", null);
        setField(term13325, term13325.getClass(), "next", term13326);
        setIntField(term13327, term13327.getClass(), "type", 0);
        setField(term13327, term13327.getClass(), "next", null);
        setField(term13327, term13327.getClass(), "first", null);
        setField(term13327, term13327.getClass(), "last", null);
        setField(term13327, term13327.getClass(), "propListHead", null);
        setIntField(term13327, term13327.getClass(), "sourcePosition", 0);
        setField(term13327, term13327.getClass(), "jsType", null);
        setField(term13327, term13327.getClass(), "parent", null);
        setField(term13325, term13325.getClass(), "first", term13327);
        setIntField(term13328, term13328.getClass(), "type", 0);
        setField(term13328, term13328.getClass(), "next", null);
        setField(term13328, term13328.getClass(), "first", null);
        setField(term13328, term13328.getClass(), "last", null);
        setField(term13328, term13328.getClass(), "propListHead", null);
        setIntField(term13328, term13328.getClass(), "sourcePosition", 0);
        setField(term13328, term13328.getClass(), "jsType", null);
        setField(term13328, term13328.getClass(), "parent", null);
        setField(term13325, term13325.getClass(), "last", term13328);
        setField(term13329, term13329.getClass(), "next", null);
        setIntField(term13329, term13329.getClass(), "type", 0);
        setIntField(term13329, term13329.getClass(), "intValue", 0);
        setField(term13329, term13329.getClass(), "objectValue", null);
        setField(term13325, term13325.getClass(), "propListHead", term13329);
        setIntField(term13325, term13325.getClass(), "sourcePosition", 63677360);
        setField(term13325, term13325.getClass(), "jsType", null);
        setField(term13325, term13325.getClass(), "parent", null);
        setField(term13324, term13324.getClass(), "next", term13325);
        setIntField(term13330, term13330.getClass(), "type", 0);
        setField(term13330, term13330.getClass(), "next", null);
        setField(term13330, term13330.getClass(), "first", null);
        setField(term13330, term13330.getClass(), "last", null);
        setField(term13330, term13330.getClass(), "propListHead", null);
        setIntField(term13330, term13330.getClass(), "sourcePosition", 0);
        setField(term13330, term13330.getClass(), "jsType", null);
        setField(term13330, term13330.getClass(), "parent", null);
        setField(term13324, term13324.getClass(), "first", term13330);
        setIntField(term13331, term13331.getClass(), "type", 0);
        setField(term13331, term13331.getClass(), "next", null);
        setField(term13331, term13331.getClass(), "first", null);
        setField(term13331, term13331.getClass(), "last", null);
        setField(term13331, term13331.getClass(), "propListHead", null);
        setIntField(term13331, term13331.getClass(), "sourcePosition", 0);
        setField(term13331, term13331.getClass(), "jsType", null);
        setField(term13331, term13331.getClass(), "parent", null);
        setField(term13324, term13324.getClass(), "last", term13331);
        setField(term13332, term13332.getClass(), "next", null);
        setIntField(term13332, term13332.getClass(), "type", 0);
        setIntField(term13332, term13332.getClass(), "intValue", 0);
        setField(term13332, term13332.getClass(), "objectValue", null);
        setField(term13324, term13324.getClass(), "propListHead", term13332);
        setIntField(term13324, term13324.getClass(), "sourcePosition", 1478914037);
        setField(term13324, term13324.getClass(), "jsType", null);
        setField(term13324, term13324.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1838;
        Object retValue = callMethod(klass, "isStatementBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term1838, term13324));
        assertTrue(recursiveEquals(retValue, false));
    }

};


