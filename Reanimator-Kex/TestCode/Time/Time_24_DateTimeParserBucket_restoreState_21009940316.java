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
import java.lang.Object;
import java.lang.Integer;

public class DateTimeParserBucket_restoreState_21009940316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2073;
     Object term2136;

    public DateTimeParserBucket_restoreState_21009940316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2093 = new Integer(-1685132342);
        term2073 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object term2076 = newInstance(Class.forName("java.util.Locale"));
        Object term2077 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term2096 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 2);
        Object term2097 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term2111 = newInstance(Class.forName("java.util.Locale"));
        Object term2112 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term2115 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term2129 = newInstance(Class.forName("java.util.Locale"));
        Object term2130 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term2135 = newInstance(Class.forName("java.lang.Object"));
        setField(term2073, term2073.getClass(), "iChrono", null);
        setLongField(term2073, term2073.getClass(), "iMillis", -316468845751588286L);
        setField(term2073, term2073.getClass(), "iZone", null);
        setIntField(term2073, term2073.getClass(), "iOffset", -894662986);
        setField(term2077, term2077.getClass(), "language", "en");
        setField(term2077, term2077.getClass(), "script", "");
        setField(term2077, term2077.getClass(), "region", "001");
        setField(term2077, term2077.getClass(), "variant", "");
        setIntField(term2077, term2077.getClass(), "hash", 98030246);
        setField(term2076, term2076.getClass(), "baseLocale", term2077);
        setField(term2076, term2076.getClass(), "localeExtensions", null);
        setIntField(term2076, term2076.getClass(), "hashCodeValue", 98030246);
        setField(term2076, term2076.getClass(), "languageTag", null);
        setField(term2073, term2073.getClass(), "iLocale", term2076);
        setField(term2073, term2073.getClass(), "iPivotYear", term2093);
        setIntField(term2073, term2073.getClass(), "iDefaultYear", 304775596);
        setField(term2097, term2097.getClass(), "iField", null);
        setIntField(term2097, term2097.getClass(), "iValue", -1347665717);
        setField(term2097, term2097.getClass(), "iText", "ffYhPOzlUs");
        setField(term2112, term2112.getClass(), "language", null);
        setField(term2112, term2112.getClass(), "script", null);
        setField(term2112, term2112.getClass(), "region", null);
        setField(term2112, term2112.getClass(), "variant", null);
        setIntField(term2112, term2112.getClass(), "hash", 100425461);
        setField(term2111, term2111.getClass(), "baseLocale", term2112);
        setField(term2111, term2111.getClass(), "localeExtensions", null);
        setIntField(term2111, term2111.getClass(), "hashCodeValue", 100425461);
        setField(term2111, term2111.getClass(), "languageTag", null);
        setField(term2097, term2097.getClass(), "iLocale", term2111);
        setElement(term2096, 0, term2097);
        setField(term2115, term2115.getClass(), "iField", null);
        setIntField(term2115, term2115.getClass(), "iValue", -1888585309);
        setField(term2115, term2115.getClass(), "iText", "MLqYREekMl");
        setField(term2130, term2130.getClass(), "language", null);
        setField(term2130, term2130.getClass(), "script", null);
        setField(term2130, term2130.getClass(), "region", null);
        setField(term2130, term2130.getClass(), "variant", null);
        setIntField(term2130, term2130.getClass(), "hash", 2080911208);
        setField(term2129, term2129.getClass(), "baseLocale", term2130);
        setField(term2129, term2129.getClass(), "localeExtensions", null);
        setIntField(term2129, term2129.getClass(), "hashCodeValue", 2080911208);
        setField(term2129, term2129.getClass(), "languageTag", null);
        setField(term2115, term2115.getClass(), "iLocale", term2129);
        setElement(term2096, 1, term2115);
        setField(term2073, term2073.getClass(), "iSavedFields", term2096);
        setIntField(term2073, term2073.getClass(), "iSavedFieldsCount", 683666002);
        setBooleanField(term2073, term2073.getClass(), "iSavedFieldsShared", true);
        setField(term2073, term2073.getClass(), "iSavedState", term2135);
        term2136 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2136;
        callMethod(klass, "restoreState", argTypes, term2073, args);
    }

};


