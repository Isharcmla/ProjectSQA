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

public class MutableDateTime_add_1838405847121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21082;
     Object term21085;

    public MutableDateTime_add_1838405847121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21082 = newInstance(Class.forName("org.joda.time.MutableDateTime"));
        setField(term21082, term21082.getClass(), "iRoundingField", null);
        setIntField(term21082, term21082.getClass(), "iRoundingMode", 0);
        setLongField(term21082, term21082.getClass(), "iMillis", 0L);
        setField(term21082, term21082.getClass(), "iChronology", null);
        term21085 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.MutableDateTime");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.ReadableDuration");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term21085;
        callMethod(klass, "add", argTypes, term21082, args);
    }

};


