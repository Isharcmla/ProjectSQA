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

public class ExtendedProperties_getByte_198050473599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4301;

    public ExtendedProperties_getByte_198050473599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4307 = new ArrayList();
        ArrayList term4344 = new ArrayList();
        HashMap term4354 = new HashMap();
        Set<Object> term16296 =  ((Map) term4354).keySet();
        HashSet term4353 = new HashSet((Collection<? extends Object>) term16296);
        HashMap term4360 = new HashMap();
        Set<Object> term16297 =  ((Map) term4360).keySet();
        HashSet term4359 = new HashSet((Collection<? extends Object>) term16297);
        ArrayList term4365 = new ArrayList();
        term4301 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term4302 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term4311 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term4348 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term4302, term4302.getClass(), "defaults", null);
        setField(term4302, term4302.getClass(), "file", null);
        setField(term4302, term4302.getClass(), "basePath", null);
        setField(term4302, term4302.getClass(), "fileSeparator", "/");
        setBooleanField(term4302, term4302.getClass(), "isInitialized", false);
        setField(term4302, term4302.getClass(), "keysAsListed", term4307);
        setField(term4302, term4302.getClass(), "table", term4311);
        setIntField(term4302, term4302.getClass(), "count", 0);
        setIntField(term4302, term4302.getClass(), "threshold", 8);
        setFloatField(term4302, term4302.getClass(), "loadFactor", 0.75F);
        setIntField(term4302, term4302.getClass(), "modCount", 0);
        setField(term4302, term4302.getClass(), "keySet", null);
        setField(term4302, term4302.getClass(), "entrySet", null);
        setField(term4302, term4302.getClass(), "values", null);
        setField(term4301, term4301.getClass(), "defaults", term4302);
        setField(term4301, term4301.getClass(), "file", "SPpkrGcPRr");
        setField(term4301, term4301.getClass(), "basePath", "sEccwbJKYE");
        setField(term4301, term4301.getClass(), "fileSeparator", "/");
        setBooleanField(term4301, term4301.getClass(), "isInitialized", false);
        setField(term4301, term4301.getClass(), "keysAsListed", term4344);
        setField(term4301, term4301.getClass(), "table", term4348);
        setIntField(term4301, term4301.getClass(), "count", -1347665717);
        setIntField(term4301, term4301.getClass(), "threshold", 8);
        setFloatField(term4301, term4301.getClass(), "loadFactor", 0.75F);
        setIntField(term4301, term4301.getClass(), "modCount", -1888585309);
        setField(term4301, term4301.getClass(), "keySet", term4353);
        setField(term4301, term4301.getClass(), "entrySet", term4359);
        setField(term4301, term4301.getClass(), "values", term4365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AWRooQKkdW";
        try {
            callMethod(klass, "getByte", argTypes, term4301, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


