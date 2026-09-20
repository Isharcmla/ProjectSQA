package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.lang.Object;

public class Flat3Map_get_229621781799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162708;
     Object term162832;
     Object term162902;
     Object term162905;

    public Flat3Map_get_229621781799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162708 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term162756 = newInstance(Class.forName("java.util.jar.JarFile"));
        Object term162794 = newInstance(Class.forName("java.lang.Object"));
        setField(term162708, term162708.getClass(), "delegateMap", null);
        setIntField(term162708, term162708.getClass(), "size", 2);
        setIntField(term162708, term162708.getClass(), "hash2", 0);
        setField(term162708, term162708.getClass(), "key2", term162756);
        setIntField(term162708, term162708.getClass(), "hash1", 0);
        setField(term162708, term162708.getClass(), "key1", term162794);
        term162832 = newInstance(Class.forName("java.lang.Object"));
        term162902 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term162903 = newInstance(Class.forName("java.lang.Object"));
        Object term162904 = newInstance(Class.forName("java.util.jar.JarFile"));
        setIntField(term162902, term162902.getClass(), "size", 2);
        setIntField(term162902, term162902.getClass(), "hash1", 0);
        setIntField(term162902, term162902.getClass(), "hash2", 0);
        setIntField(term162902, term162902.getClass(), "hash3", 0);
        setField(term162902, term162902.getClass(), "key1", term162903);
        setField(term162904, term162904.getClass(), "manRef", null);
        setField(term162904, term162904.getClass(), "manEntry", null);
        setField(term162904, term162904.getClass(), "jv", null);
        setBooleanField(term162904, term162904.getClass(), "jvInitialized", false);
        setBooleanField(term162904, term162904.getClass(), "verify", false);
        setField(term162904, term162904.getClass(), "version", null);
        setIntField(term162904, term162904.getClass(), "versionFeature", 0);
        setBooleanField(term162904, term162904.getClass(), "isMultiRelease", false);
        setBooleanField(term162904, term162904.getClass(), "hasClassPathAttribute", false);
        setBooleanField(term162904, term162904.getClass(), "hasCheckedSpecialAttributes", false);
        setField(term162904, term162904.getClass(), "name", null);
        setBooleanField(term162904, term162904.getClass(), "closeRequested", false);
        setField(term162904, term162904.getClass(), "zc", null);
        setField(term162904, term162904.getClass(), "res", null);
        setField(term162904, term162904.getClass(), "lastEntryName", null);
        setIntField(term162904, term162904.getClass(), "lastEntryPos", 0);
        setField(term162902, term162902.getClass(), "key2", term162904);
        setField(term162902, term162902.getClass(), "key3", null);
        setField(term162902, term162902.getClass(), "value1", null);
        setField(term162902, term162902.getClass(), "value2", null);
        setField(term162902, term162902.getClass(), "value3", null);
        setField(term162902, term162902.getClass(), "delegateMap", null);
        term162905 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term162832;
        Object retValue = callMethod(klass, "get", argTypes, term162708, args);
        assertTrue(recursiveEquals(term162708, term162902));
        assertTrue(recursiveEquals(term162832, term162905));
        assertTrue(recursiveEquals(retValue, null));
    }

};
