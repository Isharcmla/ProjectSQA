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

public class GlobalNamespace_isGlobalVarReference_81084441918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term751;
     Object term820;

    public GlobalNamespace_isGlobalVarReference_81084441918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term786 = new ArrayList();
        HashMap term790 = new HashMap();
        term751 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term775 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term783 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term751, term751.getClass(), "compiler", null);
        setIntField(term752, term752.getClass(), "type", 1045657203);
        setIntField(term754, term754.getClass(), "type", 1474524152);
        setIntField(term756, term756.getClass(), "type", 0);
        setField(term756, term756.getClass(), "next", null);
        setField(term756, term756.getClass(), "first", null);
        setField(term756, term756.getClass(), "last", null);
        setField(term756, term756.getClass(), "propListHead", null);
        setIntField(term756, term756.getClass(), "sourcePosition", 0);
        setField(term756, term756.getClass(), "jsType", null);
        setField(term756, term756.getClass(), "parent", null);
        setField(term754, term754.getClass(), "next", term756);
        setIntField(term759, term759.getClass(), "type", 0);
        setField(term759, term759.getClass(), "next", null);
        setField(term759, term759.getClass(), "first", null);
        setField(term759, term759.getClass(), "last", null);
        setField(term759, term759.getClass(), "propListHead", null);
        setIntField(term759, term759.getClass(), "sourcePosition", 0);
        setField(term759, term759.getClass(), "jsType", null);
        setField(term759, term759.getClass(), "parent", null);
        setField(term754, term754.getClass(), "first", term759);
        setIntField(term762, term762.getClass(), "type", 0);
        setField(term762, term762.getClass(), "next", null);
        setField(term762, term762.getClass(), "first", null);
        setField(term762, term762.getClass(), "last", null);
        setField(term762, term762.getClass(), "propListHead", null);
        setIntField(term762, term762.getClass(), "sourcePosition", 0);
        setField(term762, term762.getClass(), "jsType", null);
        setField(term762, term762.getClass(), "parent", null);
        setField(term754, term754.getClass(), "last", term762);
        setField(term765, term765.getClass(), "next", null);
        setIntField(term765, term765.getClass(), "type", 0);
        setIntField(term765, term765.getClass(), "intValue", 0);
        setField(term765, term765.getClass(), "objectValue", null);
        setField(term754, term754.getClass(), "propListHead", term765);
        setIntField(term754, term754.getClass(), "sourcePosition", 568954359);
        setField(term754, term754.getClass(), "jsType", null);
        setField(term754, term754.getClass(), "parent", null);
        setField(term752, term752.getClass(), "next", term754);
        setIntField(term769, term769.getClass(), "type", 0);
        setField(term769, term769.getClass(), "next", null);
        setField(term769, term769.getClass(), "first", null);
        setField(term769, term769.getClass(), "last", null);
        setField(term769, term769.getClass(), "propListHead", null);
        setIntField(term769, term769.getClass(), "sourcePosition", 0);
        setField(term769, term769.getClass(), "jsType", null);
        setField(term769, term769.getClass(), "parent", null);
        setField(term752, term752.getClass(), "first", term769);
        setIntField(term772, term772.getClass(), "type", 0);
        setField(term772, term772.getClass(), "next", null);
        setField(term772, term772.getClass(), "first", null);
        setField(term772, term772.getClass(), "last", null);
        setField(term772, term772.getClass(), "propListHead", null);
        setIntField(term772, term772.getClass(), "sourcePosition", 0);
        setField(term772, term772.getClass(), "jsType", null);
        setField(term772, term772.getClass(), "parent", null);
        setField(term752, term752.getClass(), "last", term772);
        setField(term775, term775.getClass(), "next", null);
        setIntField(term775, term775.getClass(), "type", 0);
        setIntField(term775, term775.getClass(), "intValue", 0);
        setField(term775, term775.getClass(), "objectValue", null);
        setField(term752, term752.getClass(), "propListHead", term775);
        setIntField(term752, term752.getClass(), "sourcePosition", 53410913);
        setField(term752, term752.getClass(), "jsType", null);
        setField(term752, term752.getClass(), "parent", null);
        setField(term751, term751.getClass(), "root", term752);
        setIntField(term779, term779.getClass(), "type", 0);
        setField(term779, term779.getClass(), "next", null);
        setField(term779, term779.getClass(), "first", null);
        setField(term779, term779.getClass(), "last", null);
        setField(term779, term779.getClass(), "propListHead", null);
        setIntField(term779, term779.getClass(), "sourcePosition", 0);
        setField(term779, term779.getClass(), "jsType", null);
        setField(term779, term779.getClass(), "parent", null);
        setField(term751, term751.getClass(), "externsRoot", term779);
        setBooleanField(term751, term751.getClass(), "inExterns", false);
        setField(term783, term783.getClass(), "vars", null);
        setField(term783, term783.getClass(), "parent", null);
        setField(term783, term783.getClass(), "rootNode", null);
        setField(term783, term783.getClass(), "thisType", null);
        setBooleanField(term783, term783.getClass(), "isBottom", false);
        setField(term751, term751.getClass(), "externsScope", term783);
        setBooleanField(term751, term751.getClass(), "generated", true);
        setField(term751, term751.getClass(), "globalNames", term786);
        setField(term751, term751.getClass(), "nameMap", term790);
        HashMap term821 = new HashMap();
        term820 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term835 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term820, term820.getClass(), "vars", term821);
        setField(term835, term835.getClass(), "vars", null);
        setField(term835, term835.getClass(), "parent", null);
        setField(term835, term835.getClass(), "rootNode", null);
        setField(term835, term835.getClass(), "thisType", null);
        setBooleanField(term835, term835.getClass(), "isBottom", false);
        setField(term820, term820.getClass(), "parent", term835);
        setIntField(term837, term837.getClass(), "type", 0);
        setField(term837, term837.getClass(), "next", null);
        setField(term837, term837.getClass(), "first", null);
        setField(term837, term837.getClass(), "last", null);
        setField(term837, term837.getClass(), "propListHead", null);
        setIntField(term837, term837.getClass(), "sourcePosition", 0);
        setField(term837, term837.getClass(), "jsType", null);
        setField(term837, term837.getClass(), "parent", null);
        setField(term820, term820.getClass(), "rootNode", term837);
        setField(term820, term820.getClass(), "thisType", null);
        setBooleanField(term820, term820.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = "LQFpaHEwXR";
        args[1] = term820;
        try {
            callMethod(klass, "isGlobalVarReference", argTypes, term751, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


