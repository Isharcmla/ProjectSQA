package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_caseNode_170930744694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term813;
     Object term840;

    public IR_caseNode_170930744694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term813, term813.getClass(), "type", -310528004);
        setIntField(term815, term815.getClass(), "type", -634976996);
        setIntField(term817, term817.getClass(), "type", -1015274146);
        setIntField(term819, term819.getClass(), "type", -49052672);
        setIntField(term821, term821.getClass(), "type", 339372704);
        setField(term821, term821.getClass(), "next", null);
        setField(term821, term821.getClass(), "first", null);
        setField(term821, term821.getClass(), "last", null);
        setField(term821, term821.getClass(), "propListHead", null);
        setIntField(term821, term821.getClass(), "sourcePosition", 0);
        setField(term821, term821.getClass(), "jsType", null);
        setField(term821, term821.getClass(), "parent", null);
        setField(term819, term819.getClass(), "next", term821);
        setIntField(term824, term824.getClass(), "type", -851097944);
        setField(term824, term824.getClass(), "next", null);
        setField(term824, term824.getClass(), "first", null);
        setField(term824, term824.getClass(), "last", term821);
        setField(term824, term824.getClass(), "propListHead", null);
        setIntField(term824, term824.getClass(), "sourcePosition", 0);
        setField(term824, term824.getClass(), "jsType", null);
        setField(term824, term824.getClass(), "parent", null);
        setField(term819, term819.getClass(), "first", term824);
        setField(term819, term819.getClass(), "last", term817);
        setField(term819, term819.getClass(), "propListHead", null);
        setIntField(term819, term819.getClass(), "sourcePosition", 0);
        setField(term819, term819.getClass(), "jsType", null);
        setField(term819, term819.getClass(), "parent", null);
        setField(term817, term817.getClass(), "next", term819);
        setField(term817, term817.getClass(), "first", term821);
        setIntField(term828, term828.getClass(), "type", 76929641);
        setIntField(term830, term830.getClass(), "type", -2003192918);
        setField(term830, term830.getClass(), "next", null);
        setField(term830, term830.getClass(), "first", term824);
        setField(term830, term830.getClass(), "last", term819);
        setField(term830, term830.getClass(), "propListHead", null);
        setIntField(term830, term830.getClass(), "sourcePosition", 0);
        setField(term830, term830.getClass(), "jsType", null);
        setField(term830, term830.getClass(), "parent", null);
        setField(term828, term828.getClass(), "next", term830);
        setField(term828, term828.getClass(), "first", term815);
        setField(term828, term828.getClass(), "last", term815);
        setField(term828, term828.getClass(), "propListHead", null);
        setIntField(term828, term828.getClass(), "sourcePosition", 0);
        setField(term828, term828.getClass(), "jsType", null);
        setField(term828, term828.getClass(), "parent", null);
        setField(term817, term817.getClass(), "last", term828);
        setField(term817, term817.getClass(), "propListHead", null);
        setIntField(term817, term817.getClass(), "sourcePosition", 0);
        setField(term817, term817.getClass(), "jsType", null);
        setField(term817, term817.getClass(), "parent", null);
        setField(term815, term815.getClass(), "next", term817);
        setIntField(term835, term835.getClass(), "type", -1362856620);
        setField(term835, term835.getClass(), "next", term828);
        setField(term835, term835.getClass(), "first", term830);
        setField(term835, term835.getClass(), "last", term813);
        setField(term835, term835.getClass(), "propListHead", null);
        setIntField(term835, term835.getClass(), "sourcePosition", 0);
        setField(term835, term835.getClass(), "jsType", null);
        setField(term835, term835.getClass(), "parent", null);
        setField(term815, term815.getClass(), "first", term835);
        setField(term815, term815.getClass(), "last", term835);
        setField(term815, term815.getClass(), "propListHead", null);
        setIntField(term815, term815.getClass(), "sourcePosition", 0);
        setField(term815, term815.getClass(), "jsType", null);
        setField(term815, term815.getClass(), "parent", null);
        setField(term813, term813.getClass(), "next", term815);
        setField(term813, term813.getClass(), "first", term819);
        setField(term813, term813.getClass(), "last", term821);
        setField(term813, term813.getClass(), "propListHead", null);
        setIntField(term813, term813.getClass(), "sourcePosition", 0);
        setField(term813, term813.getClass(), "jsType", null);
        setField(term813, term813.getClass(), "parent", null);
        term840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term840, term840.getClass(), "type", -1835839814);
        setIntField(term842, term842.getClass(), "type", -1404350380);
        setIntField(term844, term844.getClass(), "type", -2013924238);
        setIntField(term846, term846.getClass(), "type", 579006268);
        setIntField(term848, term848.getClass(), "type", -1694747156);
        setField(term848, term848.getClass(), "next", null);
        setField(term848, term848.getClass(), "first", null);
        setField(term848, term848.getClass(), "last", null);
        setField(term848, term848.getClass(), "propListHead", null);
        setIntField(term848, term848.getClass(), "sourcePosition", 0);
        setField(term848, term848.getClass(), "jsType", null);
        setField(term848, term848.getClass(), "parent", null);
        setField(term846, term846.getClass(), "next", term848);
        setIntField(term851, term851.getClass(), "type", 1466373988);
        setField(term851, term851.getClass(), "next", null);
        setField(term851, term851.getClass(), "first", null);
        setField(term851, term851.getClass(), "last", term848);
        setField(term851, term851.getClass(), "propListHead", null);
        setIntField(term851, term851.getClass(), "sourcePosition", 0);
        setField(term851, term851.getClass(), "jsType", null);
        setField(term851, term851.getClass(), "parent", null);
        setField(term846, term846.getClass(), "first", term851);
        setField(term846, term846.getClass(), "last", term844);
        setField(term846, term846.getClass(), "propListHead", null);
        setIntField(term846, term846.getClass(), "sourcePosition", 0);
        setField(term846, term846.getClass(), "jsType", null);
        setField(term846, term846.getClass(), "parent", null);
        setField(term844, term844.getClass(), "next", term846);
        setField(term844, term844.getClass(), "first", term848);
        setIntField(term855, term855.getClass(), "type", 1843268026);
        setIntField(term857, term857.getClass(), "type", 954660603);
        setField(term857, term857.getClass(), "next", null);
        setField(term857, term857.getClass(), "first", term851);
        setField(term857, term857.getClass(), "last", term846);
        setField(term857, term857.getClass(), "propListHead", null);
        setIntField(term857, term857.getClass(), "sourcePosition", 0);
        setField(term857, term857.getClass(), "jsType", null);
        setField(term857, term857.getClass(), "parent", null);
        setField(term855, term855.getClass(), "next", term857);
        setField(term855, term855.getClass(), "first", term842);
        setField(term855, term855.getClass(), "last", term842);
        setField(term855, term855.getClass(), "propListHead", null);
        setIntField(term855, term855.getClass(), "sourcePosition", 0);
        setField(term855, term855.getClass(), "jsType", null);
        setField(term855, term855.getClass(), "parent", null);
        setField(term844, term844.getClass(), "last", term855);
        setField(term844, term844.getClass(), "propListHead", null);
        setIntField(term844, term844.getClass(), "sourcePosition", 0);
        setField(term844, term844.getClass(), "jsType", null);
        setField(term844, term844.getClass(), "parent", null);
        setField(term842, term842.getClass(), "next", term844);
        setIntField(term862, term862.getClass(), "type", -1351605385);
        setField(term862, term862.getClass(), "next", term855);
        setField(term862, term862.getClass(), "first", term857);
        setField(term862, term862.getClass(), "last", term840);
        setField(term862, term862.getClass(), "propListHead", null);
        setIntField(term862, term862.getClass(), "sourcePosition", 0);
        setField(term862, term862.getClass(), "jsType", null);
        setField(term862, term862.getClass(), "parent", null);
        setField(term842, term842.getClass(), "first", term862);
        setField(term842, term842.getClass(), "last", term862);
        setField(term842, term842.getClass(), "propListHead", null);
        setIntField(term842, term842.getClass(), "sourcePosition", 0);
        setField(term842, term842.getClass(), "jsType", null);
        setField(term842, term842.getClass(), "parent", null);
        setField(term840, term840.getClass(), "next", term842);
        setField(term840, term840.getClass(), "first", term846);
        setField(term840, term840.getClass(), "last", term848);
        setField(term840, term840.getClass(), "propListHead", null);
        setIntField(term840, term840.getClass(), "sourcePosition", 0);
        setField(term840, term840.getClass(), "jsType", null);
        setField(term840, term840.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term813;
        args[1] = term840;
        try {
            callMethod(klass, "caseNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


