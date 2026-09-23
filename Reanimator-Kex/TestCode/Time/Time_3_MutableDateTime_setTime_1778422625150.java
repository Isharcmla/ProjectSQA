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

public class MutableDateTime_setTime_1778422625150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21221;
     Object term21224;
     Object term21226;
     Object term21228;
     Object term21230;

    public MutableDateTime_setTime_1778422625150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21221 = newInstance(Class.forName("org.joda.time.MutableDateTime"));
        setField(term21221, term21221.getClass(), "iRoundingField", null);
        setIntField(term21221, term21221.getClass(), "iRoundingMode", 0);
        setLongField(term21221, term21221.getClass(), "iMillis", 0L);
        setField(term21221, term21221.getClass(), "iChronology", null);
        term21224 = new Integer(0);
        term21226 = new Integer(0);
        term21228 = new Integer(0);
        term21230 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.MutableDateTime");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term21224;
        args[1] = term21226;
        args[2] = term21228;
        args[3] = term21230;
        callMethod(klass, "setTime", argTypes, term21221, args);
    }

};


