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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;

public class ExtendedProperties_save_1801676325582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224088;
     Object term224176;
     Object term224419;
     Object term224420;

    public ExtendedProperties_save_1801676325582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224088 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term224176 = newInstance(Class.forName("java.lang.ProcessBuilder$NullOutputStream"));
        term224419 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term224419, term224419.getClass(), "defaults", null);
        setField(term224419, term224419.getClass(), "file", null);
        setField(term224419, term224419.getClass(), "basePath", null);
        setField(term224419, term224419.getClass(), "fileSeparator", null);
        setBooleanField(term224419, term224419.getClass(), "isInitialized", false);
        setField(term224419, term224419.getClass(), "includePropertyName", null);
        setField(term224419, term224419.getClass(), "keysAsListed", null);
        setField(term224419, term224419.getClass(), "table", null);
        setIntField(term224419, term224419.getClass(), "count", 0);
        setIntField(term224419, term224419.getClass(), "threshold", 0);
        setFloatField(term224419, term224419.getClass(), "loadFactor", 0.0F);
        setIntField(term224419, term224419.getClass(), "modCount", 0);
        setField(term224419, term224419.getClass(), "keySet", null);
        setField(term224419, term224419.getClass(), "entrySet", null);
        setField(term224419, term224419.getClass(), "values", null);
        term224420 = newInstance(Class.forName("java.lang.ProcessBuilder$NullOutputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term224176;
        args[1] = null;
        callMethod(klass, "save", argTypes, term224088, args);
        assertTrue(recursiveEquals(term224088, term224419));
        assertTrue(recursiveEquals(term224176, term224420));
    }

};


