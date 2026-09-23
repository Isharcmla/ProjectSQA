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

public class AmbiguateProperties_addInvalidatingType_203236828111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12;

    public AmbiguateProperties_addInvalidatingType_203236828111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15, term15.getClass(), "type", 391863371);
        setIntField(term17, term17.getClass(), "type", -2038273078);
        setField(term17, term17.getClass(), "next", null);
        setField(term17, term17.getClass(), "first", null);
        setField(term17, term17.getClass(), "last", null);
        setField(term17, term17.getClass(), "propListHead", null);
        setIntField(term17, term17.getClass(), "sourcePosition", 1227103734);
        setField(term17, term17.getClass(), "jsType", null);
        setField(term17, term17.getClass(), "parent", null);
        setField(term15, term15.getClass(), "next", term17);
        setIntField(term20, term20.getClass(), "type", 0);
        setField(term20, term20.getClass(), "next", null);
        setField(term20, term20.getClass(), "first", null);
        setField(term20, term20.getClass(), "last", null);
        setField(term20, term20.getClass(), "propListHead", null);
        setIntField(term20, term20.getClass(), "sourcePosition", 0);
        setField(term20, term20.getClass(), "jsType", null);
        setField(term20, term20.getClass(), "parent", null);
        setField(term15, term15.getClass(), "first", term20);
        setIntField(term23, term23.getClass(), "type", 0);
        setField(term23, term23.getClass(), "next", null);
        setField(term23, term23.getClass(), "first", null);
        setField(term23, term23.getClass(), "last", null);
        setField(term23, term23.getClass(), "propListHead", null);
        setIntField(term23, term23.getClass(), "sourcePosition", 0);
        setField(term23, term23.getClass(), "jsType", null);
        setField(term23, term23.getClass(), "parent", null);
        setField(term15, term15.getClass(), "last", term23);
        setField(term26, term26.getClass(), "next", null);
        setIntField(term26, term26.getClass(), "type", 0);
        setIntField(term26, term26.getClass(), "intValue", 0);
        setField(term26, term26.getClass(), "objectValue", null);
        setField(term15, term15.getClass(), "propListHead", term26);
        setIntField(term15, term15.getClass(), "sourcePosition", -1339778481);
        setField(term15, term15.getClass(), "jsType", null);
        setField(term15, term15.getClass(), "parent", null);
        Object term30 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30, term30.getClass(), "type", 0);
        setField(term30, term30.getClass(), "next", null);
        setField(term30, term30.getClass(), "first", null);
        setField(term30, term30.getClass(), "last", null);
        setField(term30, term30.getClass(), "propListHead", null);
        setIntField(term30, term30.getClass(), "sourcePosition", 0);
        setField(term30, term30.getClass(), "jsType", null);
        setField(term30, term30.getClass(), "parent", null);
        Object term33 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33, term33.getClass(), "type", 0);
        setField(term33, term33.getClass(), "next", null);
        setField(term33, term33.getClass(), "first", null);
        setField(term33, term33.getClass(), "last", null);
        setField(term33, term33.getClass(), "propListHead", null);
        setIntField(term33, term33.getClass(), "sourcePosition", 0);
        setField(term33, term33.getClass(), "jsType", null);
        setField(term33, term33.getClass(), "parent", null);
        Object term36 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36, term36.getClass(), "type", 0);
        setField(term36, term36.getClass(), "next", null);
        setField(term36, term36.getClass(), "first", null);
        setField(term36, term36.getClass(), "last", null);
        setField(term36, term36.getClass(), "propListHead", null);
        setIntField(term36, term36.getClass(), "sourcePosition", 0);
        setField(term36, term36.getClass(), "jsType", null);
        setField(term36, term36.getClass(), "parent", null);
        ArrayList term13 = new ArrayList();
        ((ArrayList) term13).add(term15);
        ((ArrayList) term13).add(term30);
        ((ArrayList) term13).add(term33);
        ((ArrayList) term13).add(term36);
        HashMap term45 = new HashMap();
        HashMap term58 = new HashMap();
        Set<Object> term1702 =  ((Map) term58).keySet();
        HashSet term57 = new HashSet((Collection<? extends Object>) term1702);
        HashMap term71 = new HashMap();
        Set<Object> term1703 =  ((Map) term71).keySet();
        HashSet term70 = new HashSet((Collection<? extends Object>) term1703);
        HashMap term79 = new HashMap();
        HashMap term89 = new HashMap();
        term12 = newInstance(Class.forName("com.google.javascript.jscomp.AmbiguateProperties"));
        char[] term41 = (char[]) newCharArray(3);
        setField(term12, term12.getClass(), "compiler", null);
        setField(term12, term12.getClass(), "stringNodesToRename", term13);
        setCharElement(term41, 0, 'n');
        setCharElement(term41, 1, 'Z');
        setCharElement(term41, 2, 't');
        setField(term12, term12.getClass(), "reservedCharacters", term41);
        setField(term12, term12.getClass(), "propertyMap", term45);
        setField(term12, term12.getClass(), "externedNames", term57);
        setField(term12, term12.getClass(), "quotedNames", term70);
        setField(term12, term12.getClass(), "renamingMap", term79);
        setField(term12, term12.getClass(), "colorMap", term89);
        setField(term12, term12.getClass(), "intForType", null);
        setField(term12, term12.getClass(), "relatedBitsets", null);
        setField(term12, term12.getClass(), "invalidatingTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "addInvalidatingType", argTypes, term12, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


