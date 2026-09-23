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

public class DateTimeParserBucket_getZone_188542628427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387;
     Object term6092;

    public DateTimeParserBucket_getZone_188542628427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term404 = new Integer(-1922583790);
        term387 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object term390 = newInstance(Class.forName("java.util.Locale"));
        Object term391 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term407 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 3);
        Object term408 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term422 = newInstance(Class.forName("java.util.Locale"));
        Object term423 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term426 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term440 = newInstance(Class.forName("java.util.Locale"));
        Object term441 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term444 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term458 = newInstance(Class.forName("java.util.Locale"));
        Object term459 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term464 = newInstance(Class.forName("java.lang.Object"));
        setField(term387, term387.getClass(), "iChrono", null);
        setLongField(term387, term387.getClass(), "iMillis", 7411271909051562686L);
        setField(term387, term387.getClass(), "iZone", null);
        setIntField(term387, term387.getClass(), "iOffset", -1685132342);
        setField(term391, term391.getClass(), "language", "be");
        setField(term391, term391.getClass(), "script", "");
        setField(term391, term391.getClass(), "region", "");
        setField(term391, term391.getClass(), "variant", "");
        setIntField(term391, term391.getClass(), "hash", 93513949);
        setField(term390, term390.getClass(), "baseLocale", term391);
        setField(term390, term390.getClass(), "localeExtensions", null);
        setIntField(term390, term390.getClass(), "hashCodeValue", 93513949);
        setField(term390, term390.getClass(), "languageTag", null);
        setField(term387, term387.getClass(), "iLocale", term390);
        setField(term387, term387.getClass(), "iPivotYear", term404);
        setIntField(term387, term387.getClass(), "iDefaultYear", -1456670397);
        setField(term408, term408.getClass(), "iField", null);
        setIntField(term408, term408.getClass(), "iValue", 1622346318);
        setField(term408, term408.getClass(), "iText", "RMFIsYGgne");
        setField(term423, term423.getClass(), "language", null);
        setField(term423, term423.getClass(), "script", null);
        setField(term423, term423.getClass(), "region", null);
        setField(term423, term423.getClass(), "variant", null);
        setIntField(term423, term423.getClass(), "hash", 94388118);
        setField(term422, term422.getClass(), "baseLocale", term423);
        setField(term422, term422.getClass(), "localeExtensions", null);
        setIntField(term422, term422.getClass(), "hashCodeValue", 94388118);
        setField(term422, term422.getClass(), "languageTag", null);
        setField(term408, term408.getClass(), "iLocale", term422);
        setElement(term407, 0, term408);
        setField(term426, term426.getClass(), "iField", null);
        setIntField(term426, term426.getClass(), "iValue", 1048535127);
        setField(term426, term426.getClass(), "iText", "NRdvgJlhkX");
        setField(term441, term441.getClass(), "language", null);
        setField(term441, term441.getClass(), "script", null);
        setField(term441, term441.getClass(), "region", null);
        setField(term441, term441.getClass(), "variant", null);
        setIntField(term441, term441.getClass(), "hash", 109816539);
        setField(term440, term440.getClass(), "baseLocale", term441);
        setField(term440, term440.getClass(), "localeExtensions", null);
        setIntField(term440, term440.getClass(), "hashCodeValue", 109816539);
        setField(term440, term440.getClass(), "languageTag", null);
        setField(term426, term426.getClass(), "iLocale", term440);
        setElement(term407, 1, term426);
        setField(term444, term444.getClass(), "iField", null);
        setIntField(term444, term444.getClass(), "iValue", -655067527);
        setField(term444, term444.getClass(), "iText", "uuaPigETmJ");
        setField(term459, term459.getClass(), "language", null);
        setField(term459, term459.getClass(), "script", null);
        setField(term459, term459.getClass(), "region", null);
        setField(term459, term459.getClass(), "variant", null);
        setIntField(term459, term459.getClass(), "hash", 108841806);
        setField(term458, term458.getClass(), "baseLocale", term459);
        setField(term458, term458.getClass(), "localeExtensions", null);
        setIntField(term458, term458.getClass(), "hashCodeValue", 108841806);
        setField(term458, term458.getClass(), "languageTag", null);
        setField(term444, term444.getClass(), "iLocale", term458);
        setElement(term407, 2, term444);
        setField(term387, term387.getClass(), "iSavedFields", term407);
        setIntField(term387, term387.getClass(), "iSavedFieldsCount", -6029667);
        setBooleanField(term387, term387.getClass(), "iSavedFieldsShared", false);
        setField(term387, term387.getClass(), "iSavedState", term464);
        Integer term6103 = new Integer(-1922583790);
        term6092 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object term6093 = newInstance(Class.forName("java.util.Locale"));
        Object term6094 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term6104 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 3);
        Object term6105 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term6108 = newInstance(Class.forName("java.util.Locale"));
        Object term6109 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term6110 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term6113 = newInstance(Class.forName("java.util.Locale"));
        Object term6114 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term6115 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term6118 = newInstance(Class.forName("java.util.Locale"));
        Object term6119 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term6120 = newInstance(Class.forName("java.lang.Object"));
        setField(term6092, term6092.getClass(), "iChrono", null);
        setLongField(term6092, term6092.getClass(), "iMillis", 7411271909051562686L);
        setField(term6092, term6092.getClass(), "iZone", null);
        setIntField(term6092, term6092.getClass(), "iOffset", -1685132342);
        setField(term6094, term6094.getClass(), "language", "be");
        setField(term6094, term6094.getClass(), "script", "");
        setField(term6094, term6094.getClass(), "region", "");
        setField(term6094, term6094.getClass(), "variant", "");
        setIntField(term6094, term6094.getClass(), "hash", 93513949);
        setField(term6093, term6093.getClass(), "baseLocale", term6094);
        setField(term6093, term6093.getClass(), "localeExtensions", null);
        setIntField(term6093, term6093.getClass(), "hashCodeValue", 93513949);
        setField(term6093, term6093.getClass(), "languageTag", null);
        setField(term6092, term6092.getClass(), "iLocale", term6093);
        setField(term6092, term6092.getClass(), "iPivotYear", term6103);
        setIntField(term6092, term6092.getClass(), "iDefaultYear", -1456670397);
        setField(term6105, term6105.getClass(), "iField", null);
        setIntField(term6105, term6105.getClass(), "iValue", 1622346318);
        setField(term6105, term6105.getClass(), "iText", "RMFIsYGgne");
        setField(term6109, term6109.getClass(), "language", null);
        setField(term6109, term6109.getClass(), "script", null);
        setField(term6109, term6109.getClass(), "region", null);
        setField(term6109, term6109.getClass(), "variant", null);
        setIntField(term6109, term6109.getClass(), "hash", 94388118);
        setField(term6108, term6108.getClass(), "baseLocale", term6109);
        setField(term6108, term6108.getClass(), "localeExtensions", null);
        setIntField(term6108, term6108.getClass(), "hashCodeValue", 94388118);
        setField(term6108, term6108.getClass(), "languageTag", null);
        setField(term6105, term6105.getClass(), "iLocale", term6108);
        setElement(term6104, 0, term6105);
        setField(term6110, term6110.getClass(), "iField", null);
        setIntField(term6110, term6110.getClass(), "iValue", 1048535127);
        setField(term6110, term6110.getClass(), "iText", "NRdvgJlhkX");
        setField(term6114, term6114.getClass(), "language", null);
        setField(term6114, term6114.getClass(), "script", null);
        setField(term6114, term6114.getClass(), "region", null);
        setField(term6114, term6114.getClass(), "variant", null);
        setIntField(term6114, term6114.getClass(), "hash", 109816539);
        setField(term6113, term6113.getClass(), "baseLocale", term6114);
        setField(term6113, term6113.getClass(), "localeExtensions", null);
        setIntField(term6113, term6113.getClass(), "hashCodeValue", 109816539);
        setField(term6113, term6113.getClass(), "languageTag", null);
        setField(term6110, term6110.getClass(), "iLocale", term6113);
        setElement(term6104, 1, term6110);
        setField(term6115, term6115.getClass(), "iField", null);
        setIntField(term6115, term6115.getClass(), "iValue", -655067527);
        setField(term6115, term6115.getClass(), "iText", "uuaPigETmJ");
        setField(term6119, term6119.getClass(), "language", null);
        setField(term6119, term6119.getClass(), "script", null);
        setField(term6119, term6119.getClass(), "region", null);
        setField(term6119, term6119.getClass(), "variant", null);
        setIntField(term6119, term6119.getClass(), "hash", 108841806);
        setField(term6118, term6118.getClass(), "baseLocale", term6119);
        setField(term6118, term6118.getClass(), "localeExtensions", null);
        setIntField(term6118, term6118.getClass(), "hashCodeValue", 108841806);
        setField(term6118, term6118.getClass(), "languageTag", null);
        setField(term6115, term6115.getClass(), "iLocale", term6118);
        setElement(term6104, 2, term6115);
        setField(term6092, term6092.getClass(), "iSavedFields", term6104);
        setIntField(term6092, term6092.getClass(), "iSavedFieldsCount", -6029667);
        setBooleanField(term6092, term6092.getClass(), "iSavedFieldsShared", false);
        setField(term6092, term6092.getClass(), "iSavedState", term6120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getZone", argTypes, term387, args);
        assertTrue(recursiveEquals(term387, term6092));
        assertTrue(recursiveEquals(retValue, null));
    }

};


