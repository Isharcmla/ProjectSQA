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
     Object term69387;

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
        Set<Object> term69557 =  ((Map) term23476).keySet();
        HashSet term23475 = new HashSet((Collection<? extends Object>) term69557);
        HashMap term23482 = new HashMap();
        Set<Object> term69558 =  ((Map) term23482).keySet();
        HashSet term23481 = new HashSet((Collection<? extends Object>) term69558);
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
        ArrayList term69391 = new ArrayList();
        ArrayList term69402 = new ArrayList();
        ((ArrayList) term69402).add("java.lang.Object@4338195b");
        ((ArrayList) term69402).add("java.lang.Object@5634c7a4");
        HashMap term69418 = new HashMap();
        Set<Object> term69701 =  ((Map) term69418).keySet();
        HashSet term69417 = new HashSet((Collection<? extends Object>) term69701);
        HashMap term69420 = new HashMap();
        Set<Object> term69702 =  ((Map) term69420).keySet();
        HashSet term69419 = new HashSet((Collection<? extends Object>) term69702);
        ArrayList term69421 = new ArrayList();
        term69387 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term69388 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term69393 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term69408 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term69409 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term69412 = newInstance(Class.forName("java.lang.Object"));
        Object term69413 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term69416 = newInstance(Class.forName("java.lang.Object"));
        setField(term69388, term69388.getClass(), "defaults", null);
        setField(term69388, term69388.getClass(), "file", null);
        setField(term69388, term69388.getClass(), "basePath", null);
        setField(term69388, term69388.getClass(), "fileSeparator", "/");
        setBooleanField(term69388, term69388.getClass(), "isInitialized", false);
        setField(term69388, term69388.getClass(), "includePropertyName", null);
        setField(term69388, term69388.getClass(), "keysAsListed", term69391);
        setField(term69388, term69388.getClass(), "table", term69393);
        setIntField(term69388, term69388.getClass(), "count", 0);
        setIntField(term69388, term69388.getClass(), "threshold", 8);
        setFloatField(term69388, term69388.getClass(), "loadFactor", 0.75F);
        setIntField(term69388, term69388.getClass(), "modCount", 0);
        setField(term69388, term69388.getClass(), "keySet", null);
        setField(term69388, term69388.getClass(), "entrySet", null);
        setField(term69388, term69388.getClass(), "values", null);
        setField(term69387, term69387.getClass(), "defaults", term69388);
        setField(term69387, term69387.getClass(), "file", "VGizxZnyHX");
        setField(term69387, term69387.getClass(), "basePath", "kVEZMHmRtR");
        setField(term69387, term69387.getClass(), "fileSeparator", "/");
        setBooleanField(term69387, term69387.getClass(), "isInitialized", true);
        setField(term69387, term69387.getClass(), "includePropertyName", "ekxGuOYIwi");
        setField(term69387, term69387.getClass(), "keysAsListed", term69402);
        setIntField(term69409, term69409.getClass(), "hash", 414641910);
        setField(term69409, term69409.getClass(), "key", "java.lang.Object@5634c7a4");
        setField(term69409, term69409.getClass(), "value", term69412);
        setField(term69409, term69409.getClass(), "next", null);
        setElement(term69408, 1, term69409);
        setIntField(term69413, term69413.getClass(), "hash", 306492966);
        setField(term69413, term69413.getClass(), "key", "java.lang.Object@4338195b");
        setField(term69413, term69413.getClass(), "value", term69416);
        setField(term69413, term69413.getClass(), "next", null);
        setElement(term69408, 10, term69413);
        setField(term69387, term69387.getClass(), "table", term69408);
        setIntField(term69387, term69387.getClass(), "count", -2015048151);
        setIntField(term69387, term69387.getClass(), "threshold", 8);
        setFloatField(term69387, term69387.getClass(), "loadFactor", 0.75F);
        setIntField(term69387, term69387.getClass(), "modCount", -2063457667);
        setField(term69387, term69387.getClass(), "keySet", term69417);
        setField(term69387, term69387.getClass(), "entrySet", term69419);
        setField(term69387, term69387.getClass(), "values", term69421);
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
        assertTrue(recursiveEquals(term23297, term69387));
        assertTrue(recursiveEquals(term23503, 2442117782898005296L));
        assertTrue(recursiveEquals(retValue, 2442117782898005296L));
    }

};


