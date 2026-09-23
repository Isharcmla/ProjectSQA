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

public class ExtendedProperties_getBoolean_58765003795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3779;

    public ExtendedProperties_getBoolean_58765003795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3785 = new ArrayList();
        ArrayList term3822 = new ArrayList();
        HashMap term3832 = new HashMap();
        Set<Object> term15117 =  ((Map) term3832).keySet();
        HashSet term3831 = new HashSet((Collection<? extends Object>) term15117);
        HashMap term3838 = new HashMap();
        Set<Object> term15118 =  ((Map) term3838).keySet();
        HashSet term3837 = new HashSet((Collection<? extends Object>) term15118);
        ArrayList term3843 = new ArrayList();
        term3779 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term3780 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term3789 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term3826 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term3780, term3780.getClass(), "defaults", null);
        setField(term3780, term3780.getClass(), "file", null);
        setField(term3780, term3780.getClass(), "basePath", null);
        setField(term3780, term3780.getClass(), "fileSeparator", "/");
        setBooleanField(term3780, term3780.getClass(), "isInitialized", false);
        setField(term3780, term3780.getClass(), "keysAsListed", term3785);
        setField(term3780, term3780.getClass(), "table", term3789);
        setIntField(term3780, term3780.getClass(), "count", 0);
        setIntField(term3780, term3780.getClass(), "threshold", 8);
        setFloatField(term3780, term3780.getClass(), "loadFactor", 0.75F);
        setIntField(term3780, term3780.getClass(), "modCount", 0);
        setField(term3780, term3780.getClass(), "keySet", null);
        setField(term3780, term3780.getClass(), "entrySet", null);
        setField(term3780, term3780.getClass(), "values", null);
        setField(term3779, term3779.getClass(), "defaults", term3780);
        setField(term3779, term3779.getClass(), "file", "PkWMRdJcBb");
        setField(term3779, term3779.getClass(), "basePath", "jSpAteRute");
        setField(term3779, term3779.getClass(), "fileSeparator", "/");
        setBooleanField(term3779, term3779.getClass(), "isInitialized", true);
        setField(term3779, term3779.getClass(), "keysAsListed", term3822);
        setField(term3779, term3779.getClass(), "table", term3826);
        setIntField(term3779, term3779.getClass(), "count", 1114000454);
        setIntField(term3779, term3779.getClass(), "threshold", 8);
        setFloatField(term3779, term3779.getClass(), "loadFactor", 0.75F);
        setIntField(term3779, term3779.getClass(), "modCount", -556405712);
        setField(term3779, term3779.getClass(), "keySet", term3831);
        setField(term3779, term3779.getClass(), "entrySet", term3837);
        setField(term3779, term3779.getClass(), "values", term3843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "swZVeJAxjt";
        try {
            callMethod(klass, "getBoolean", argTypes, term3779, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


