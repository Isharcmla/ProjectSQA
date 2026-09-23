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

public class ExtendedProperties_getInclude_1778893229426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188317;
     Object term188843;

    public ExtendedProperties_getInclude_1778893229426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188317 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term188317, term188317.getClass(), "includePropertyName", "");
        term188843 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term188843, term188843.getClass(), "defaults", null);
        setField(term188843, term188843.getClass(), "file", null);
        setField(term188843, term188843.getClass(), "basePath", null);
        setField(term188843, term188843.getClass(), "fileSeparator", null);
        setBooleanField(term188843, term188843.getClass(), "isInitialized", false);
        setField(term188843, term188843.getClass(), "includePropertyName", "");
        setField(term188843, term188843.getClass(), "keysAsListed", null);
        setField(term188843, term188843.getClass(), "table", null);
        setIntField(term188843, term188843.getClass(), "count", 0);
        setIntField(term188843, term188843.getClass(), "threshold", 0);
        setFloatField(term188843, term188843.getClass(), "loadFactor", 0.0F);
        setIntField(term188843, term188843.getClass(), "modCount", 0);
        setField(term188843, term188843.getClass(), "keySet", null);
        setField(term188843, term188843.getClass(), "entrySet", null);
        setField(term188843, term188843.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getInclude", argTypes, term188317, args);
        assertTrue(recursiveEquals(term188317, term188843));
        assertTrue(recursiveEquals(retValue, null));
    }

};


