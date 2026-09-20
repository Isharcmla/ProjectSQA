package org.joda.time.field;

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
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.field.EqualityUtils.*;
import java.lang.Object;

public class UnsupportedDurationField_equals_72423379979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14458;
     Object term14672;
     Object term14811;
     Object term14813;

    public UnsupportedDurationField_equals_72423379979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14458 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term14578 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term14458, term14458.getClass(), "iType", term14578);
        term14672 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term14792 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term14792, term14792.getClass(), "iName", null);
        setField(term14672, term14672.getClass(), "iType", term14792);
        term14811 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term14812 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setByteField(term14812, term14812.getClass(), "iOrdinal", (byte) 0);
        setField(term14812, term14812.getClass(), "iName", null);
        setField(term14811, term14811.getClass(), "iType", term14812);
        term14813 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term14814 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setByteField(term14814, term14814.getClass(), "iOrdinal", (byte) 0);
        setField(term14814, term14814.getClass(), "iName", null);
        setField(term14813, term14813.getClass(), "iType", term14814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14672;
        Object retValue = callMethod(klass, "equals", argTypes, term14458, args);
        assertTrue(recursiveEquals(term14458, term14811));
        assertTrue(recursiveEquals(term14672, term14813));
        assertTrue(recursiveEquals(retValue, true));
    }

};
