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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class AmbiguateProperties_getRelatedTypesOnNonUnion_137109609015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444;

    public AmbiguateProperties_getRelatedTypesOnNonUnion_137109609015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term447, term447.getClass(), "type", -93135961);
        setIntField(term449, term449.getClass(), "type", 962840079);
        setField(term449, term449.getClass(), "next", null);
        setField(term449, term449.getClass(), "first", null);
        setField(term449, term449.getClass(), "last", null);
        setField(term449, term449.getClass(), "propListHead", null);
        setIntField(term449, term449.getClass(), "sourcePosition", 1540719661);
        setField(term449, term449.getClass(), "jsType", null);
        setField(term449, term449.getClass(), "parent", null);
        setField(term447, term447.getClass(), "next", term449);
        setIntField(term452, term452.getClass(), "type", 0);
        setField(term452, term452.getClass(), "next", null);
        setField(term452, term452.getClass(), "first", null);
        setField(term452, term452.getClass(), "last", null);
        setField(term452, term452.getClass(), "propListHead", null);
        setIntField(term452, term452.getClass(), "sourcePosition", 0);
        setField(term452, term452.getClass(), "jsType", null);
        setField(term452, term452.getClass(), "parent", null);
        setField(term447, term447.getClass(), "first", term452);
        setIntField(term455, term455.getClass(), "type", 0);
        setField(term455, term455.getClass(), "next", null);
        setField(term455, term455.getClass(), "first", null);
        setField(term455, term455.getClass(), "last", null);
        setField(term455, term455.getClass(), "propListHead", null);
        setIntField(term455, term455.getClass(), "sourcePosition", 0);
        setField(term455, term455.getClass(), "jsType", null);
        setField(term455, term455.getClass(), "parent", null);
        setField(term447, term447.getClass(), "last", term455);
        setField(term458, term458.getClass(), "next", null);
        setIntField(term458, term458.getClass(), "type", 0);
        setIntField(term458, term458.getClass(), "intValue", 0);
        setField(term458, term458.getClass(), "objectValue", null);
        setField(term447, term447.getClass(), "propListHead", term458);
        setIntField(term447, term447.getClass(), "sourcePosition", 1265463001);
        setField(term447, term447.getClass(), "jsType", null);
        setField(term447, term447.getClass(), "parent", null);
        Object term462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term462, term462.getClass(), "type", 0);
        setField(term462, term462.getClass(), "next", null);
        setField(term462, term462.getClass(), "first", null);
        setField(term462, term462.getClass(), "last", null);
        setField(term462, term462.getClass(), "propListHead", null);
        setIntField(term462, term462.getClass(), "sourcePosition", 0);
        setField(term462, term462.getClass(), "jsType", null);
        setField(term462, term462.getClass(), "parent", null);
        ArrayList term445 = new ArrayList();
        ((ArrayList) term445).add(term447);
        ((ArrayList) term445).add(term462);
        HashMap term476 = new HashMap();
        HashMap term489 = new HashMap();
        Set<Object> term3671 =  ((Map) term489).keySet();
        HashSet term488 = new HashSet((Collection<? extends Object>) term3671);
        HashMap term506 = new HashMap();
        Set<Object> term3672 =  ((Map) term506).keySet();
        HashSet term505 = new HashSet((Collection<? extends Object>) term3672);
        HashMap term516 = new HashMap();
        HashMap term526 = new HashMap();
        term444 = newInstance(Class.forName("com.google.javascript.jscomp.AmbiguateProperties"));
        char[] term467 = (char[]) newCharArray(8);
        setField(term444, term444.getClass(), "compiler", null);
        setField(term444, term444.getClass(), "stringNodesToRename", term445);
        setCharElement(term467, 0, 'b');
        setCharElement(term467, 1, 'M');
        setCharElement(term467, 2, 'u');
        setCharElement(term467, 3, 'L');
        setCharElement(term467, 4, 'c');
        setCharElement(term467, 5, 'g');
        setCharElement(term467, 6, 'Q');
        setCharElement(term467, 7, 'H');
        setField(term444, term444.getClass(), "reservedCharacters", term467);
        setField(term444, term444.getClass(), "propertyMap", term476);
        setField(term444, term444.getClass(), "externedNames", term488);
        setField(term444, term444.getClass(), "quotedNames", term505);
        setField(term444, term444.getClass(), "renamingMap", term516);
        setField(term444, term444.getClass(), "colorMap", term526);
        setField(term444, term444.getClass(), "intForType", null);
        setField(term444, term444.getClass(), "relatedBitsets", null);
        setField(term444, term444.getClass(), "invalidatingTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getRelatedTypesOnNonUnion", argTypes, term444, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


