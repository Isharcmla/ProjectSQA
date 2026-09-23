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

public class MutableDateTime_setDateTime_451816975151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21232;
     Object term21235;
     Object term21237;
     Object term21239;
     Object term21241;
     Object term21243;
     Object term21245;
     Object term21247;

    public MutableDateTime_setDateTime_451816975151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21232 = newInstance(Class.forName("org.joda.time.MutableDateTime"));
        setField(term21232, term21232.getClass(), "iRoundingField", null);
        setIntField(term21232, term21232.getClass(), "iRoundingMode", 0);
        setLongField(term21232, term21232.getClass(), "iMillis", 0L);
        setField(term21232, term21232.getClass(), "iChronology", null);
        term21235 = new Integer(0);
        term21237 = new Integer(0);
        term21239 = new Integer(0);
        term21241 = new Integer(0);
        term21243 = new Integer(0);
        term21245 = new Integer(0);
        term21247 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.MutableDateTime");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = term21235;
        args[1] = term21237;
        args[2] = term21239;
        args[3] = term21241;
        args[4] = term21243;
        args[5] = term21245;
        args[6] = term21247;
        callMethod(klass, "setDateTime", argTypes, term21232, args);
    }

};


