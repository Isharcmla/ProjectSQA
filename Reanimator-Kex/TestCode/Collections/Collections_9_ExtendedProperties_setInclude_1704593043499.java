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

public class ExtendedProperties_setInclude_1704593043499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204594;
     Object term204961;

    public ExtendedProperties_setInclude_1704593043499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204594 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term204961 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term204961, term204961.getClass(), "defaults", null);
        setField(term204961, term204961.getClass(), "file", null);
        setField(term204961, term204961.getClass(), "basePath", null);
        setField(term204961, term204961.getClass(), "fileSeparator", null);
        setBooleanField(term204961, term204961.getClass(), "isInitialized", false);
        setField(term204961, term204961.getClass(), "includePropertyName", "");
        setField(term204961, term204961.getClass(), "keysAsListed", null);
        setField(term204961, term204961.getClass(), "table", null);
        setIntField(term204961, term204961.getClass(), "count", 0);
        setIntField(term204961, term204961.getClass(), "threshold", 0);
        setFloatField(term204961, term204961.getClass(), "loadFactor", 0.0F);
        setIntField(term204961, term204961.getClass(), "modCount", 0);
        setField(term204961, term204961.getClass(), "keySet", null);
        setField(term204961, term204961.getClass(), "entrySet", null);
        setField(term204961, term204961.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setInclude", argTypes, term204594, args);
        assertTrue(recursiveEquals(term204594, term204961));
    }

};


