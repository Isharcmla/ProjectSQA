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

public class DateTimeParserBucket_saveField_143217351235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1439;
     Object term1585;

    public DateTimeParserBucket_saveField_143217351235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1458 = new Integer(-883034806);
        term1439 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object term1442 = newInstance(Class.forName("java.util.Locale"));
        Object term1443 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1461 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 6);
        Object term1462 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1476 = newInstance(Class.forName("java.util.Locale"));
        Object term1477 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1480 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1494 = newInstance(Class.forName("java.util.Locale"));
        Object term1495 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1498 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1512 = newInstance(Class.forName("java.util.Locale"));
        Object term1513 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1516 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1530 = newInstance(Class.forName("java.util.Locale"));
        Object term1531 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1534 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1548 = newInstance(Class.forName("java.util.Locale"));
        Object term1549 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1552 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1566 = newInstance(Class.forName("java.util.Locale"));
        Object term1567 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1572 = newInstance(Class.forName("java.lang.Object"));
        setField(term1439, term1439.getClass(), "iChrono", null);
        setLongField(term1439, term1439.getClass(), "iMillis", 2535595959091595249L);
        setField(term1439, term1439.getClass(), "iZone", null);
        setIntField(term1439, term1439.getClass(), "iOffset", 1540719661);
        setField(term1443, term1443.getClass(), "language", "en");
        setField(term1443, term1443.getClass(), "script", "");
        setField(term1443, term1443.getClass(), "region", "SE");
        setField(term1443, term1443.getClass(), "variant", "");
        setIntField(term1443, term1443.getClass(), "hash", 96634533);
        setField(term1442, term1442.getClass(), "baseLocale", term1443);
        setField(term1442, term1442.getClass(), "localeExtensions", null);
        setIntField(term1442, term1442.getClass(), "hashCodeValue", 96634533);
        setField(term1442, term1442.getClass(), "languageTag", null);
        setField(term1439, term1439.getClass(), "iLocale", term1442);
        setField(term1439, term1439.getClass(), "iPivotYear", term1458);
        setIntField(term1439, term1439.getClass(), "iDefaultYear", 1265463001);
        setField(term1462, term1462.getClass(), "iField", null);
        setIntField(term1462, term1462.getClass(), "iValue", 335112684);
        setField(term1462, term1462.getClass(), "iText", "nyiiPDVjAc");
        setField(term1477, term1477.getClass(), "language", null);
        setField(term1477, term1477.getClass(), "script", null);
        setField(term1477, term1477.getClass(), "region", null);
        setField(term1477, term1477.getClass(), "variant", null);
        setIntField(term1477, term1477.getClass(), "hash", 97671669);
        setField(term1476, term1476.getClass(), "baseLocale", term1477);
        setField(term1476, term1476.getClass(), "localeExtensions", null);
        setIntField(term1476, term1476.getClass(), "hashCodeValue", 97671669);
        setField(term1476, term1476.getClass(), "languageTag", null);
        setField(term1462, term1462.getClass(), "iLocale", term1476);
        setElement(term1461, 0, term1462);
        setField(term1480, term1480.getClass(), "iField", null);
        setIntField(term1480, term1480.getClass(), "iValue", 1551099402);
        setField(term1480, term1480.getClass(), "iText", "aKnKipADSo");
        setField(term1495, term1495.getClass(), "language", null);
        setField(term1495, term1495.getClass(), "script", null);
        setField(term1495, term1495.getClass(), "region", null);
        setField(term1495, term1495.getClass(), "variant", null);
        setIntField(term1495, term1495.getClass(), "hash", 97671483);
        setField(term1494, term1494.getClass(), "baseLocale", term1495);
        setField(term1494, term1494.getClass(), "localeExtensions", null);
        setIntField(term1494, term1494.getClass(), "hashCodeValue", 97671483);
        setField(term1494, term1494.getClass(), "languageTag", null);
        setField(term1480, term1480.getClass(), "iLocale", term1494);
        setElement(term1461, 1, term1480);
        setField(term1498, term1498.getClass(), "iField", null);
        setIntField(term1498, term1498.getClass(), "iValue", -2027534003);
        setField(term1498, term1498.getClass(), "iText", "wSQxaModmm");
        setField(term1513, term1513.getClass(), "language", null);
        setField(term1513, term1513.getClass(), "script", null);
        setField(term1513, term1513.getClass(), "region", null);
        setField(term1513, term1513.getClass(), "variant", null);
        setIntField(term1513, term1513.getClass(), "hash", 2127395584);
        setField(term1512, term1512.getClass(), "baseLocale", term1513);
        setField(term1512, term1512.getClass(), "localeExtensions", null);
        setIntField(term1512, term1512.getClass(), "hashCodeValue", 2127395584);
        setField(term1512, term1512.getClass(), "languageTag", null);
        setField(term1498, term1498.getClass(), "iLocale", term1512);
        setElement(term1461, 2, term1498);
        setField(term1516, term1516.getClass(), "iField", null);
        setIntField(term1516, term1516.getClass(), "iValue", 1063420942);
        setField(term1516, term1516.getClass(), "iText", "UlajhuVLaP");
        setField(term1531, term1531.getClass(), "language", null);
        setField(term1531, term1531.getClass(), "script", null);
        setField(term1531, term1531.getClass(), "region", null);
        setField(term1531, term1531.getClass(), "variant", null);
        setIntField(term1531, term1531.getClass(), "hash", 93052483);
        setField(term1530, term1530.getClass(), "baseLocale", term1531);
        setField(term1530, term1530.getClass(), "localeExtensions", null);
        setIntField(term1530, term1530.getClass(), "hashCodeValue", 93052483);
        setField(term1530, term1530.getClass(), "languageTag", null);
        setField(term1516, term1516.getClass(), "iLocale", term1530);
        setElement(term1461, 3, term1516);
        setField(term1534, term1534.getClass(), "iField", null);
        setIntField(term1534, term1534.getClass(), "iValue", 1375330971);
        setField(term1534, term1534.getClass(), "iText", "gGSMzuGICf");
        setField(term1549, term1549.getClass(), "language", null);
        setField(term1549, term1549.getClass(), "script", null);
        setField(term1549, term1549.getClass(), "region", null);
        setField(term1549, term1549.getClass(), "variant", null);
        setIntField(term1549, term1549.getClass(), "hash", -1091288106);
        setField(term1548, term1548.getClass(), "baseLocale", term1549);
        setField(term1548, term1548.getClass(), "localeExtensions", null);
        setIntField(term1548, term1548.getClass(), "hashCodeValue", -1091288106);
        setField(term1548, term1548.getClass(), "languageTag", null);
        setField(term1534, term1534.getClass(), "iLocale", term1548);
        setElement(term1461, 4, term1534);
        setField(term1552, term1552.getClass(), "iField", null);
        setIntField(term1552, term1552.getClass(), "iValue", -478195677);
        setField(term1552, term1552.getClass(), "iText", "hxCBltsObl");
        setField(term1567, term1567.getClass(), "language", null);
        setField(term1567, term1567.getClass(), "script", null);
        setField(term1567, term1567.getClass(), "region", null);
        setField(term1567, term1567.getClass(), "variant", null);
        setIntField(term1567, term1567.getClass(), "hash", 93216039);
        setField(term1566, term1566.getClass(), "baseLocale", term1567);
        setField(term1566, term1566.getClass(), "localeExtensions", null);
        setIntField(term1566, term1566.getClass(), "hashCodeValue", 93216039);
        setField(term1566, term1566.getClass(), "languageTag", null);
        setField(term1552, term1552.getClass(), "iLocale", term1566);
        setElement(term1461, 5, term1552);
        setField(term1439, term1439.getClass(), "iSavedFields", term1461);
        setIntField(term1439, term1439.getClass(), "iSavedFieldsCount", 972867650);
        setBooleanField(term1439, term1439.getClass(), "iSavedFieldsShared", false);
        setField(term1439, term1439.getClass(), "iSavedState", term1572);
        term1585 = newInstance(Class.forName("java.util.Locale"));
        Object term1586 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1586, term1586.getClass(), "language", "asa");
        setField(term1586, term1586.getClass(), "script", "");
        setField(term1586, term1586.getClass(), "region", "TZ");
        setField(term1586, term1586.getClass(), "variant", "");
        setIntField(term1586, term1586.getClass(), "hash", -1408761493);
        setField(term1585, term1585.getClass(), "baseLocale", term1586);
        setField(term1585, term1585.getClass(), "localeExtensions", null);
        setIntField(term1585, term1585.getClass(), "hashCodeValue", -1408761493);
        setField(term1585, term1585.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.Locale");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "BndsHwAFMv";
        args[2] = term1585;
        try {
            callMethod(klass, "saveField", argTypes, term1439, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


