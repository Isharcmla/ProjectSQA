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

public class DateTimeFormatter_parseMutableDateTime_159500734887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1409;

    public DateTimeFormatter_parseMutableDateTime_159500734887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1425 = new Integer(-602026508);
        term1409 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1410 = newInstance(Class.forName("java.util.Locale"));
        Object term1411 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1409, term1409.getClass(), "iPrinter", null);
        setField(term1409, term1409.getClass(), "iParser", null);
        setField(term1411, term1411.getClass(), "language", "es");
        setField(term1411, term1411.getClass(), "script", "");
        setField(term1411, term1411.getClass(), "region", "");
        setField(term1411, term1411.getClass(), "variant", "");
        setIntField(term1411, term1411.getClass(), "hash", 96701586);
        setField(term1410, term1410.getClass(), "baseLocale", term1411);
        setField(term1410, term1410.getClass(), "localeExtensions", null);
        setIntField(term1410, term1410.getClass(), "hashCodeValue", 96701586);
        setField(term1410, term1410.getClass(), "languageTag", null);
        setField(term1409, term1409.getClass(), "iLocale", term1410);
        setBooleanField(term1409, term1409.getClass(), "iOffsetParsed", false);
        setField(term1409, term1409.getClass(), "iChrono", null);
        setField(term1409, term1409.getClass(), "iZone", null);
        setField(term1409, term1409.getClass(), "iPivotYear", term1425);
        setIntField(term1409, term1409.getClass(), "iDefaultYear", 579005622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NRdvgJlhkX";
        try {
            callMethod(klass, "parseMutableDateTime", argTypes, term1409, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


