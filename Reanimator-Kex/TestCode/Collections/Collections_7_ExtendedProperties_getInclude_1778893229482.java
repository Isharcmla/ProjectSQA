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

public class ExtendedProperties_getInclude_1778893229482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127904;
     Object term128150;

    public ExtendedProperties_getInclude_1778893229482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127904 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term127904, term127904.getClass(), "includePropertyName", null);
        term128150 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term128150, term128150.getClass(), "defaults", null);
        setField(term128150, term128150.getClass(), "file", null);
        setField(term128150, term128150.getClass(), "basePath", null);
        setField(term128150, term128150.getClass(), "fileSeparator", null);
        setBooleanField(term128150, term128150.getClass(), "isInitialized", false);
        setField(term128150, term128150.getClass(), "includePropertyName", null);
        setField(term128150, term128150.getClass(), "keysAsListed", null);
        setField(term128150, term128150.getClass(), "table", null);
        setIntField(term128150, term128150.getClass(), "count", 0);
        setIntField(term128150, term128150.getClass(), "threshold", 0);
        setFloatField(term128150, term128150.getClass(), "loadFactor", 0.0F);
        setIntField(term128150, term128150.getClass(), "modCount", 0);
        setField(term128150, term128150.getClass(), "keySet", null);
        setField(term128150, term128150.getClass(), "entrySet", null);
        setField(term128150, term128150.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getInclude", argTypes, term127904, args);
        assertTrue(recursiveEquals(term127904, term128150));
        assertTrue(recursiveEquals(retValue, "include"));
    }

};


