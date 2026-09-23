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

public class DateTimeFormatter_printTo_190055744969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653;
     Object term672;
     Object term704;

    public DateTimeFormatter_printTo_190055744969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term669 = new Integer(-1007160944);
        term653 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term654 = newInstance(Class.forName("java.util.Locale"));
        Object term655 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term653, term653.getClass(), "iPrinter", null);
        setField(term653, term653.getClass(), "iParser", null);
        setField(term655, term655.getClass(), "language", "pa");
        setField(term655, term655.getClass(), "script", "");
        setField(term655, term655.getClass(), "region", "");
        setField(term655, term655.getClass(), "variant", "");
        setIntField(term655, term655.getClass(), "hash", 106324079);
        setField(term654, term654.getClass(), "baseLocale", term655);
        setField(term654, term654.getClass(), "localeExtensions", null);
        setIntField(term654, term654.getClass(), "hashCodeValue", 106324079);
        setField(term654, term654.getClass(), "languageTag", null);
        setField(term653, term653.getClass(), "iLocale", term654);
        setBooleanField(term653, term653.getClass(), "iOffsetParsed", true);
        setField(term653, term653.getClass(), "iChrono", null);
        setField(term653, term653.getClass(), "iZone", null);
        setField(term653, term653.getClass(), "iPivotYear", term669);
        setIntField(term653, term653.getClass(), "iDefaultYear", 590364439);
        term672 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term685 = (byte[]) newByteArray(16);
        setField(term672, term672.getClass(), "toStringCache", "sjlJAEtRrb");
        setField(term672, term672.getClass(), "value", term685);
        setByteField(term672, term672.getClass(), "coder", (byte) 48);
        setIntField(term672, term672.getClass(), "count", 865208305);
        term704 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term672;
        args[1] = term704;
        try {
            callMethod(klass, "printTo", argTypes, term653, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


