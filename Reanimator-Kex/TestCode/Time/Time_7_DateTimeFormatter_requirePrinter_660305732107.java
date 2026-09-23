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

public class DateTimeFormatter_requirePrinter_660305732107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14382;
     Object term16977;
     Object term16970;

    public DateTimeFormatter_requirePrinter_660305732107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14382 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term14488 = newInstance(Class.forName("org.joda.time.format.DateTimeFormat$StyleFormatter"));
        setField(term14382, term14382.getClass(), "iPrinter", term14488);
        term16977 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term16978 = newInstance(Class.forName("org.joda.time.format.DateTimeFormat$StyleFormatter"));
        setIntField(term16978, term16978.getClass(), "iDateStyle", 0);
        setIntField(term16978, term16978.getClass(), "iTimeStyle", 0);
        setIntField(term16978, term16978.getClass(), "iType", 0);
        setField(term16977, term16977.getClass(), "iPrinter", term16978);
        setField(term16977, term16977.getClass(), "iParser", null);
        setField(term16977, term16977.getClass(), "iLocale", null);
        setBooleanField(term16977, term16977.getClass(), "iOffsetParsed", false);
        setField(term16977, term16977.getClass(), "iChrono", null);
        setField(term16977, term16977.getClass(), "iZone", null);
        setField(term16977, term16977.getClass(), "iPivotYear", null);
        setIntField(term16977, term16977.getClass(), "iDefaultYear", 0);
        term16970 = newInstance(Class.forName("org.joda.time.format.DateTimeFormat$StyleFormatter"));
        setIntField(term16970, term16970.getClass(), "iDateStyle", 0);
        setIntField(term16970, term16970.getClass(), "iTimeStyle", 0);
        setIntField(term16970, term16970.getClass(), "iType", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "requirePrinter", argTypes, term14382, args);
        assertTrue(recursiveEquals(term14382, term16977));
        assertTrue(recursiveEquals(retValue, term16970));
    }

};


