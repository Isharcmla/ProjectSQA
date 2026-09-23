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

public class MutableDateTime_addMillis_1276416933144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21191;
     Object term21194;

    public MutableDateTime_addMillis_1276416933144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21191 = newInstance(Class.forName("org.joda.time.MutableDateTime"));
        setField(term21191, term21191.getClass(), "iRoundingField", null);
        setIntField(term21191, term21191.getClass(), "iRoundingMode", 0);
        setLongField(term21191, term21191.getClass(), "iMillis", 0L);
        setField(term21191, term21191.getClass(), "iChronology", null);
        term21194 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.MutableDateTime");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21194;
        callMethod(klass, "addMillis", argTypes, term21191, args);
    }

};


