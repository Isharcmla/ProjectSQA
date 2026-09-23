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

public class GlobalNamespace_getNameForest_66304294412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;

    public GlobalNamespace_getNameForest_66304294412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term119 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term119, term119.getClass(), "name", null);
        setField(term119, term119.getClass(), "parent", null);
        setField(term119, term119.getClass(), "props", null);
        setField(term119, term119.getClass(), "declaration", null);
        setField(term119, term119.getClass(), "refs", null);
        setField(term119, term119.getClass(), "type", null);
        setBooleanField(term119, term119.getClass(), "isClassOrEnum", false);
        setBooleanField(term119, term119.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term119, term119.getClass(), "globalSets", 0);
        setIntField(term119, term119.getClass(), "localSets", 0);
        setIntField(term119, term119.getClass(), "aliasingGets", 0);
        setIntField(term119, term119.getClass(), "totalGets", 0);
        setIntField(term119, term119.getClass(), "callGets", 0);
        setBooleanField(term119, term119.getClass(), "inExterns", false);
        setField(term119, term119.getClass(), "docInfo", null);
        Object term128 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term128, term128.getClass(), "name", null);
        setField(term128, term128.getClass(), "parent", null);
        setField(term128, term128.getClass(), "props", null);
        setField(term128, term128.getClass(), "declaration", null);
        setField(term128, term128.getClass(), "refs", null);
        setField(term128, term128.getClass(), "type", null);
        setBooleanField(term128, term128.getClass(), "isClassOrEnum", false);
        setBooleanField(term128, term128.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term128, term128.getClass(), "globalSets", 0);
        setIntField(term128, term128.getClass(), "localSets", 0);
        setIntField(term128, term128.getClass(), "aliasingGets", 0);
        setIntField(term128, term128.getClass(), "totalGets", 0);
        setIntField(term128, term128.getClass(), "callGets", 0);
        setBooleanField(term128, term128.getClass(), "inExterns", false);
        setField(term128, term128.getClass(), "docInfo", null);
        Object term137 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term137, term137.getClass(), "name", null);
        setField(term137, term137.getClass(), "parent", null);
        setField(term137, term137.getClass(), "props", null);
        setField(term137, term137.getClass(), "declaration", null);
        setField(term137, term137.getClass(), "refs", null);
        setField(term137, term137.getClass(), "type", null);
        setBooleanField(term137, term137.getClass(), "isClassOrEnum", false);
        setBooleanField(term137, term137.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term137, term137.getClass(), "globalSets", 0);
        setIntField(term137, term137.getClass(), "localSets", 0);
        setIntField(term137, term137.getClass(), "aliasingGets", 0);
        setIntField(term137, term137.getClass(), "totalGets", 0);
        setIntField(term137, term137.getClass(), "callGets", 0);
        setBooleanField(term137, term137.getClass(), "inExterns", false);
        setField(term137, term137.getClass(), "docInfo", null);
        Object term146 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term146, term146.getClass(), "name", null);
        setField(term146, term146.getClass(), "parent", null);
        setField(term146, term146.getClass(), "props", null);
        setField(term146, term146.getClass(), "declaration", null);
        setField(term146, term146.getClass(), "refs", null);
        setField(term146, term146.getClass(), "type", null);
        setBooleanField(term146, term146.getClass(), "isClassOrEnum", false);
        setBooleanField(term146, term146.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term146, term146.getClass(), "globalSets", 0);
        setIntField(term146, term146.getClass(), "localSets", 0);
        setIntField(term146, term146.getClass(), "aliasingGets", 0);
        setIntField(term146, term146.getClass(), "totalGets", 0);
        setIntField(term146, term146.getClass(), "callGets", 0);
        setBooleanField(term146, term146.getClass(), "inExterns", false);
        setField(term146, term146.getClass(), "docInfo", null);
        Object term155 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term155, term155.getClass(), "name", null);
        setField(term155, term155.getClass(), "parent", null);
        setField(term155, term155.getClass(), "props", null);
        setField(term155, term155.getClass(), "declaration", null);
        setField(term155, term155.getClass(), "refs", null);
        setField(term155, term155.getClass(), "type", null);
        setBooleanField(term155, term155.getClass(), "isClassOrEnum", false);
        setBooleanField(term155, term155.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term155, term155.getClass(), "globalSets", 0);
        setIntField(term155, term155.getClass(), "localSets", 0);
        setIntField(term155, term155.getClass(), "aliasingGets", 0);
        setIntField(term155, term155.getClass(), "totalGets", 0);
        setIntField(term155, term155.getClass(), "callGets", 0);
        setBooleanField(term155, term155.getClass(), "inExterns", false);
        setField(term155, term155.getClass(), "docInfo", null);
        ArrayList term117 = new ArrayList();
        ((ArrayList) term117).add(term119);
        ((ArrayList) term117).add(term128);
        ((ArrayList) term117).add(term137);
        ((ArrayList) term117).add(term146);
        ((ArrayList) term117).add(term155);
        HashMap term166 = new HashMap();
        term82 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term83 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term82, term82.getClass(), "compiler", null);
        setIntField(term83, term83.getClass(), "type", 679763016);
        setIntField(term85, term85.getClass(), "type", -157887805);
        setIntField(term87, term87.getClass(), "type", 0);
        setField(term87, term87.getClass(), "next", null);
        setField(term87, term87.getClass(), "first", null);
        setField(term87, term87.getClass(), "last", null);
        setField(term87, term87.getClass(), "propListHead", null);
        setIntField(term87, term87.getClass(), "sourcePosition", 0);
        setField(term87, term87.getClass(), "jsType", null);
        setField(term87, term87.getClass(), "parent", null);
        setField(term85, term85.getClass(), "next", term87);
        setIntField(term90, term90.getClass(), "type", 0);
        setField(term90, term90.getClass(), "next", null);
        setField(term90, term90.getClass(), "first", null);
        setField(term90, term90.getClass(), "last", null);
        setField(term90, term90.getClass(), "propListHead", null);
        setIntField(term90, term90.getClass(), "sourcePosition", 0);
        setField(term90, term90.getClass(), "jsType", null);
        setField(term90, term90.getClass(), "parent", null);
        setField(term85, term85.getClass(), "first", term90);
        setIntField(term93, term93.getClass(), "type", 0);
        setField(term93, term93.getClass(), "next", null);
        setField(term93, term93.getClass(), "first", null);
        setField(term93, term93.getClass(), "last", null);
        setField(term93, term93.getClass(), "propListHead", null);
        setIntField(term93, term93.getClass(), "sourcePosition", 0);
        setField(term93, term93.getClass(), "jsType", null);
        setField(term93, term93.getClass(), "parent", null);
        setField(term85, term85.getClass(), "last", term93);
        setField(term96, term96.getClass(), "next", null);
        setIntField(term96, term96.getClass(), "type", 0);
        setIntField(term96, term96.getClass(), "intValue", 0);
        setField(term96, term96.getClass(), "objectValue", null);
        setField(term85, term85.getClass(), "propListHead", term96);
        setIntField(term85, term85.getClass(), "sourcePosition", 1876565163);
        setField(term85, term85.getClass(), "jsType", null);
        setField(term85, term85.getClass(), "parent", null);
        setField(term83, term83.getClass(), "next", term85);
        setIntField(term100, term100.getClass(), "type", 0);
        setField(term100, term100.getClass(), "next", null);
        setField(term100, term100.getClass(), "first", null);
        setField(term100, term100.getClass(), "last", null);
        setField(term100, term100.getClass(), "propListHead", null);
        setIntField(term100, term100.getClass(), "sourcePosition", 0);
        setField(term100, term100.getClass(), "jsType", null);
        setField(term100, term100.getClass(), "parent", null);
        setField(term83, term83.getClass(), "first", term100);
        setIntField(term103, term103.getClass(), "type", 0);
        setField(term103, term103.getClass(), "next", null);
        setField(term103, term103.getClass(), "first", null);
        setField(term103, term103.getClass(), "last", null);
        setField(term103, term103.getClass(), "propListHead", null);
        setIntField(term103, term103.getClass(), "sourcePosition", 0);
        setField(term103, term103.getClass(), "jsType", null);
        setField(term103, term103.getClass(), "parent", null);
        setField(term83, term83.getClass(), "last", term103);
        setField(term106, term106.getClass(), "next", null);
        setIntField(term106, term106.getClass(), "type", 0);
        setIntField(term106, term106.getClass(), "intValue", 0);
        setField(term106, term106.getClass(), "objectValue", null);
        setField(term83, term83.getClass(), "propListHead", term106);
        setIntField(term83, term83.getClass(), "sourcePosition", -817164822);
        setField(term83, term83.getClass(), "jsType", null);
        setField(term83, term83.getClass(), "parent", null);
        setField(term82, term82.getClass(), "root", term83);
        setIntField(term110, term110.getClass(), "type", 0);
        setField(term110, term110.getClass(), "next", null);
        setField(term110, term110.getClass(), "first", null);
        setField(term110, term110.getClass(), "last", null);
        setField(term110, term110.getClass(), "propListHead", null);
        setIntField(term110, term110.getClass(), "sourcePosition", 0);
        setField(term110, term110.getClass(), "jsType", null);
        setField(term110, term110.getClass(), "parent", null);
        setField(term82, term82.getClass(), "externsRoot", term110);
        setBooleanField(term82, term82.getClass(), "inExterns", false);
        setField(term114, term114.getClass(), "vars", null);
        setField(term114, term114.getClass(), "parent", null);
        setField(term114, term114.getClass(), "rootNode", null);
        setField(term114, term114.getClass(), "thisType", null);
        setBooleanField(term114, term114.getClass(), "isBottom", false);
        setField(term82, term82.getClass(), "externsScope", term114);
        setBooleanField(term82, term82.getClass(), "generated", false);
        setField(term82, term82.getClass(), "globalNames", term117);
        setField(term82, term82.getClass(), "nameMap", term166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNameForest", argTypes, term82, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


