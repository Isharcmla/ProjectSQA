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

public class DateTimeParserBucket_saveField_86086605336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1681;
     Object term1797;

    public DateTimeParserBucket_saveField_86086605336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1700 = new Integer(1585847225);
        term1681 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object term1684 = newInstance(Class.forName("java.util.Locale"));
        Object term1685 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1703 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 5);
        Object term1704 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1718 = newInstance(Class.forName("java.util.Locale"));
        Object term1719 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1722 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1736 = newInstance(Class.forName("java.util.Locale"));
        Object term1737 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1740 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1754 = newInstance(Class.forName("java.util.Locale"));
        Object term1755 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1758 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1772 = newInstance(Class.forName("java.util.Locale"));
        Object term1773 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1776 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1790 = newInstance(Class.forName("java.util.Locale"));
        Object term1791 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1796 = newInstance(Class.forName("java.lang.Object"));
        setField(term1681, term1681.getClass(), "iChrono", null);
        setLongField(term1681, term1681.getClass(), "iMillis", -5476826692763582090L);
        setField(term1681, term1681.getClass(), "iZone", null);
        setIntField(term1681, term1681.getClass(), "iOffset", 1655935355);
        setField(term1685, term1685.getClass(), "language", "om");
        setField(term1685, term1685.getClass(), "script", "");
        setField(term1685, term1685.getClass(), "region", "KE");
        setField(term1685, term1685.getClass(), "variant", "");
        setIntField(term1685, term1685.getClass(), "hash", 105832264);
        setField(term1684, term1684.getClass(), "baseLocale", term1685);
        setField(term1684, term1684.getClass(), "localeExtensions", null);
        setIntField(term1684, term1684.getClass(), "hashCodeValue", 105832264);
        setField(term1684, term1684.getClass(), "languageTag", null);
        setField(term1681, term1681.getClass(), "iLocale", term1684);
        setField(term1681, term1681.getClass(), "iPivotYear", term1700);
        setIntField(term1681, term1681.getClass(), "iDefaultYear", -481533957);
        setField(term1704, term1704.getClass(), "iField", null);
        setIntField(term1704, term1704.getClass(), "iValue", 1240914516);
        setField(term1704, term1704.getClass(), "iText", "GzFkzHGYFt");
        setField(term1719, term1719.getClass(), "language", null);
        setField(term1719, term1719.getClass(), "script", null);
        setField(term1719, term1719.getClass(), "region", null);
        setField(term1719, term1719.getClass(), "variant", null);
        setIntField(term1719, term1719.getClass(), "hash", 96622908);
        setField(term1718, term1718.getClass(), "baseLocale", term1719);
        setField(term1718, term1718.getClass(), "localeExtensions", null);
        setIntField(term1718, term1718.getClass(), "hashCodeValue", 96622908);
        setField(term1718, term1718.getClass(), "languageTag", null);
        setField(term1704, term1704.getClass(), "iLocale", term1718);
        setElement(term1703, 0, term1704);
        setField(term1722, term1722.getClass(), "iField", null);
        setIntField(term1722, term1722.getClass(), "iValue", -1465035361);
        setField(term1722, term1722.getClass(), "iText", "tShwQLRGNe");
        setField(term1737, term1737.getClass(), "language", null);
        setField(term1737, term1737.getClass(), "script", null);
        setField(term1737, term1737.getClass(), "region", null);
        setField(term1737, term1737.getClass(), "variant", null);
        setIntField(term1737, term1737.getClass(), "hash", 96769383);
        setField(term1736, term1736.getClass(), "baseLocale", term1737);
        setField(term1736, term1736.getClass(), "localeExtensions", null);
        setIntField(term1736, term1736.getClass(), "hashCodeValue", 96769383);
        setField(term1736, term1736.getClass(), "languageTag", null);
        setField(term1722, term1722.getClass(), "iLocale", term1736);
        setElement(term1703, 1, term1722);
        setField(term1740, term1740.getClass(), "iField", null);
        setIntField(term1740, term1740.getClass(), "iValue", 1090617576);
        setField(term1740, term1740.getClass(), "iText", "LvtrsXUliU");
        setField(term1755, term1755.getClass(), "language", null);
        setField(term1755, term1755.getClass(), "script", null);
        setField(term1755, term1755.getClass(), "region", null);
        setField(term1755, term1755.getClass(), "variant", null);
        setIntField(term1755, term1755.getClass(), "hash", 97662090);
        setField(term1754, term1754.getClass(), "baseLocale", term1755);
        setField(term1754, term1754.getClass(), "localeExtensions", null);
        setIntField(term1754, term1754.getClass(), "hashCodeValue", 97662090);
        setField(term1754, term1754.getClass(), "languageTag", null);
        setField(term1740, term1740.getClass(), "iLocale", term1754);
        setElement(term1703, 2, term1740);
        setField(term1758, term1758.getClass(), "iField", null);
        setIntField(term1758, term1758.getClass(), "iValue", -1547384488);
        setField(term1758, term1758.getClass(), "iText", "xLbjWUgOIL");
        setField(term1773, term1773.getClass(), "language", null);
        setField(term1773, term1773.getClass(), "script", null);
        setField(term1773, term1773.getClass(), "region", null);
        setField(term1773, term1773.getClass(), "variant", null);
        setIntField(term1773, term1773.getClass(), "hash", 97595316);
        setField(term1772, term1772.getClass(), "baseLocale", term1773);
        setField(term1772, term1772.getClass(), "localeExtensions", null);
        setIntField(term1772, term1772.getClass(), "hashCodeValue", 97595316);
        setField(term1772, term1772.getClass(), "languageTag", null);
        setField(term1758, term1758.getClass(), "iLocale", term1772);
        setElement(term1703, 3, term1758);
        setField(term1776, term1776.getClass(), "iField", null);
        setIntField(term1776, term1776.getClass(), "iValue", 1442160736);
        setField(term1776, term1776.getClass(), "iText", "jDtqGUpnZN");
        setField(term1791, term1791.getClass(), "language", null);
        setField(term1791, term1791.getClass(), "script", null);
        setField(term1791, term1791.getClass(), "region", null);
        setField(term1791, term1791.getClass(), "variant", null);
        setIntField(term1791, term1791.getClass(), "hash", 106957161);
        setField(term1790, term1790.getClass(), "baseLocale", term1791);
        setField(term1790, term1790.getClass(), "localeExtensions", null);
        setIntField(term1790, term1790.getClass(), "hashCodeValue", 106957161);
        setField(term1790, term1790.getClass(), "languageTag", null);
        setField(term1776, term1776.getClass(), "iLocale", term1790);
        setElement(term1703, 4, term1776);
        setField(term1681, term1681.getClass(), "iSavedFields", term1703);
        setIntField(term1681, term1681.getClass(), "iSavedFieldsCount", 1114000454);
        setBooleanField(term1681, term1681.getClass(), "iSavedFieldsShared", true);
        setField(term1681, term1681.getClass(), "iSavedState", term1796);
        term1797 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1811 = newInstance(Class.forName("java.util.Locale"));
        Object term1812 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1797, term1797.getClass(), "iField", null);
        setIntField(term1797, term1797.getClass(), "iValue", -556405712);
        setField(term1797, term1797.getClass(), "iText", "nGKItKLYNC");
        setField(term1812, term1812.getClass(), "language", "be");
        setField(term1812, term1812.getClass(), "script", "");
        setField(term1812, term1812.getClass(), "region", "BY");
        setField(term1812, term1812.getClass(), "variant", "");
        setIntField(term1812, term1812.getClass(), "hash", 93580134);
        setField(term1811, term1811.getClass(), "baseLocale", term1812);
        setField(term1811, term1811.getClass(), "localeExtensions", null);
        setIntField(term1811, term1811.getClass(), "hashCodeValue", 93580134);
        setField(term1811, term1811.getClass(), "languageTag", null);
        setField(term1797, term1797.getClass(), "iLocale", term1811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField");
        Object[] args = new Object[1];
        args[0] = term1797;
        try {
            callMethod(klass, "saveField", argTypes, term1681, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


