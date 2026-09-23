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

public class NodeUtil_isLabelName_1609672670228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1973;
     Object term13823;

    public NodeUtil_isLabelName_1609672670228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1986 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1996 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1973, term1973.getClass(), "type", 175343605);
        setIntField(term1975, term1975.getClass(), "type", -407582855);
        setIntField(term1977, term1977.getClass(), "type", 0);
        setField(term1977, term1977.getClass(), "next", null);
        setField(term1977, term1977.getClass(), "first", null);
        setField(term1977, term1977.getClass(), "last", null);
        setField(term1977, term1977.getClass(), "propListHead", null);
        setIntField(term1977, term1977.getClass(), "sourcePosition", 0);
        setField(term1977, term1977.getClass(), "jsType", null);
        setField(term1977, term1977.getClass(), "parent", null);
        setField(term1975, term1975.getClass(), "next", term1977);
        setIntField(term1980, term1980.getClass(), "type", 0);
        setField(term1980, term1980.getClass(), "next", null);
        setField(term1980, term1980.getClass(), "first", null);
        setField(term1980, term1980.getClass(), "last", null);
        setField(term1980, term1980.getClass(), "propListHead", null);
        setIntField(term1980, term1980.getClass(), "sourcePosition", 0);
        setField(term1980, term1980.getClass(), "jsType", null);
        setField(term1980, term1980.getClass(), "parent", null);
        setField(term1975, term1975.getClass(), "first", term1980);
        setIntField(term1983, term1983.getClass(), "type", 0);
        setField(term1983, term1983.getClass(), "next", null);
        setField(term1983, term1983.getClass(), "first", null);
        setField(term1983, term1983.getClass(), "last", null);
        setField(term1983, term1983.getClass(), "propListHead", null);
        setIntField(term1983, term1983.getClass(), "sourcePosition", 0);
        setField(term1983, term1983.getClass(), "jsType", null);
        setField(term1983, term1983.getClass(), "parent", null);
        setField(term1975, term1975.getClass(), "last", term1983);
        setField(term1986, term1986.getClass(), "next", null);
        setIntField(term1986, term1986.getClass(), "type", 0);
        setIntField(term1986, term1986.getClass(), "intValue", 0);
        setField(term1986, term1986.getClass(), "objectValue", null);
        setField(term1975, term1975.getClass(), "propListHead", term1986);
        setIntField(term1975, term1975.getClass(), "sourcePosition", 848907965);
        setField(term1975, term1975.getClass(), "jsType", null);
        setField(term1975, term1975.getClass(), "parent", null);
        setField(term1973, term1973.getClass(), "next", term1975);
        setIntField(term1990, term1990.getClass(), "type", 0);
        setField(term1990, term1990.getClass(), "next", null);
        setField(term1990, term1990.getClass(), "first", null);
        setField(term1990, term1990.getClass(), "last", null);
        setField(term1990, term1990.getClass(), "propListHead", null);
        setIntField(term1990, term1990.getClass(), "sourcePosition", 0);
        setField(term1990, term1990.getClass(), "jsType", null);
        setField(term1990, term1990.getClass(), "parent", null);
        setField(term1973, term1973.getClass(), "first", term1990);
        setIntField(term1993, term1993.getClass(), "type", 0);
        setField(term1993, term1993.getClass(), "next", null);
        setField(term1993, term1993.getClass(), "first", null);
        setField(term1993, term1993.getClass(), "last", null);
        setField(term1993, term1993.getClass(), "propListHead", null);
        setIntField(term1993, term1993.getClass(), "sourcePosition", 0);
        setField(term1993, term1993.getClass(), "jsType", null);
        setField(term1993, term1993.getClass(), "parent", null);
        setField(term1973, term1973.getClass(), "last", term1993);
        setField(term1996, term1996.getClass(), "next", null);
        setIntField(term1996, term1996.getClass(), "type", 0);
        setIntField(term1996, term1996.getClass(), "intValue", 0);
        setField(term1996, term1996.getClass(), "objectValue", null);
        setField(term1973, term1973.getClass(), "propListHead", term1996);
        setIntField(term1973, term1973.getClass(), "sourcePosition", 1865070548);
        setField(term1973, term1973.getClass(), "jsType", null);
        setField(term1973, term1973.getClass(), "parent", null);
        term13823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13828 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13831 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13823, term13823.getClass(), "type", 175343605);
        setIntField(term13824, term13824.getClass(), "type", -407582855);
        setIntField(term13825, term13825.getClass(), "type", 0);
        setField(term13825, term13825.getClass(), "next", null);
        setField(term13825, term13825.getClass(), "first", null);
        setField(term13825, term13825.getClass(), "last", null);
        setField(term13825, term13825.getClass(), "propListHead", null);
        setIntField(term13825, term13825.getClass(), "sourcePosition", 0);
        setField(term13825, term13825.getClass(), "jsType", null);
        setField(term13825, term13825.getClass(), "parent", null);
        setField(term13824, term13824.getClass(), "next", term13825);
        setIntField(term13826, term13826.getClass(), "type", 0);
        setField(term13826, term13826.getClass(), "next", null);
        setField(term13826, term13826.getClass(), "first", null);
        setField(term13826, term13826.getClass(), "last", null);
        setField(term13826, term13826.getClass(), "propListHead", null);
        setIntField(term13826, term13826.getClass(), "sourcePosition", 0);
        setField(term13826, term13826.getClass(), "jsType", null);
        setField(term13826, term13826.getClass(), "parent", null);
        setField(term13824, term13824.getClass(), "first", term13826);
        setIntField(term13827, term13827.getClass(), "type", 0);
        setField(term13827, term13827.getClass(), "next", null);
        setField(term13827, term13827.getClass(), "first", null);
        setField(term13827, term13827.getClass(), "last", null);
        setField(term13827, term13827.getClass(), "propListHead", null);
        setIntField(term13827, term13827.getClass(), "sourcePosition", 0);
        setField(term13827, term13827.getClass(), "jsType", null);
        setField(term13827, term13827.getClass(), "parent", null);
        setField(term13824, term13824.getClass(), "last", term13827);
        setField(term13828, term13828.getClass(), "next", null);
        setIntField(term13828, term13828.getClass(), "type", 0);
        setIntField(term13828, term13828.getClass(), "intValue", 0);
        setField(term13828, term13828.getClass(), "objectValue", null);
        setField(term13824, term13824.getClass(), "propListHead", term13828);
        setIntField(term13824, term13824.getClass(), "sourcePosition", 848907965);
        setField(term13824, term13824.getClass(), "jsType", null);
        setField(term13824, term13824.getClass(), "parent", null);
        setField(term13823, term13823.getClass(), "next", term13824);
        setIntField(term13829, term13829.getClass(), "type", 0);
        setField(term13829, term13829.getClass(), "next", null);
        setField(term13829, term13829.getClass(), "first", null);
        setField(term13829, term13829.getClass(), "last", null);
        setField(term13829, term13829.getClass(), "propListHead", null);
        setIntField(term13829, term13829.getClass(), "sourcePosition", 0);
        setField(term13829, term13829.getClass(), "jsType", null);
        setField(term13829, term13829.getClass(), "parent", null);
        setField(term13823, term13823.getClass(), "first", term13829);
        setIntField(term13830, term13830.getClass(), "type", 0);
        setField(term13830, term13830.getClass(), "next", null);
        setField(term13830, term13830.getClass(), "first", null);
        setField(term13830, term13830.getClass(), "last", null);
        setField(term13830, term13830.getClass(), "propListHead", null);
        setIntField(term13830, term13830.getClass(), "sourcePosition", 0);
        setField(term13830, term13830.getClass(), "jsType", null);
        setField(term13830, term13830.getClass(), "parent", null);
        setField(term13823, term13823.getClass(), "last", term13830);
        setField(term13831, term13831.getClass(), "next", null);
        setIntField(term13831, term13831.getClass(), "type", 0);
        setIntField(term13831, term13831.getClass(), "intValue", 0);
        setField(term13831, term13831.getClass(), "objectValue", null);
        setField(term13823, term13823.getClass(), "propListHead", term13831);
        setIntField(term13823, term13823.getClass(), "sourcePosition", 1865070548);
        setField(term13823, term13823.getClass(), "jsType", null);
        setField(term13823, term13823.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1973;
        Object retValue = callMethod(klass, "isLabelName", argTypes, null, args);
        assertTrue(recursiveEquals(term1973, term13823));
        assertTrue(recursiveEquals(retValue, false));
    }

};


