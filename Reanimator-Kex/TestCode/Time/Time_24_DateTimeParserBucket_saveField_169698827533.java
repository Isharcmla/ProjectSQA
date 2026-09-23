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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeParserBucket_saveField_169698827533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1179;
     Object term1313;

    public DateTimeParserBucket_saveField_169698827533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1196 = new Integer(-522618178);
        term1179 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object term1182 = newInstance(Class.forName("java.util.Locale"));
        Object term1183 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1199 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 7);
        Object term1200 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1214 = newInstance(Class.forName("java.util.Locale"));
        Object term1215 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1218 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1232 = newInstance(Class.forName("java.util.Locale"));
        Object term1233 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1236 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1250 = newInstance(Class.forName("java.util.Locale"));
        Object term1251 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1254 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1268 = newInstance(Class.forName("java.util.Locale"));
        Object term1269 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1272 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1286 = newInstance(Class.forName("java.util.Locale"));
        Object term1287 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1290 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1304 = newInstance(Class.forName("java.util.Locale"));
        Object term1305 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1308 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1312 = newInstance(Class.forName("java.lang.Object"));
        setField(term1179, term1179.getClass(), "iChrono", null);
        setLongField(term1179, term1179.getClass(), "iMillis", -8885298608300233488L);
        setField(term1179, term1179.getClass(), "iZone", null);
        setIntField(term1179, term1179.getClass(), "iOffset", -184153539);
        setField(term1183, term1183.getClass(), "language", "es");
        setField(term1183, term1183.getClass(), "script", "");
        setField(term1183, term1183.getClass(), "region", "");
        setField(term1183, term1183.getClass(), "variant", "");
        setIntField(term1183, term1183.getClass(), "hash", 96701586);
        setField(term1182, term1182.getClass(), "baseLocale", term1183);
        setField(term1182, term1182.getClass(), "localeExtensions", null);
        setIntField(term1182, term1182.getClass(), "hashCodeValue", 96701586);
        setField(term1182, term1182.getClass(), "languageTag", null);
        setField(term1179, term1179.getClass(), "iLocale", term1182);
        setField(term1179, term1179.getClass(), "iPivotYear", term1196);
        setIntField(term1179, term1179.getClass(), "iDefaultYear", 493620644);
        setField(term1200, term1200.getClass(), "iField", null);
        setIntField(term1200, term1200.getClass(), "iValue", 1328271830);
        setField(term1200, term1200.getClass(), "iText", "dWRymuLBtr");
        setField(term1215, term1215.getClass(), "language", null);
        setField(term1215, term1215.getClass(), "script", null);
        setField(term1215, term1215.getClass(), "region", null);
        setField(term1215, term1215.getClass(), "variant", null);
        setIntField(term1215, term1215.getClass(), "hash", 97661904);
        setField(term1214, term1214.getClass(), "baseLocale", term1215);
        setField(term1214, term1214.getClass(), "localeExtensions", null);
        setIntField(term1214, term1214.getClass(), "hashCodeValue", 97661904);
        setField(term1214, term1214.getClass(), "languageTag", null);
        setField(term1200, term1200.getClass(), "iLocale", term1214);
        setElement(term1199, 0, term1200);
        setField(term1218, term1218.getClass(), "iField", null);
        setIntField(term1218, term1218.getClass(), "iValue", 1596070772);
        setField(term1218, term1218.getClass(), "iText", "AijpHYOFuy");
        setField(term1233, term1233.getClass(), "language", null);
        setField(term1233, term1233.getClass(), "script", null);
        setField(term1233, term1233.getClass(), "region", null);
        setField(term1233, term1233.getClass(), "variant", null);
        setIntField(term1233, term1233.getClass(), "hash", 102123548);
        setField(term1232, term1232.getClass(), "baseLocale", term1233);
        setField(term1232, term1232.getClass(), "localeExtensions", null);
        setIntField(term1232, term1232.getClass(), "hashCodeValue", 102123548);
        setField(term1232, term1232.getClass(), "languageTag", null);
        setField(term1218, term1218.getClass(), "iLocale", term1232);
        setElement(term1199, 1, term1218);
        setField(term1236, term1236.getClass(), "iField", null);
        setIntField(term1236, term1236.getClass(), "iValue", 97029295);
        setField(term1236, term1236.getClass(), "iText", "SbAoxhfrkn");
        setField(term1251, term1251.getClass(), "language", null);
        setField(term1251, term1251.getClass(), "script", null);
        setField(term1251, term1251.getClass(), "region", null);
        setField(term1251, term1251.getClass(), "variant", null);
        setIntField(term1251, term1251.getClass(), "hash", 1434555562);
        setField(term1250, term1250.getClass(), "baseLocale", term1251);
        setField(term1250, term1250.getClass(), "localeExtensions", null);
        setIntField(term1250, term1250.getClass(), "hashCodeValue", 1434555562);
        setField(term1250, term1250.getClass(), "languageTag", null);
        setField(term1236, term1236.getClass(), "iLocale", term1250);
        setElement(term1199, 2, term1236);
        setField(term1254, term1254.getClass(), "iField", null);
        setIntField(term1254, term1254.getClass(), "iValue", -1371869594);
        setField(term1254, term1254.getClass(), "iText", "kuTXqwMtDB");
        setField(term1269, term1269.getClass(), "language", null);
        setField(term1269, term1269.getClass(), "script", null);
        setField(term1269, term1269.getClass(), "region", null);
        setField(term1269, term1269.getClass(), "variant", null);
        setIntField(term1269, term1269.getClass(), "hash", 111323294);
        setField(term1268, term1268.getClass(), "baseLocale", term1269);
        setField(term1268, term1268.getClass(), "localeExtensions", null);
        setIntField(term1268, term1268.getClass(), "hashCodeValue", 111323294);
        setField(term1268, term1268.getClass(), "languageTag", null);
        setField(term1254, term1254.getClass(), "iLocale", term1268);
        setElement(term1199, 3, term1254);
        setField(term1272, term1272.getClass(), "iField", null);
        setIntField(term1272, term1272.getClass(), "iValue", -2095575670);
        setField(term1272, term1272.getClass(), "iText", "Ghbwtircqb");
        setField(term1287, term1287.getClass(), "language", null);
        setField(term1287, term1287.getClass(), "script", null);
        setField(term1287, term1287.getClass(), "region", null);
        setField(term1287, term1287.getClass(), "variant", null);
        setIntField(term1287, term1287.getClass(), "hash", 96629232);
        setField(term1286, term1286.getClass(), "baseLocale", term1287);
        setField(term1286, term1286.getClass(), "localeExtensions", null);
        setIntField(term1286, term1286.getClass(), "hashCodeValue", 96629232);
        setField(term1286, term1286.getClass(), "languageTag", null);
        setField(term1272, term1272.getClass(), "iLocale", term1286);
        setElement(term1199, 4, term1272);
        setField(term1290, term1290.getClass(), "iField", null);
        setIntField(term1290, term1290.getClass(), "iValue", 1225272962);
        setField(term1290, term1290.getClass(), "iText", "xrwlQZdwCp");
        setField(term1305, term1305.getClass(), "language", null);
        setField(term1305, term1305.getClass(), "script", null);
        setField(term1305, term1305.getClass(), "region", null);
        setField(term1305, term1305.getClass(), "variant", null);
        setIntField(term1305, term1305.getClass(), "hash", 115839343);
        setField(term1304, term1304.getClass(), "baseLocale", term1305);
        setField(term1304, term1304.getClass(), "localeExtensions", null);
        setIntField(term1304, term1304.getClass(), "hashCodeValue", 115839343);
        setField(term1304, term1304.getClass(), "languageTag", null);
        setField(term1290, term1290.getClass(), "iLocale", term1304);
        setElement(term1199, 5, term1290);
        setField(term1308, term1308.getClass(), "iField", null);
        setIntField(term1308, term1308.getClass(), "iValue", 0);
        setField(term1308, term1308.getClass(), "iText", null);
        setField(term1308, term1308.getClass(), "iLocale", null);
        setElement(term1199, 6, term1308);
        setField(term1179, term1179.getClass(), "iSavedFields", term1199);
        setIntField(term1179, term1179.getClass(), "iSavedFieldsCount", 1324040357);
        setBooleanField(term1179, term1179.getClass(), "iSavedFieldsShared", false);
        setField(term1179, term1179.getClass(), "iSavedState", term1312);
        term1313 = new Integer(-1588772968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeField");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1313;
        try {
            callMethod(klass, "saveField", argTypes, term1179, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


