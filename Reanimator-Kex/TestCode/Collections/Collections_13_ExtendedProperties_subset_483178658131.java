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
import java.util.ArrayList;
import java.lang.Object;

public class ExtendedProperties_subset_483178658131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79896;
     Object term80025;

    public ExtendedProperties_subset_483178658131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term79986 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term79948 = new ArrayList();
        ((ArrayList) term79948).add(term79986);
        term79896 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term79896, term79896.getClass(), "keysAsListed", term79948);
        Object term80028 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term80026 = new ArrayList();
        ((ArrayList) term80026).add(term80028);
        term80025 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term80025, term80025.getClass(), "defaults", null);
        setField(term80025, term80025.getClass(), "file", null);
        setField(term80025, term80025.getClass(), "basePath", null);
        setField(term80025, term80025.getClass(), "fileSeparator", null);
        setBooleanField(term80025, term80025.getClass(), "isInitialized", false);
        setField(term80025, term80025.getClass(), "includePropertyName", null);
        setField(term80025, term80025.getClass(), "keysAsListed", term80026);
        setField(term80025, term80025.getClass(), "table", null);
        setIntField(term80025, term80025.getClass(), "count", 0);
        setIntField(term80025, term80025.getClass(), "threshold", 0);
        setFloatField(term80025, term80025.getClass(), "loadFactor", 0.0F);
        setIntField(term80025, term80025.getClass(), "modCount", 0);
        setField(term80025, term80025.getClass(), "keySet", null);
        setField(term80025, term80025.getClass(), "entrySet", null);
        setField(term80025, term80025.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "subset", argTypes, term79896, args);
        assertTrue(recursiveEquals(term79896, term80025));
        assertTrue(recursiveEquals(retValue, null));
    }

};


