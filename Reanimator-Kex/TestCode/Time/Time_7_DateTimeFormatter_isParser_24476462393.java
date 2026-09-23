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
import java.lang.Object;

public class DateTimeFormatter_isParser_24476462393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11072;
     Object term11626;

    public DateTimeFormatter_isParser_24476462393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11072 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term11194 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        setField(term11072, term11072.getClass(), "iParser", term11194);
        term11626 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term11627 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear"));
        setField(term11626, term11626.getClass(), "iPrinter", null);
        setField(term11627, term11627.getClass(), "iType", null);
        setIntField(term11627, term11627.getClass(), "iPivot", 0);
        setBooleanField(term11627, term11627.getClass(), "iLenientParse", false);
        setField(term11626, term11626.getClass(), "iParser", term11627);
        setField(term11626, term11626.getClass(), "iLocale", null);
        setBooleanField(term11626, term11626.getClass(), "iOffsetParsed", false);
        setField(term11626, term11626.getClass(), "iChrono", null);
        setField(term11626, term11626.getClass(), "iZone", null);
        setField(term11626, term11626.getClass(), "iPivotYear", null);
        setIntField(term11626, term11626.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isParser", argTypes, term11072, args);
        assertTrue(recursiveEquals(term11072, term11626));
        assertTrue(recursiveEquals(retValue, true));
    }

};


