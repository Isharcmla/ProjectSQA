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

public class ExtendedProperties_remove_846717726125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28621;
     Object term28844;
     Object term77823;
     Object term77864;

    public ExtendedProperties_remove_846717726125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term28627 = new ArrayList();
        ArrayList term28676 = new ArrayList();
        ((ArrayList) term28676).add("java.lang.Object@1dc27d44");
        ((ArrayList) term28676).add("java.lang.Object@7a169fe7");
        ((ArrayList) term28676).add("java.lang.Object@94d856a");
        HashMap term28829 = new HashMap();
        Set<Object> term78020 =  ((Map) term28829).keySet();
        HashSet term28828 = new HashSet((Collection<? extends Object>) term78020);
        HashMap term28835 = new HashMap();
        Set<Object> term78021 =  ((Map) term28835).keySet();
        HashSet term28834 = new HashSet((Collection<? extends Object>) term78021);
        ArrayList term28840 = new ArrayList();
        term28621 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term28622 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term28631 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term28760 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term28761 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term28790 = newInstance(Class.forName("java.lang.Object"));
        Object term28791 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term28794 = newInstance(Class.forName("java.lang.Object"));
        Object term28795 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term28823 = newInstance(Class.forName("java.lang.Object"));
        setField(term28622, term28622.getClass(), "defaults", null);
        setField(term28622, term28622.getClass(), "file", null);
        setField(term28622, term28622.getClass(), "basePath", null);
        setField(term28622, term28622.getClass(), "fileSeparator", "/");
        setBooleanField(term28622, term28622.getClass(), "isInitialized", false);
        setField(term28622, term28622.getClass(), "includePropertyName", null);
        setField(term28622, term28622.getClass(), "keysAsListed", term28627);
        setField(term28622, term28622.getClass(), "table", term28631);
        setIntField(term28622, term28622.getClass(), "count", 0);
        setIntField(term28622, term28622.getClass(), "threshold", 8);
        setFloatField(term28622, term28622.getClass(), "loadFactor", 0.75F);
        setIntField(term28622, term28622.getClass(), "modCount", 0);
        setField(term28622, term28622.getClass(), "keySet", null);
        setField(term28622, term28622.getClass(), "entrySet", null);
        setField(term28622, term28622.getClass(), "values", null);
        setField(term28621, term28621.getClass(), "defaults", term28622);
        setField(term28621, term28621.getClass(), "file", "SFqCrhEWLm");
        setField(term28621, term28621.getClass(), "basePath", "GZdcJyZntS");
        setField(term28621, term28621.getClass(), "fileSeparator", "/");
        setBooleanField(term28621, term28621.getClass(), "isInitialized", true);
        setField(term28621, term28621.getClass(), "includePropertyName", "OIHoJeysUi");
        setField(term28621, term28621.getClass(), "keysAsListed", term28676);
        setIntField(term28761, term28761.getClass(), "hash", -943369285);
        setField(term28761, term28761.getClass(), "key", "java.lang.Object@7a169fe7");
        setField(term28761, term28761.getClass(), "value", term28790);
        setIntField(term28791, term28791.getClass(), "hash", 1279914780);
        setField(term28791, term28791.getClass(), "key", "");
        setField(term28791, term28791.getClass(), "value", term28794);
        setField(term28791, term28791.getClass(), "next", null);
        setField(term28761, term28761.getClass(), "next", term28791);
        setElement(term28760, 1, term28761);
        setIntField(term28795, term28795.getClass(), "hash", 1611796772);
        setField(term28795, term28795.getClass(), "key", "java.lang.Object@94d856a");
        setField(term28795, term28795.getClass(), "value", term28823);
        setField(term28795, term28795.getClass(), "next", null);
        setElement(term28760, 3, term28795);
        setField(term28621, term28621.getClass(), "table", term28760);
        setIntField(term28621, term28621.getClass(), "count", -2014576102);
        setIntField(term28621, term28621.getClass(), "threshold", 8);
        setFloatField(term28621, term28621.getClass(), "loadFactor", 0.75F);
        setIntField(term28621, term28621.getClass(), "modCount", 1296895587);
        setField(term28621, term28621.getClass(), "keySet", term28828);
        setField(term28621, term28621.getClass(), "entrySet", term28834);
        setField(term28621, term28621.getClass(), "values", term28840);
        term28844 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term77827 = new ArrayList();
        ArrayList term77838 = new ArrayList();
        ((ArrayList) term77838).add("java.lang.Object@1dc27d44");
        ((ArrayList) term77838).add("java.lang.Object@7a169fe7");
        ((ArrayList) term77838).add("java.lang.Object@94d856a");
        HashMap term77859 = new HashMap();
        Set<Object> term78177 =  ((Map) term77859).keySet();
        HashSet term77858 = new HashSet((Collection<? extends Object>) term78177);
        HashMap term77861 = new HashMap();
        Set<Object> term78178 =  ((Map) term77861).keySet();
        HashSet term77860 = new HashSet((Collection<? extends Object>) term78178);
        ArrayList term77862 = new ArrayList();
        term77823 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term77824 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term77829 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term77846 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term77847 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term77850 = newInstance(Class.forName("java.lang.Object"));
        Object term77851 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term77853 = newInstance(Class.forName("java.lang.Object"));
        Object term77854 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term77857 = newInstance(Class.forName("java.lang.Object"));
        setField(term77824, term77824.getClass(), "defaults", null);
        setField(term77824, term77824.getClass(), "file", null);
        setField(term77824, term77824.getClass(), "basePath", null);
        setField(term77824, term77824.getClass(), "fileSeparator", "/");
        setBooleanField(term77824, term77824.getClass(), "isInitialized", false);
        setField(term77824, term77824.getClass(), "includePropertyName", null);
        setField(term77824, term77824.getClass(), "keysAsListed", term77827);
        setField(term77824, term77824.getClass(), "table", term77829);
        setIntField(term77824, term77824.getClass(), "count", 0);
        setIntField(term77824, term77824.getClass(), "threshold", 8);
        setFloatField(term77824, term77824.getClass(), "loadFactor", 0.75F);
        setIntField(term77824, term77824.getClass(), "modCount", 0);
        setField(term77824, term77824.getClass(), "keySet", null);
        setField(term77824, term77824.getClass(), "entrySet", null);
        setField(term77824, term77824.getClass(), "values", null);
        setField(term77823, term77823.getClass(), "defaults", term77824);
        setField(term77823, term77823.getClass(), "file", "SFqCrhEWLm");
        setField(term77823, term77823.getClass(), "basePath", "GZdcJyZntS");
        setField(term77823, term77823.getClass(), "fileSeparator", "/");
        setBooleanField(term77823, term77823.getClass(), "isInitialized", true);
        setField(term77823, term77823.getClass(), "includePropertyName", "OIHoJeysUi");
        setField(term77823, term77823.getClass(), "keysAsListed", term77838);
        setIntField(term77847, term77847.getClass(), "hash", -943369285);
        setField(term77847, term77847.getClass(), "key", "java.lang.Object@7a169fe7");
        setField(term77847, term77847.getClass(), "value", term77850);
        setIntField(term77851, term77851.getClass(), "hash", 1279914780);
        setField(term77851, term77851.getClass(), "key", "");
        setField(term77851, term77851.getClass(), "value", term77853);
        setField(term77851, term77851.getClass(), "next", null);
        setField(term77847, term77847.getClass(), "next", term77851);
        setElement(term77846, 1, term77847);
        setIntField(term77854, term77854.getClass(), "hash", 1611796772);
        setField(term77854, term77854.getClass(), "key", "java.lang.Object@94d856a");
        setField(term77854, term77854.getClass(), "value", term77857);
        setField(term77854, term77854.getClass(), "next", null);
        setElement(term77846, 3, term77854);
        setField(term77823, term77823.getClass(), "table", term77846);
        setIntField(term77823, term77823.getClass(), "count", -2014576102);
        setIntField(term77823, term77823.getClass(), "threshold", 8);
        setFloatField(term77823, term77823.getClass(), "loadFactor", 0.75F);
        setIntField(term77823, term77823.getClass(), "modCount", 1296895587);
        setField(term77823, term77823.getClass(), "keySet", term77858);
        setField(term77823, term77823.getClass(), "entrySet", term77860);
        setField(term77823, term77823.getClass(), "values", term77862);
        term77864 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term28844;
        Object retValue = callMethod(klass, "remove", argTypes, term28621, args);
        assertTrue(recursiveEquals(term28621, term77823));
        assertTrue(recursiveEquals(term28844, term77864));
        assertTrue(recursiveEquals(retValue, null));
    }

};


