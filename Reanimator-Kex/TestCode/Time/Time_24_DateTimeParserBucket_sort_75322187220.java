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

public class DateTimeParserBucket_sort_75322187220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2390;
     Object term2435;

    public DateTimeParserBucket_sort_75322187220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2390 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 2);
        Object term2391 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term2405 = newInstance(Class.forName("java.util.Locale"));
        Object term2406 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term2413 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term2427 = newInstance(Class.forName("java.util.Locale"));
        Object term2428 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2391, term2391.getClass(), "iField", null);
        setIntField(term2391, term2391.getClass(), "iValue", -893623680);
        setField(term2391, term2391.getClass(), "iText", "eqJfYWRaEL");
        setField(term2406, term2406.getClass(), "language", "");
        setField(term2406, term2406.getClass(), "script", "");
        setField(term2406, term2406.getClass(), "region", "");
        setField(term2406, term2406.getClass(), "variant", "");
        setIntField(term2406, term2406.getClass(), "hash", -1338955321);
        setField(term2405, term2405.getClass(), "baseLocale", term2406);
        setField(term2405, term2405.getClass(), "localeExtensions", null);
        setIntField(term2405, term2405.getClass(), "hashCodeValue", -1338955321);
        setField(term2405, term2405.getClass(), "languageTag", null);
        setField(term2391, term2391.getClass(), "iLocale", term2405);
        setElement(term2390, 0, term2391);
        setField(term2413, term2413.getClass(), "iField", null);
        setIntField(term2413, term2413.getClass(), "iValue", -1963434938);
        setField(term2413, term2413.getClass(), "iText", "fhkbdRViHi");
        setField(term2428, term2428.getClass(), "language", "");
        setField(term2428, term2428.getClass(), "script", "");
        setField(term2428, term2428.getClass(), "region", "");
        setField(term2428, term2428.getClass(), "variant", "");
        setIntField(term2428, term2428.getClass(), "hash", 104870675);
        setField(term2427, term2427.getClass(), "baseLocale", term2428);
        setField(term2427, term2427.getClass(), "localeExtensions", null);
        setIntField(term2427, term2427.getClass(), "hashCodeValue", 104870675);
        setField(term2427, term2427.getClass(), "languageTag", null);
        setField(term2413, term2413.getClass(), "iLocale", term2427);
        setElement(term2390, 1, term2413);
        term2435 = new Integer(906181092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2390;
        args[1] = term2435;
        callMethod(klass, "sort", argTypes, null, args);
    }

};


