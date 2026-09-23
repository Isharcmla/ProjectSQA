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

public class DateTimeParserBucket_computeMillis_23540282119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2336;
     Object term2362;

    public DateTimeParserBucket_computeMillis_23540282119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2355 = new Integer(1048535127);
        term2336 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object term2339 = newInstance(Class.forName("java.util.Locale"));
        Object term2340 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term2358 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 0);
        Object term2361 = newInstance(Class.forName("java.lang.Object"));
        setField(term2336, term2336.getClass(), "iChrono", null);
        setLongField(term2336, term2336.getClass(), "iMillis", -4920224193275732920L);
        setField(term2336, term2336.getClass(), "iZone", null);
        setIntField(term2336, term2336.getClass(), "iOffset", 1141317871);
        setField(term2340, term2340.getClass(), "language", "sq");
        setField(term2340, term2340.getClass(), "script", "");
        setField(term2340, term2340.getClass(), "region", "XK");
        setField(term2340, term2340.getClass(), "variant", "");
        setIntField(term2340, term2340.getClass(), "hash", 109658191);
        setField(term2339, term2339.getClass(), "baseLocale", term2340);
        setField(term2339, term2339.getClass(), "localeExtensions", null);
        setIntField(term2339, term2339.getClass(), "hashCodeValue", 109658191);
        setField(term2339, term2339.getClass(), "languageTag", null);
        setField(term2336, term2336.getClass(), "iLocale", term2339);
        setField(term2336, term2336.getClass(), "iPivotYear", term2355);
        setIntField(term2336, term2336.getClass(), "iDefaultYear", 890669485);
        setField(term2336, term2336.getClass(), "iSavedFields", term2358);
        setIntField(term2336, term2336.getClass(), "iSavedFieldsCount", 691577392);
        setBooleanField(term2336, term2336.getClass(), "iSavedFieldsShared", true);
        setField(term2336, term2336.getClass(), "iSavedState", term2361);
        term2362 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2362;
        args[1] = "hoicvmsovO";
        callMethod(klass, "computeMillis", argTypes, term2336, args);
    }

};


