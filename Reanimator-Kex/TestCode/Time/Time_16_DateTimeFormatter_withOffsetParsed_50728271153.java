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

public class DateTimeFormatter_withOffsetParsed_50728271153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193;
     Object term1941;
     Object term1916;

    public DateTimeFormatter_withOffsetParsed_50728271153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term215 = new Integer(-2038273078);
        term193 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term194 = newInstance(Class.forName("java.util.Locale"));
        Object term195 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term193, term193.getClass(), "iPrinter", null);
        setField(term193, term193.getClass(), "iParser", null);
        setField(term195, term195.getClass(), "language", "pa");
        setField(term195, term195.getClass(), "script", "Arab");
        setField(term195, term195.getClass(), "region", "PK");
        setField(term195, term195.getClass(), "variant", "");
        setIntField(term195, term195.getClass(), "hash", 2075563398);
        setField(term194, term194.getClass(), "baseLocale", term195);
        setField(term194, term194.getClass(), "localeExtensions", null);
        setIntField(term194, term194.getClass(), "hashCodeValue", 2075563398);
        setField(term194, term194.getClass(), "languageTag", null);
        setField(term193, term193.getClass(), "iLocale", term194);
        setBooleanField(term193, term193.getClass(), "iOffsetParsed", true);
        setField(term193, term193.getClass(), "iChrono", null);
        setField(term193, term193.getClass(), "iZone", null);
        setField(term193, term193.getClass(), "iPivotYear", term215);
        setIntField(term193, term193.getClass(), "iDefaultYear", -2038273078);
        Integer term1952 = new Integer(-2038273078);
        term1941 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1942 = newInstance(Class.forName("java.util.Locale"));
        Object term1943 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1941, term1941.getClass(), "iPrinter", null);
        setField(term1941, term1941.getClass(), "iParser", null);
        setField(term1943, term1943.getClass(), "language", "pa");
        setField(term1943, term1943.getClass(), "script", "Arab");
        setField(term1943, term1943.getClass(), "region", "PK");
        setField(term1943, term1943.getClass(), "variant", "");
        setIntField(term1943, term1943.getClass(), "hash", 2075563398);
        setField(term1942, term1942.getClass(), "baseLocale", term1943);
        setField(term1942, term1942.getClass(), "localeExtensions", null);
        setIntField(term1942, term1942.getClass(), "hashCodeValue", 2075563398);
        setField(term1942, term1942.getClass(), "languageTag", null);
        setField(term1941, term1941.getClass(), "iLocale", term1942);
        setBooleanField(term1941, term1941.getClass(), "iOffsetParsed", true);
        setField(term1941, term1941.getClass(), "iChrono", null);
        setField(term1941, term1941.getClass(), "iZone", null);
        setField(term1941, term1941.getClass(), "iPivotYear", term1952);
        setIntField(term1941, term1941.getClass(), "iDefaultYear", -2038273078);
        Integer term1938 = new Integer(-2038273078);
        term1916 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1917 = newInstance(Class.forName("java.util.Locale"));
        Object term1918 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1916, term1916.getClass(), "iPrinter", null);
        setField(term1916, term1916.getClass(), "iParser", null);
        setField(term1918, term1918.getClass(), "language", "pa");
        setField(term1918, term1918.getClass(), "script", "Arab");
        setField(term1918, term1918.getClass(), "region", "PK");
        setField(term1918, term1918.getClass(), "variant", "");
        setIntField(term1918, term1918.getClass(), "hash", 2075563398);
        setField(term1917, term1917.getClass(), "baseLocale", term1918);
        setField(term1917, term1917.getClass(), "localeExtensions", null);
        setIntField(term1917, term1917.getClass(), "hashCodeValue", 2075563398);
        setField(term1917, term1917.getClass(), "languageTag", null);
        setField(term1916, term1916.getClass(), "iLocale", term1917);
        setBooleanField(term1916, term1916.getClass(), "iOffsetParsed", true);
        setField(term1916, term1916.getClass(), "iChrono", null);
        setField(term1916, term1916.getClass(), "iZone", null);
        setField(term1916, term1916.getClass(), "iPivotYear", term1938);
        setIntField(term1916, term1916.getClass(), "iDefaultYear", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withOffsetParsed", argTypes, term193, args);
        assertTrue(recursiveEquals(term193, term1941));
        assertTrue(recursiveEquals(retValue, term1916));
    }

};


