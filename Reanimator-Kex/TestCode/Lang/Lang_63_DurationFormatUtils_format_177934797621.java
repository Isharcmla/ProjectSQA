package org.apache.commons.lang.time;

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
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.time.EqualityUtils.*;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class DurationFormatUtils_format_177934797621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146;
     Object term162;
     Object term164;
     Object term166;
     Object term168;
     Object term170;
     Object term172;
     Object term174;
     Object term176;
     Object term9456;

    public DurationFormatUtils_format_177934797621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term147 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term148 = newInstance(Class.forName("java.lang.Object"));
        Object term150 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term151 = newInstance(Class.forName("java.lang.Object"));
        Object term153 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term154 = newInstance(Class.forName("java.lang.Object"));
        Object term156 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term157 = newInstance(Class.forName("java.lang.Object"));
        Object term159 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term160 = newInstance(Class.forName("java.lang.Object"));
        setField(term147, term147.getClass(), "value", term148);
        setIntField(term147, term147.getClass(), "count", 568599855);
        setElement(term146, 0, term147);
        setField(term150, term150.getClass(), "value", term151);
        setIntField(term150, term150.getClass(), "count", 1162663216);
        setElement(term146, 1, term150);
        setField(term153, term153.getClass(), "value", term154);
        setIntField(term153, term153.getClass(), "count", 1484323161);
        setElement(term146, 2, term153);
        setField(term156, term156.getClass(), "value", term157);
        setIntField(term156, term156.getClass(), "count", 391863371);
        setElement(term146, 3, term156);
        setField(term159, term159.getClass(), "value", term160);
        setIntField(term159, term159.getClass(), "count", -1922583790);
        setElement(term146, 4, term159);
        term162 = new Integer(-616727354);
        term164 = new Integer(-1955890973);
        term166 = new Integer(-2038273078);
        term168 = new Integer(1227103734);
        term170 = new Integer(-1339778481);
        term172 = new Integer(1725571209);
        term174 = new Integer(-522618178);
        term176 = new Boolean(true);
        term9456 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term9457 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term9458 = newInstance(Class.forName("java.lang.Object"));
        Object term9459 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term9460 = newInstance(Class.forName("java.lang.Object"));
        Object term9461 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term9462 = newInstance(Class.forName("java.lang.Object"));
        Object term9463 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term9464 = newInstance(Class.forName("java.lang.Object"));
        Object term9465 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term9466 = newInstance(Class.forName("java.lang.Object"));
        setField(term9457, term9457.getClass(), "value", term9458);
        setIntField(term9457, term9457.getClass(), "count", 568599855);
        setElement(term9456, 0, term9457);
        setField(term9459, term9459.getClass(), "value", term9460);
        setIntField(term9459, term9459.getClass(), "count", 1162663216);
        setElement(term9456, 1, term9459);
        setField(term9461, term9461.getClass(), "value", term9462);
        setIntField(term9461, term9461.getClass(), "count", 1484323161);
        setElement(term9456, 2, term9461);
        setField(term9463, term9463.getClass(), "value", term9464);
        setIntField(term9463, term9463.getClass(), "count", 391863371);
        setElement(term9456, 3, term9463);
        setField(term9465, term9465.getClass(), "value", term9466);
        setIntField(term9465, term9465.getClass(), "count", -1922583790);
        setElement(term9456, 4, term9465);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term146;
        args[1] = term162;
        args[2] = term164;
        args[3] = term166;
        args[4] = term168;
        args[5] = term170;
        args[6] = term172;
        args[7] = term174;
        args[8] = term176;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term146, term9456));
        assertTrue(recursiveEquals(term162, -616727354));
        assertTrue(recursiveEquals(term164, -1955890973));
        assertTrue(recursiveEquals(term166, -2038273078));
        assertTrue(recursiveEquals(term168, 1227103734));
        assertTrue(recursiveEquals(term170, -1339778481));
        assertTrue(recursiveEquals(term172, 1725571209));
        assertTrue(recursiveEquals(term174, -522618178));
        assertTrue(recursiveEquals(term176, true));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


