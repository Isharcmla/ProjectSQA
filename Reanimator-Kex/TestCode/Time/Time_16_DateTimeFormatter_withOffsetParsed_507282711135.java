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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;

public class DateTimeFormatter_withOffsetParsed_507282711135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23744;
     Object term23761;
     Object term23758;

    public DateTimeFormatter_withOffsetParsed_507282711135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23744 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setBooleanField(term23744, term23744.getClass(), "iOffsetParsed", true);
        term23761 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term23761, term23761.getClass(), "iPrinter", null);
        setField(term23761, term23761.getClass(), "iParser", null);
        setField(term23761, term23761.getClass(), "iLocale", null);
        setBooleanField(term23761, term23761.getClass(), "iOffsetParsed", true);
        setField(term23761, term23761.getClass(), "iChrono", null);
        setField(term23761, term23761.getClass(), "iZone", null);
        setField(term23761, term23761.getClass(), "iPivotYear", null);
        setIntField(term23761, term23761.getClass(), "iDefaultYear", 0);
        term23758 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term23758, term23758.getClass(), "iPrinter", null);
        setField(term23758, term23758.getClass(), "iParser", null);
        setField(term23758, term23758.getClass(), "iLocale", null);
        setBooleanField(term23758, term23758.getClass(), "iOffsetParsed", true);
        setField(term23758, term23758.getClass(), "iChrono", null);
        setField(term23758, term23758.getClass(), "iZone", null);
        setField(term23758, term23758.getClass(), "iPivotYear", null);
        setIntField(term23758, term23758.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withOffsetParsed", argTypes, term23744, args);
        assertTrue(recursiveEquals(term23744, term23761));
        assertTrue(recursiveEquals(retValue, term23758));
    }

};


