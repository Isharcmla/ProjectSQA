package org.joda.time.format;

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
import java.lang.IllegalArgumentException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;

public class DateTimeFormatterBuilder_appendTimeZoneOffset_173543079142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term612;
     Object term642;
     Object term644;
     Object term646;

    public DateTimeFormatterBuilder_appendTimeZoneOffset_173543079142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term613 = new ArrayList();
        term612 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term617 = newInstance(Class.forName("java.lang.Object"));
        setField(term612, term612.getClass(), "iElementPairs", term613);
        setField(term612, term612.getClass(), "iFormatter", term617);
        term642 = new Boolean(true);
        term644 = new Integer(579005622);
        term646 = new Integer(-14890619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = "jJCZpVmanW";
        args[1] = "EGtDIRbSSb";
        args[2] = term642;
        args[3] = term644;
        args[4] = term646;
        try {
            callMethod(klass, "appendTimeZoneOffset", argTypes, term612, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


