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

public class AmbiguateProperties_computeRelatedTypes_51687743316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547;

    public AmbiguateProperties_computeRelatedTypes_51687743316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term561 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term550, term550.getClass(), "type", 1063420942);
        setIntField(term552, term552.getClass(), "type", 1655935355);
        setField(term552, term552.getClass(), "next", null);
        setField(term552, term552.getClass(), "first", null);
        setField(term552, term552.getClass(), "last", null);
        setField(term552, term552.getClass(), "propListHead", null);
        setIntField(term552, term552.getClass(), "sourcePosition", -481533957);
        setField(term552, term552.getClass(), "jsType", null);
        setField(term552, term552.getClass(), "parent", null);
        setField(term550, term550.getClass(), "next", term552);
        setIntField(term555, term555.getClass(), "type", 0);
        setField(term555, term555.getClass(), "next", null);
        setField(term555, term555.getClass(), "first", null);
        setField(term555, term555.getClass(), "last", null);
        setField(term555, term555.getClass(), "propListHead", null);
        setIntField(term555, term555.getClass(), "sourcePosition", 0);
        setField(term555, term555.getClass(), "jsType", null);
        setField(term555, term555.getClass(), "parent", null);
        setField(term550, term550.getClass(), "first", term555);
        setIntField(term558, term558.getClass(), "type", 0);
        setField(term558, term558.getClass(), "next", null);
        setField(term558, term558.getClass(), "first", null);
        setField(term558, term558.getClass(), "last", null);
        setField(term558, term558.getClass(), "propListHead", null);
        setIntField(term558, term558.getClass(), "sourcePosition", 0);
        setField(term558, term558.getClass(), "jsType", null);
        setField(term558, term558.getClass(), "parent", null);
        setField(term550, term550.getClass(), "last", term558);
        setField(term561, term561.getClass(), "next", null);
        setIntField(term561, term561.getClass(), "type", 0);
        setIntField(term561, term561.getClass(), "intValue", 0);
        setField(term561, term561.getClass(), "objectValue", null);
        setField(term550, term550.getClass(), "propListHead", term561);
        setIntField(term550, term550.getClass(), "sourcePosition", 1240914516);
        setField(term550, term550.getClass(), "jsType", null);
        setField(term550, term550.getClass(), "parent", null);
        ArrayList term548 = new ArrayList();
        ((ArrayList) term548).add(term550);
        HashMap term577 = new HashMap();
        HashMap term590 = new HashMap();
        Set<Object> term3931 =  ((Map) term590).keySet();
        HashSet term589 = new HashSet((Collection<? extends Object>) term3931);
        HashMap term603 = new HashMap();
        Set<Object> term3932 =  ((Map) term603).keySet();
        HashSet term602 = new HashSet((Collection<? extends Object>) term3932);
        HashMap term615 = new HashMap();
        HashMap term625 = new HashMap();
        term547 = newInstance(Class.forName("com.google.javascript.jscomp.AmbiguateProperties"));
        char[] term567 = (char[]) newCharArray(9);
        setField(term547, term547.getClass(), "compiler", null);
        setField(term547, term547.getClass(), "stringNodesToRename", term548);
        setCharElement(term567, 0, 'g');
        setCharElement(term567, 1, 'q');
        setCharElement(term567, 2, 'z');
        setCharElement(term567, 3, 'x');
        setCharElement(term567, 4, 'x');
        setCharElement(term567, 5, 't');
        setCharElement(term567, 6, 'l');
        setCharElement(term567, 7, 'P');
        setCharElement(term567, 8, 'w');
        setField(term547, term547.getClass(), "reservedCharacters", term567);
        setField(term547, term547.getClass(), "propertyMap", term577);
        setField(term547, term547.getClass(), "externedNames", term589);
        setField(term547, term547.getClass(), "quotedNames", term602);
        setField(term547, term547.getClass(), "renamingMap", term615);
        setField(term547, term547.getClass(), "colorMap", term625);
        setField(term547, term547.getClass(), "intForType", null);
        setField(term547, term547.getClass(), "relatedBitsets", null);
        setField(term547, term547.getClass(), "invalidatingTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "computeRelatedTypes", argTypes, term547, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


