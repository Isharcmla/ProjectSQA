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

public class MutableDateTime_setYear_1858364371128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21111;
     Object term21114;

    public MutableDateTime_setYear_1858364371128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21111 = newInstance(Class.forName("org.joda.time.MutableDateTime"));
        setField(term21111, term21111.getClass(), "iRoundingField", null);
        setIntField(term21111, term21111.getClass(), "iRoundingMode", 0);
        setLongField(term21111, term21111.getClass(), "iMillis", 0L);
        setField(term21111, term21111.getClass(), "iChronology", null);
        term21114 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.MutableDateTime");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21114;
        callMethod(klass, "setYear", argTypes, term21111, args);
    }

};


