package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Object;

public class Period_init_167289003185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88758;
     Object term90686;
     Object term90693;

    public Period_init_167289003185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term88650 = newInstance(Class.forName("org.joda.time.Period"));
        Object term88704 = newInstance(Class.forName("org.joda.time.PeriodType"));
        setField(term88650, term88650.getClass(), "iType", term88704);
        term88758 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term88553 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        Object term88878 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term88998 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term89118 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setElement(term88553, 0, term88878);
        setElement(term88553, 1, term88878);
        setElement(term88553, 2, term88998);
        setElement(term88553, 3, term89118);
        setField(term88758, term88758.getClass(), "iTypes", term88553);
        term90686 = newInstance(Class.forName("org.joda.time.Period"));
        Object term90687 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term90688 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        Object term90689 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term90690 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term90691 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term90692 = (int[]) newIntArray(4);
        setField(term90687, term90687.getClass(), "iName", null);
        setByteField(term90689, term90689.getClass(), "iOrdinal", (byte) 0);
        setField(term90689, term90689.getClass(), "iName", null);
        setElement(term90688, 0, term90689);
        setElement(term90688, 1, term90689);
        setByteField(term90690, term90690.getClass(), "iOrdinal", (byte) 0);
        setField(term90690, term90690.getClass(), "iName", null);
        setElement(term90688, 2, term90690);
        setByteField(term90691, term90691.getClass(), "iOrdinal", (byte) 0);
        setField(term90691, term90691.getClass(), "iName", null);
        setElement(term90688, 3, term90691);
        setField(term90687, term90687.getClass(), "iTypes", term90688);
        setField(term90687, term90687.getClass(), "iIndices", null);
        setField(term90686, term90686.getClass(), "iType", term90687);
        setField(term90686, term90686.getClass(), "iValues", term90692);
        term90693 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term90694 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        Object term90695 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term90696 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term90697 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term90693, term90693.getClass(), "iName", null);
        setByteField(term90695, term90695.getClass(), "iOrdinal", (byte) 0);
        setField(term90695, term90695.getClass(), "iName", null);
        setElement(term90694, 0, term90695);
        setElement(term90694, 1, term90695);
        setByteField(term90696, term90696.getClass(), "iOrdinal", (byte) 0);
        setField(term90696, term90696.getClass(), "iName", null);
        setElement(term90694, 2, term90696);
        setByteField(term90697, term90697.getClass(), "iOrdinal", (byte) 0);
        setField(term90697, term90697.getClass(), "iName", null);
        setElement(term90694, 3, term90697);
        setField(term90693, term90693.getClass(), "iTypes", term90694);
        setField(term90693, term90693.getClass(), "iIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[9];
        args[0] = 0;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = term88758;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term90686));
        assertTrue(recursiveEquals(term88758, 0));
    }

};


