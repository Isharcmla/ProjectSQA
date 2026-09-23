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

public class UnsupportedDurationField_equals_72423379971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13981;
     Object term14195;
     Object term14389;
     Object term14391;

    public UnsupportedDurationField_equals_72423379971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13981 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term14101 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term13981, term13981.getClass(), "iType", term14101);
        term14195 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term14315 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term14315, term14315.getClass(), "iName", "");
        setField(term14195, term14195.getClass(), "iType", term14315);
        term14389 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term14390 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setByteField(term14390, term14390.getClass(), "iOrdinal", (byte) 0);
        setField(term14390, term14390.getClass(), "iName", null);
        setField(term14389, term14389.getClass(), "iType", term14390);
        term14391 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term14392 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setByteField(term14392, term14392.getClass(), "iOrdinal", (byte) 0);
        setField(term14392, term14392.getClass(), "iName", "");
        setField(term14391, term14391.getClass(), "iType", term14392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14195;
        Object retValue = callMethod(klass, "equals", argTypes, term13981, args);
        assertTrue(recursiveEquals(term13981, term14389));
        assertTrue(recursiveEquals(term14195, term14391));
        assertTrue(recursiveEquals(retValue, false));
    }

};


