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

public class ExtendedProperties_testBoolean_199146257298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4179;
     Object term15754;

    public ExtendedProperties_testBoolean_199146257298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4185 = new ArrayList();
        ArrayList term4222 = new ArrayList();
        HashMap term4240 = new HashMap();
        Set<Object> term15806 =  ((Map) term4240).keySet();
        HashSet term4239 = new HashSet((Collection<? extends Object>) term15806);
        HashMap term4246 = new HashMap();
        Set<Object> term15807 =  ((Map) term4246).keySet();
        HashSet term4245 = new HashSet((Collection<? extends Object>) term15807);
        ArrayList term4251 = new ArrayList();
        term4179 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term4180 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term4189 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term4226 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term4227 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4229 = newInstance(Class.forName("java.lang.Object"));
        Object term4230 = newInstance(Class.forName("java.lang.Object"));
        Object term4231 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4233 = newInstance(Class.forName("java.lang.Object"));
        Object term4234 = newInstance(Class.forName("java.lang.Object"));
        setField(term4180, term4180.getClass(), "defaults", null);
        setField(term4180, term4180.getClass(), "file", null);
        setField(term4180, term4180.getClass(), "basePath", null);
        setField(term4180, term4180.getClass(), "fileSeparator", "/");
        setBooleanField(term4180, term4180.getClass(), "isInitialized", false);
        setField(term4180, term4180.getClass(), "keysAsListed", term4185);
        setField(term4180, term4180.getClass(), "table", term4189);
        setIntField(term4180, term4180.getClass(), "count", 0);
        setIntField(term4180, term4180.getClass(), "threshold", 8);
        setFloatField(term4180, term4180.getClass(), "loadFactor", 0.75F);
        setIntField(term4180, term4180.getClass(), "modCount", 0);
        setField(term4180, term4180.getClass(), "keySet", null);
        setField(term4180, term4180.getClass(), "entrySet", null);
        setField(term4180, term4180.getClass(), "values", null);
        setField(term4179, term4179.getClass(), "defaults", term4180);
        setField(term4179, term4179.getClass(), "file", "JiVRgTZvKc");
        setField(term4179, term4179.getClass(), "basePath", "XPKmummaqg");
        setField(term4179, term4179.getClass(), "fileSeparator", "/");
        setBooleanField(term4179, term4179.getClass(), "isInitialized", true);
        setField(term4179, term4179.getClass(), "keysAsListed", term4222);
        setIntField(term4227, term4227.getClass(), "hash", 282763129);
        setField(term4227, term4227.getClass(), "key", term4229);
        setField(term4227, term4227.getClass(), "value", term4230);
        setField(term4227, term4227.getClass(), "next", null);
        setElement(term4226, 0, term4227);
        setIntField(term4231, term4231.getClass(), "hash", 353600683);
        setField(term4231, term4231.getClass(), "key", term4233);
        setField(term4231, term4231.getClass(), "value", term4234);
        setField(term4231, term4231.getClass(), "next", null);
        setElement(term4226, 7, term4231);
        setField(term4179, term4179.getClass(), "table", term4226);
        setIntField(term4179, term4179.getClass(), "count", -1263114717);
        setIntField(term4179, term4179.getClass(), "threshold", 8);
        setFloatField(term4179, term4179.getClass(), "loadFactor", 0.75F);
        setIntField(term4179, term4179.getClass(), "modCount", -894662984);
        setField(term4179, term4179.getClass(), "keySet", term4239);
        setField(term4179, term4179.getClass(), "entrySet", term4245);
        setField(term4179, term4179.getClass(), "values", term4251);
        ArrayList term15758 = new ArrayList();
        ArrayList term15767 = new ArrayList();
        HashMap term15777 = new HashMap();
        Set<Object> term15840 =  ((Map) term15777).keySet();
        HashSet term15776 = new HashSet((Collection<? extends Object>) term15840);
        HashMap term15779 = new HashMap();
        Set<Object> term15841 =  ((Map) term15779).keySet();
        HashSet term15778 = new HashSet((Collection<? extends Object>) term15841);
        ArrayList term15780 = new ArrayList();
        term15754 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term15755 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term15760 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term15769 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term15770 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term15771 = newInstance(Class.forName("java.lang.Object"));
        Object term15772 = newInstance(Class.forName("java.lang.Object"));
        Object term15773 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term15774 = newInstance(Class.forName("java.lang.Object"));
        Object term15775 = newInstance(Class.forName("java.lang.Object"));
        setField(term15755, term15755.getClass(), "defaults", null);
        setField(term15755, term15755.getClass(), "file", null);
        setField(term15755, term15755.getClass(), "basePath", null);
        setField(term15755, term15755.getClass(), "fileSeparator", "/");
        setBooleanField(term15755, term15755.getClass(), "isInitialized", false);
        setField(term15755, term15755.getClass(), "keysAsListed", term15758);
        setField(term15755, term15755.getClass(), "table", term15760);
        setIntField(term15755, term15755.getClass(), "count", 0);
        setIntField(term15755, term15755.getClass(), "threshold", 8);
        setFloatField(term15755, term15755.getClass(), "loadFactor", 0.75F);
        setIntField(term15755, term15755.getClass(), "modCount", 0);
        setField(term15755, term15755.getClass(), "keySet", null);
        setField(term15755, term15755.getClass(), "entrySet", null);
        setField(term15755, term15755.getClass(), "values", null);
        setField(term15754, term15754.getClass(), "defaults", term15755);
        setField(term15754, term15754.getClass(), "file", "JiVRgTZvKc");
        setField(term15754, term15754.getClass(), "basePath", "XPKmummaqg");
        setField(term15754, term15754.getClass(), "fileSeparator", "/");
        setBooleanField(term15754, term15754.getClass(), "isInitialized", true);
        setField(term15754, term15754.getClass(), "keysAsListed", term15767);
        setIntField(term15770, term15770.getClass(), "hash", 282763129);
        setField(term15770, term15770.getClass(), "key", term15771);
        setField(term15770, term15770.getClass(), "value", term15772);
        setField(term15770, term15770.getClass(), "next", null);
        setElement(term15769, 0, term15770);
        setIntField(term15773, term15773.getClass(), "hash", 353600683);
        setField(term15773, term15773.getClass(), "key", term15774);
        setField(term15773, term15773.getClass(), "value", term15775);
        setField(term15773, term15773.getClass(), "next", null);
        setElement(term15769, 7, term15773);
        setField(term15754, term15754.getClass(), "table", term15769);
        setIntField(term15754, term15754.getClass(), "count", -1263114717);
        setIntField(term15754, term15754.getClass(), "threshold", 8);
        setFloatField(term15754, term15754.getClass(), "loadFactor", 0.75F);
        setIntField(term15754, term15754.getClass(), "modCount", -894662984);
        setField(term15754, term15754.getClass(), "keySet", term15776);
        setField(term15754, term15754.getClass(), "entrySet", term15778);
        setField(term15754, term15754.getClass(), "values", term15780);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BKLfkLiZTH";
        Object retValue = callMethod(klass, "testBoolean", argTypes, term4179, args);
        assertTrue(recursiveEquals(term4179, term15754));
        assertTrue(recursiveEquals(retValue, null));
    }

};


