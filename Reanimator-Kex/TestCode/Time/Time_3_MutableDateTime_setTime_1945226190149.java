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

public class MutableDateTime_setTime_1945226190149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21218;

    public MutableDateTime_setTime_1945226190149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21218 = newInstance(Class.forName("org.joda.time.MutableDateTime"));
        setField(term21218, term21218.getClass(), "iRoundingField", null);
        setIntField(term21218, term21218.getClass(), "iRoundingMode", 0);
        setLongField(term21218, term21218.getClass(), "iMillis", 0L);
        setField(term21218, term21218.getClass(), "iChronology", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.MutableDateTime");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadableInstant");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTime", argTypes, term21218, args);
    }

};


