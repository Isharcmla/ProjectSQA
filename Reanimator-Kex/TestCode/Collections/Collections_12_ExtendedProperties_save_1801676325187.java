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

public class ExtendedProperties_save_1801676325187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119710;
     Object term119776;
     Object term120042;
     Object term120043;

    public ExtendedProperties_save_1801676325187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119710 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term119776 = newInstance(Class.forName("java.util.zip.GZIPOutputStream"));
        term120042 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term120042, term120042.getClass(), "defaults", null);
        setField(term120042, term120042.getClass(), "file", null);
        setField(term120042, term120042.getClass(), "basePath", null);
        setField(term120042, term120042.getClass(), "fileSeparator", null);
        setBooleanField(term120042, term120042.getClass(), "isInitialized", false);
        setField(term120042, term120042.getClass(), "includePropertyName", null);
        setField(term120042, term120042.getClass(), "keysAsListed", null);
        setField(term120042, term120042.getClass(), "table", null);
        setIntField(term120042, term120042.getClass(), "count", 0);
        setIntField(term120042, term120042.getClass(), "threshold", 0);
        setFloatField(term120042, term120042.getClass(), "loadFactor", 0.0F);
        setIntField(term120042, term120042.getClass(), "modCount", 0);
        setField(term120042, term120042.getClass(), "keySet", null);
        setField(term120042, term120042.getClass(), "entrySet", null);
        setField(term120042, term120042.getClass(), "values", null);
        term120043 = newInstance(Class.forName("java.util.zip.GZIPOutputStream"));
        setField(term120043, term120043.getClass(), "crc", null);
        setField(term120043, term120043.getClass(), "def", null);
        setField(term120043, term120043.getClass(), "buf", null);
        setBooleanField(term120043, term120043.getClass(), "closed", false);
        setBooleanField(term120043, term120043.getClass(), "syncFlush", false);
        setBooleanField(term120043, term120043.getClass(), "usesDefaultDeflater", false);
        setField(term120043, term120043.getClass(), "out", null);
        setField(term120043, term120043.getClass(), "closeLock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term119776;
        args[1] = null;
        callMethod(klass, "save", argTypes, term119710, args);
        assertTrue(recursiveEquals(term119710, term120042));
        assertTrue(recursiveEquals(term119776, term120043));
    }

};


