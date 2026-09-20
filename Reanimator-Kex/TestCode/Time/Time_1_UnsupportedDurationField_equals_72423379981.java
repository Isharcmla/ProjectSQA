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

public class UnsupportedDurationField_equals_72423379981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14935;
     Object term15149;
     Object term15343;
     Object term15345;

    public UnsupportedDurationField_equals_72423379981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14935 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term15055 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term14935, term14935.getClass(), "iType", term15055);
        term15149 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term15269 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term15269, term15269.getClass(), "iName", "");
        setField(term15149, term15149.getClass(), "iType", term15269);
        term15343 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term15344 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setByteField(term15344, term15344.getClass(), "iOrdinal", (byte) 0);
        setField(term15344, term15344.getClass(), "iName", null);
        setField(term15343, term15343.getClass(), "iType", term15344);
        term15345 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term15346 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setByteField(term15346, term15346.getClass(), "iOrdinal", (byte) 0);
        setField(term15346, term15346.getClass(), "iName", "");
        setField(term15345, term15345.getClass(), "iType", term15346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15149;
        Object retValue = callMethod(klass, "equals", argTypes, term14935, args);
        assertTrue(recursiveEquals(term14935, term15343));
        assertTrue(recursiveEquals(term15149, term15345));
        assertTrue(recursiveEquals(retValue, false));
    }

};
