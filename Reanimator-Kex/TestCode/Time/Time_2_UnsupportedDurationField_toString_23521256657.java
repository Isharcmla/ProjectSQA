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

public class UnsupportedDurationField_toString_23521256657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10653;
     Object term10817;

    public UnsupportedDurationField_toString_23521256657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10653 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term10773 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term10653, term10653.getClass(), "iType", term10773);
        term10817 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term10818 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setByteField(term10818, term10818.getClass(), "iOrdinal", (byte) 0);
        setField(term10818, term10818.getClass(), "iName", null);
        setField(term10817, term10817.getClass(), "iType", term10818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term10653, args);
        assertTrue(recursiveEquals(term10653, term10817));
        assertTrue(recursiveEquals(retValue, "UnsupportedDurationField[null]"));
    }

};


