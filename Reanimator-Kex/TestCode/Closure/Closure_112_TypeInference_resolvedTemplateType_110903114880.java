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
     Object term12427;
     Object term12433;

    public TypeInference_resolvedTemplateType_110903114880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12427 = new LinkedHashMap();
        ArrayList term12454 = new ArrayList();
        ((ArrayList) term12454).add((Object)null);
        ((ArrayList) term12454).add((Object)null);
        ((ArrayList) term12454).add((Object)null);
        ((ArrayList) term12454).add((Object)null);
        ((ArrayList) term12454).add((Object)null);
        ((ArrayList) term12454).add((Object)null);
        ((ArrayList) term12454).add((Object)null);
        ArrayList term12458 = new ArrayList();
        ((ArrayList) term12458).add((Object)null);
        ((ArrayList) term12458).add((Object)null);
        HashMap term12462 = new HashMap();
        ArrayList term12468 = new ArrayList();
        ((ArrayList) term12468).add((Object)null);
        ((ArrayList) term12468).add((Object)null);
        ((ArrayList) term12468).add((Object)null);
        ((ArrayList) term12468).add((Object)null);
        ((ArrayList) term12468).add((Object)null);
        ((ArrayList) term12468).add((Object)null);
        ((ArrayList) term12468).add((Object)null);
        ((ArrayList) term12468).add((Object)null);
        HashMap term12473 = new HashMap();
        Set<Object> term47193 =  ((Map) term12473).keySet();
        HashSet term12472 = new HashSet((Collection<? extends Object>) term47193);
        HashMap term12527 = new HashMap();
        Set<Object> term47234 =  ((Map) term12527).keySet();
        HashSet term12526 = new HashSet((Collection<? extends Object>) term47234);
        HashMap term12533 = new HashMap();
        Set<Object> term47235 =  ((Map) term12533).keySet();
        HashSet term12532 = new HashSet((Collection<? extends Object>) term47235);
        ArrayList term12568 = new ArrayList();
        ((ArrayList) term12568).add((Object)null);
        ((ArrayList) term12568).add((Object)null);
        ((ArrayList) term12568).add((Object)null);
        ((ArrayList) term12568).add((Object)null);
        HashMap term12572 = new HashMap();
        Class<? extends Object> term47257 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term47256 = ((Class) term47257).getDeclaredField((String) "PUBLIC");
        ((Field) term47256).setAccessible(true);
        Object enum115 = ((Field) term47256).get((Object) null);
        term12433 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term12447 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term12448 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term12449 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12555 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term12578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12607 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12624 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        setField(term12433, term12433.getClass(), "name", "oOUHomyJff");
        setField(term12433, term12433.getClass(), "referencedType", null);
        setField(term12433, term12433.getClass(), "referencedObjType", null);
        setBooleanField(term12433, term12433.getClass(), "visited", false);
        setIntField(term12450, term12450.getClass(), "type", 1638851942);
        setField(term12450, term12450.getClass(), "next", null);
        setField(term12450, term12450.getClass(), "first", null);
        setField(term12450, term12450.getClass(), "last", term12450);
        setField(term12450, term12450.getClass(), "propListHead", null);
        setIntField(term12450, term12450.getClass(), "sourcePosition", 0);
        setField(term12450, term12450.getClass(), "jsType", null);
        setField(term12450, term12450.getClass(), "parent", null);
        setField(term12449, term12449.getClass(), "root", term12450);
        setField(term12449, term12449.getClass(), "sourceName", "");
        setField(term12448, term12448.getClass(), "baseType", term12449);
        setField(term12448, term12448.getClass(), "extendedInterfaces", term12454);
        setField(term12448, term12448.getClass(), "implementedInterfaces", term12458);
        setField(term12448, term12448.getClass(), "parameters", term12462);
        setField(term12448, term12448.getClass(), "thrownTypes", term12468);
        setField(term12448, term12448.getClass(), "templateTypeNames", null);
        setField(term12448, term12448.getClass(), "disposedParameters", term12472);
        setField(term12448, term12448.getClass(), "description", "shLHFznysy");
        setField(term12448, term12448.getClass(), "meaning", "YCKIloBHLj");
        setField(term12448, term12448.getClass(), "deprecated", "qUWDhAeFJY");
        setField(term12448, term12448.getClass(), "license", "wboNBMhRjP");
        setField(term12448, term12448.getClass(), "suppressions", term12526);
        setField(term12448, term12448.getClass(), "modifies", term12532);
        setField(term12448, term12448.getClass(), "lendsName", "FiqETbKjpv");
        setBooleanField(term12448, term12448.getClass(), "ngInject", true);
        setBooleanField(term12448, term12448.getClass(), "wizaction", true);
        setBooleanField(term12448, term12448.getClass(), "jaggerInject", false);
        setBooleanField(term12448, term12448.getClass(), "jaggerProvide", true);
        setBooleanField(term12448, term12448.getClass(), "jaggerModule", false);
        setField(term12447, term12447.getClass(), "info", term12448);
        setField(term12555, term12555.getClass(), "sourceComment", "FxXtdhhXyS");
        setField(term12555, term12555.getClass(), "markers", term12568);
        setField(term12555, term12555.getClass(), "parameters", term12572);
        setField(term12555, term12555.getClass(), "throwsDescriptions", null);
        setField(term12555, term12555.getClass(), "blockDescription", null);
        setField(term12555, term12555.getClass(), "fileOverview", null);
        setField(term12555, term12555.getClass(), "returnDescription", null);
        setField(term12555, term12555.getClass(), "version", null);
        setField(term12555, term12555.getClass(), "authors", null);
        setField(term12555, term12555.getClass(), "sees", null);
        setField(term12447, term12447.getClass(), "documentation", term12555);
        setIntField(term12578, term12578.getClass(), "type", 1374790203);
        setIntField(term12580, term12580.getClass(), "type", 1160010161);
        setIntField(term12582, term12582.getClass(), "type", -423900705);
        setField(term12582, term12582.getClass(), "next", null);
        setField(term12582, term12582.getClass(), "first", null);
        setField(term12582, term12582.getClass(), "last", null);
        setField(term12582, term12582.getClass(), "propListHead", null);
        setIntField(term12582, term12582.getClass(), "sourcePosition", 0);
        setField(term12582, term12582.getClass(), "jsType", null);
        setField(term12582, term12582.getClass(), "parent", null);
        setField(term12580, term12580.getClass(), "next", term12582);
        setIntField(term12585, term12585.getClass(), "type", 0);
        setField(term12585, term12585.getClass(), "next", null);
        setField(term12585, term12585.getClass(), "first", null);
        setField(term12585, term12585.getClass(), "last", null);
        setField(term12585, term12585.getClass(), "propListHead", null);
        setIntField(term12585, term12585.getClass(), "sourcePosition", 0);
        setField(term12585, term12585.getClass(), "jsType", null);
        setField(term12585, term12585.getClass(), "parent", null);
        setField(term12580, term12580.getClass(), "first", term12585);
        setIntField(term12588, term12588.getClass(), "type", 0);
        setField(term12588, term12588.getClass(), "next", null);
        setField(term12588, term12588.getClass(), "first", null);
        setField(term12588, term12588.getClass(), "last", null);
        setField(term12588, term12588.getClass(), "propListHead", null);
        setIntField(term12588, term12588.getClass(), "sourcePosition", 0);
        setField(term12588, term12588.getClass(), "jsType", null);
        setField(term12588, term12588.getClass(), "parent", null);
        setField(term12580, term12580.getClass(), "last", term12588);
        setField(term12580, term12580.getClass(), "propListHead", null);
        setIntField(term12580, term12580.getClass(), "sourcePosition", 0);
        setField(term12580, term12580.getClass(), "jsType", null);
        setField(term12580, term12580.getClass(), "parent", null);
        setField(term12578, term12578.getClass(), "next", term12580);
        setIntField(term12592, term12592.getClass(), "type", 0);
        setField(term12592, term12592.getClass(), "next", null);
        setField(term12592, term12592.getClass(), "first", null);
        setField(term12592, term12592.getClass(), "last", null);
        setField(term12592, term12592.getClass(), "propListHead", null);
        setIntField(term12592, term12592.getClass(), "sourcePosition", 0);
        setField(term12592, term12592.getClass(), "jsType", null);
        setField(term12592, term12592.getClass(), "parent", null);
        setField(term12578, term12578.getClass(), "first", term12592);
        setField(term12578, term12578.getClass(), "last", term12585);
        setField(term12578, term12578.getClass(), "propListHead", null);
        setIntField(term12578, term12578.getClass(), "sourcePosition", 0);
        setField(term12578, term12578.getClass(), "jsType", null);
        setField(term12578, term12578.getClass(), "parent", null);
        setField(term12447, term12447.getClass(), "associatedNode", term12578);
        setField(term12447, term12447.getClass(), "visibility", enum115);
        setIntField(term12447, term12447.getClass(), "bitset", -525570815);
        setField(term12607, term12607.getClass(), "root", term12585);
        setField(term12607, term12607.getClass(), "sourceName", "WRIQkTdeMl");
        setField(term12447, term12447.getClass(), "type", term12607);
        setField(term12447, term12447.getClass(), "thisType", term12607);
        setBooleanField(term12447, term12447.getClass(), "includeDocumentation", true);
        setIntField(term12447, term12447.getClass(), "originalCommentPosition", 754055848);
        setField(term12433, term12433.getClass(), "docInfo", term12447);
        setBooleanField(term12433, term12433.getClass(), "unknown", false);
        setBooleanField(term12433, term12433.getClass(), "resolved", false);
        setField(term12433, term12433.getClass(), "resolveResult", null);
        setField(term12624, term12624.getClass(), "templateKeys", null);
        setField(term12624, term12624.getClass(), "templateValues", null);
        setField(term12624, term12624.getClass(), "resolvedTemplateValues", null);
        setField(term12624, term12624.getClass(), "registry", null);
        setField(term12433, term12433.getClass(), "templateTypeMap", term12624);
        setBooleanField(term12433, term12433.getClass(), "inTemplatedCheckVisit", true);
        setField(term12433, term12433.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.TemplateType");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = term12427;
        args[1] = term12433;
        args[2] = null;
        try {
            callMethod(klass, "resolvedTemplateType", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


