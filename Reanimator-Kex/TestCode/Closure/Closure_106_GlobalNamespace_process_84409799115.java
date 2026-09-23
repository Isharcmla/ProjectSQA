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

public class GlobalNamespace_process_84409799115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389;

    public GlobalNamespace_process_84409799115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term426 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term426, term426.getClass(), "name", null);
        setField(term426, term426.getClass(), "parent", null);
        setField(term426, term426.getClass(), "props", null);
        setField(term426, term426.getClass(), "declaration", null);
        setField(term426, term426.getClass(), "refs", null);
        setField(term426, term426.getClass(), "type", null);
        setBooleanField(term426, term426.getClass(), "isClassOrEnum", false);
        setBooleanField(term426, term426.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term426, term426.getClass(), "globalSets", 0);
        setIntField(term426, term426.getClass(), "localSets", 0);
        setIntField(term426, term426.getClass(), "aliasingGets", 0);
        setIntField(term426, term426.getClass(), "totalGets", 0);
        setIntField(term426, term426.getClass(), "callGets", 0);
        setBooleanField(term426, term426.getClass(), "inExterns", false);
        setField(term426, term426.getClass(), "docInfo", null);
        Object term435 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term435, term435.getClass(), "name", null);
        setField(term435, term435.getClass(), "parent", null);
        setField(term435, term435.getClass(), "props", null);
        setField(term435, term435.getClass(), "declaration", null);
        setField(term435, term435.getClass(), "refs", null);
        setField(term435, term435.getClass(), "type", null);
        setBooleanField(term435, term435.getClass(), "isClassOrEnum", false);
        setBooleanField(term435, term435.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term435, term435.getClass(), "globalSets", 0);
        setIntField(term435, term435.getClass(), "localSets", 0);
        setIntField(term435, term435.getClass(), "aliasingGets", 0);
        setIntField(term435, term435.getClass(), "totalGets", 0);
        setIntField(term435, term435.getClass(), "callGets", 0);
        setBooleanField(term435, term435.getClass(), "inExterns", false);
        setField(term435, term435.getClass(), "docInfo", null);
        Object term444 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term444, term444.getClass(), "name", null);
        setField(term444, term444.getClass(), "parent", null);
        setField(term444, term444.getClass(), "props", null);
        setField(term444, term444.getClass(), "declaration", null);
        setField(term444, term444.getClass(), "refs", null);
        setField(term444, term444.getClass(), "type", null);
        setBooleanField(term444, term444.getClass(), "isClassOrEnum", false);
        setBooleanField(term444, term444.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term444, term444.getClass(), "globalSets", 0);
        setIntField(term444, term444.getClass(), "localSets", 0);
        setIntField(term444, term444.getClass(), "aliasingGets", 0);
        setIntField(term444, term444.getClass(), "totalGets", 0);
        setIntField(term444, term444.getClass(), "callGets", 0);
        setBooleanField(term444, term444.getClass(), "inExterns", false);
        setField(term444, term444.getClass(), "docInfo", null);
        Object term453 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term453, term453.getClass(), "name", null);
        setField(term453, term453.getClass(), "parent", null);
        setField(term453, term453.getClass(), "props", null);
        setField(term453, term453.getClass(), "declaration", null);
        setField(term453, term453.getClass(), "refs", null);
        setField(term453, term453.getClass(), "type", null);
        setBooleanField(term453, term453.getClass(), "isClassOrEnum", false);
        setBooleanField(term453, term453.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term453, term453.getClass(), "globalSets", 0);
        setIntField(term453, term453.getClass(), "localSets", 0);
        setIntField(term453, term453.getClass(), "aliasingGets", 0);
        setIntField(term453, term453.getClass(), "totalGets", 0);
        setIntField(term453, term453.getClass(), "callGets", 0);
        setBooleanField(term453, term453.getClass(), "inExterns", false);
        setField(term453, term453.getClass(), "docInfo", null);
        Object term462 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term462, term462.getClass(), "name", null);
        setField(term462, term462.getClass(), "parent", null);
        setField(term462, term462.getClass(), "props", null);
        setField(term462, term462.getClass(), "declaration", null);
        setField(term462, term462.getClass(), "refs", null);
        setField(term462, term462.getClass(), "type", null);
        setBooleanField(term462, term462.getClass(), "isClassOrEnum", false);
        setBooleanField(term462, term462.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term462, term462.getClass(), "globalSets", 0);
        setIntField(term462, term462.getClass(), "localSets", 0);
        setIntField(term462, term462.getClass(), "aliasingGets", 0);
        setIntField(term462, term462.getClass(), "totalGets", 0);
        setIntField(term462, term462.getClass(), "callGets", 0);
        setBooleanField(term462, term462.getClass(), "inExterns", false);
        setField(term462, term462.getClass(), "docInfo", null);
        ArrayList term424 = new ArrayList();
        ((ArrayList) term424).add(term426);
        ((ArrayList) term424).add(term435);
        ((ArrayList) term424).add(term444);
        ((ArrayList) term424).add(term453);
        ((ArrayList) term424).add(term462);
        HashMap term473 = new HashMap();
        term389 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term413 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term421 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term389, term389.getClass(), "compiler", null);
        setIntField(term390, term390.getClass(), "type", -478195677);
        setIntField(term392, term392.getClass(), "type", 1240914516);
        setIntField(term394, term394.getClass(), "type", 0);
        setField(term394, term394.getClass(), "next", null);
        setField(term394, term394.getClass(), "first", null);
        setField(term394, term394.getClass(), "last", null);
        setField(term394, term394.getClass(), "propListHead", null);
        setIntField(term394, term394.getClass(), "sourcePosition", 0);
        setField(term394, term394.getClass(), "jsType", null);
        setField(term394, term394.getClass(), "parent", null);
        setField(term392, term392.getClass(), "next", term394);
        setIntField(term397, term397.getClass(), "type", 0);
        setField(term397, term397.getClass(), "next", null);
        setField(term397, term397.getClass(), "first", null);
        setField(term397, term397.getClass(), "last", null);
        setField(term397, term397.getClass(), "propListHead", null);
        setIntField(term397, term397.getClass(), "sourcePosition", 0);
        setField(term397, term397.getClass(), "jsType", null);
        setField(term397, term397.getClass(), "parent", null);
        setField(term392, term392.getClass(), "first", term397);
        setIntField(term400, term400.getClass(), "type", 0);
        setField(term400, term400.getClass(), "next", null);
        setField(term400, term400.getClass(), "first", null);
        setField(term400, term400.getClass(), "last", null);
        setField(term400, term400.getClass(), "propListHead", null);
        setIntField(term400, term400.getClass(), "sourcePosition", 0);
        setField(term400, term400.getClass(), "jsType", null);
        setField(term400, term400.getClass(), "parent", null);
        setField(term392, term392.getClass(), "last", term400);
        setField(term403, term403.getClass(), "next", null);
        setIntField(term403, term403.getClass(), "type", 0);
        setIntField(term403, term403.getClass(), "intValue", 0);
        setField(term403, term403.getClass(), "objectValue", null);
        setField(term392, term392.getClass(), "propListHead", term403);
        setIntField(term392, term392.getClass(), "sourcePosition", -1465035361);
        setField(term392, term392.getClass(), "jsType", null);
        setField(term392, term392.getClass(), "parent", null);
        setField(term390, term390.getClass(), "next", term392);
        setIntField(term407, term407.getClass(), "type", 0);
        setField(term407, term407.getClass(), "next", null);
        setField(term407, term407.getClass(), "first", null);
        setField(term407, term407.getClass(), "last", null);
        setField(term407, term407.getClass(), "propListHead", null);
        setIntField(term407, term407.getClass(), "sourcePosition", 0);
        setField(term407, term407.getClass(), "jsType", null);
        setField(term407, term407.getClass(), "parent", null);
        setField(term390, term390.getClass(), "first", term407);
        setIntField(term410, term410.getClass(), "type", 0);
        setField(term410, term410.getClass(), "next", null);
        setField(term410, term410.getClass(), "first", null);
        setField(term410, term410.getClass(), "last", null);
        setField(term410, term410.getClass(), "propListHead", null);
        setIntField(term410, term410.getClass(), "sourcePosition", 0);
        setField(term410, term410.getClass(), "jsType", null);
        setField(term410, term410.getClass(), "parent", null);
        setField(term390, term390.getClass(), "last", term410);
        setField(term413, term413.getClass(), "next", null);
        setIntField(term413, term413.getClass(), "type", 0);
        setIntField(term413, term413.getClass(), "intValue", 0);
        setField(term413, term413.getClass(), "objectValue", null);
        setField(term390, term390.getClass(), "propListHead", term413);
        setIntField(term390, term390.getClass(), "sourcePosition", 1090617576);
        setField(term390, term390.getClass(), "jsType", null);
        setField(term390, term390.getClass(), "parent", null);
        setField(term389, term389.getClass(), "root", term390);
        setIntField(term417, term417.getClass(), "type", 0);
        setField(term417, term417.getClass(), "next", null);
        setField(term417, term417.getClass(), "first", null);
        setField(term417, term417.getClass(), "last", null);
        setField(term417, term417.getClass(), "propListHead", null);
        setIntField(term417, term417.getClass(), "sourcePosition", 0);
        setField(term417, term417.getClass(), "jsType", null);
        setField(term417, term417.getClass(), "parent", null);
        setField(term389, term389.getClass(), "externsRoot", term417);
        setBooleanField(term389, term389.getClass(), "inExterns", true);
        setField(term421, term421.getClass(), "vars", null);
        setField(term421, term421.getClass(), "parent", null);
        setField(term421, term421.getClass(), "rootNode", null);
        setField(term421, term421.getClass(), "thisType", null);
        setBooleanField(term421, term421.getClass(), "isBottom", false);
        setField(term389, term389.getClass(), "externsScope", term421);
        setBooleanField(term389, term389.getClass(), "generated", true);
        setField(term389, term389.getClass(), "globalNames", term424);
        setField(term389, term389.getClass(), "nameMap", term473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "process", argTypes, term389, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


