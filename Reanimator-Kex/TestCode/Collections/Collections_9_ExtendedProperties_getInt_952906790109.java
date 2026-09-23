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
import java.lang.Integer;

public class ExtendedProperties_getInt_952906790109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19956;
     Object term20219;
     Object term63151;

    public ExtendedProperties_getInt_952906790109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19962 = new ArrayList();
        ArrayList term20011 = new ArrayList();
        ((ArrayList) term20011).add("java.lang.Object@5001caaf");
        ((ArrayList) term20011).add("java.lang.Object@7d647344");
        ((ArrayList) term20011).add("java.lang.Object@4b745253");
        HashMap term20192 = new HashMap();
        Set<Object> term63377 =  ((Map) term20192).keySet();
        HashSet term20191 = new HashSet((Collection<? extends Object>) term63377);
        HashMap term20198 = new HashMap();
        Set<Object> term63378 =  ((Map) term20198).keySet();
        HashSet term20197 = new HashSet((Collection<? extends Object>) term63378);
        ArrayList term20203 = new ArrayList();
        term19956 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term19957 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term19966 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term20096 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term20097 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term20126 = newInstance(Class.forName("java.lang.Object"));
        Object term20127 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term20156 = newInstance(Class.forName("java.lang.Object"));
        Object term20157 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term20186 = newInstance(Class.forName("java.lang.Object"));
        setField(term19957, term19957.getClass(), "defaults", null);
        setField(term19957, term19957.getClass(), "file", null);
        setField(term19957, term19957.getClass(), "basePath", null);
        setField(term19957, term19957.getClass(), "fileSeparator", "/");
        setBooleanField(term19957, term19957.getClass(), "isInitialized", false);
        setField(term19957, term19957.getClass(), "includePropertyName", null);
        setField(term19957, term19957.getClass(), "keysAsListed", term19962);
        setField(term19957, term19957.getClass(), "table", term19966);
        setIntField(term19957, term19957.getClass(), "count", 0);
        setIntField(term19957, term19957.getClass(), "threshold", 8);
        setFloatField(term19957, term19957.getClass(), "loadFactor", 0.75F);
        setIntField(term19957, term19957.getClass(), "modCount", 0);
        setField(term19957, term19957.getClass(), "keySet", null);
        setField(term19957, term19957.getClass(), "entrySet", null);
        setField(term19957, term19957.getClass(), "values", null);
        setField(term19956, term19956.getClass(), "defaults", term19957);
        setField(term19956, term19956.getClass(), "file", "aWYOWZFyaX");
        setField(term19956, term19956.getClass(), "basePath", "BRIVNtfUWU");
        setField(term19956, term19956.getClass(), "fileSeparator", "/");
        setBooleanField(term19956, term19956.getClass(), "isInitialized", true);
        setField(term19956, term19956.getClass(), "includePropertyName", "DbiCVtPPCT");
        setField(term19956, term19956.getClass(), "keysAsListed", term20011);
        setIntField(term20097, term20097.getClass(), "hash", -819572077);
        setField(term20097, term20097.getClass(), "key", "java.lang.Object@4b745253");
        setField(term20097, term20097.getClass(), "value", term20126);
        setField(term20097, term20097.getClass(), "next", null);
        setElement(term20096, 51, term20097);
        setIntField(term20127, term20127.getClass(), "hash", 1860330356);
        setField(term20127, term20127.getClass(), "key", "java.lang.Object@7d647344");
        setField(term20127, term20127.getClass(), "value", term20156);
        setField(term20127, term20127.getClass(), "next", null);
        setElement(term20096, 76, term20127);
        setIntField(term20157, term20157.getClass(), "hash", -704030484);
        setField(term20157, term20157.getClass(), "key", "java.lang.Object@5001caaf");
        setField(term20157, term20157.getClass(), "value", term20186);
        setField(term20157, term20157.getClass(), "next", null);
        setElement(term20096, 79, term20157);
        setField(term19956, term19956.getClass(), "table", term20096);
        setIntField(term19956, term19956.getClass(), "count", 1072005686);
        setIntField(term19956, term19956.getClass(), "threshold", 71);
        setFloatField(term19956, term19956.getClass(), "loadFactor", 0.75F);
        setIntField(term19956, term19956.getClass(), "modCount", 1861318865);
        setField(term19956, term19956.getClass(), "keySet", term20191);
        setField(term19956, term19956.getClass(), "entrySet", term20197);
        setField(term19956, term19956.getClass(), "values", term20203);
        term20219 = new Integer(568954359);
        ArrayList term63155 = new ArrayList();
        ArrayList term63166 = new ArrayList();
        ((ArrayList) term63166).add("java.lang.Object@5001caaf");
        ((ArrayList) term63166).add("java.lang.Object@7d647344");
        ((ArrayList) term63166).add("java.lang.Object@4b745253");
        HashMap term63188 = new HashMap();
        Set<Object> term63571 =  ((Map) term63188).keySet();
        HashSet term63187 = new HashSet((Collection<? extends Object>) term63571);
        HashMap term63190 = new HashMap();
        Set<Object> term63572 =  ((Map) term63190).keySet();
        HashSet term63189 = new HashSet((Collection<? extends Object>) term63572);
        ArrayList term63191 = new ArrayList();
        term63151 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term63152 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term63157 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term63174 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term63175 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term63178 = newInstance(Class.forName("java.lang.Object"));
        Object term63179 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term63182 = newInstance(Class.forName("java.lang.Object"));
        Object term63183 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term63186 = newInstance(Class.forName("java.lang.Object"));
        setField(term63152, term63152.getClass(), "defaults", null);
        setField(term63152, term63152.getClass(), "file", null);
        setField(term63152, term63152.getClass(), "basePath", null);
        setField(term63152, term63152.getClass(), "fileSeparator", "/");
        setBooleanField(term63152, term63152.getClass(), "isInitialized", false);
        setField(term63152, term63152.getClass(), "includePropertyName", null);
        setField(term63152, term63152.getClass(), "keysAsListed", term63155);
        setField(term63152, term63152.getClass(), "table", term63157);
        setIntField(term63152, term63152.getClass(), "count", 0);
        setIntField(term63152, term63152.getClass(), "threshold", 8);
        setFloatField(term63152, term63152.getClass(), "loadFactor", 0.75F);
        setIntField(term63152, term63152.getClass(), "modCount", 0);
        setField(term63152, term63152.getClass(), "keySet", null);
        setField(term63152, term63152.getClass(), "entrySet", null);
        setField(term63152, term63152.getClass(), "values", null);
        setField(term63151, term63151.getClass(), "defaults", term63152);
        setField(term63151, term63151.getClass(), "file", "aWYOWZFyaX");
        setField(term63151, term63151.getClass(), "basePath", "BRIVNtfUWU");
        setField(term63151, term63151.getClass(), "fileSeparator", "/");
        setBooleanField(term63151, term63151.getClass(), "isInitialized", true);
        setField(term63151, term63151.getClass(), "includePropertyName", "DbiCVtPPCT");
        setField(term63151, term63151.getClass(), "keysAsListed", term63166);
        setIntField(term63175, term63175.getClass(), "hash", -819572077);
        setField(term63175, term63175.getClass(), "key", "java.lang.Object@4b745253");
        setField(term63175, term63175.getClass(), "value", term63178);
        setField(term63175, term63175.getClass(), "next", null);
        setElement(term63174, 51, term63175);
        setIntField(term63179, term63179.getClass(), "hash", 1860330356);
        setField(term63179, term63179.getClass(), "key", "java.lang.Object@7d647344");
        setField(term63179, term63179.getClass(), "value", term63182);
        setField(term63179, term63179.getClass(), "next", null);
        setElement(term63174, 76, term63179);
        setIntField(term63183, term63183.getClass(), "hash", -704030484);
        setField(term63183, term63183.getClass(), "key", "java.lang.Object@5001caaf");
        setField(term63183, term63183.getClass(), "value", term63186);
        setField(term63183, term63183.getClass(), "next", null);
        setElement(term63174, 79, term63183);
        setField(term63151, term63151.getClass(), "table", term63174);
        setIntField(term63151, term63151.getClass(), "count", 1072005686);
        setIntField(term63151, term63151.getClass(), "threshold", 71);
        setFloatField(term63151, term63151.getClass(), "loadFactor", 0.75F);
        setIntField(term63151, term63151.getClass(), "modCount", 1861318865);
        setField(term63151, term63151.getClass(), "keySet", term63187);
        setField(term63151, term63151.getClass(), "entrySet", term63189);
        setField(term63151, term63151.getClass(), "values", term63191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "WzFopsaDuG";
        args[1] = term20219;
        Object retValue = callMethod(klass, "getInt", argTypes, term19956, args);
        assertTrue(recursiveEquals(term19956, term63151));
        assertTrue(recursiveEquals(term20219, 568954359));
        assertTrue(recursiveEquals(retValue, 568954359));
    }

};


