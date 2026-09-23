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

public class DateTimeFormatter_printTo_136128044979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1077;
     Object term1098;

    public DateTimeFormatter_printTo_136128044979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1095 = new Integer(1193880199);
        term1077 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1078 = newInstance(Class.forName("java.util.Locale"));
        Object term1079 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1077, term1077.getClass(), "iPrinter", null);
        setField(term1077, term1077.getClass(), "iParser", null);
        setField(term1079, term1079.getClass(), "language", "en");
        setField(term1079, term1079.getClass(), "script", "");
        setField(term1079, term1079.getClass(), "region", "JE");
        setField(term1079, term1079.getClass(), "variant", "");
        setIntField(term1079, term1079.getClass(), "hash", 96625884);
        setField(term1078, term1078.getClass(), "baseLocale", term1079);
        setField(term1078, term1078.getClass(), "localeExtensions", null);
        setIntField(term1078, term1078.getClass(), "hashCodeValue", 96625884);
        setField(term1078, term1078.getClass(), "languageTag", null);
        setField(term1077, term1077.getClass(), "iLocale", term1078);
        setBooleanField(term1077, term1077.getClass(), "iOffsetParsed", true);
        setField(term1077, term1077.getClass(), "iChrono", null);
        setField(term1077, term1077.getClass(), "iZone", null);
        setField(term1077, term1077.getClass(), "iPivotYear", term1095);
        setIntField(term1077, term1077.getClass(), "iDefaultYear", 679763016);
        term1098 = new Long(7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Writer");
        argTypes[1] = long.class;
        argTypes[2] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1098;
        args[2] = null;
        try {
            callMethod(klass, "printTo", argTypes, term1077, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


