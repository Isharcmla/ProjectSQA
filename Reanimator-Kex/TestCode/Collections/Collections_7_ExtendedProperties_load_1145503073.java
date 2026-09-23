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
import java.lang.NullPointerException;
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ExtendedProperties_load_1145503073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940;

    public ExtendedProperties_load_1145503073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term946 = new ArrayList();
        ArrayList term995 = new ArrayList();
        HashMap term1017 = new HashMap();
        Set<Object> term11444 =  ((Map) term1017).keySet();
        HashSet term1016 = new HashSet((Collection<? extends Object>) term11444);
        HashMap term1023 = new HashMap();
        Set<Object> term11445 =  ((Map) term1023).keySet();
        HashSet term1022 = new HashSet((Collection<? extends Object>) term11445);
        ArrayList term1028 = new ArrayList();
        term940 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term941 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term950 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term999 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term1000 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1002 = newInstance(Class.forName("java.lang.Object"));
        Object term1003 = newInstance(Class.forName("java.lang.Object"));
        Object term1004 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1006 = newInstance(Class.forName("java.lang.Object"));
        Object term1007 = newInstance(Class.forName("java.lang.Object"));
        Object term1008 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term1010 = newInstance(Class.forName("java.lang.Object"));
        Object term1011 = newInstance(Class.forName("java.lang.Object"));
        setField(term941, term941.getClass(), "defaults", null);
        setField(term941, term941.getClass(), "file", null);
        setField(term941, term941.getClass(), "basePath", null);
        setField(term941, term941.getClass(), "fileSeparator", "/");
        setBooleanField(term941, term941.getClass(), "isInitialized", false);
        setField(term941, term941.getClass(), "includePropertyName", null);
        setField(term941, term941.getClass(), "keysAsListed", term946);
        setField(term941, term941.getClass(), "table", term950);
        setIntField(term941, term941.getClass(), "count", 0);
        setIntField(term941, term941.getClass(), "threshold", 8);
        setFloatField(term941, term941.getClass(), "loadFactor", 0.75F);
        setIntField(term941, term941.getClass(), "modCount", 0);
        setField(term941, term941.getClass(), "keySet", null);
        setField(term941, term941.getClass(), "entrySet", null);
        setField(term941, term941.getClass(), "values", null);
        setField(term940, term940.getClass(), "defaults", term941);
        setField(term940, term940.getClass(), "file", "vrQLuWIDJX");
        setField(term940, term940.getClass(), "basePath", "flxyYxBRtu");
        setField(term940, term940.getClass(), "fileSeparator", "/");
        setBooleanField(term940, term940.getClass(), "isInitialized", true);
        setField(term940, term940.getClass(), "includePropertyName", "OclPbYPkcH");
        setField(term940, term940.getClass(), "keysAsListed", term995);
        setIntField(term1000, term1000.getClass(), "hash", 885321322);
        setField(term1000, term1000.getClass(), "key", term1002);
        setField(term1000, term1000.getClass(), "value", term1003);
        setField(term1000, term1000.getClass(), "next", null);
        setElement(term999, 6, term1000);
        setIntField(term1004, term1004.getClass(), "hash", 1694446135);
        setField(term1004, term1004.getClass(), "key", term1006);
        setField(term1004, term1004.getClass(), "value", term1007);
        setField(term1004, term1004.getClass(), "next", null);
        setElement(term999, 8, term1004);
        setIntField(term1008, term1008.getClass(), "hash", 469686270);
        setField(term1008, term1008.getClass(), "key", term1010);
        setField(term1008, term1008.getClass(), "value", term1011);
        setField(term1008, term1008.getClass(), "next", null);
        setElement(term999, 9, term1008);
        setField(term940, term940.getClass(), "table", term999);
        setIntField(term940, term940.getClass(), "count", -1685132339);
        setIntField(term940, term940.getClass(), "threshold", 8);
        setFloatField(term940, term940.getClass(), "loadFactor", 0.75F);
        setIntField(term940, term940.getClass(), "modCount", -1456670394);
        setField(term940, term940.getClass(), "keySet", term1016);
        setField(term940, term940.getClass(), "entrySet", term1022);
        setField(term940, term940.getClass(), "values", term1028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "load", argTypes, term940, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


