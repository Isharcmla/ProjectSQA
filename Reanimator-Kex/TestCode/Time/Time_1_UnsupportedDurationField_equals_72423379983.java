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

public class UnsupportedDurationField_equals_72423379983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15469;
     Object term15721;
     Object term15868;
     Object term15872;

    public UnsupportedDurationField_equals_72423379983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15469 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term15589 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term15589, term15589.getClass(), "iName", "");
        setField(term15469, term15469.getClass(), "iType", term15589);
        term15721 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term15841 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term15841, term15841.getClass(), "iName", null);
        setField(term15721, term15721.getClass(), "iType", term15841);
        term15868 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term15869 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setByteField(term15869, term15869.getClass(), "iOrdinal", (byte) 0);
        setField(term15869, term15869.getClass(), "iName", "");
        setField(term15868, term15868.getClass(), "iType", term15869);
        term15872 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term15873 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setByteField(term15873, term15873.getClass(), "iOrdinal", (byte) 0);
        setField(term15873, term15873.getClass(), "iName", null);
        setField(term15872, term15872.getClass(), "iType", term15873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15721;
        Object retValue = callMethod(klass, "equals", argTypes, term15469, args);
        assertTrue(recursiveEquals(term15469, term15868));
        assertTrue(recursiveEquals(term15721, term15872));
        assertTrue(recursiveEquals(retValue, false));
    }

};
