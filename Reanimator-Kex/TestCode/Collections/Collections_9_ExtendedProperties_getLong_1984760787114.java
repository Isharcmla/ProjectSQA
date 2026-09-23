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
import java.lang.Long;

public class ExtendedProperties_getLong_1984760787114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23297;
     Object term23503;
     Object term68891;

    public ExtendedProperties_getLong_1984760787114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23303 = new ArrayList();
        ArrayList term23352 = new ArrayList();
        ((ArrayList) term23352).add("java.lang.Object@4338195b");
        ((ArrayList) term23352).add("java.lang.Object@5634c7a4");
        HashMap term23476 = new HashMap();
        Set<Object> term69061 =  ((Map) term23476).keySet();
        HashSet term23475 = new HashSet((Collection<? extends Object>) term69061);
        HashMap term23482 = new HashMap();
        Set<Object> term69062 =  ((Map) term23482).keySet();
        HashSet term23481 = new HashSet((Collection<? extends Object>) term69062);
        ArrayList term23487 = new ArrayList();
        term23297 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term23298 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term23307 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term23410 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term23411 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term23440 = newInstance(Class.forName("java.lang.Object"));
        Object term23441 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term23470 = newInstance(Class.forName("java.lang.Object"));
        setField(term23298, term23298.getClass(), "defaults", null);
        setField(term23298, term23298.getClass(), "file", null);
        setField(term23298, term23298.getClass(), "basePath", null);
        setField(term23298, term23298.getClass(), "fileSeparator", "/");
        setBooleanField(term23298, term23298.getClass(), "isInitialized", false);
        setField(term23298, term23298.getClass(), "includePropertyName", null);
        setField(term23298, term23298.getClass(), "keysAsListed", term23303);
        setField(term23298, term23298.getClass(), "table", term23307);
        setIntField(term23298, term23298.getClass(), "count", 0);
        setIntField(term23298, term23298.getClass(), "threshold", 8);
        setFloatField(term23298, term23298.getClass(), "loadFactor", 0.75F);
        setIntField(term23298, term23298.getClass(), "modCount", 0);
        setField(term23298, term23298.getClass(), "keySet", null);
        setField(term23298, term23298.getClass(), "entrySet", null);
        setField(term23298, term23298.getClass(), "values", null);
        setField(term23297, term23297.getClass(), "defaults", term23298);
        setField(term23297, term23297.getClass(), "file", "VGizxZnyHX");
        setField(term23297, term23297.getClass(), "basePath", "kVEZMHmRtR");
        setField(term23297, term23297.getClass(), "fileSeparator", "/");
        setBooleanField(term23297, term23297.getClass(), "isInitialized", true);
        setField(term23297, term23297.getClass(), "includePropertyName", "ekxGuOYIwi");
        setField(term23297, term23297.getClass(), "keysAsListed", term23352);
        setIntField(term23411, term23411.getClass(), "hash", 414641910);
        setField(term23411, term23411.getClass(), "key", "java.lang.Object@5634c7a4");
        setField(term23411, term23411.getClass(), "value", term23440);
        setField(term23411, term23411.getClass(), "next", null);
        setElement(term23410, 1, term23411);
        setIntField(term23441, term23441.getClass(), "hash", 306492966);
        setField(term23441, term23441.getClass(), "key", "java.lang.Object@4338195b");
        setField(term23441, term23441.getClass(), "value", term23470);
        setField(term23441, term23441.getClass(), "next", null);
        setElement(term23410, 10, term23441);
        setField(term23297, term23297.getClass(), "table", term23410);
        setIntField(term23297, term23297.getClass(), "count", -2015048151);
        setIntField(term23297, term23297.getClass(), "threshold", 8);
        setFloatField(term23297, term23297.getClass(), "loadFactor", 0.75F);
        setIntField(term23297, term23297.getClass(), "modCount", -2063457667);
        setField(term23297, term23297.getClass(), "keySet", term23475);
        setField(term23297, term23297.getClass(), "entrySet", term23481);
        setField(term23297, term23297.getClass(), "values", term23487);
        term23503 = new Long(2442117782898005296L);
        ArrayList term68895 = new ArrayList();
        ArrayList term68906 = new ArrayList();
        ((ArrayList) term68906).add("java.lang.Object@4338195b");
        ((ArrayList) term68906).add("java.lang.Object@5634c7a4");
        HashMap term68922 = new HashMap();
        Set<Object> term69205 =  ((Map) term68922).keySet();
        HashSet term68921 = new HashSet((Collection<? extends Object>) term69205);
        HashMap term68924 = new HashMap();
        Set<Object> term69206 =  ((Map) term68924).keySet();
        HashSet term68923 = new HashSet((Collection<? extends Object>) term69206);
        ArrayList term68925 = new ArrayList();
        term68891 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term68892 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term68897 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term68912 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term68913 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term68916 = newInstance(Class.forName("java.lang.Object"));
        Object term68917 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term68920 = newInstance(Class.forName("java.lang.Object"));
        setField(term68892, term68892.getClass(), "defaults", null);
        setField(term68892, term68892.getClass(), "file", null);
        setField(term68892, term68892.getClass(), "basePath", null);
        setField(term68892, term68892.getClass(), "fileSeparator", "/");
        setBooleanField(term68892, term68892.getClass(), "isInitialized", false);
        setField(term68892, term68892.getClass(), "includePropertyName", null);
        setField(term68892, term68892.getClass(), "keysAsListed", term68895);
        setField(term68892, term68892.getClass(), "table", term68897);
        setIntField(term68892, term68892.getClass(), "count", 0);
        setIntField(term68892, term68892.getClass(), "threshold", 8);
        setFloatField(term68892, term68892.getClass(), "loadFactor", 0.75F);
        setIntField(term68892, term68892.getClass(), "modCount", 0);
        setField(term68892, term68892.getClass(), "keySet", null);
        setField(term68892, term68892.getClass(), "entrySet", null);
        setField(term68892, term68892.getClass(), "values", null);
        setField(term68891, term68891.getClass(), "defaults", term68892);
        setField(term68891, term68891.getClass(), "file", "VGizxZnyHX");
        setField(term68891, term68891.getClass(), "basePath", "kVEZMHmRtR");
        setField(term68891, term68891.getClass(), "fileSeparator", "/");
        setBooleanField(term68891, term68891.getClass(), "isInitialized", true);
        setField(term68891, term68891.getClass(), "includePropertyName", "ekxGuOYIwi");
        setField(term68891, term68891.getClass(), "keysAsListed", term68906);
        setIntField(term68913, term68913.getClass(), "hash", 414641910);
        setField(term68913, term68913.getClass(), "key", "java.lang.Object@5634c7a4");
        setField(term68913, term68913.getClass(), "value", term68916);
        setField(term68913, term68913.getClass(), "next", null);
        setElement(term68912, 1, term68913);
        setIntField(term68917, term68917.getClass(), "hash", 306492966);
        setField(term68917, term68917.getClass(), "key", "java.lang.Object@4338195b");
        setField(term68917, term68917.getClass(), "value", term68920);
        setField(term68917, term68917.getClass(), "next", null);
        setElement(term68912, 10, term68917);
        setField(term68891, term68891.getClass(), "table", term68912);
        setIntField(term68891, term68891.getClass(), "count", -2015048151);
        setIntField(term68891, term68891.getClass(), "threshold", 8);
        setFloatField(term68891, term68891.getClass(), "loadFactor", 0.75F);
        setIntField(term68891, term68891.getClass(), "modCount", -2063457667);
        setField(term68891, term68891.getClass(), "keySet", term68921);
        setField(term68891, term68891.getClass(), "entrySet", term68923);
        setField(term68891, term68891.getClass(), "values", term68925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = "RbVQXSpxXy";
        args[1] = term23503;
        Object retValue = callMethod(klass, "getLong", argTypes, term23297, args);
        assertTrue(recursiveEquals(term23297, term68891));
        assertTrue(recursiveEquals(term23503, 2442117782898005296L));
        assertTrue(recursiveEquals(retValue, 2442117782898005296L));
    }

};


