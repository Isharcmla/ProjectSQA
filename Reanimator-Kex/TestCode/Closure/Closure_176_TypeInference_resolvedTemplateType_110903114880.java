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
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class TypeInference_resolvedTemplateType_110903114880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12452;
     Object term12458;

    public TypeInference_resolvedTemplateType_110903114880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12452 = new LinkedHashMap();
        ArrayList term12479 = new ArrayList();
        ((ArrayList) term12479).add((Object)null);
        ((ArrayList) term12479).add((Object)null);
        ((ArrayList) term12479).add((Object)null);
        ((ArrayList) term12479).add((Object)null);
        ((ArrayList) term12479).add((Object)null);
        ((ArrayList) term12479).add((Object)null);
        ((ArrayList) term12479).add((Object)null);
        ((ArrayList) term12479).add((Object)null);
        ((ArrayList) term12479).add((Object)null);
        ArrayList term12483 = new ArrayList();
        ((ArrayList) term12483).add((Object)null);
        ((ArrayList) term12483).add((Object)null);
        ((ArrayList) term12483).add((Object)null);
        ((ArrayList) term12483).add((Object)null);
        ((ArrayList) term12483).add((Object)null);
        ((ArrayList) term12483).add((Object)null);
        HashMap term12487 = new HashMap();
        ArrayList term12493 = new ArrayList();
        HashMap term12498 = new HashMap();
        Set<Object> term47275 =  ((Map) term12498).keySet();
        HashSet term12497 = new HashSet((Collection<? extends Object>) term47275);
        HashMap term12552 = new HashMap();
        Set<Object> term47316 =  ((Map) term12552).keySet();
        HashSet term12551 = new HashSet((Collection<? extends Object>) term47316);
        HashMap term12558 = new HashMap();
        Set<Object> term47623 =  ((Map) term12558).keySet();
        HashSet term12557 = new HashSet((Collection<? extends Object>) term47623);
        ArrayList term12593 = new ArrayList();
        ((ArrayList) term12593).add((Object)null);
        ((ArrayList) term12593).add((Object)null);
        ((ArrayList) term12593).add((Object)null);
        HashMap term12597 = new HashMap();
        Class<? extends Object> term47645 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term47644 = ((Class) term47645).getDeclaredField((String) "PUBLIC");
        ((Field) term47644).setAccessible(true);
        Object enum115 = ((Field) term47644).get((Object) null);
        term12458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term12472 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term12473 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term12474 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12580 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term12603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12617 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12642 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        setField(term12458, term12458.getClass(), "name", "vZpMxQNHKu");
        setField(term12458, term12458.getClass(), "referencedType", null);
        setField(term12458, term12458.getClass(), "referencedObjType", null);
        setBooleanField(term12458, term12458.getClass(), "visited", false);
        setIntField(term12475, term12475.getClass(), "type", -509349195);
        setField(term12475, term12475.getClass(), "next", null);
        setField(term12475, term12475.getClass(), "first", null);
        setField(term12475, term12475.getClass(), "last", term12475);
        setField(term12475, term12475.getClass(), "propListHead", null);
        setIntField(term12475, term12475.getClass(), "sourcePosition", 0);
        setField(term12475, term12475.getClass(), "jsType", null);
        setField(term12475, term12475.getClass(), "parent", null);
        setField(term12474, term12474.getClass(), "root", term12475);
        setField(term12474, term12474.getClass(), "sourceName", "");
        setField(term12473, term12473.getClass(), "baseType", term12474);
        setField(term12473, term12473.getClass(), "extendedInterfaces", term12479);
        setField(term12473, term12473.getClass(), "implementedInterfaces", term12483);
        setField(term12473, term12473.getClass(), "parameters", term12487);
        setField(term12473, term12473.getClass(), "thrownTypes", term12493);
        setField(term12473, term12473.getClass(), "templateTypeNames", null);
        setField(term12473, term12473.getClass(), "disposedParameters", term12497);
        setField(term12473, term12473.getClass(), "description", "rsnXTpfhqf");
        setField(term12473, term12473.getClass(), "meaning", "gzvlGZVfnZ");
        setField(term12473, term12473.getClass(), "deprecated", "rmSqCaXWHi");
        setField(term12473, term12473.getClass(), "license", "ScztqspySK");
        setField(term12473, term12473.getClass(), "suppressions", term12551);
        setField(term12473, term12473.getClass(), "modifies", term12557);
        setField(term12473, term12473.getClass(), "lendsName", "SXMdNSGPog");
        setBooleanField(term12473, term12473.getClass(), "ngInject", true);
        setBooleanField(term12473, term12473.getClass(), "wizaction", true);
        setBooleanField(term12473, term12473.getClass(), "jaggerInject", true);
        setBooleanField(term12473, term12473.getClass(), "jaggerProvide", false);
        setBooleanField(term12473, term12473.getClass(), "jaggerModule", false);
        setField(term12472, term12472.getClass(), "info", term12473);
        setField(term12580, term12580.getClass(), "sourceComment", "vsqwOLpDjj");
        setField(term12580, term12580.getClass(), "markers", term12593);
        setField(term12580, term12580.getClass(), "parameters", term12597);
        setField(term12580, term12580.getClass(), "throwsDescriptions", null);
        setField(term12580, term12580.getClass(), "blockDescription", null);
        setField(term12580, term12580.getClass(), "fileOverview", null);
        setField(term12580, term12580.getClass(), "returnDescription", null);
        setField(term12580, term12580.getClass(), "version", null);
        setField(term12580, term12580.getClass(), "authors", null);
        setField(term12580, term12580.getClass(), "sees", null);
        setField(term12472, term12472.getClass(), "documentation", term12580);
        setIntField(term12603, term12603.getClass(), "type", 0);
        setField(term12603, term12603.getClass(), "next", null);
        setField(term12603, term12603.getClass(), "first", null);
        setField(term12603, term12603.getClass(), "last", null);
        setField(term12603, term12603.getClass(), "propListHead", null);
        setIntField(term12603, term12603.getClass(), "sourcePosition", 0);
        setField(term12603, term12603.getClass(), "jsType", null);
        setField(term12603, term12603.getClass(), "parent", null);
        setField(term12472, term12472.getClass(), "associatedNode", term12603);
        setField(term12472, term12472.getClass(), "visibility", enum115);
        setIntField(term12472, term12472.getClass(), "bitset", -695279311);
        setIntField(term12618, term12618.getClass(), "type", -1639041228);
        setIntField(term12620, term12620.getClass(), "type", 2027686272);
        setField(term12620, term12620.getClass(), "next", null);
        setField(term12620, term12620.getClass(), "first", null);
        setField(term12620, term12620.getClass(), "last", null);
        setField(term12620, term12620.getClass(), "propListHead", null);
        setIntField(term12620, term12620.getClass(), "sourcePosition", 0);
        setField(term12620, term12620.getClass(), "jsType", null);
        setField(term12620, term12620.getClass(), "parent", null);
        setField(term12618, term12618.getClass(), "next", term12620);
        setIntField(term12623, term12623.getClass(), "type", 0);
        setField(term12623, term12623.getClass(), "next", null);
        setField(term12623, term12623.getClass(), "first", null);
        setField(term12623, term12623.getClass(), "last", null);
        setField(term12623, term12623.getClass(), "propListHead", null);
        setIntField(term12623, term12623.getClass(), "sourcePosition", 0);
        setField(term12623, term12623.getClass(), "jsType", null);
        setField(term12623, term12623.getClass(), "parent", null);
        setField(term12618, term12618.getClass(), "first", term12623);
        setIntField(term12626, term12626.getClass(), "type", 0);
        setField(term12626, term12626.getClass(), "next", null);
        setField(term12626, term12626.getClass(), "first", null);
        setField(term12626, term12626.getClass(), "last", null);
        setField(term12626, term12626.getClass(), "propListHead", null);
        setIntField(term12626, term12626.getClass(), "sourcePosition", 0);
        setField(term12626, term12626.getClass(), "jsType", null);
        setField(term12626, term12626.getClass(), "parent", null);
        setField(term12618, term12618.getClass(), "last", term12626);
        setField(term12618, term12618.getClass(), "propListHead", null);
        setIntField(term12618, term12618.getClass(), "sourcePosition", 0);
        setField(term12618, term12618.getClass(), "jsType", null);
        setField(term12618, term12618.getClass(), "parent", null);
        setField(term12617, term12617.getClass(), "root", term12618);
        setField(term12617, term12617.getClass(), "sourceName", "SNqwfZGLFh");
        setField(term12472, term12472.getClass(), "type", term12617);
        setIntField(term12643, term12643.getClass(), "type", 0);
        setField(term12643, term12643.getClass(), "next", null);
        setField(term12643, term12643.getClass(), "first", null);
        setField(term12643, term12643.getClass(), "last", null);
        setField(term12643, term12643.getClass(), "propListHead", null);
        setIntField(term12643, term12643.getClass(), "sourcePosition", 0);
        setField(term12643, term12643.getClass(), "jsType", null);
        setField(term12643, term12643.getClass(), "parent", null);
        setField(term12642, term12642.getClass(), "root", term12643);
        setField(term12642, term12642.getClass(), "sourceName", "feyxNWUenU");
        setField(term12472, term12472.getClass(), "thisType", term12642);
        setBooleanField(term12472, term12472.getClass(), "includeDocumentation", true);
        setIntField(term12472, term12472.getClass(), "originalCommentPosition", 114279242);
        setField(term12458, term12458.getClass(), "docInfo", term12472);
        setBooleanField(term12458, term12458.getClass(), "unknown", true);
        setBooleanField(term12458, term12458.getClass(), "resolved", false);
        setField(term12458, term12458.getClass(), "resolveResult", null);
        setField(term12662, term12662.getClass(), "templateKeys", null);
        setField(term12662, term12662.getClass(), "templateValues", null);
        setField(term12662, term12662.getClass(), "resolvedTemplateValues", null);
        setField(term12662, term12662.getClass(), "registry", null);
        setField(term12458, term12458.getClass(), "templateTypeMap", term12662);
        setBooleanField(term12458, term12458.getClass(), "inTemplatedCheckVisit", true);
        setField(term12458, term12458.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.TemplateType");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = term12452;
        args[1] = term12458;
        args[2] = null;
        try {
            callMethod(klass, "resolvedTemplateType", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


