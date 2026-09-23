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

public class GlobalNamespace_getNameIndex_22018420913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184;

    public GlobalNamespace_getNameIndex_22018420913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term221 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term221, term221.getClass(), "name", null);
        setField(term221, term221.getClass(), "parent", null);
        setField(term221, term221.getClass(), "props", null);
        setField(term221, term221.getClass(), "declaration", null);
        setField(term221, term221.getClass(), "refs", null);
        setField(term221, term221.getClass(), "type", null);
        setBooleanField(term221, term221.getClass(), "isClassOrEnum", false);
        setBooleanField(term221, term221.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term221, term221.getClass(), "globalSets", 0);
        setIntField(term221, term221.getClass(), "localSets", 0);
        setIntField(term221, term221.getClass(), "aliasingGets", 0);
        setIntField(term221, term221.getClass(), "totalGets", 0);
        setIntField(term221, term221.getClass(), "callGets", 0);
        setBooleanField(term221, term221.getClass(), "inExterns", false);
        setField(term221, term221.getClass(), "docInfo", null);
        Object term230 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term230, term230.getClass(), "name", null);
        setField(term230, term230.getClass(), "parent", null);
        setField(term230, term230.getClass(), "props", null);
        setField(term230, term230.getClass(), "declaration", null);
        setField(term230, term230.getClass(), "refs", null);
        setField(term230, term230.getClass(), "type", null);
        setBooleanField(term230, term230.getClass(), "isClassOrEnum", false);
        setBooleanField(term230, term230.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term230, term230.getClass(), "globalSets", 0);
        setIntField(term230, term230.getClass(), "localSets", 0);
        setIntField(term230, term230.getClass(), "aliasingGets", 0);
        setIntField(term230, term230.getClass(), "totalGets", 0);
        setIntField(term230, term230.getClass(), "callGets", 0);
        setBooleanField(term230, term230.getClass(), "inExterns", false);
        setField(term230, term230.getClass(), "docInfo", null);
        Object term239 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term239, term239.getClass(), "name", null);
        setField(term239, term239.getClass(), "parent", null);
        setField(term239, term239.getClass(), "props", null);
        setField(term239, term239.getClass(), "declaration", null);
        setField(term239, term239.getClass(), "refs", null);
        setField(term239, term239.getClass(), "type", null);
        setBooleanField(term239, term239.getClass(), "isClassOrEnum", false);
        setBooleanField(term239, term239.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term239, term239.getClass(), "globalSets", 0);
        setIntField(term239, term239.getClass(), "localSets", 0);
        setIntField(term239, term239.getClass(), "aliasingGets", 0);
        setIntField(term239, term239.getClass(), "totalGets", 0);
        setIntField(term239, term239.getClass(), "callGets", 0);
        setBooleanField(term239, term239.getClass(), "inExterns", false);
        setField(term239, term239.getClass(), "docInfo", null);
        Object term248 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term248, term248.getClass(), "name", null);
        setField(term248, term248.getClass(), "parent", null);
        setField(term248, term248.getClass(), "props", null);
        setField(term248, term248.getClass(), "declaration", null);
        setField(term248, term248.getClass(), "refs", null);
        setField(term248, term248.getClass(), "type", null);
        setBooleanField(term248, term248.getClass(), "isClassOrEnum", false);
        setBooleanField(term248, term248.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term248, term248.getClass(), "globalSets", 0);
        setIntField(term248, term248.getClass(), "localSets", 0);
        setIntField(term248, term248.getClass(), "aliasingGets", 0);
        setIntField(term248, term248.getClass(), "totalGets", 0);
        setIntField(term248, term248.getClass(), "callGets", 0);
        setBooleanField(term248, term248.getClass(), "inExterns", false);
        setField(term248, term248.getClass(), "docInfo", null);
        ArrayList term219 = new ArrayList();
        ((ArrayList) term219).add(term221);
        ((ArrayList) term219).add(term230);
        ((ArrayList) term219).add(term239);
        ((ArrayList) term219).add(term248);
        HashMap term259 = new HashMap();
        term184 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term208 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term216 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term184, term184.getClass(), "compiler", null);
        setIntField(term185, term185.getClass(), "type", -14890619);
        setIntField(term187, term187.getClass(), "type", 2055867847);
        setIntField(term189, term189.getClass(), "type", 0);
        setField(term189, term189.getClass(), "next", null);
        setField(term189, term189.getClass(), "first", null);
        setField(term189, term189.getClass(), "last", null);
        setField(term189, term189.getClass(), "propListHead", null);
        setIntField(term189, term189.getClass(), "sourcePosition", 0);
        setField(term189, term189.getClass(), "jsType", null);
        setField(term189, term189.getClass(), "parent", null);
        setField(term187, term187.getClass(), "next", term189);
        setIntField(term192, term192.getClass(), "type", 0);
        setField(term192, term192.getClass(), "next", null);
        setField(term192, term192.getClass(), "first", null);
        setField(term192, term192.getClass(), "last", null);
        setField(term192, term192.getClass(), "propListHead", null);
        setIntField(term192, term192.getClass(), "sourcePosition", 0);
        setField(term192, term192.getClass(), "jsType", null);
        setField(term192, term192.getClass(), "parent", null);
        setField(term187, term187.getClass(), "first", term192);
        setIntField(term195, term195.getClass(), "type", 0);
        setField(term195, term195.getClass(), "next", null);
        setField(term195, term195.getClass(), "first", null);
        setField(term195, term195.getClass(), "last", null);
        setField(term195, term195.getClass(), "propListHead", null);
        setIntField(term195, term195.getClass(), "sourcePosition", 0);
        setField(term195, term195.getClass(), "jsType", null);
        setField(term195, term195.getClass(), "parent", null);
        setField(term187, term187.getClass(), "last", term195);
        setField(term198, term198.getClass(), "next", null);
        setIntField(term198, term198.getClass(), "type", 0);
        setIntField(term198, term198.getClass(), "intValue", 0);
        setField(term198, term198.getClass(), "objectValue", null);
        setField(term187, term187.getClass(), "propListHead", term198);
        setIntField(term187, term187.getClass(), "sourcePosition", -1048298087);
        setField(term187, term187.getClass(), "jsType", null);
        setField(term187, term187.getClass(), "parent", null);
        setField(term185, term185.getClass(), "next", term187);
        setIntField(term202, term202.getClass(), "type", 0);
        setField(term202, term202.getClass(), "next", null);
        setField(term202, term202.getClass(), "first", null);
        setField(term202, term202.getClass(), "last", null);
        setField(term202, term202.getClass(), "propListHead", null);
        setIntField(term202, term202.getClass(), "sourcePosition", 0);
        setField(term202, term202.getClass(), "jsType", null);
        setField(term202, term202.getClass(), "parent", null);
        setField(term185, term185.getClass(), "first", term202);
        setIntField(term205, term205.getClass(), "type", 0);
        setField(term205, term205.getClass(), "next", null);
        setField(term205, term205.getClass(), "first", null);
        setField(term205, term205.getClass(), "last", null);
        setField(term205, term205.getClass(), "propListHead", null);
        setIntField(term205, term205.getClass(), "sourcePosition", 0);
        setField(term205, term205.getClass(), "jsType", null);
        setField(term205, term205.getClass(), "parent", null);
        setField(term185, term185.getClass(), "last", term205);
        setField(term208, term208.getClass(), "next", null);
        setIntField(term208, term208.getClass(), "type", 0);
        setIntField(term208, term208.getClass(), "intValue", 0);
        setField(term208, term208.getClass(), "objectValue", null);
        setField(term185, term185.getClass(), "propListHead", term208);
        setIntField(term185, term185.getClass(), "sourcePosition", 292681826);
        setField(term185, term185.getClass(), "jsType", null);
        setField(term185, term185.getClass(), "parent", null);
        setField(term184, term184.getClass(), "root", term185);
        setIntField(term212, term212.getClass(), "type", 0);
        setField(term212, term212.getClass(), "next", null);
        setField(term212, term212.getClass(), "first", null);
        setField(term212, term212.getClass(), "last", null);
        setField(term212, term212.getClass(), "propListHead", null);
        setIntField(term212, term212.getClass(), "sourcePosition", 0);
        setField(term212, term212.getClass(), "jsType", null);
        setField(term212, term212.getClass(), "parent", null);
        setField(term184, term184.getClass(), "externsRoot", term212);
        setBooleanField(term184, term184.getClass(), "inExterns", false);
        setField(term216, term216.getClass(), "vars", null);
        setField(term216, term216.getClass(), "parent", null);
        setField(term216, term216.getClass(), "rootNode", null);
        setField(term216, term216.getClass(), "thisType", null);
        setBooleanField(term216, term216.getClass(), "isBottom", false);
        setField(term184, term184.getClass(), "externsScope", term216);
        setBooleanField(term184, term184.getClass(), "generated", false);
        setField(term184, term184.getClass(), "globalNames", term219);
        setField(term184, term184.getClass(), "nameMap", term259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNameIndex", argTypes, term184, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


