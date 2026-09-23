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

public class UnsupportedDurationField_equals_72423379969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13456;
     Object term13708;
     Object term13855;
     Object term13859;

    public UnsupportedDurationField_equals_72423379969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13456 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term13576 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term13576, term13576.getClass(), "iName", "");
        setField(term13456, term13456.getClass(), "iType", term13576);
        term13708 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term13828 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term13828, term13828.getClass(), "iName", null);
        setField(term13708, term13708.getClass(), "iType", term13828);
        term13855 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term13856 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setByteField(term13856, term13856.getClass(), "iOrdinal", (byte) 0);
        setField(term13856, term13856.getClass(), "iName", "");
        setField(term13855, term13855.getClass(), "iType", term13856);
        term13859 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term13860 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setByteField(term13860, term13860.getClass(), "iOrdinal", (byte) 0);
        setField(term13860, term13860.getClass(), "iName", null);
        setField(term13859, term13859.getClass(), "iType", term13860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13708;
        Object retValue = callMethod(klass, "equals", argTypes, term13456, args);
        assertTrue(recursiveEquals(term13456, term13855));
        assertTrue(recursiveEquals(term13708, term13859));
        assertTrue(recursiveEquals(retValue, false));
    }

};


