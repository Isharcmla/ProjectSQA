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
     Object term14006;

    public ExtendedProperties_getBoolean_58765003798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14012 = new ArrayList();
        ArrayList term14061 = new ArrayList();
        HashMap term14071 = new HashMap();
        Set<Object> term52835 =  ((Map) term14071).keySet();
        HashSet term14070 = new HashSet((Collection<? extends Object>) term52835);
        HashMap term14077 = new HashMap();
        Set<Object> term52836 =  ((Map) term14077).keySet();
        HashSet term14076 = new HashSet((Collection<? extends Object>) term52836);
        ArrayList term14082 = new ArrayList();
        term14006 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term14007 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term14016 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term14065 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term14007, term14007.getClass(), "defaults", null);
        setField(term14007, term14007.getClass(), "file", null);
        setField(term14007, term14007.getClass(), "basePath", null);
        setField(term14007, term14007.getClass(), "fileSeparator", "/");
        setBooleanField(term14007, term14007.getClass(), "isInitialized", false);
        setField(term14007, term14007.getClass(), "includePropertyName", null);
        setField(term14007, term14007.getClass(), "keysAsListed", term14012);
        setField(term14007, term14007.getClass(), "table", term14016);
        setIntField(term14007, term14007.getClass(), "count", 0);
        setIntField(term14007, term14007.getClass(), "threshold", 8);
        setFloatField(term14007, term14007.getClass(), "loadFactor", 0.75F);
        setIntField(term14007, term14007.getClass(), "modCount", 0);
        setField(term14007, term14007.getClass(), "keySet", null);
        setField(term14007, term14007.getClass(), "entrySet", null);
        setField(term14007, term14007.getClass(), "values", null);
        setField(term14006, term14006.getClass(), "defaults", term14007);
        setField(term14006, term14006.getClass(), "file", "XylxrMBraH");
        setField(term14006, term14006.getClass(), "basePath", "pORebkoRdD");
        setField(term14006, term14006.getClass(), "fileSeparator", "/");
        setBooleanField(term14006, term14006.getClass(), "isInitialized", true);
        setField(term14006, term14006.getClass(), "includePropertyName", "mXGCWJDOqA");
        setField(term14006, term14006.getClass(), "keysAsListed", term14061);
        setField(term14006, term14006.getClass(), "table", term14065);
        setIntField(term14006, term14006.getClass(), "count", 1114000454);
        setIntField(term14006, term14006.getClass(), "threshold", 8);
        setFloatField(term14006, term14006.getClass(), "loadFactor", 0.75F);
        setIntField(term14006, term14006.getClass(), "modCount", -556405712);
        setField(term14006, term14006.getClass(), "keySet", term14070);
        setField(term14006, term14006.getClass(), "entrySet", term14076);
        setField(term14006, term14006.getClass(), "values", term14082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dpNsDgfPso";
        try {
            callMethod(klass, "getBoolean", argTypes, term14006, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


