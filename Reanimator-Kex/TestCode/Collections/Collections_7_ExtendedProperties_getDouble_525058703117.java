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
import java.util.NoSuchElementException;
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ExtendedProperties_getDouble_525058703117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7695;

    public ExtendedProperties_getDouble_525058703117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7701 = new ArrayList();
        ArrayList term7750 = new ArrayList();
        HashMap term7780 = new HashMap();
        Set<Object> term25526 =  ((Map) term7780).keySet();
        HashSet term7779 = new HashSet((Collection<? extends Object>) term25526);
        HashMap term7786 = new HashMap();
        Set<Object> term25527 =  ((Map) term7786).keySet();
        HashSet term7785 = new HashSet((Collection<? extends Object>) term25527);
        ArrayList term7791 = new ArrayList();
        term7695 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term7696 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term7705 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term7754 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term7755 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7757 = newInstance(Class.forName("java.lang.Object"));
        Object term7758 = newInstance(Class.forName("java.lang.Object"));
        Object term7759 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7761 = newInstance(Class.forName("java.lang.Object"));
        Object term7762 = newInstance(Class.forName("java.lang.Object"));
        Object term7763 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7765 = newInstance(Class.forName("java.lang.Object"));
        Object term7766 = newInstance(Class.forName("java.lang.Object"));
        Object term7767 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7769 = newInstance(Class.forName("java.lang.Object"));
        Object term7770 = newInstance(Class.forName("java.lang.Object"));
        Object term7771 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term7773 = newInstance(Class.forName("java.lang.Object"));
        Object term7774 = newInstance(Class.forName("java.lang.Object"));
        setField(term7696, term7696.getClass(), "defaults", null);
        setField(term7696, term7696.getClass(), "file", null);
        setField(term7696, term7696.getClass(), "basePath", null);
        setField(term7696, term7696.getClass(), "fileSeparator", "/");
        setBooleanField(term7696, term7696.getClass(), "isInitialized", false);
        setField(term7696, term7696.getClass(), "includePropertyName", null);
        setField(term7696, term7696.getClass(), "keysAsListed", term7701);
        setField(term7696, term7696.getClass(), "table", term7705);
        setIntField(term7696, term7696.getClass(), "count", 0);
        setIntField(term7696, term7696.getClass(), "threshold", 8);
        setFloatField(term7696, term7696.getClass(), "loadFactor", 0.75F);
        setIntField(term7696, term7696.getClass(), "modCount", 0);
        setField(term7696, term7696.getClass(), "keySet", null);
        setField(term7696, term7696.getClass(), "entrySet", null);
        setField(term7696, term7696.getClass(), "values", null);
        setField(term7695, term7695.getClass(), "defaults", term7696);
        setField(term7695, term7695.getClass(), "file", "nhoHrZfnIN");
        setField(term7695, term7695.getClass(), "basePath", "ZkMALXpEAZ");
        setField(term7695, term7695.getClass(), "fileSeparator", "/");
        setBooleanField(term7695, term7695.getClass(), "isInitialized", false);
        setField(term7695, term7695.getClass(), "includePropertyName", "tXfQjSqDzN");
        setField(term7695, term7695.getClass(), "keysAsListed", term7750);
        setIntField(term7755, term7755.getClass(), "hash", 959354165);
        setField(term7755, term7755.getClass(), "key", term7757);
        setField(term7755, term7755.getClass(), "value", term7758);
        setField(term7755, term7755.getClass(), "next", null);
        setElement(term7754, 0, term7755);
        setIntField(term7759, term7759.getClass(), "hash", 1407586755);
        setField(term7759, term7759.getClass(), "key", term7761);
        setField(term7759, term7759.getClass(), "value", term7762);
        setField(term7759, term7759.getClass(), "next", null);
        setElement(term7754, 3, term7759);
        setIntField(term7763, term7763.getClass(), "hash", 1512435643);
        setField(term7763, term7763.getClass(), "key", term7765);
        setField(term7763, term7763.getClass(), "value", term7766);
        setIntField(term7767, term7767.getClass(), "hash", 786977778);
        setField(term7767, term7767.getClass(), "key", term7769);
        setField(term7767, term7767.getClass(), "value", term7770);
        setField(term7767, term7767.getClass(), "next", null);
        setField(term7763, term7763.getClass(), "next", term7767);
        setElement(term7754, 4, term7763);
        setIntField(term7771, term7771.getClass(), "hash", 1432985912);
        setField(term7771, term7771.getClass(), "key", term7773);
        setField(term7771, term7771.getClass(), "value", term7774);
        setField(term7771, term7771.getClass(), "next", null);
        setElement(term7754, 6, term7771);
        setField(term7695, term7695.getClass(), "table", term7754);
        setIntField(term7695, term7695.getClass(), "count", -1498296047);
        setIntField(term7695, term7695.getClass(), "threshold", 8);
        setFloatField(term7695, term7695.getClass(), "loadFactor", 0.75F);
        setIntField(term7695, term7695.getClass(), "modCount", 2098647994);
        setField(term7695, term7695.getClass(), "keySet", term7779);
        setField(term7695, term7695.getClass(), "entrySet", term7785);
        setField(term7695, term7695.getClass(), "values", term7791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BjugTaMcxJ";
        try {
            callMethod(klass, "getDouble", argTypes, term7695, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


