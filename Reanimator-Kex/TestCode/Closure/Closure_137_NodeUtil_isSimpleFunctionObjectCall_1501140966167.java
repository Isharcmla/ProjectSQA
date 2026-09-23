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

public class NodeUtil_isSimpleFunctionObjectCall_1501140966167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1754;
     Object term10326;

    public NodeUtil_isSimpleFunctionObjectCall_1501140966167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1767 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1777 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1754, term1754.getClass(), "type", -341287775);
        setIntField(term1756, term1756.getClass(), "type", -2023791789);
        setIntField(term1758, term1758.getClass(), "type", 0);
        setField(term1758, term1758.getClass(), "next", null);
        setField(term1758, term1758.getClass(), "first", null);
        setField(term1758, term1758.getClass(), "last", null);
        setField(term1758, term1758.getClass(), "propListHead", null);
        setIntField(term1758, term1758.getClass(), "sourcePosition", 0);
        setField(term1758, term1758.getClass(), "jsType", null);
        setField(term1758, term1758.getClass(), "parent", null);
        setField(term1756, term1756.getClass(), "next", term1758);
        setIntField(term1761, term1761.getClass(), "type", 0);
        setField(term1761, term1761.getClass(), "next", null);
        setField(term1761, term1761.getClass(), "first", null);
        setField(term1761, term1761.getClass(), "last", null);
        setField(term1761, term1761.getClass(), "propListHead", null);
        setIntField(term1761, term1761.getClass(), "sourcePosition", 0);
        setField(term1761, term1761.getClass(), "jsType", null);
        setField(term1761, term1761.getClass(), "parent", null);
        setField(term1756, term1756.getClass(), "first", term1761);
        setIntField(term1764, term1764.getClass(), "type", 0);
        setField(term1764, term1764.getClass(), "next", null);
        setField(term1764, term1764.getClass(), "first", null);
        setField(term1764, term1764.getClass(), "last", null);
        setField(term1764, term1764.getClass(), "propListHead", null);
        setIntField(term1764, term1764.getClass(), "sourcePosition", 0);
        setField(term1764, term1764.getClass(), "jsType", null);
        setField(term1764, term1764.getClass(), "parent", null);
        setField(term1756, term1756.getClass(), "last", term1764);
        setField(term1767, term1767.getClass(), "next", null);
        setIntField(term1767, term1767.getClass(), "type", 0);
        setIntField(term1767, term1767.getClass(), "intValue", 0);
        setField(term1767, term1767.getClass(), "objectValue", null);
        setField(term1756, term1756.getClass(), "propListHead", term1767);
        setIntField(term1756, term1756.getClass(), "sourcePosition", 1418551216);
        setField(term1756, term1756.getClass(), "jsType", null);
        setField(term1756, term1756.getClass(), "parent", null);
        setField(term1754, term1754.getClass(), "next", term1756);
        setIntField(term1771, term1771.getClass(), "type", 0);
        setField(term1771, term1771.getClass(), "next", null);
        setField(term1771, term1771.getClass(), "first", null);
        setField(term1771, term1771.getClass(), "last", null);
        setField(term1771, term1771.getClass(), "propListHead", null);
        setIntField(term1771, term1771.getClass(), "sourcePosition", 0);
        setField(term1771, term1771.getClass(), "jsType", null);
        setField(term1771, term1771.getClass(), "parent", null);
        setField(term1754, term1754.getClass(), "first", term1771);
        setIntField(term1774, term1774.getClass(), "type", 0);
        setField(term1774, term1774.getClass(), "next", null);
        setField(term1774, term1774.getClass(), "first", null);
        setField(term1774, term1774.getClass(), "last", null);
        setField(term1774, term1774.getClass(), "propListHead", null);
        setIntField(term1774, term1774.getClass(), "sourcePosition", 0);
        setField(term1774, term1774.getClass(), "jsType", null);
        setField(term1774, term1774.getClass(), "parent", null);
        setField(term1754, term1754.getClass(), "last", term1774);
        setField(term1777, term1777.getClass(), "next", null);
        setIntField(term1777, term1777.getClass(), "type", 0);
        setIntField(term1777, term1777.getClass(), "intValue", 0);
        setField(term1777, term1777.getClass(), "objectValue", null);
        setField(term1754, term1754.getClass(), "propListHead", term1777);
        setIntField(term1754, term1754.getClass(), "sourcePosition", -626779272);
        setField(term1754, term1754.getClass(), "jsType", null);
        setField(term1754, term1754.getClass(), "parent", null);
        term10326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10331 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10334 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10326, term10326.getClass(), "type", -341287775);
        setIntField(term10327, term10327.getClass(), "type", -2023791789);
        setIntField(term10328, term10328.getClass(), "type", 0);
        setField(term10328, term10328.getClass(), "next", null);
        setField(term10328, term10328.getClass(), "first", null);
        setField(term10328, term10328.getClass(), "last", null);
        setField(term10328, term10328.getClass(), "propListHead", null);
        setIntField(term10328, term10328.getClass(), "sourcePosition", 0);
        setField(term10328, term10328.getClass(), "jsType", null);
        setField(term10328, term10328.getClass(), "parent", null);
        setField(term10327, term10327.getClass(), "next", term10328);
        setIntField(term10329, term10329.getClass(), "type", 0);
        setField(term10329, term10329.getClass(), "next", null);
        setField(term10329, term10329.getClass(), "first", null);
        setField(term10329, term10329.getClass(), "last", null);
        setField(term10329, term10329.getClass(), "propListHead", null);
        setIntField(term10329, term10329.getClass(), "sourcePosition", 0);
        setField(term10329, term10329.getClass(), "jsType", null);
        setField(term10329, term10329.getClass(), "parent", null);
        setField(term10327, term10327.getClass(), "first", term10329);
        setIntField(term10330, term10330.getClass(), "type", 0);
        setField(term10330, term10330.getClass(), "next", null);
        setField(term10330, term10330.getClass(), "first", null);
        setField(term10330, term10330.getClass(), "last", null);
        setField(term10330, term10330.getClass(), "propListHead", null);
        setIntField(term10330, term10330.getClass(), "sourcePosition", 0);
        setField(term10330, term10330.getClass(), "jsType", null);
        setField(term10330, term10330.getClass(), "parent", null);
        setField(term10327, term10327.getClass(), "last", term10330);
        setField(term10331, term10331.getClass(), "next", null);
        setIntField(term10331, term10331.getClass(), "type", 0);
        setIntField(term10331, term10331.getClass(), "intValue", 0);
        setField(term10331, term10331.getClass(), "objectValue", null);
        setField(term10327, term10327.getClass(), "propListHead", term10331);
        setIntField(term10327, term10327.getClass(), "sourcePosition", 1418551216);
        setField(term10327, term10327.getClass(), "jsType", null);
        setField(term10327, term10327.getClass(), "parent", null);
        setField(term10326, term10326.getClass(), "next", term10327);
        setIntField(term10332, term10332.getClass(), "type", 0);
        setField(term10332, term10332.getClass(), "next", null);
        setField(term10332, term10332.getClass(), "first", null);
        setField(term10332, term10332.getClass(), "last", null);
        setField(term10332, term10332.getClass(), "propListHead", null);
        setIntField(term10332, term10332.getClass(), "sourcePosition", 0);
        setField(term10332, term10332.getClass(), "jsType", null);
        setField(term10332, term10332.getClass(), "parent", null);
        setField(term10326, term10326.getClass(), "first", term10332);
        setIntField(term10333, term10333.getClass(), "type", 0);
        setField(term10333, term10333.getClass(), "next", null);
        setField(term10333, term10333.getClass(), "first", null);
        setField(term10333, term10333.getClass(), "last", null);
        setField(term10333, term10333.getClass(), "propListHead", null);
        setIntField(term10333, term10333.getClass(), "sourcePosition", 0);
        setField(term10333, term10333.getClass(), "jsType", null);
        setField(term10333, term10333.getClass(), "parent", null);
        setField(term10326, term10326.getClass(), "last", term10333);
        setField(term10334, term10334.getClass(), "next", null);
        setIntField(term10334, term10334.getClass(), "type", 0);
        setIntField(term10334, term10334.getClass(), "intValue", 0);
        setField(term10334, term10334.getClass(), "objectValue", null);
        setField(term10326, term10326.getClass(), "propListHead", term10334);
        setIntField(term10326, term10326.getClass(), "sourcePosition", -626779272);
        setField(term10326, term10326.getClass(), "jsType", null);
        setField(term10326, term10326.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1754;
        Object retValue = callMethod(klass, "isSimpleFunctionObjectCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1754, term10326));
        assertTrue(recursiveEquals(retValue, false));
    }

};


