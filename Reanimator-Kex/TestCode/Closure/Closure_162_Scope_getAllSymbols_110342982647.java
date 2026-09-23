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
import java.util.HashMap;
import java.lang.Object;

public class Scope_getAllSymbols_110342982647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1000;
     Object term3854;
     Object term3808;

    public Scope_getAllSymbols_110342982647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1001 = new HashMap();
        term1000 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1014 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1000, term1000.getClass(), "vars", term1001);
        setField(term1014, term1014.getClass(), "vars", null);
        setField(term1014, term1014.getClass(), "parent", null);
        setIntField(term1014, term1014.getClass(), "depth", 0);
        setField(term1014, term1014.getClass(), "rootNode", null);
        setField(term1014, term1014.getClass(), "thisType", null);
        setBooleanField(term1014, term1014.getClass(), "isBottom", false);
        setField(term1014, term1014.getClass(), "arguments", null);
        setField(term1000, term1000.getClass(), "parent", term1014);
        setIntField(term1000, term1000.getClass(), "depth", 1593461795);
        setIntField(term1018, term1018.getClass(), "type", 0);
        setField(term1018, term1018.getClass(), "next", null);
        setField(term1018, term1018.getClass(), "first", null);
        setField(term1018, term1018.getClass(), "last", null);
        setField(term1018, term1018.getClass(), "propListHead", null);
        setIntField(term1018, term1018.getClass(), "sourcePosition", 0);
        setField(term1018, term1018.getClass(), "jsType", null);
        setField(term1018, term1018.getClass(), "parent", null);
        setField(term1000, term1000.getClass(), "rootNode", term1018);
        setField(term1000, term1000.getClass(), "thisType", null);
        setBooleanField(term1000, term1000.getClass(), "isBottom", false);
        setField(term1000, term1000.getClass(), "arguments", null);
        HashMap term3855 = new HashMap();
        term3854 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3857 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3854, term3854.getClass(), "vars", term3855);
        setField(term3857, term3857.getClass(), "vars", null);
        setField(term3857, term3857.getClass(), "parent", null);
        setIntField(term3857, term3857.getClass(), "depth", 0);
        setField(term3857, term3857.getClass(), "rootNode", null);
        setField(term3857, term3857.getClass(), "thisType", null);
        setBooleanField(term3857, term3857.getClass(), "isBottom", false);
        setField(term3857, term3857.getClass(), "arguments", null);
        setField(term3854, term3854.getClass(), "parent", term3857);
        setIntField(term3854, term3854.getClass(), "depth", 1593461795);
        setIntField(term3858, term3858.getClass(), "type", 0);
        setField(term3858, term3858.getClass(), "next", null);
        setField(term3858, term3858.getClass(), "first", null);
        setField(term3858, term3858.getClass(), "last", null);
        setField(term3858, term3858.getClass(), "propListHead", null);
        setIntField(term3858, term3858.getClass(), "sourcePosition", 0);
        setField(term3858, term3858.getClass(), "jsType", null);
        setField(term3858, term3858.getClass(), "parent", null);
        setField(term3854, term3854.getClass(), "rootNode", term3858);
        setField(term3854, term3854.getClass(), "thisType", null);
        setBooleanField(term3854, term3854.getClass(), "isBottom", false);
        setField(term3854, term3854.getClass(), "arguments", null);
        HashMap term3810 = new HashMap();
        term3808 = newInstance(Class.forName("java.util.Collections$UnmodifiableCollection"));
        Object term3809 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term3809, term3809.getClass(), "this$0", term3810);
        setField(term3808, term3808.getClass(), "c", term3809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllSymbols", argTypes, term1000, args);
        assertTrue(recursiveEquals(term1000, term3854));
        assertTrue(recursiveEquals(retValue, term3808));
    }

};


