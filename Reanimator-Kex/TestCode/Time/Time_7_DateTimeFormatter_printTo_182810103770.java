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

public class DateTimeFormatter_printTo_182810103770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term734;
     Object term756;

    public DateTimeFormatter_printTo_182810103770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term753 = new Integer(1135664017);
        term734 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term735 = newInstance(Class.forName("java.util.Locale"));
        Object term736 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term734, term734.getClass(), "iPrinter", null);
        setField(term734, term734.getClass(), "iParser", null);
        setField(term736, term736.getClass(), "language", "saq");
        setField(term736, term736.getClass(), "script", "");
        setField(term736, term736.getClass(), "region", "KE");
        setField(term736, term736.getClass(), "variant", "");
        setIntField(term736, term736.getClass(), "hash", -909592797);
        setField(term735, term735.getClass(), "baseLocale", term736);
        setField(term735, term735.getClass(), "localeExtensions", null);
        setIntField(term735, term735.getClass(), "hashCodeValue", -909592797);
        setField(term735, term735.getClass(), "languageTag", null);
        setField(term734, term734.getClass(), "iLocale", term735);
        setBooleanField(term734, term734.getClass(), "iOffsetParsed", true);
        setField(term734, term734.getClass(), "iChrono", null);
        setField(term734, term734.getClass(), "iZone", null);
        setField(term734, term734.getClass(), "iPivotYear", term753);
        setIntField(term734, term734.getClass(), "iDefaultYear", -1275173084);
        term756 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Writer");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term756;
        try {
            callMethod(klass, "printTo", argTypes, term734, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


