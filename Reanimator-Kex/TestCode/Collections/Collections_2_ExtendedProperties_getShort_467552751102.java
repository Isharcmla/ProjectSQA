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

public class ExtendedProperties_getShort_467552751102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4695;

    public ExtendedProperties_getShort_467552751102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4701 = new ArrayList();
        ArrayList term4738 = new ArrayList();
        HashMap term4768 = new HashMap();
        Set<Object> term17309 =  ((Map) term4768).keySet();
        HashSet term4767 = new HashSet((Collection<? extends Object>) term17309);
        HashMap term4774 = new HashMap();
        Set<Object> term17310 =  ((Map) term4774).keySet();
        HashSet term4773 = new HashSet((Collection<? extends Object>) term17310);
        ArrayList term4779 = new ArrayList();
        term4695 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term4696 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term4705 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term4742 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term4743 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4745 = newInstance(Class.forName("java.lang.Object"));
        Object term4746 = newInstance(Class.forName("java.lang.Object"));
        Object term4747 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4749 = newInstance(Class.forName("java.lang.Object"));
        Object term4750 = newInstance(Class.forName("java.lang.Object"));
        Object term4751 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4753 = newInstance(Class.forName("java.lang.Object"));
        Object term4754 = newInstance(Class.forName("java.lang.Object"));
        Object term4755 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4757 = newInstance(Class.forName("java.lang.Object"));
        Object term4758 = newInstance(Class.forName("java.lang.Object"));
        Object term4759 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4761 = newInstance(Class.forName("java.lang.Object"));
        Object term4762 = newInstance(Class.forName("java.lang.Object"));
        setField(term4696, term4696.getClass(), "defaults", null);
        setField(term4696, term4696.getClass(), "file", null);
        setField(term4696, term4696.getClass(), "basePath", null);
        setField(term4696, term4696.getClass(), "fileSeparator", "/");
        setBooleanField(term4696, term4696.getClass(), "isInitialized", false);
        setField(term4696, term4696.getClass(), "keysAsListed", term4701);
        setField(term4696, term4696.getClass(), "table", term4705);
        setIntField(term4696, term4696.getClass(), "count", 0);
        setIntField(term4696, term4696.getClass(), "threshold", 8);
        setFloatField(term4696, term4696.getClass(), "loadFactor", 0.75F);
        setIntField(term4696, term4696.getClass(), "modCount", 0);
        setField(term4696, term4696.getClass(), "keySet", null);
        setField(term4696, term4696.getClass(), "entrySet", null);
        setField(term4696, term4696.getClass(), "values", null);
        setField(term4695, term4695.getClass(), "defaults", term4696);
        setField(term4695, term4695.getClass(), "file", "fztQhjqwdP");
        setField(term4695, term4695.getClass(), "basePath", "eVpkWxjuki");
        setField(term4695, term4695.getClass(), "fileSeparator", "/");
        setBooleanField(term4695, term4695.getClass(), "isInitialized", true);
        setField(term4695, term4695.getClass(), "keysAsListed", term4738);
        setIntField(term4743, term4743.getClass(), "hash", 2126079231);
        setField(term4743, term4743.getClass(), "key", term4745);
        setField(term4743, term4743.getClass(), "value", term4746);
        setField(term4743, term4743.getClass(), "next", null);
        setElement(term4742, 1, term4743);
        setIntField(term4747, term4747.getClass(), "hash", 1162218599);
        setField(term4747, term4747.getClass(), "key", term4749);
        setField(term4747, term4747.getClass(), "value", term4750);
        setField(term4747, term4747.getClass(), "next", null);
        setElement(term4742, 3, term4747);
        setIntField(term4751, term4751.getClass(), "hash", 372119678);
        setField(term4751, term4751.getClass(), "key", term4753);
        setField(term4751, term4751.getClass(), "value", term4754);
        setField(term4751, term4751.getClass(), "next", null);
        setElement(term4742, 7, term4751);
        setIntField(term4755, term4755.getClass(), "hash", 1351937530);
        setField(term4755, term4755.getClass(), "key", term4757);
        setField(term4755, term4755.getClass(), "value", term4758);
        setField(term4755, term4755.getClass(), "next", null);
        setElement(term4742, 9, term4755);
        setIntField(term4759, term4759.getClass(), "hash", 1981064689);
        setField(term4759, term4759.getClass(), "key", term4761);
        setField(term4759, term4759.getClass(), "value", term4762);
        setField(term4759, term4759.getClass(), "next", null);
        setElement(term4742, 10, term4759);
        setField(term4695, term4695.getClass(), "table", term4742);
        setIntField(term4695, term4695.getClass(), "count", -1476117757);
        setIntField(term4695, term4695.getClass(), "threshold", 8);
        setFloatField(term4695, term4695.getClass(), "loadFactor", 0.75F);
        setIntField(term4695, term4695.getClass(), "modCount", -341962975);
        setField(term4695, term4695.getClass(), "keySet", term4767);
        setField(term4695, term4695.getClass(), "entrySet", term4773);
        setField(term4695, term4695.getClass(), "values", term4779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SJiQaLvSKv";
        try {
            callMethod(klass, "getShort", argTypes, term4695, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


