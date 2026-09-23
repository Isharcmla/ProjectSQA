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

public class MutableDateTime_setDate_1255918276147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21204;
     Object term21207;
     Object term21209;
     Object term21211;

    public MutableDateTime_setDate_1255918276147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21204 = newInstance(Class.forName("org.joda.time.MutableDateTime"));
        setField(term21204, term21204.getClass(), "iRoundingField", null);
        setIntField(term21204, term21204.getClass(), "iRoundingMode", 0);
        setLongField(term21204, term21204.getClass(), "iMillis", 0L);
        setField(term21204, term21204.getClass(), "iChronology", null);
        term21207 = new Integer(0);
        term21209 = new Integer(0);
        term21211 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.MutableDateTime");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term21207;
        args[1] = term21209;
        args[2] = term21211;
        callMethod(klass, "setDate", argTypes, term21204, args);
    }

};


