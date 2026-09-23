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

public class ExtendedProperties_save_1801676325140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81245;
     Object term81309;
     Object term81454;
     Object term81455;

    public ExtendedProperties_save_1801676325140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81245 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term81309 = newInstance(Class.forName("java.util.zip.ZipOutputStream"));
        term81454 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term81454, term81454.getClass(), "defaults", null);
        setField(term81454, term81454.getClass(), "file", null);
        setField(term81454, term81454.getClass(), "basePath", null);
        setField(term81454, term81454.getClass(), "fileSeparator", null);
        setBooleanField(term81454, term81454.getClass(), "isInitialized", false);
        setField(term81454, term81454.getClass(), "includePropertyName", null);
        setField(term81454, term81454.getClass(), "keysAsListed", null);
        setField(term81454, term81454.getClass(), "table", null);
        setIntField(term81454, term81454.getClass(), "count", 0);
        setIntField(term81454, term81454.getClass(), "threshold", 0);
        setFloatField(term81454, term81454.getClass(), "loadFactor", 0.0F);
        setIntField(term81454, term81454.getClass(), "modCount", 0);
        setField(term81454, term81454.getClass(), "keySet", null);
        setField(term81454, term81454.getClass(), "entrySet", null);
        setField(term81454, term81454.getClass(), "values", null);
        term81455 = newInstance(Class.forName("java.util.zip.ZipOutputStream"));
        setField(term81455, term81455.getClass(), "current", null);
        setField(term81455, term81455.getClass(), "xentries", null);
        setField(term81455, term81455.getClass(), "names", null);
        setField(term81455, term81455.getClass(), "crc", null);
        setLongField(term81455, term81455.getClass(), "written", 0L);
        setLongField(term81455, term81455.getClass(), "locoff", 0L);
        setField(term81455, term81455.getClass(), "comment", null);
        setIntField(term81455, term81455.getClass(), "method", 0);
        setBooleanField(term81455, term81455.getClass(), "finished", false);
        setBooleanField(term81455, term81455.getClass(), "closed", false);
        setField(term81455, term81455.getClass(), "zc", null);
        setField(term81455, term81455.getClass(), "def", null);
        setField(term81455, term81455.getClass(), "buf", null);
        setBooleanField(term81455, term81455.getClass(), "syncFlush", false);
        setBooleanField(term81455, term81455.getClass(), "usesDefaultDeflater", false);
        setField(term81455, term81455.getClass(), "out", null);
        setField(term81455, term81455.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term81309;
        args[1] = null;
        callMethod(klass, "save", argTypes, term81245, args);
        assertTrue(recursiveEquals(term81245, term81454));
        assertTrue(recursiveEquals(term81309, term81455));
    }

};


