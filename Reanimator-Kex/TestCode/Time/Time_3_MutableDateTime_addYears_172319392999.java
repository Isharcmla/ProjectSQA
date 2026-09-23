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

public class MutableDateTime_addYears_172319392999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20987;
     Object term20990;

    public MutableDateTime_addYears_172319392999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20987 = newInstance(Class.forName("org.joda.time.MutableDateTime"));
        setField(term20987, term20987.getClass(), "iRoundingField", null);
        setIntField(term20987, term20987.getClass(), "iRoundingMode", 0);
        setLongField(term20987, term20987.getClass(), "iMillis", 0L);
        setField(term20987, term20987.getClass(), "iChronology", null);
        term20990 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.MutableDateTime");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term20990;
        callMethod(klass, "addYears", argTypes, term20987, args);
    }

};


