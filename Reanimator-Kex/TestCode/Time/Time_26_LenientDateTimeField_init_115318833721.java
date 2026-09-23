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

public class LenientDateTimeField_init_115318833721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2780;
     Object term3036;
     Object term3038;

    public LenientDateTimeField_init_115318833721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2566 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        Object term2664 = newInstance(Class.forName("org.joda.time.chrono.ISOYearOfEraDateTimeField"));
        setField(term2566, term2566.getClass(), "iField", term2664);
        term2780 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        term3036 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        Object term3037 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        setField(term3036, term3036.getClass(), "iBase", null);
        setField(term3037, term3037.getClass(), "iDurationField", null);
        setField(term3037, term3037.getClass(), "iRangeDurationField", null);
        setField(term3037, term3037.getClass(), "iLeapDurationField", null);
        setField(term3037, term3037.getClass(), "this$0", null);
        setField(term3037, term3037.getClass(), "iField", null);
        setField(term3037, term3037.getClass(), "iType", null);
        setField(term3036, term3036.getClass(), "iField", term3037);
        setField(term3036, term3036.getClass(), "iType", null);
        term3038 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        setField(term3038, term3038.getClass(), "iDurationField", null);
        setField(term3038, term3038.getClass(), "iRangeDurationField", null);
        setField(term3038, term3038.getClass(), "iLeapDurationField", null);
        setField(term3038, term3038.getClass(), "this$0", null);
        setField(term3038, term3038.getClass(), "iField", null);
        setField(term3038, term3038.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.LenientDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeField");
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[2];
        args[0] = term2780;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3036));
        assertTrue(recursiveEquals(term2780, term3038));
    }

};


