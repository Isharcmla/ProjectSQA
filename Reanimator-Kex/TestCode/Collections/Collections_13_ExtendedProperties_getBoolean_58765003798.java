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

public class ExtendedProperties_getBoolean_58765003798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13802;

    public ExtendedProperties_getBoolean_58765003798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13808 = new ArrayList();
        ArrayList term13857 = new ArrayList();
        HashMap term13867 = new HashMap();
        Set<Object> term52196 =  ((Map) term13867).keySet();
        HashSet term13866 = new HashSet((Collection<? extends Object>) term52196);
        HashMap term13873 = new HashMap();
        Set<Object> term52197 =  ((Map) term13873).keySet();
        HashSet term13872 = new HashSet((Collection<? extends Object>) term52197);
        ArrayList term13878 = new ArrayList();
        term13802 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term13803 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term13812 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term13861 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term13803, term13803.getClass(), "defaults", null);
        setField(term13803, term13803.getClass(), "file", null);
        setField(term13803, term13803.getClass(), "basePath", null);
        setField(term13803, term13803.getClass(), "fileSeparator", "/");
        setBooleanField(term13803, term13803.getClass(), "isInitialized", false);
        setField(term13803, term13803.getClass(), "includePropertyName", null);
        setField(term13803, term13803.getClass(), "keysAsListed", term13808);
        setField(term13803, term13803.getClass(), "table", term13812);
        setIntField(term13803, term13803.getClass(), "count", 0);
        setIntField(term13803, term13803.getClass(), "threshold", 8);
        setFloatField(term13803, term13803.getClass(), "loadFactor", 0.75F);
        setIntField(term13803, term13803.getClass(), "modCount", 0);
        setField(term13803, term13803.getClass(), "keySet", null);
        setField(term13803, term13803.getClass(), "entrySet", null);
        setField(term13803, term13803.getClass(), "values", null);
        setField(term13802, term13802.getClass(), "defaults", term13803);
        setField(term13802, term13802.getClass(), "file", "XylxrMBraH");
        setField(term13802, term13802.getClass(), "basePath", "pORebkoRdD");
        setField(term13802, term13802.getClass(), "fileSeparator", "/");
        setBooleanField(term13802, term13802.getClass(), "isInitialized", true);
        setField(term13802, term13802.getClass(), "includePropertyName", "mXGCWJDOqA");
        setField(term13802, term13802.getClass(), "keysAsListed", term13857);
        setField(term13802, term13802.getClass(), "table", term13861);
        setIntField(term13802, term13802.getClass(), "count", 1114000454);
        setIntField(term13802, term13802.getClass(), "threshold", 8);
        setFloatField(term13802, term13802.getClass(), "loadFactor", 0.75F);
        setIntField(term13802, term13802.getClass(), "modCount", -556405712);
        setField(term13802, term13802.getClass(), "keySet", term13866);
        setField(term13802, term13802.getClass(), "entrySet", term13872);
        setField(term13802, term13802.getClass(), "values", term13878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dpNsDgfPso";
        try {
            callMethod(klass, "getBoolean", argTypes, term13802, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


