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

public class DateTimeParserBucket_getOffset_102480718829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term639;
     Object term6448;

    public DateTimeParserBucket_getOffset_102480718829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term657 = new Integer(-1955890973);
        term639 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object term642 = newInstance(Class.forName("java.util.Locale"));
        Object term643 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term660 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 1);
        Object term661 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term675 = newInstance(Class.forName("java.util.Locale"));
        Object term676 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term681 = newInstance(Class.forName("java.lang.Object"));
        setField(term639, term639.getClass(), "iChrono", null);
        setLongField(term639, term639.getClass(), "iMillis", 6811161968424632369L);
        setField(term639, term639.getClass(), "iZone", null);
        setIntField(term639, term639.getClass(), "iOffset", -244121226);
        setField(term643, term643.getClass(), "language", "cgg");
        setField(term643, term643.getClass(), "script", "");
        setField(term643, term643.getClass(), "region", "");
        setField(term643, term643.getClass(), "variant", "");
        setIntField(term643, term643.getClass(), "hash", -1362490211);
        setField(term642, term642.getClass(), "baseLocale", term643);
        setField(term642, term642.getClass(), "localeExtensions", null);
        setIntField(term642, term642.getClass(), "hashCodeValue", -1362490211);
        setField(term642, term642.getClass(), "languageTag", null);
        setField(term639, term639.getClass(), "iLocale", term642);
        setField(term639, term639.getClass(), "iPivotYear", term657);
        setIntField(term639, term639.getClass(), "iDefaultYear", -203030934);
        setField(term661, term661.getClass(), "iField", null);
        setIntField(term661, term661.getClass(), "iValue", -1179120542);
        setField(term661, term661.getClass(), "iText", "ZiaGIbnzTs");
        setField(term676, term676.getClass(), "language", null);
        setField(term676, term676.getClass(), "script", null);
        setField(term676, term676.getClass(), "region", null);
        setField(term676, term676.getClass(), "variant", null);
        setIntField(term676, term676.getClass(), "hash", 106324079);
        setField(term675, term675.getClass(), "baseLocale", term676);
        setField(term675, term675.getClass(), "localeExtensions", null);
        setIntField(term675, term675.getClass(), "hashCodeValue", 106324079);
        setField(term675, term675.getClass(), "languageTag", null);
        setField(term661, term661.getClass(), "iLocale", term675);
        setElement(term660, 0, term661);
        setField(term639, term639.getClass(), "iSavedFields", term660);
        setIntField(term639, term639.getClass(), "iSavedFieldsCount", -73683645);
        setBooleanField(term639, term639.getClass(), "iSavedFieldsShared", true);
        setField(term639, term639.getClass(), "iSavedState", term681);
        Integer term6459 = new Integer(-1955890973);
        term6448 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object term6449 = newInstance(Class.forName("java.util.Locale"));
        Object term6450 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term6460 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 1);
        Object term6461 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term6464 = newInstance(Class.forName("java.util.Locale"));
        Object term6465 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term6466 = newInstance(Class.forName("java.lang.Object"));
        setField(term6448, term6448.getClass(), "iChrono", null);
        setLongField(term6448, term6448.getClass(), "iMillis", 6811161968424632369L);
        setField(term6448, term6448.getClass(), "iZone", null);
        setIntField(term6448, term6448.getClass(), "iOffset", -244121226);
        setField(term6450, term6450.getClass(), "language", "cgg");
        setField(term6450, term6450.getClass(), "script", "");
        setField(term6450, term6450.getClass(), "region", "");
        setField(term6450, term6450.getClass(), "variant", "");
        setIntField(term6450, term6450.getClass(), "hash", -1362490211);
        setField(term6449, term6449.getClass(), "baseLocale", term6450);
        setField(term6449, term6449.getClass(), "localeExtensions", null);
        setIntField(term6449, term6449.getClass(), "hashCodeValue", -1362490211);
        setField(term6449, term6449.getClass(), "languageTag", null);
        setField(term6448, term6448.getClass(), "iLocale", term6449);
        setField(term6448, term6448.getClass(), "iPivotYear", term6459);
        setIntField(term6448, term6448.getClass(), "iDefaultYear", -203030934);
        setField(term6461, term6461.getClass(), "iField", null);
        setIntField(term6461, term6461.getClass(), "iValue", -1179120542);
        setField(term6461, term6461.getClass(), "iText", "ZiaGIbnzTs");
        setField(term6465, term6465.getClass(), "language", null);
        setField(term6465, term6465.getClass(), "script", null);
        setField(term6465, term6465.getClass(), "region", null);
        setField(term6465, term6465.getClass(), "variant", null);
        setIntField(term6465, term6465.getClass(), "hash", 106324079);
        setField(term6464, term6464.getClass(), "baseLocale", term6465);
        setField(term6464, term6464.getClass(), "localeExtensions", null);
        setIntField(term6464, term6464.getClass(), "hashCodeValue", 106324079);
        setField(term6464, term6464.getClass(), "languageTag", null);
        setField(term6461, term6461.getClass(), "iLocale", term6464);
        setElement(term6460, 0, term6461);
        setField(term6448, term6448.getClass(), "iSavedFields", term6460);
        setIntField(term6448, term6448.getClass(), "iSavedFieldsCount", -73683645);
        setBooleanField(term6448, term6448.getClass(), "iSavedFieldsShared", true);
        setField(term6448, term6448.getClass(), "iSavedState", term6466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOffset", argTypes, term639, args);
        assertTrue(recursiveEquals(term639, term6448));
        assertTrue(recursiveEquals(retValue, -244121226));
    }

};


