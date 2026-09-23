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

public class ExtendedProperties_getBoolean_58765003796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4421;

    public ExtendedProperties_getBoolean_58765003796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4427 = new ArrayList();
        ArrayList term4476 = new ArrayList();
        HashMap term4486 = new HashMap();
        Set<Object> term17867 =  ((Map) term4486).keySet();
        HashSet term4485 = new HashSet((Collection<? extends Object>) term17867);
        HashMap term4492 = new HashMap();
        Set<Object> term17868 =  ((Map) term4492).keySet();
        HashSet term4491 = new HashSet((Collection<? extends Object>) term17868);
        ArrayList term4497 = new ArrayList();
        term4421 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term4422 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term4431 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term4480 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term4422, term4422.getClass(), "defaults", null);
        setField(term4422, term4422.getClass(), "file", null);
        setField(term4422, term4422.getClass(), "basePath", null);
        setField(term4422, term4422.getClass(), "fileSeparator", "/");
        setBooleanField(term4422, term4422.getClass(), "isInitialized", false);
        setField(term4422, term4422.getClass(), "includePropertyName", null);
        setField(term4422, term4422.getClass(), "keysAsListed", term4427);
        setField(term4422, term4422.getClass(), "table", term4431);
        setIntField(term4422, term4422.getClass(), "count", 0);
        setIntField(term4422, term4422.getClass(), "threshold", 8);
        setFloatField(term4422, term4422.getClass(), "loadFactor", 0.75F);
        setIntField(term4422, term4422.getClass(), "modCount", 0);
        setField(term4422, term4422.getClass(), "keySet", null);
        setField(term4422, term4422.getClass(), "entrySet", null);
        setField(term4422, term4422.getClass(), "values", null);
        setField(term4421, term4421.getClass(), "defaults", term4422);
        setField(term4421, term4421.getClass(), "file", "XylxrMBraH");
        setField(term4421, term4421.getClass(), "basePath", "pORebkoRdD");
        setField(term4421, term4421.getClass(), "fileSeparator", "/");
        setBooleanField(term4421, term4421.getClass(), "isInitialized", true);
        setField(term4421, term4421.getClass(), "includePropertyName", "mXGCWJDOqA");
        setField(term4421, term4421.getClass(), "keysAsListed", term4476);
        setField(term4421, term4421.getClass(), "table", term4480);
        setIntField(term4421, term4421.getClass(), "count", 1114000454);
        setIntField(term4421, term4421.getClass(), "threshold", 8);
        setFloatField(term4421, term4421.getClass(), "loadFactor", 0.75F);
        setIntField(term4421, term4421.getClass(), "modCount", -556405712);
        setField(term4421, term4421.getClass(), "keySet", term4485);
        setField(term4421, term4421.getClass(), "entrySet", term4491);
        setField(term4421, term4421.getClass(), "values", term4497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dpNsDgfPso";
        try {
            callMethod(klass, "getBoolean", argTypes, term4421, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


