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

public class ExtendedProperties_getLong_2037583029113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23054;

    public ExtendedProperties_getLong_2037583029113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23060 = new ArrayList();
        ArrayList term23109 = new ArrayList();
        ((ArrayList) term23109).add("java.lang.Object@3f78cc2e");
        HashMap term23176 = new HashMap();
        Set<Object> term69045 =  ((Map) term23176).keySet();
        HashSet term23175 = new HashSet((Collection<? extends Object>) term69045);
        HashMap term23182 = new HashMap();
        Set<Object> term69046 =  ((Map) term23182).keySet();
        HashSet term23181 = new HashSet((Collection<? extends Object>) term69046);
        ArrayList term23187 = new ArrayList();
        term23054 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term23055 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term23064 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term23140 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term23141 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term23170 = newInstance(Class.forName("java.lang.Object"));
        setField(term23055, term23055.getClass(), "defaults", null);
        setField(term23055, term23055.getClass(), "file", null);
        setField(term23055, term23055.getClass(), "basePath", null);
        setField(term23055, term23055.getClass(), "fileSeparator", "/");
        setBooleanField(term23055, term23055.getClass(), "isInitialized", false);
        setField(term23055, term23055.getClass(), "includePropertyName", null);
        setField(term23055, term23055.getClass(), "keysAsListed", term23060);
        setField(term23055, term23055.getClass(), "table", term23064);
        setIntField(term23055, term23055.getClass(), "count", 0);
        setIntField(term23055, term23055.getClass(), "threshold", 8);
        setFloatField(term23055, term23055.getClass(), "loadFactor", 0.75F);
        setIntField(term23055, term23055.getClass(), "modCount", 0);
        setField(term23055, term23055.getClass(), "keySet", null);
        setField(term23055, term23055.getClass(), "entrySet", null);
        setField(term23055, term23055.getClass(), "values", null);
        setField(term23054, term23054.getClass(), "defaults", term23055);
        setField(term23054, term23054.getClass(), "file", "JmcmxoGhIK");
        setField(term23054, term23054.getClass(), "basePath", "jXzmYyrnnT");
        setField(term23054, term23054.getClass(), "fileSeparator", "/");
        setBooleanField(term23054, term23054.getClass(), "isInitialized", true);
        setField(term23054, term23054.getClass(), "includePropertyName", "igCAtimmYB");
        setField(term23054, term23054.getClass(), "keysAsListed", term23109);
        setIntField(term23141, term23141.getClass(), "hash", 992743828);
        setField(term23141, term23141.getClass(), "key", "java.lang.Object@3f78cc2e");
        setField(term23141, term23141.getClass(), "value", term23170);
        setField(term23141, term23141.getClass(), "next", null);
        setElement(term23140, 10, term23141);
        setField(term23054, term23054.getClass(), "table", term23140);
        setIntField(term23054, term23054.getClass(), "count", -1963464808);
        setIntField(term23054, term23054.getClass(), "threshold", 8);
        setFloatField(term23054, term23054.getClass(), "loadFactor", 0.75F);
        setIntField(term23054, term23054.getClass(), "modCount", 71190298);
        setField(term23054, term23054.getClass(), "keySet", term23175);
        setField(term23054, term23054.getClass(), "entrySet", term23181);
        setField(term23054, term23054.getClass(), "values", term23187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DyiXbeYIaN";
        try {
            callMethod(klass, "getLong", argTypes, term23054, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


