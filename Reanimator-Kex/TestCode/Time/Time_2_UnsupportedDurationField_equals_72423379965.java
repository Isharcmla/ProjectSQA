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

public class UnsupportedDurationField_equals_72423379965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12339;
     Object term12553;
     Object term12692;
     Object term12694;

    public UnsupportedDurationField_equals_72423379965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12339 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term12459 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term12339, term12339.getClass(), "iType", term12459);
        term12553 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term12673 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term12673, term12673.getClass(), "iName", null);
        setField(term12553, term12553.getClass(), "iType", term12673);
        term12692 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term12693 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setByteField(term12693, term12693.getClass(), "iOrdinal", (byte) 0);
        setField(term12693, term12693.getClass(), "iName", null);
        setField(term12692, term12692.getClass(), "iType", term12693);
        term12694 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term12695 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setByteField(term12695, term12695.getClass(), "iOrdinal", (byte) 0);
        setField(term12695, term12695.getClass(), "iName", null);
        setField(term12694, term12694.getClass(), "iType", term12695);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12553;
        Object retValue = callMethod(klass, "equals", argTypes, term12339, args);
        assertTrue(recursiveEquals(term12339, term12692));
        assertTrue(recursiveEquals(term12553, term12694));
        assertTrue(recursiveEquals(retValue, true));
    }

};


