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
import java.lang.UnsupportedOperationException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatter_requireParser_118714137488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1452;

    public DateTimeFormatter_requireParser_118714137488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1470 = new Integer(-157887805);
        term1452 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1453 = newInstance(Class.forName("java.util.Locale"));
        Object term1454 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1452, term1452.getClass(), "iPrinter", null);
        setField(term1452, term1452.getClass(), "iParser", null);
        setField(term1454, term1454.getClass(), "language", "fr");
        setField(term1454, term1454.getClass(), "script", "");
        setField(term1454, term1454.getClass(), "region", "CG");
        setField(term1454, term1454.getClass(), "variant", "");
        setIntField(term1454, term1454.getClass(), "hash", 97661904);
        setField(term1453, term1453.getClass(), "baseLocale", term1454);
        setField(term1453, term1453.getClass(), "localeExtensions", null);
        setIntField(term1453, term1453.getClass(), "hashCodeValue", 97661904);
        setField(term1453, term1453.getClass(), "languageTag", null);
        setField(term1452, term1452.getClass(), "iLocale", term1453);
        setBooleanField(term1452, term1452.getClass(), "iOffsetParsed", true);
        setField(term1452, term1452.getClass(), "iChrono", null);
        setField(term1452, term1452.getClass(), "iZone", null);
        setField(term1452, term1452.getClass(), "iPivotYear", term1470);
        setIntField(term1452, term1452.getClass(), "iDefaultYear", -14890619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "requireParser", argTypes, term1452, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


