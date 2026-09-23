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
import java.lang.NullPointerException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeParserBucket_saveField_123961185334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1377;
     Object term1422;

    public DateTimeParserBucket_saveField_123961185334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1397 = new Integer(1134449235);
        term1377 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object term1380 = newInstance(Class.forName("java.util.Locale"));
        Object term1381 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1400 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 1);
        Object term1401 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1415 = newInstance(Class.forName("java.util.Locale"));
        Object term1416 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1421 = newInstance(Class.forName("java.lang.Object"));
        setField(term1377, term1377.getClass(), "iChrono", null);
        setLongField(term1377, term1377.getClass(), "iMillis", -4325723315152823407L);
        setField(term1377, term1377.getClass(), "iZone", null);
        setIntField(term1377, term1377.getClass(), "iOffset", -93135961);
        setField(term1381, term1381.getClass(), "language", "en");
        setField(term1381, term1381.getClass(), "script", "");
        setField(term1381, term1381.getClass(), "region", "001");
        setField(term1381, term1381.getClass(), "variant", "");
        setIntField(term1381, term1381.getClass(), "hash", 98030246);
        setField(term1380, term1380.getClass(), "baseLocale", term1381);
        setField(term1380, term1380.getClass(), "localeExtensions", null);
        setIntField(term1380, term1380.getClass(), "hashCodeValue", 98030246);
        setField(term1380, term1380.getClass(), "languageTag", null);
        setField(term1377, term1377.getClass(), "iLocale", term1380);
        setField(term1377, term1377.getClass(), "iPivotYear", term1397);
        setIntField(term1377, term1377.getClass(), "iDefaultYear", -112921587);
        setField(term1401, term1401.getClass(), "iField", null);
        setIntField(term1401, term1401.getClass(), "iValue", 933028652);
        setField(term1401, term1401.getClass(), "iText", "IDCWpPLRkE");
        setField(term1416, term1416.getClass(), "language", null);
        setField(term1416, term1416.getClass(), "script", null);
        setField(term1416, term1416.getClass(), "region", null);
        setField(term1416, term1416.getClass(), "variant", null);
        setIntField(term1416, term1416.getClass(), "hash", 93639158);
        setField(term1415, term1415.getClass(), "baseLocale", term1416);
        setField(term1415, term1415.getClass(), "localeExtensions", null);
        setIntField(term1415, term1415.getClass(), "hashCodeValue", 93639158);
        setField(term1415, term1415.getClass(), "languageTag", null);
        setField(term1401, term1401.getClass(), "iLocale", term1415);
        setElement(term1400, 0, term1401);
        setField(term1377, term1377.getClass(), "iSavedFields", term1400);
        setIntField(term1377, term1377.getClass(), "iSavedFieldsCount", 287287233);
        setBooleanField(term1377, term1377.getClass(), "iSavedFieldsShared", true);
        setField(term1377, term1377.getClass(), "iSavedState", term1421);
        term1422 = new Integer(962840079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1422;
        try {
            callMethod(klass, "saveField", argTypes, term1377, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


