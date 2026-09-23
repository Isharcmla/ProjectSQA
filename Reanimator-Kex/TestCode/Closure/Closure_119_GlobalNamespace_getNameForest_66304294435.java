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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class GlobalNamespace_getNameForest_66304294435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4877;

    public GlobalNamespace_getNameForest_66304294435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4914 = new ArrayList();
        HashMap term4918 = new HashMap();
        term4877 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term4878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4909 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term4877, term4877.getClass(), "compiler", null);
        setIntField(term4878, term4878.getClass(), "type", -936895502);
        setIntField(term4880, term4880.getClass(), "type", -129547140);
        setIntField(term4882, term4882.getClass(), "type", 199287428);
        setIntField(term4884, term4884.getClass(), "type", -1195339592);
        setField(term4884, term4884.getClass(), "next", null);
        setField(term4884, term4884.getClass(), "first", null);
        setField(term4884, term4884.getClass(), "last", null);
        setField(term4884, term4884.getClass(), "propListHead", null);
        setIntField(term4884, term4884.getClass(), "sourcePosition", 0);
        setField(term4884, term4884.getClass(), "jsType", null);
        setField(term4884, term4884.getClass(), "parent", null);
        setField(term4882, term4882.getClass(), "next", term4884);
        setIntField(term4887, term4887.getClass(), "type", 2009020256);
        setField(term4887, term4887.getClass(), "next", null);
        setField(term4887, term4887.getClass(), "first", null);
        setField(term4887, term4887.getClass(), "last", term4887);
        setField(term4887, term4887.getClass(), "propListHead", null);
        setIntField(term4887, term4887.getClass(), "sourcePosition", 0);
        setField(term4887, term4887.getClass(), "jsType", null);
        setField(term4887, term4887.getClass(), "parent", null);
        setField(term4882, term4882.getClass(), "first", term4887);
        setIntField(term4890, term4890.getClass(), "type", -376422566);
        setField(term4890, term4890.getClass(), "next", null);
        setField(term4890, term4890.getClass(), "first", term4880);
        setField(term4890, term4890.getClass(), "last", term4880);
        setField(term4890, term4890.getClass(), "propListHead", null);
        setIntField(term4890, term4890.getClass(), "sourcePosition", 0);
        setField(term4890, term4890.getClass(), "jsType", null);
        setField(term4890, term4890.getClass(), "parent", null);
        setField(term4882, term4882.getClass(), "last", term4890);
        setField(term4882, term4882.getClass(), "propListHead", null);
        setIntField(term4882, term4882.getClass(), "sourcePosition", 0);
        setField(term4882, term4882.getClass(), "jsType", null);
        setField(term4882, term4882.getClass(), "parent", null);
        setField(term4880, term4880.getClass(), "next", term4882);
        setIntField(term4894, term4894.getClass(), "type", 0);
        setField(term4894, term4894.getClass(), "next", null);
        setField(term4894, term4894.getClass(), "first", null);
        setField(term4894, term4894.getClass(), "last", null);
        setField(term4894, term4894.getClass(), "propListHead", null);
        setIntField(term4894, term4894.getClass(), "sourcePosition", 0);
        setField(term4894, term4894.getClass(), "jsType", null);
        setField(term4894, term4894.getClass(), "parent", null);
        setField(term4880, term4880.getClass(), "first", term4894);
        setField(term4880, term4880.getClass(), "last", term4887);
        setField(term4880, term4880.getClass(), "propListHead", null);
        setIntField(term4880, term4880.getClass(), "sourcePosition", 0);
        setField(term4880, term4880.getClass(), "jsType", null);
        setField(term4880, term4880.getClass(), "parent", null);
        setField(term4878, term4878.getClass(), "next", term4880);
        setIntField(term4898, term4898.getClass(), "type", 306847454);
        setIntField(term4900, term4900.getClass(), "type", 1745276158);
        setField(term4900, term4900.getClass(), "next", term4887);
        setIntField(term4902, term4902.getClass(), "type", 0);
        setField(term4902, term4902.getClass(), "next", null);
        setField(term4902, term4902.getClass(), "first", null);
        setField(term4902, term4902.getClass(), "last", null);
        setField(term4902, term4902.getClass(), "propListHead", null);
        setIntField(term4902, term4902.getClass(), "sourcePosition", 0);
        setField(term4902, term4902.getClass(), "jsType", null);
        setField(term4902, term4902.getClass(), "parent", null);
        setField(term4900, term4900.getClass(), "first", term4902);
        setField(term4900, term4900.getClass(), "last", term4878);
        setField(term4900, term4900.getClass(), "propListHead", null);
        setIntField(term4900, term4900.getClass(), "sourcePosition", 0);
        setField(term4900, term4900.getClass(), "jsType", null);
        setField(term4900, term4900.getClass(), "parent", null);
        setField(term4898, term4898.getClass(), "next", term4900);
        setField(term4898, term4898.getClass(), "first", term4898);
        setField(term4898, term4898.getClass(), "last", term4884);
        setField(term4898, term4898.getClass(), "propListHead", null);
        setIntField(term4898, term4898.getClass(), "sourcePosition", 0);
        setField(term4898, term4898.getClass(), "jsType", null);
        setField(term4898, term4898.getClass(), "parent", null);
        setField(term4878, term4878.getClass(), "first", term4898);
        setField(term4878, term4878.getClass(), "last", term4882);
        setField(term4878, term4878.getClass(), "propListHead", null);
        setIntField(term4878, term4878.getClass(), "sourcePosition", 0);
        setField(term4878, term4878.getClass(), "jsType", null);
        setField(term4878, term4878.getClass(), "parent", null);
        setField(term4877, term4877.getClass(), "root", term4878);
        setField(term4877, term4877.getClass(), "externsRoot", term4890);
        setBooleanField(term4877, term4877.getClass(), "inExterns", false);
        setField(term4909, term4909.getClass(), "vars", null);
        setField(term4909, term4909.getClass(), "parent", null);
        setIntField(term4909, term4909.getClass(), "depth", 0);
        setField(term4909, term4909.getClass(), "rootNode", null);
        setBooleanField(term4909, term4909.getClass(), "isBottom", false);
        setField(term4909, term4909.getClass(), "arguments", null);
        setField(term4909, term4909.getClass(), "typeResolver", null);
        setField(term4877, term4877.getClass(), "externsScope", term4909);
        setBooleanField(term4877, term4877.getClass(), "generated", false);
        setIntField(term4877, term4877.getClass(), "currentPreOrderIndex", 2049577015);
        setField(term4877, term4877.getClass(), "globalNames", term4914);
        setField(term4877, term4877.getClass(), "nameMap", term4918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNameForest", argTypes, term4877, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


