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

public class MutableDateTime_setMillis_1977300757118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21071;

    public MutableDateTime_setMillis_1977300757118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21071 = newInstance(Class.forName("org.joda.time.MutableDateTime"));
        setField(term21071, term21071.getClass(), "iRoundingField", null);
        setIntField(term21071, term21071.getClass(), "iRoundingMode", 0);
        setLongField(term21071, term21071.getClass(), "iMillis", 0L);
        setField(term21071, term21071.getClass(), "iChronology", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.MutableDateTime");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadableInstant");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMillis", argTypes, term21071, args);
    }

};


