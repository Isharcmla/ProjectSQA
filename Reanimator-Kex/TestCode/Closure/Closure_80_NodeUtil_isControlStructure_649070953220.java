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

public class NodeUtil_isControlStructure_649070953220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1730;
     Object term12437;

    public NodeUtil_isControlStructure_649070953220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1743 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1753 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1730, term1730.getClass(), "type", -1631048635);
        setIntField(term1732, term1732.getClass(), "type", -146564963);
        setIntField(term1734, term1734.getClass(), "type", 0);
        setField(term1734, term1734.getClass(), "next", null);
        setField(term1734, term1734.getClass(), "first", null);
        setField(term1734, term1734.getClass(), "last", null);
        setField(term1734, term1734.getClass(), "propListHead", null);
        setIntField(term1734, term1734.getClass(), "sourcePosition", 0);
        setField(term1734, term1734.getClass(), "jsType", null);
        setField(term1734, term1734.getClass(), "parent", null);
        setField(term1732, term1732.getClass(), "next", term1734);
        setIntField(term1737, term1737.getClass(), "type", 0);
        setField(term1737, term1737.getClass(), "next", null);
        setField(term1737, term1737.getClass(), "first", null);
        setField(term1737, term1737.getClass(), "last", null);
        setField(term1737, term1737.getClass(), "propListHead", null);
        setIntField(term1737, term1737.getClass(), "sourcePosition", 0);
        setField(term1737, term1737.getClass(), "jsType", null);
        setField(term1737, term1737.getClass(), "parent", null);
        setField(term1732, term1732.getClass(), "first", term1737);
        setIntField(term1740, term1740.getClass(), "type", 0);
        setField(term1740, term1740.getClass(), "next", null);
        setField(term1740, term1740.getClass(), "first", null);
        setField(term1740, term1740.getClass(), "last", null);
        setField(term1740, term1740.getClass(), "propListHead", null);
        setIntField(term1740, term1740.getClass(), "sourcePosition", 0);
        setField(term1740, term1740.getClass(), "jsType", null);
        setField(term1740, term1740.getClass(), "parent", null);
        setField(term1732, term1732.getClass(), "last", term1740);
        setField(term1743, term1743.getClass(), "next", null);
        setIntField(term1743, term1743.getClass(), "type", 0);
        setIntField(term1743, term1743.getClass(), "intValue", 0);
        setField(term1743, term1743.getClass(), "objectValue", null);
        setField(term1732, term1732.getClass(), "propListHead", term1743);
        setIntField(term1732, term1732.getClass(), "sourcePosition", 1991858584);
        setField(term1732, term1732.getClass(), "jsType", null);
        setField(term1732, term1732.getClass(), "parent", null);
        setField(term1730, term1730.getClass(), "next", term1732);
        setIntField(term1747, term1747.getClass(), "type", 0);
        setField(term1747, term1747.getClass(), "next", null);
        setField(term1747, term1747.getClass(), "first", null);
        setField(term1747, term1747.getClass(), "last", null);
        setField(term1747, term1747.getClass(), "propListHead", null);
        setIntField(term1747, term1747.getClass(), "sourcePosition", 0);
        setField(term1747, term1747.getClass(), "jsType", null);
        setField(term1747, term1747.getClass(), "parent", null);
        setField(term1730, term1730.getClass(), "first", term1747);
        setIntField(term1750, term1750.getClass(), "type", 0);
        setField(term1750, term1750.getClass(), "next", null);
        setField(term1750, term1750.getClass(), "first", null);
        setField(term1750, term1750.getClass(), "last", null);
        setField(term1750, term1750.getClass(), "propListHead", null);
        setIntField(term1750, term1750.getClass(), "sourcePosition", 0);
        setField(term1750, term1750.getClass(), "jsType", null);
        setField(term1750, term1750.getClass(), "parent", null);
        setField(term1730, term1730.getClass(), "last", term1750);
        setField(term1753, term1753.getClass(), "next", null);
        setIntField(term1753, term1753.getClass(), "type", 0);
        setIntField(term1753, term1753.getClass(), "intValue", 0);
        setField(term1753, term1753.getClass(), "objectValue", null);
        setField(term1730, term1730.getClass(), "propListHead", term1753);
        setIntField(term1730, term1730.getClass(), "sourcePosition", -1300947782);
        setField(term1730, term1730.getClass(), "jsType", null);
        setField(term1730, term1730.getClass(), "parent", null);
        term12437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12442 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12445 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12437, term12437.getClass(), "type", -1631048635);
        setIntField(term12438, term12438.getClass(), "type", -146564963);
        setIntField(term12439, term12439.getClass(), "type", 0);
        setField(term12439, term12439.getClass(), "next", null);
        setField(term12439, term12439.getClass(), "first", null);
        setField(term12439, term12439.getClass(), "last", null);
        setField(term12439, term12439.getClass(), "propListHead", null);
        setIntField(term12439, term12439.getClass(), "sourcePosition", 0);
        setField(term12439, term12439.getClass(), "jsType", null);
        setField(term12439, term12439.getClass(), "parent", null);
        setField(term12438, term12438.getClass(), "next", term12439);
        setIntField(term12440, term12440.getClass(), "type", 0);
        setField(term12440, term12440.getClass(), "next", null);
        setField(term12440, term12440.getClass(), "first", null);
        setField(term12440, term12440.getClass(), "last", null);
        setField(term12440, term12440.getClass(), "propListHead", null);
        setIntField(term12440, term12440.getClass(), "sourcePosition", 0);
        setField(term12440, term12440.getClass(), "jsType", null);
        setField(term12440, term12440.getClass(), "parent", null);
        setField(term12438, term12438.getClass(), "first", term12440);
        setIntField(term12441, term12441.getClass(), "type", 0);
        setField(term12441, term12441.getClass(), "next", null);
        setField(term12441, term12441.getClass(), "first", null);
        setField(term12441, term12441.getClass(), "last", null);
        setField(term12441, term12441.getClass(), "propListHead", null);
        setIntField(term12441, term12441.getClass(), "sourcePosition", 0);
        setField(term12441, term12441.getClass(), "jsType", null);
        setField(term12441, term12441.getClass(), "parent", null);
        setField(term12438, term12438.getClass(), "last", term12441);
        setField(term12442, term12442.getClass(), "next", null);
        setIntField(term12442, term12442.getClass(), "type", 0);
        setIntField(term12442, term12442.getClass(), "intValue", 0);
        setField(term12442, term12442.getClass(), "objectValue", null);
        setField(term12438, term12438.getClass(), "propListHead", term12442);
        setIntField(term12438, term12438.getClass(), "sourcePosition", 1991858584);
        setField(term12438, term12438.getClass(), "jsType", null);
        setField(term12438, term12438.getClass(), "parent", null);
        setField(term12437, term12437.getClass(), "next", term12438);
        setIntField(term12443, term12443.getClass(), "type", 0);
        setField(term12443, term12443.getClass(), "next", null);
        setField(term12443, term12443.getClass(), "first", null);
        setField(term12443, term12443.getClass(), "last", null);
        setField(term12443, term12443.getClass(), "propListHead", null);
        setIntField(term12443, term12443.getClass(), "sourcePosition", 0);
        setField(term12443, term12443.getClass(), "jsType", null);
        setField(term12443, term12443.getClass(), "parent", null);
        setField(term12437, term12437.getClass(), "first", term12443);
        setIntField(term12444, term12444.getClass(), "type", 0);
        setField(term12444, term12444.getClass(), "next", null);
        setField(term12444, term12444.getClass(), "first", null);
        setField(term12444, term12444.getClass(), "last", null);
        setField(term12444, term12444.getClass(), "propListHead", null);
        setIntField(term12444, term12444.getClass(), "sourcePosition", 0);
        setField(term12444, term12444.getClass(), "jsType", null);
        setField(term12444, term12444.getClass(), "parent", null);
        setField(term12437, term12437.getClass(), "last", term12444);
        setField(term12445, term12445.getClass(), "next", null);
        setIntField(term12445, term12445.getClass(), "type", 0);
        setIntField(term12445, term12445.getClass(), "intValue", 0);
        setField(term12445, term12445.getClass(), "objectValue", null);
        setField(term12437, term12437.getClass(), "propListHead", term12445);
        setIntField(term12437, term12437.getClass(), "sourcePosition", -1300947782);
        setField(term12437, term12437.getClass(), "jsType", null);
        setField(term12437, term12437.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1730;
        Object retValue = callMethod(klass, "isControlStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term1730, term12437));
        assertTrue(recursiveEquals(retValue, false));
    }

};


