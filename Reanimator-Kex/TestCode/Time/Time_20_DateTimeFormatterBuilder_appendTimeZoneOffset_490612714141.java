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

public class DateTimeFormatterBuilder_appendTimeZoneOffset_490612714141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578;
     Object term596;
     Object term598;
     Object term600;

    public DateTimeFormatterBuilder_appendTimeZoneOffset_490612714141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term579 = new ArrayList();
        term578 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term583 = newInstance(Class.forName("java.lang.Object"));
        setField(term578, term578.getClass(), "iElementPairs", term579);
        setField(term578, term578.getClass(), "iFormatter", term583);
        term596 = new Boolean(false);
        term598 = new Integer(-1016503459);
        term600 = new Integer(-1968847291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = "xxtlPwDYFs";
        args[1] = term596;
        args[2] = term598;
        args[3] = term600;
        try {
            callMethod(klass, "appendTimeZoneOffset", argTypes, term578, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


