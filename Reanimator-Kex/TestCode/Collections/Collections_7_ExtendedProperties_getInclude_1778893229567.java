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

public class ExtendedProperties_getInclude_1778893229567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146068;
     Object term146692;

    public ExtendedProperties_getInclude_1778893229567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146068 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term146068, term146068.getClass(), "includePropertyName", "");
        term146692 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term146692, term146692.getClass(), "defaults", null);
        setField(term146692, term146692.getClass(), "file", null);
        setField(term146692, term146692.getClass(), "basePath", null);
        setField(term146692, term146692.getClass(), "fileSeparator", null);
        setBooleanField(term146692, term146692.getClass(), "isInitialized", false);
        setField(term146692, term146692.getClass(), "includePropertyName", "");
        setField(term146692, term146692.getClass(), "keysAsListed", null);
        setField(term146692, term146692.getClass(), "table", null);
        setIntField(term146692, term146692.getClass(), "count", 0);
        setIntField(term146692, term146692.getClass(), "threshold", 0);
        setFloatField(term146692, term146692.getClass(), "loadFactor", 0.0F);
        setIntField(term146692, term146692.getClass(), "modCount", 0);
        setField(term146692, term146692.getClass(), "keySet", null);
        setField(term146692, term146692.getClass(), "entrySet", null);
        setField(term146692, term146692.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getInclude", argTypes, term146068, args);
        assertTrue(recursiveEquals(term146068, term146692));
        assertTrue(recursiveEquals(retValue, null));
    }

};


