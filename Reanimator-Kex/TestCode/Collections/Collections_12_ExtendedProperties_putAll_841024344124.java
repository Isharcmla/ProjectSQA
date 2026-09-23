package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class ExtendedProperties_putAll_841024344124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28763;
     Object term28843;
     Object term78720;
     Object term78744;

    public ExtendedProperties_putAll_841024344124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term28769 = new ArrayList();
        ArrayList term28818 = new ArrayList();
        HashMap term28828 = new HashMap();
        Set<Object> term78778 =  ((Map) term28828).keySet();
        HashSet term28827 = new HashSet((Collection<? extends Object>) term78778);
        HashMap term28834 = new HashMap();
        Set<Object> term78779 =  ((Map) term28834).keySet();
        HashSet term28833 = new HashSet((Collection<? extends Object>) term78779);
        ArrayList term28839 = new ArrayList();
        term28763 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term28764 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term28773 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term28822 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term28764, term28764.getClass(), "defaults", null);
        setField(term28764, term28764.getClass(), "file", null);
        setField(term28764, term28764.getClass(), "basePath", null);
        setField(term28764, term28764.getClass(), "fileSeparator", "/");
        setBooleanField(term28764, term28764.getClass(), "isInitialized", false);
        setField(term28764, term28764.getClass(), "includePropertyName", null);
        setField(term28764, term28764.getClass(), "keysAsListed", term28769);
        setField(term28764, term28764.getClass(), "table", term28773);
        setIntField(term28764, term28764.getClass(), "count", 0);
        setIntField(term28764, term28764.getClass(), "threshold", 8);
        setFloatField(term28764, term28764.getClass(), "loadFactor", 0.75F);
        setIntField(term28764, term28764.getClass(), "modCount", 0);
        setField(term28764, term28764.getClass(), "keySet", null);
        setField(term28764, term28764.getClass(), "entrySet", null);
        setField(term28764, term28764.getClass(), "values", null);
        setField(term28763, term28763.getClass(), "defaults", term28764);
        setField(term28763, term28763.getClass(), "file", "zcorEihhLK");
        setField(term28763, term28763.getClass(), "basePath", "GrqozDKFOk");
        setField(term28763, term28763.getClass(), "fileSeparator", "/");
        setBooleanField(term28763, term28763.getClass(), "isInitialized", false);
        setField(term28763, term28763.getClass(), "includePropertyName", "CFyoseFGLF");
        setField(term28763, term28763.getClass(), "keysAsListed", term28818);
        setField(term28763, term28763.getClass(), "table", term28822);
        setIntField(term28763, term28763.getClass(), "count", -243422082);
        setIntField(term28763, term28763.getClass(), "threshold", 8);
        setFloatField(term28763, term28763.getClass(), "loadFactor", 0.75F);
        setIntField(term28763, term28763.getClass(), "modCount", 1384592638);
        setField(term28763, term28763.getClass(), "keySet", term28827);
        setField(term28763, term28763.getClass(), "entrySet", term28833);
        setField(term28763, term28763.getClass(), "values", term28839);
        term28843 = new LinkedHashMap();
        ArrayList term78724 = new ArrayList();
        ArrayList term78735 = new ArrayList();
        HashMap term78739 = new HashMap();
        Set<Object> term78812 =  ((Map) term78739).keySet();
        HashSet term78738 = new HashSet((Collection<? extends Object>) term78812);
        HashMap term78741 = new HashMap();
        Set<Object> term78813 =  ((Map) term78741).keySet();
        HashSet term78740 = new HashSet((Collection<? extends Object>) term78813);
        ArrayList term78742 = new ArrayList();
        term78720 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term78721 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term78726 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term78737 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term78721, term78721.getClass(), "defaults", null);
        setField(term78721, term78721.getClass(), "file", null);
        setField(term78721, term78721.getClass(), "basePath", null);
        setField(term78721, term78721.getClass(), "fileSeparator", "/");
        setBooleanField(term78721, term78721.getClass(), "isInitialized", false);
        setField(term78721, term78721.getClass(), "includePropertyName", null);
        setField(term78721, term78721.getClass(), "keysAsListed", term78724);
        setField(term78721, term78721.getClass(), "table", term78726);
        setIntField(term78721, term78721.getClass(), "count", 0);
        setIntField(term78721, term78721.getClass(), "threshold", 8);
        setFloatField(term78721, term78721.getClass(), "loadFactor", 0.75F);
        setIntField(term78721, term78721.getClass(), "modCount", 0);
        setField(term78721, term78721.getClass(), "keySet", null);
        setField(term78721, term78721.getClass(), "entrySet", null);
        setField(term78721, term78721.getClass(), "values", null);
        setField(term78720, term78720.getClass(), "defaults", term78721);
        setField(term78720, term78720.getClass(), "file", "zcorEihhLK");
        setField(term78720, term78720.getClass(), "basePath", "GrqozDKFOk");
        setField(term78720, term78720.getClass(), "fileSeparator", "/");
        setBooleanField(term78720, term78720.getClass(), "isInitialized", false);
        setField(term78720, term78720.getClass(), "includePropertyName", "CFyoseFGLF");
        setField(term78720, term78720.getClass(), "keysAsListed", term78735);
        setField(term78720, term78720.getClass(), "table", term78737);
        setIntField(term78720, term78720.getClass(), "count", -243422082);
        setIntField(term78720, term78720.getClass(), "threshold", 8);
        setFloatField(term78720, term78720.getClass(), "loadFactor", 0.75F);
        setIntField(term78720, term78720.getClass(), "modCount", 1384592638);
        setField(term78720, term78720.getClass(), "keySet", term78738);
        setField(term78720, term78720.getClass(), "entrySet", term78740);
        setField(term78720, term78720.getClass(), "values", term78742);
        term78744 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term28843;
        callMethod(klass, "putAll", argTypes, term28763, args);
        assertTrue(recursiveEquals(term28763, term78720));
        assertTrue(recursiveEquals(term28843, term78744));
    }

};


