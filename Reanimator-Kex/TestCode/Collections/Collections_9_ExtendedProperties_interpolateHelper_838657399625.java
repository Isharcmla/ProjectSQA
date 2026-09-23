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

public class ExtendedProperties_interpolateHelper_838657399625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234031;
     Object term234121;
     Object term234142;
     Object term234145;

    public ExtendedProperties_interpolateHelper_838657399625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234031 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term234121 = new ArrayList();
        term234142 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term234142, term234142.getClass(), "defaults", null);
        setField(term234142, term234142.getClass(), "file", null);
        setField(term234142, term234142.getClass(), "basePath", null);
        setField(term234142, term234142.getClass(), "fileSeparator", null);
        setBooleanField(term234142, term234142.getClass(), "isInitialized", false);
        setField(term234142, term234142.getClass(), "includePropertyName", null);
        setField(term234142, term234142.getClass(), "keysAsListed", null);
        setField(term234142, term234142.getClass(), "table", null);
        setIntField(term234142, term234142.getClass(), "count", 0);
        setIntField(term234142, term234142.getClass(), "threshold", 0);
        setFloatField(term234142, term234142.getClass(), "loadFactor", 0.0F);
        setIntField(term234142, term234142.getClass(), "modCount", 0);
        setField(term234142, term234142.getClass(), "keySet", null);
        setField(term234142, term234142.getClass(), "entrySet", null);
        setField(term234142, term234142.getClass(), "values", null);
        term234145 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term234121;
        Object retValue = callMethod(klass, "interpolateHelper", argTypes, term234031, args);
        assertTrue(recursiveEquals(term234031, term234142));
        assertTrue(recursiveEquals(term234121, term234145));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


