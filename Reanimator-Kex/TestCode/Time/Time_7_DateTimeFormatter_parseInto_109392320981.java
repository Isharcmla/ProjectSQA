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

public class DateTimeFormatter_parseInto_109392320981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1125;
     Object term1158;

    public DateTimeFormatter_parseInto_109392320981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1143 = new Integer(-1530420153);
        term1125 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1126 = newInstance(Class.forName("java.util.Locale"));
        Object term1127 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1125, term1125.getClass(), "iPrinter", null);
        setField(term1125, term1125.getClass(), "iParser", null);
        setField(term1127, term1127.getClass(), "language", "en");
        setField(term1127, term1127.getClass(), "script", "");
        setField(term1127, term1127.getClass(), "region", "KE");
        setField(term1127, term1127.getClass(), "variant", "");
        setIntField(term1127, term1127.getClass(), "hash", 96626845);
        setField(term1126, term1126.getClass(), "baseLocale", term1127);
        setField(term1126, term1126.getClass(), "localeExtensions", null);
        setIntField(term1126, term1126.getClass(), "hashCodeValue", 96626845);
        setField(term1126, term1126.getClass(), "languageTag", null);
        setField(term1125, term1125.getClass(), "iLocale", term1126);
        setBooleanField(term1125, term1125.getClass(), "iOffsetParsed", true);
        setField(term1125, term1125.getClass(), "iChrono", null);
        setField(term1125, term1125.getClass(), "iZone", null);
        setField(term1125, term1125.getClass(), "iPivotYear", term1143);
        setIntField(term1125, term1125.getClass(), "iDefaultYear", 767834723);
        term1158 = new Integer(-602026508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.ReadWritableInstant");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "jJCZpVmanW";
        args[2] = term1158;
        try {
            callMethod(klass, "parseInto", argTypes, term1125, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


