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
import java.lang.Long;

public class MutableDateTime_setMillis_1687184124117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21066;
     Object term21069;

    public MutableDateTime_setMillis_1687184124117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21066 = newInstance(Class.forName("org.joda.time.MutableDateTime"));
        setField(term21066, term21066.getClass(), "iRoundingField", null);
        setIntField(term21066, term21066.getClass(), "iRoundingMode", 0);
        setLongField(term21066, term21066.getClass(), "iMillis", 0L);
        setField(term21066, term21066.getClass(), "iChronology", null);
        term21069 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.MutableDateTime");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term21069;
        callMethod(klass, "setMillis", argTypes, term21066, args);
    }

};


