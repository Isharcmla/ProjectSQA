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

public class ExtendedProperties_load_53824547376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4548;

    public ExtendedProperties_load_53824547376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4554 = new ArrayList();
        ArrayList term4603 = new ArrayList();
        ((ArrayList) term4603).add("java.lang.Object@67d26ff2");
        ((ArrayList) term4603).add("java.lang.Object@2883a474");
        HashMap term4727 = new HashMap();
        Set<Object> term37312 =  ((Map) term4727).keySet();
        HashSet term4726 = new HashSet((Collection<? extends Object>) term37312);
        HashMap term4733 = new HashMap();
        Set<Object> term37313 =  ((Map) term4733).keySet();
        HashSet term4732 = new HashSet((Collection<? extends Object>) term37313);
        ArrayList term4738 = new ArrayList();
        term4548 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term4549 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term4558 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term4661 = (Object[]) newArray("java.util.Hashtable$Entry", 47);
        Object term4662 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4691 = newInstance(Class.forName("java.lang.Object"));
        Object term4692 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term4721 = newInstance(Class.forName("java.lang.Object"));
        setField(term4549, term4549.getClass(), "defaults", null);
        setField(term4549, term4549.getClass(), "file", null);
        setField(term4549, term4549.getClass(), "basePath", null);
        setField(term4549, term4549.getClass(), "fileSeparator", "/");
        setBooleanField(term4549, term4549.getClass(), "isInitialized", false);
        setField(term4549, term4549.getClass(), "includePropertyName", null);
        setField(term4549, term4549.getClass(), "keysAsListed", term4554);
        setField(term4549, term4549.getClass(), "table", term4558);
        setIntField(term4549, term4549.getClass(), "count", 0);
        setIntField(term4549, term4549.getClass(), "threshold", 8);
        setFloatField(term4549, term4549.getClass(), "loadFactor", 0.75F);
        setIntField(term4549, term4549.getClass(), "modCount", 0);
        setField(term4549, term4549.getClass(), "keySet", null);
        setField(term4549, term4549.getClass(), "entrySet", null);
        setField(term4549, term4549.getClass(), "values", null);
        setField(term4548, term4548.getClass(), "defaults", term4549);
        setField(term4548, term4548.getClass(), "file", "IoAlmYsBwc");
        setField(term4548, term4548.getClass(), "basePath", "TEParAifyi");
        setField(term4548, term4548.getClass(), "fileSeparator", "/");
        setBooleanField(term4548, term4548.getClass(), "isInitialized", true);
        setField(term4548, term4548.getClass(), "includePropertyName", "OWDIEULEFu");
        setField(term4548, term4548.getClass(), "keysAsListed", term4603);
        setIntField(term4662, term4662.getClass(), "hash", 149674712);
        setField(term4662, term4662.getClass(), "key", "java.lang.Object@67d26ff2");
        setField(term4662, term4662.getClass(), "value", term4691);
        setField(term4662, term4662.getClass(), "next", null);
        setElement(term4661, 16, term4662);
        setIntField(term4692, term4692.getClass(), "hash", 1398344030);
        setField(term4692, term4692.getClass(), "key", "java.lang.Object@2883a474");
        setField(term4692, term4692.getClass(), "value", term4721);
        setField(term4692, term4692.getClass(), "next", null);
        setElement(term4661, 30, term4692);
        setField(term4548, term4548.getClass(), "table", term4661);
        setIntField(term4548, term4548.getClass(), "count", 1048535129);
        setIntField(term4548, term4548.getClass(), "threshold", 35);
        setFloatField(term4548, term4548.getClass(), "loadFactor", 0.75F);
        setIntField(term4548, term4548.getClass(), "modCount", -655067523);
        setField(term4548, term4548.getClass(), "keySet", term4726);
        setField(term4548, term4548.getClass(), "entrySet", term4732);
        setField(term4548, term4548.getClass(), "values", term4738);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "dWRymuLBtr";
        try {
            callMethod(klass, "load", argTypes, term4548, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


