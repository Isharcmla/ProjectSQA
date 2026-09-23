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

public class DateTimeFormatter_getZone_70213492760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370;
     Object term2337;

    public DateTimeFormatter_getZone_70213492760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term388 = new Integer(1585847225);
        term370 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term371 = newInstance(Class.forName("java.util.Locale"));
        Object term372 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term370, term370.getClass(), "iPrinter", null);
        setField(term370, term370.getClass(), "iParser", null);
        setField(term372, term372.getClass(), "language", "ca");
        setField(term372, term372.getClass(), "script", "");
        setField(term372, term372.getClass(), "region", "FR");
        setField(term372, term372.getClass(), "variant", "");
        setIntField(term372, term372.getClass(), "hash", 94388118);
        setField(term371, term371.getClass(), "baseLocale", term372);
        setField(term371, term371.getClass(), "localeExtensions", null);
        setIntField(term371, term371.getClass(), "hashCodeValue", 94388118);
        setField(term371, term371.getClass(), "languageTag", null);
        setField(term370, term370.getClass(), "iLocale", term371);
        setBooleanField(term370, term370.getClass(), "iOffsetParsed", false);
        setField(term370, term370.getClass(), "iChrono", null);
        setField(term370, term370.getClass(), "iZone", null);
        setField(term370, term370.getClass(), "iPivotYear", term388);
        setIntField(term370, term370.getClass(), "iDefaultYear", 1585847225);
        Integer term2348 = new Integer(1585847225);
        term2337 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2338 = newInstance(Class.forName("java.util.Locale"));
        Object term2339 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2337, term2337.getClass(), "iPrinter", null);
        setField(term2337, term2337.getClass(), "iParser", null);
        setField(term2339, term2339.getClass(), "language", "ca");
        setField(term2339, term2339.getClass(), "script", "");
        setField(term2339, term2339.getClass(), "region", "FR");
        setField(term2339, term2339.getClass(), "variant", "");
        setIntField(term2339, term2339.getClass(), "hash", 94388118);
        setField(term2338, term2338.getClass(), "baseLocale", term2339);
        setField(term2338, term2338.getClass(), "localeExtensions", null);
        setIntField(term2338, term2338.getClass(), "hashCodeValue", 94388118);
        setField(term2338, term2338.getClass(), "languageTag", null);
        setField(term2337, term2337.getClass(), "iLocale", term2338);
        setBooleanField(term2337, term2337.getClass(), "iOffsetParsed", false);
        setField(term2337, term2337.getClass(), "iChrono", null);
        setField(term2337, term2337.getClass(), "iZone", null);
        setField(term2337, term2337.getClass(), "iPivotYear", term2348);
        setIntField(term2337, term2337.getClass(), "iDefaultYear", 1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getZone", argTypes, term370, args);
        assertTrue(recursiveEquals(term370, term2337));
        assertTrue(recursiveEquals(retValue, null));
    }

};


