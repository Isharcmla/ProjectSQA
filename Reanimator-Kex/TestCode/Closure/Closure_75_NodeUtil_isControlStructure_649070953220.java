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
     Object term12731;

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
        term12731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12736 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12739 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12731, term12731.getClass(), "type", -1631048635);
        setIntField(term12732, term12732.getClass(), "type", -146564963);
        setIntField(term12733, term12733.getClass(), "type", 0);
        setField(term12733, term12733.getClass(), "next", null);
        setField(term12733, term12733.getClass(), "first", null);
        setField(term12733, term12733.getClass(), "last", null);
        setField(term12733, term12733.getClass(), "propListHead", null);
        setIntField(term12733, term12733.getClass(), "sourcePosition", 0);
        setField(term12733, term12733.getClass(), "jsType", null);
        setField(term12733, term12733.getClass(), "parent", null);
        setField(term12732, term12732.getClass(), "next", term12733);
        setIntField(term12734, term12734.getClass(), "type", 0);
        setField(term12734, term12734.getClass(), "next", null);
        setField(term12734, term12734.getClass(), "first", null);
        setField(term12734, term12734.getClass(), "last", null);
        setField(term12734, term12734.getClass(), "propListHead", null);
        setIntField(term12734, term12734.getClass(), "sourcePosition", 0);
        setField(term12734, term12734.getClass(), "jsType", null);
        setField(term12734, term12734.getClass(), "parent", null);
        setField(term12732, term12732.getClass(), "first", term12734);
        setIntField(term12735, term12735.getClass(), "type", 0);
        setField(term12735, term12735.getClass(), "next", null);
        setField(term12735, term12735.getClass(), "first", null);
        setField(term12735, term12735.getClass(), "last", null);
        setField(term12735, term12735.getClass(), "propListHead", null);
        setIntField(term12735, term12735.getClass(), "sourcePosition", 0);
        setField(term12735, term12735.getClass(), "jsType", null);
        setField(term12735, term12735.getClass(), "parent", null);
        setField(term12732, term12732.getClass(), "last", term12735);
        setField(term12736, term12736.getClass(), "next", null);
        setIntField(term12736, term12736.getClass(), "type", 0);
        setIntField(term12736, term12736.getClass(), "intValue", 0);
        setField(term12736, term12736.getClass(), "objectValue", null);
        setField(term12732, term12732.getClass(), "propListHead", term12736);
        setIntField(term12732, term12732.getClass(), "sourcePosition", 1991858584);
        setField(term12732, term12732.getClass(), "jsType", null);
        setField(term12732, term12732.getClass(), "parent", null);
        setField(term12731, term12731.getClass(), "next", term12732);
        setIntField(term12737, term12737.getClass(), "type", 0);
        setField(term12737, term12737.getClass(), "next", null);
        setField(term12737, term12737.getClass(), "first", null);
        setField(term12737, term12737.getClass(), "last", null);
        setField(term12737, term12737.getClass(), "propListHead", null);
        setIntField(term12737, term12737.getClass(), "sourcePosition", 0);
        setField(term12737, term12737.getClass(), "jsType", null);
        setField(term12737, term12737.getClass(), "parent", null);
        setField(term12731, term12731.getClass(), "first", term12737);
        setIntField(term12738, term12738.getClass(), "type", 0);
        setField(term12738, term12738.getClass(), "next", null);
        setField(term12738, term12738.getClass(), "first", null);
        setField(term12738, term12738.getClass(), "last", null);
        setField(term12738, term12738.getClass(), "propListHead", null);
        setIntField(term12738, term12738.getClass(), "sourcePosition", 0);
        setField(term12738, term12738.getClass(), "jsType", null);
        setField(term12738, term12738.getClass(), "parent", null);
        setField(term12731, term12731.getClass(), "last", term12738);
        setField(term12739, term12739.getClass(), "next", null);
        setIntField(term12739, term12739.getClass(), "type", 0);
        setIntField(term12739, term12739.getClass(), "intValue", 0);
        setField(term12739, term12739.getClass(), "objectValue", null);
        setField(term12731, term12731.getClass(), "propListHead", term12739);
        setIntField(term12731, term12731.getClass(), "sourcePosition", -1300947782);
        setField(term12731, term12731.getClass(), "jsType", null);
        setField(term12731, term12731.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1730;
        Object retValue = callMethod(klass, "isControlStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term1730, term12731));
        assertTrue(recursiveEquals(retValue, false));
    }

};


