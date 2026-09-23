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
import java.lang.Integer;

public class DateTimeFormatter_getLocale_110420823852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168;
     Object term1891;
     Object term1870;

    public DateTimeFormatter_getLocale_110420823852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term186 = new Integer(-1955890973);
        term168 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term169 = newInstance(Class.forName("java.util.Locale"));
        Object term170 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term168, term168.getClass(), "iPrinter", null);
        setField(term168, term168.getClass(), "iParser", null);
        setField(term170, term170.getClass(), "language", "fr");
        setField(term170, term170.getClass(), "script", "");
        setField(term170, term170.getClass(), "region", "CI");
        setField(term170, term170.getClass(), "variant", "");
        setIntField(term170, term170.getClass(), "hash", 97661966);
        setField(term169, term169.getClass(), "baseLocale", term170);
        setField(term169, term169.getClass(), "localeExtensions", null);
        setIntField(term169, term169.getClass(), "hashCodeValue", 97661966);
        setField(term169, term169.getClass(), "languageTag", null);
        setField(term168, term168.getClass(), "iLocale", term169);
        setBooleanField(term168, term168.getClass(), "iOffsetParsed", true);
        setField(term168, term168.getClass(), "iChrono", null);
        setField(term168, term168.getClass(), "iZone", null);
        setField(term168, term168.getClass(), "iPivotYear", term186);
        setIntField(term168, term168.getClass(), "iDefaultYear", -1955890973);
        Integer term1902 = new Integer(-1955890973);
        term1891 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1892 = newInstance(Class.forName("java.util.Locale"));
        Object term1893 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1891, term1891.getClass(), "iPrinter", null);
        setField(term1891, term1891.getClass(), "iParser", null);
        setField(term1893, term1893.getClass(), "language", "fr");
        setField(term1893, term1893.getClass(), "script", "");
        setField(term1893, term1893.getClass(), "region", "CI");
        setField(term1893, term1893.getClass(), "variant", "");
        setIntField(term1893, term1893.getClass(), "hash", 97661966);
        setField(term1892, term1892.getClass(), "baseLocale", term1893);
        setField(term1892, term1892.getClass(), "localeExtensions", null);
        setIntField(term1892, term1892.getClass(), "hashCodeValue", 97661966);
        setField(term1892, term1892.getClass(), "languageTag", null);
        setField(term1891, term1891.getClass(), "iLocale", term1892);
        setBooleanField(term1891, term1891.getClass(), "iOffsetParsed", true);
        setField(term1891, term1891.getClass(), "iChrono", null);
        setField(term1891, term1891.getClass(), "iZone", null);
        setField(term1891, term1891.getClass(), "iPivotYear", term1902);
        setIntField(term1891, term1891.getClass(), "iDefaultYear", -1955890973);
        term1870 = newInstance(Class.forName("java.util.Locale"));
        Object term1871 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1871, term1871.getClass(), "language", "fr");
        setField(term1871, term1871.getClass(), "script", "");
        setField(term1871, term1871.getClass(), "region", "CI");
        setField(term1871, term1871.getClass(), "variant", "");
        setIntField(term1871, term1871.getClass(), "hash", 97661966);
        setField(term1870, term1870.getClass(), "baseLocale", term1871);
        setField(term1870, term1870.getClass(), "localeExtensions", null);
        setIntField(term1870, term1870.getClass(), "hashCodeValue", 97661966);
        setField(term1870, term1870.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocale", argTypes, term168, args);
        assertTrue(recursiveEquals(term168, term1891));
        assertTrue(recursiveEquals(retValue, term1870));
    }

};


