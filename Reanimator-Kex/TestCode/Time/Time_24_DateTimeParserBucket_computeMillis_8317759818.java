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
import java.lang.Boolean;

public class DateTimeParserBucket_computeMillis_8317759818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2276;
     Object term2320;

    public DateTimeParserBucket_computeMillis_8317759818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2295 = new Integer(1622346318);
        term2276 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object term2279 = newInstance(Class.forName("java.util.Locale"));
        Object term2280 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term2298 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 1);
        Object term2299 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term2313 = newInstance(Class.forName("java.util.Locale"));
        Object term2314 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term2319 = newInstance(Class.forName("java.lang.Object"));
        setField(term2276, term2276.getClass(), "iChrono", null);
        setLongField(term2276, term2276.getClass(), "iMillis", -6573104506744284592L);
        setField(term2276, term2276.getClass(), "iZone", null);
        setIntField(term2276, term2276.getClass(), "iOffset", -1476117762);
        setField(term2280, term2280.getClass(), "language", "lv");
        setField(term2280, term2280.getClass(), "script", "");
        setField(term2280, term2280.getClass(), "region", "LV");
        setField(term2280, term2280.getClass(), "variant", "");
        setIntField(term2280, term2280.getClass(), "hash", 103331308);
        setField(term2279, term2279.getClass(), "baseLocale", term2280);
        setField(term2279, term2279.getClass(), "localeExtensions", null);
        setIntField(term2279, term2279.getClass(), "hashCodeValue", 103331308);
        setField(term2279, term2279.getClass(), "languageTag", null);
        setField(term2276, term2276.getClass(), "iLocale", term2279);
        setField(term2276, term2276.getClass(), "iPivotYear", term2295);
        setIntField(term2276, term2276.getClass(), "iDefaultYear", -341962980);
        setField(term2299, term2299.getClass(), "iField", null);
        setIntField(term2299, term2299.getClass(), "iValue", 1532716628);
        setField(term2299, term2299.getClass(), "iText", "dEnhdmILtU");
        setField(term2314, term2314.getClass(), "language", null);
        setField(term2314, term2314.getClass(), "script", null);
        setField(term2314, term2314.getClass(), "region", null);
        setField(term2314, term2314.getClass(), "variant", null);
        setIntField(term2314, term2314.getClass(), "hash", 96620366);
        setField(term2313, term2313.getClass(), "baseLocale", term2314);
        setField(term2313, term2313.getClass(), "localeExtensions", null);
        setIntField(term2313, term2313.getClass(), "hashCodeValue", 96620366);
        setField(term2313, term2313.getClass(), "languageTag", null);
        setField(term2299, term2299.getClass(), "iLocale", term2313);
        setElement(term2298, 0, term2299);
        setField(term2276, term2276.getClass(), "iSavedFields", term2298);
        setIntField(term2276, term2276.getClass(), "iSavedFieldsCount", -1801760683);
        setBooleanField(term2276, term2276.getClass(), "iSavedFieldsShared", false);
        setField(term2276, term2276.getClass(), "iSavedState", term2319);
        term2320 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2320;
        callMethod(klass, "computeMillis", argTypes, term2276, args);
    }

};


