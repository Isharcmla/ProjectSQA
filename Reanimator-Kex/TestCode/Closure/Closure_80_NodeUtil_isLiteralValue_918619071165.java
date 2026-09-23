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
import java.lang.Boolean;

public class NodeUtil_isLiteralValue_918619071165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290;
     Object term317;
     Object term6853;

    public NodeUtil_isLiteralValue_918619071165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term303 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term313 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term290, term290.getClass(), "type", -1801760683);
        setIntField(term292, term292.getClass(), "type", -893623680);
        setIntField(term294, term294.getClass(), "type", 0);
        setField(term294, term294.getClass(), "next", null);
        setField(term294, term294.getClass(), "first", null);
        setField(term294, term294.getClass(), "last", null);
        setField(term294, term294.getClass(), "propListHead", null);
        setIntField(term294, term294.getClass(), "sourcePosition", 0);
        setField(term294, term294.getClass(), "jsType", null);
        setField(term294, term294.getClass(), "parent", null);
        setField(term292, term292.getClass(), "next", term294);
        setIntField(term297, term297.getClass(), "type", 0);
        setField(term297, term297.getClass(), "next", null);
        setField(term297, term297.getClass(), "first", null);
        setField(term297, term297.getClass(), "last", null);
        setField(term297, term297.getClass(), "propListHead", null);
        setIntField(term297, term297.getClass(), "sourcePosition", 0);
        setField(term297, term297.getClass(), "jsType", null);
        setField(term297, term297.getClass(), "parent", null);
        setField(term292, term292.getClass(), "first", term297);
        setIntField(term300, term300.getClass(), "type", 0);
        setField(term300, term300.getClass(), "next", null);
        setField(term300, term300.getClass(), "first", null);
        setField(term300, term300.getClass(), "last", null);
        setField(term300, term300.getClass(), "propListHead", null);
        setIntField(term300, term300.getClass(), "sourcePosition", 0);
        setField(term300, term300.getClass(), "jsType", null);
        setField(term300, term300.getClass(), "parent", null);
        setField(term292, term292.getClass(), "last", term300);
        setField(term303, term303.getClass(), "next", null);
        setIntField(term303, term303.getClass(), "type", 0);
        setIntField(term303, term303.getClass(), "intValue", 0);
        setField(term303, term303.getClass(), "objectValue", null);
        setField(term292, term292.getClass(), "propListHead", term303);
        setIntField(term292, term292.getClass(), "sourcePosition", 1045657203);
        setField(term292, term292.getClass(), "jsType", null);
        setField(term292, term292.getClass(), "parent", null);
        setField(term290, term290.getClass(), "next", term292);
        setIntField(term307, term307.getClass(), "type", 0);
        setField(term307, term307.getClass(), "next", null);
        setField(term307, term307.getClass(), "first", null);
        setField(term307, term307.getClass(), "last", null);
        setField(term307, term307.getClass(), "propListHead", null);
        setIntField(term307, term307.getClass(), "sourcePosition", 0);
        setField(term307, term307.getClass(), "jsType", null);
        setField(term307, term307.getClass(), "parent", null);
        setField(term290, term290.getClass(), "first", term307);
        setIntField(term310, term310.getClass(), "type", 0);
        setField(term310, term310.getClass(), "next", null);
        setField(term310, term310.getClass(), "first", null);
        setField(term310, term310.getClass(), "last", null);
        setField(term310, term310.getClass(), "propListHead", null);
        setIntField(term310, term310.getClass(), "sourcePosition", 0);
        setField(term310, term310.getClass(), "jsType", null);
        setField(term310, term310.getClass(), "parent", null);
        setField(term290, term290.getClass(), "last", term310);
        setField(term313, term313.getClass(), "next", null);
        setIntField(term313, term313.getClass(), "type", 0);
        setIntField(term313, term313.getClass(), "intValue", 0);
        setField(term313, term313.getClass(), "objectValue", null);
        setField(term290, term290.getClass(), "propListHead", term313);
        setIntField(term290, term290.getClass(), "sourcePosition", 1386130016);
        setField(term290, term290.getClass(), "jsType", null);
        setField(term290, term290.getClass(), "parent", null);
        term317 = new Boolean(false);
        term6853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6858 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6861 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6853, term6853.getClass(), "type", -1801760683);
        setIntField(term6854, term6854.getClass(), "type", -893623680);
        setIntField(term6855, term6855.getClass(), "type", 0);
        setField(term6855, term6855.getClass(), "next", null);
        setField(term6855, term6855.getClass(), "first", null);
        setField(term6855, term6855.getClass(), "last", null);
        setField(term6855, term6855.getClass(), "propListHead", null);
        setIntField(term6855, term6855.getClass(), "sourcePosition", 0);
        setField(term6855, term6855.getClass(), "jsType", null);
        setField(term6855, term6855.getClass(), "parent", null);
        setField(term6854, term6854.getClass(), "next", term6855);
        setIntField(term6856, term6856.getClass(), "type", 0);
        setField(term6856, term6856.getClass(), "next", null);
        setField(term6856, term6856.getClass(), "first", null);
        setField(term6856, term6856.getClass(), "last", null);
        setField(term6856, term6856.getClass(), "propListHead", null);
        setIntField(term6856, term6856.getClass(), "sourcePosition", 0);
        setField(term6856, term6856.getClass(), "jsType", null);
        setField(term6856, term6856.getClass(), "parent", null);
        setField(term6854, term6854.getClass(), "first", term6856);
        setIntField(term6857, term6857.getClass(), "type", 0);
        setField(term6857, term6857.getClass(), "next", null);
        setField(term6857, term6857.getClass(), "first", null);
        setField(term6857, term6857.getClass(), "last", null);
        setField(term6857, term6857.getClass(), "propListHead", null);
        setIntField(term6857, term6857.getClass(), "sourcePosition", 0);
        setField(term6857, term6857.getClass(), "jsType", null);
        setField(term6857, term6857.getClass(), "parent", null);
        setField(term6854, term6854.getClass(), "last", term6857);
        setField(term6858, term6858.getClass(), "next", null);
        setIntField(term6858, term6858.getClass(), "type", 0);
        setIntField(term6858, term6858.getClass(), "intValue", 0);
        setField(term6858, term6858.getClass(), "objectValue", null);
        setField(term6854, term6854.getClass(), "propListHead", term6858);
        setIntField(term6854, term6854.getClass(), "sourcePosition", 1045657203);
        setField(term6854, term6854.getClass(), "jsType", null);
        setField(term6854, term6854.getClass(), "parent", null);
        setField(term6853, term6853.getClass(), "next", term6854);
        setIntField(term6859, term6859.getClass(), "type", 0);
        setField(term6859, term6859.getClass(), "next", null);
        setField(term6859, term6859.getClass(), "first", null);
        setField(term6859, term6859.getClass(), "last", null);
        setField(term6859, term6859.getClass(), "propListHead", null);
        setIntField(term6859, term6859.getClass(), "sourcePosition", 0);
        setField(term6859, term6859.getClass(), "jsType", null);
        setField(term6859, term6859.getClass(), "parent", null);
        setField(term6853, term6853.getClass(), "first", term6859);
        setIntField(term6860, term6860.getClass(), "type", 0);
        setField(term6860, term6860.getClass(), "next", null);
        setField(term6860, term6860.getClass(), "first", null);
        setField(term6860, term6860.getClass(), "last", null);
        setField(term6860, term6860.getClass(), "propListHead", null);
        setIntField(term6860, term6860.getClass(), "sourcePosition", 0);
        setField(term6860, term6860.getClass(), "jsType", null);
        setField(term6860, term6860.getClass(), "parent", null);
        setField(term6853, term6853.getClass(), "last", term6860);
        setField(term6861, term6861.getClass(), "next", null);
        setIntField(term6861, term6861.getClass(), "type", 0);
        setIntField(term6861, term6861.getClass(), "intValue", 0);
        setField(term6861, term6861.getClass(), "objectValue", null);
        setField(term6853, term6853.getClass(), "propListHead", term6861);
        setIntField(term6853, term6853.getClass(), "sourcePosition", 1386130016);
        setField(term6853, term6853.getClass(), "jsType", null);
        setField(term6853, term6853.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term290;
        args[1] = term317;
        Object retValue = callMethod(klass, "isLiteralValue", argTypes, null, args);
        assertTrue(recursiveEquals(term290, term6853));
        assertTrue(recursiveEquals(term317, false));
        assertTrue(recursiveEquals(retValue, false));
    }

};


