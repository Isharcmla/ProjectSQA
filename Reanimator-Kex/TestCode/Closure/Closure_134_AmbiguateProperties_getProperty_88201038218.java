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

public class AmbiguateProperties_getProperty_88201038218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term754;

    public AmbiguateProperties_getProperty_88201038218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term768 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term757, term757.getClass(), "type", -1263114719);
        setIntField(term759, term759.getClass(), "type", -1888585309);
        setField(term759, term759.getClass(), "next", null);
        setField(term759, term759.getClass(), "first", null);
        setField(term759, term759.getClass(), "last", null);
        setField(term759, term759.getClass(), "propListHead", null);
        setIntField(term759, term759.getClass(), "sourcePosition", 683666002);
        setField(term759, term759.getClass(), "jsType", null);
        setField(term759, term759.getClass(), "parent", null);
        setField(term757, term757.getClass(), "next", term759);
        setIntField(term762, term762.getClass(), "type", 0);
        setField(term762, term762.getClass(), "next", null);
        setField(term762, term762.getClass(), "first", null);
        setField(term762, term762.getClass(), "last", null);
        setField(term762, term762.getClass(), "propListHead", null);
        setIntField(term762, term762.getClass(), "sourcePosition", 0);
        setField(term762, term762.getClass(), "jsType", null);
        setField(term762, term762.getClass(), "parent", null);
        setField(term757, term757.getClass(), "first", term762);
        setIntField(term765, term765.getClass(), "type", 0);
        setField(term765, term765.getClass(), "next", null);
        setField(term765, term765.getClass(), "first", null);
        setField(term765, term765.getClass(), "last", null);
        setField(term765, term765.getClass(), "propListHead", null);
        setIntField(term765, term765.getClass(), "sourcePosition", 0);
        setField(term765, term765.getClass(), "jsType", null);
        setField(term765, term765.getClass(), "parent", null);
        setField(term757, term757.getClass(), "last", term765);
        setField(term768, term768.getClass(), "next", null);
        setIntField(term768, term768.getClass(), "type", 0);
        setIntField(term768, term768.getClass(), "intValue", 0);
        setField(term768, term768.getClass(), "objectValue", null);
        setField(term757, term757.getClass(), "propListHead", term768);
        setIntField(term757, term757.getClass(), "sourcePosition", 1596213415);
        setField(term757, term757.getClass(), "jsType", null);
        setField(term757, term757.getClass(), "parent", null);
        Object term772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term772, term772.getClass(), "type", 0);
        setField(term772, term772.getClass(), "next", null);
        setField(term772, term772.getClass(), "first", null);
        setField(term772, term772.getClass(), "last", null);
        setField(term772, term772.getClass(), "propListHead", null);
        setIntField(term772, term772.getClass(), "sourcePosition", 0);
        setField(term772, term772.getClass(), "jsType", null);
        setField(term772, term772.getClass(), "parent", null);
        ArrayList term755 = new ArrayList();
        ((ArrayList) term755).add(term757);
        ((ArrayList) term755).add(term772);
        HashMap term784 = new HashMap();
        HashMap term797 = new HashMap();
        Set<Object> term4347 =  ((Map) term797).keySet();
        HashSet term796 = new HashSet((Collection<? extends Object>) term4347);
        HashMap term816 = new HashMap();
        Set<Object> term4348 =  ((Map) term816).keySet();
        HashSet term815 = new HashSet((Collection<? extends Object>) term4348);
        HashMap term826 = new HashMap();
        HashMap term836 = new HashMap();
        term754 = newInstance(Class.forName("com.google.javascript.jscomp.AmbiguateProperties"));
        char[] term777 = (char[]) newCharArray(6);
        setField(term754, term754.getClass(), "compiler", null);
        setField(term754, term754.getClass(), "stringNodesToRename", term755);
        setCharElement(term777, 0, 'J');
        setCharElement(term777, 1, 'C');
        setCharElement(term777, 2, 'Z');
        setCharElement(term777, 3, 'p');
        setCharElement(term777, 4, 'V');
        setCharElement(term777, 5, 'm');
        setField(term754, term754.getClass(), "reservedCharacters", term777);
        setField(term754, term754.getClass(), "propertyMap", term784);
        setField(term754, term754.getClass(), "externedNames", term796);
        setField(term754, term754.getClass(), "quotedNames", term815);
        setField(term754, term754.getClass(), "renamingMap", term826);
        setField(term754, term754.getClass(), "colorMap", term836);
        setField(term754, term754.getClass(), "intForType", null);
        setField(term754, term754.getClass(), "relatedBitsets", null);
        setField(term754, term754.getClass(), "invalidatingTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DfISiziTgG";
        try {
            callMethod(klass, "getProperty", argTypes, term754, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


