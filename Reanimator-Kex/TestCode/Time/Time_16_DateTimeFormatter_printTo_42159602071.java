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
import java.lang.Long;

public class DateTimeFormatter_printTo_42159602071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term763;
     Object term784;

    public DateTimeFormatter_printTo_42159602071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term781 = new Integer(590364439);
        term763 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term764 = newInstance(Class.forName("java.util.Locale"));
        Object term765 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term763, term763.getClass(), "iPrinter", null);
        setField(term763, term763.getClass(), "iParser", null);
        setField(term765, term765.getClass(), "language", "es");
        setField(term765, term765.getClass(), "script", "");
        setField(term765, term765.getClass(), "region", "EA");
        setField(term765, term765.getClass(), "variant", "");
        setIntField(term765, term765.getClass(), "hash", 96769910);
        setField(term764, term764.getClass(), "baseLocale", term765);
        setField(term764, term764.getClass(), "localeExtensions", null);
        setIntField(term764, term764.getClass(), "hashCodeValue", 96769910);
        setField(term764, term764.getClass(), "languageTag", null);
        setField(term763, term763.getClass(), "iLocale", term764);
        setBooleanField(term763, term763.getClass(), "iOffsetParsed", false);
        setField(term763, term763.getClass(), "iChrono", null);
        setField(term763, term763.getClass(), "iZone", null);
        setField(term763, term763.getClass(), "iPivotYear", term781);
        setIntField(term763, term763.getClass(), "iDefaultYear", -244121226);
        term784 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term784;
        try {
            callMethod(klass, "printTo", argTypes, term763, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


