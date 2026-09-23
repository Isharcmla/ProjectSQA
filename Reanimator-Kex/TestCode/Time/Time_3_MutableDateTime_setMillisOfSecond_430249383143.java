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
import java.lang.Integer;

public class MutableDateTime_setMillisOfSecond_430249383143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21186;
     Object term21189;

    public MutableDateTime_setMillisOfSecond_430249383143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21186 = newInstance(Class.forName("org.joda.time.MutableDateTime"));
        setField(term21186, term21186.getClass(), "iRoundingField", null);
        setIntField(term21186, term21186.getClass(), "iRoundingMode", 0);
        setLongField(term21186, term21186.getClass(), "iMillis", 0L);
        setField(term21186, term21186.getClass(), "iChronology", null);
        term21189 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.MutableDateTime");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21189;
        callMethod(klass, "setMillisOfSecond", argTypes, term21186, args);
    }

};


