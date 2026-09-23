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

public class ExtendedProperties_getInclude_1778893229148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82315;
     Object term82618;

    public ExtendedProperties_getInclude_1778893229148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82315 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term82315, term82315.getClass(), "includePropertyName", "");
        term82618 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term82618, term82618.getClass(), "defaults", null);
        setField(term82618, term82618.getClass(), "file", null);
        setField(term82618, term82618.getClass(), "basePath", null);
        setField(term82618, term82618.getClass(), "fileSeparator", null);
        setBooleanField(term82618, term82618.getClass(), "isInitialized", false);
        setField(term82618, term82618.getClass(), "includePropertyName", "");
        setField(term82618, term82618.getClass(), "keysAsListed", null);
        setField(term82618, term82618.getClass(), "table", null);
        setIntField(term82618, term82618.getClass(), "count", 0);
        setIntField(term82618, term82618.getClass(), "threshold", 0);
        setFloatField(term82618, term82618.getClass(), "loadFactor", 0.0F);
        setIntField(term82618, term82618.getClass(), "modCount", 0);
        setField(term82618, term82618.getClass(), "keySet", null);
        setField(term82618, term82618.getClass(), "entrySet", null);
        setField(term82618, term82618.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getInclude", argTypes, term82315, args);
        assertTrue(recursiveEquals(term82315, term82618));
        assertTrue(recursiveEquals(retValue, null));
    }

};


