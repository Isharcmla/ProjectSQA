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
import java.lang.Double;

public class ExtendedProperties_getDouble_1047284872120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27588;
     Object term27680;
     Object term76556;

    public ExtendedProperties_getDouble_1047284872120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27594 = new ArrayList();
        ArrayList term27643 = new ArrayList();
        HashMap term27653 = new HashMap();
        Set<Object> term76614 =  ((Map) term27653).keySet();
        HashSet term27652 = new HashSet((Collection<? extends Object>) term76614);
        HashMap term27659 = new HashMap();
        Set<Object> term76615 =  ((Map) term27659).keySet();
        HashSet term27658 = new HashSet((Collection<? extends Object>) term76615);
        ArrayList term27664 = new ArrayList();
        term27588 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term27589 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term27598 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term27647 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term27589, term27589.getClass(), "defaults", null);
        setField(term27589, term27589.getClass(), "file", null);
        setField(term27589, term27589.getClass(), "basePath", null);
        setField(term27589, term27589.getClass(), "fileSeparator", "/");
        setBooleanField(term27589, term27589.getClass(), "isInitialized", false);
        setField(term27589, term27589.getClass(), "includePropertyName", null);
        setField(term27589, term27589.getClass(), "keysAsListed", term27594);
        setField(term27589, term27589.getClass(), "table", term27598);
        setIntField(term27589, term27589.getClass(), "count", 0);
        setIntField(term27589, term27589.getClass(), "threshold", 8);
        setFloatField(term27589, term27589.getClass(), "loadFactor", 0.75F);
        setIntField(term27589, term27589.getClass(), "modCount", 0);
        setField(term27589, term27589.getClass(), "keySet", null);
        setField(term27589, term27589.getClass(), "entrySet", null);
        setField(term27589, term27589.getClass(), "values", null);
        setField(term27588, term27588.getClass(), "defaults", term27589);
        setField(term27588, term27588.getClass(), "file", "vGiuZVPJNH");
        setField(term27588, term27588.getClass(), "basePath", "tlzpzIjMib");
        setField(term27588, term27588.getClass(), "fileSeparator", "/");
        setBooleanField(term27588, term27588.getClass(), "isInitialized", true);
        setField(term27588, term27588.getClass(), "includePropertyName", "AZdLeSugwv");
        setField(term27588, term27588.getClass(), "keysAsListed", term27643);
        setField(term27588, term27588.getClass(), "table", term27647);
        setIntField(term27588, term27588.getClass(), "count", 1830648570);
        setIntField(term27588, term27588.getClass(), "threshold", 8);
        setFloatField(term27588, term27588.getClass(), "loadFactor", 0.75F);
        setIntField(term27588, term27588.getClass(), "modCount", -227365013);
        setField(term27588, term27588.getClass(), "keySet", term27652);
        setField(term27588, term27588.getClass(), "entrySet", term27658);
        setField(term27588, term27588.getClass(), "values", term27664);
        term27680 = new Double(0.13238746331190498);
        ArrayList term76560 = new ArrayList();
        ArrayList term76571 = new ArrayList();
        HashMap term76575 = new HashMap();
        Set<Object> term76658 =  ((Map) term76575).keySet();
        HashSet term76574 = new HashSet((Collection<? extends Object>) term76658);
        HashMap term76577 = new HashMap();
        Set<Object> term76659 =  ((Map) term76577).keySet();
        HashSet term76576 = new HashSet((Collection<? extends Object>) term76659);
        ArrayList term76578 = new ArrayList();
        term76556 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term76557 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term76562 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term76573 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term76557, term76557.getClass(), "defaults", null);
        setField(term76557, term76557.getClass(), "file", null);
        setField(term76557, term76557.getClass(), "basePath", null);
        setField(term76557, term76557.getClass(), "fileSeparator", "/");
        setBooleanField(term76557, term76557.getClass(), "isInitialized", false);
        setField(term76557, term76557.getClass(), "includePropertyName", null);
        setField(term76557, term76557.getClass(), "keysAsListed", term76560);
        setField(term76557, term76557.getClass(), "table", term76562);
        setIntField(term76557, term76557.getClass(), "count", 0);
        setIntField(term76557, term76557.getClass(), "threshold", 8);
        setFloatField(term76557, term76557.getClass(), "loadFactor", 0.75F);
        setIntField(term76557, term76557.getClass(), "modCount", 0);
        setField(term76557, term76557.getClass(), "keySet", null);
        setField(term76557, term76557.getClass(), "entrySet", null);
        setField(term76557, term76557.getClass(), "values", null);
        setField(term76556, term76556.getClass(), "defaults", term76557);
        setField(term76556, term76556.getClass(), "file", "vGiuZVPJNH");
        setField(term76556, term76556.getClass(), "basePath", "tlzpzIjMib");
        setField(term76556, term76556.getClass(), "fileSeparator", "/");
        setBooleanField(term76556, term76556.getClass(), "isInitialized", true);
        setField(term76556, term76556.getClass(), "includePropertyName", "AZdLeSugwv");
        setField(term76556, term76556.getClass(), "keysAsListed", term76571);
        setField(term76556, term76556.getClass(), "table", term76573);
        setIntField(term76556, term76556.getClass(), "count", 1830648570);
        setIntField(term76556, term76556.getClass(), "threshold", 8);
        setFloatField(term76556, term76556.getClass(), "loadFactor", 0.75F);
        setIntField(term76556, term76556.getClass(), "modCount", -227365013);
        setField(term76556, term76556.getClass(), "keySet", term76574);
        setField(term76556, term76556.getClass(), "entrySet", term76576);
        setField(term76556, term76556.getClass(), "values", term76578);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = "RMsXuyzKJV";
        args[1] = term27680;
        Object retValue = callMethod(klass, "getDouble", argTypes, term27588, args);
        assertTrue(recursiveEquals(term27588, term76556));
        assertTrue(recursiveEquals(term27680, 0.13238746331190498));
        assertTrue(recursiveEquals(retValue, 0.13238746331190498));
    }

};


