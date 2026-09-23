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

public class MutableDateTime_setDayOfMonth_1912392253103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21007;
     Object term21010;

    public MutableDateTime_setDayOfMonth_1912392253103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21007 = newInstance(Class.forName("org.joda.time.MutableDateTime"));
        setField(term21007, term21007.getClass(), "iRoundingField", null);
        setIntField(term21007, term21007.getClass(), "iRoundingMode", 0);
        setLongField(term21007, term21007.getClass(), "iMillis", 0L);
        setField(term21007, term21007.getClass(), "iChronology", null);
        term21010 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.MutableDateTime");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21010;
        callMethod(klass, "setDayOfMonth", argTypes, term21007, args);
    }

};


