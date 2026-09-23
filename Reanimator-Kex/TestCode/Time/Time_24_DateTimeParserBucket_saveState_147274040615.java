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

public class DateTimeParserBucket_saveState_147274040615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1895;

    public DateTimeParserBucket_saveState_147274040615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1918 = new Integer(597278769);
        term1895 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object term1898 = newInstance(Class.forName("java.util.Locale"));
        Object term1899 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1921 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 5);
        Object term1922 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1936 = newInstance(Class.forName("java.util.Locale"));
        Object term1937 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1940 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1954 = newInstance(Class.forName("java.util.Locale"));
        Object term1955 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1958 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1972 = newInstance(Class.forName("java.util.Locale"));
        Object term1973 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1976 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term1990 = newInstance(Class.forName("java.util.Locale"));
        Object term1991 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term1994 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term2008 = newInstance(Class.forName("java.util.Locale"));
        Object term2009 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term2014 = newInstance(Class.forName("java.lang.Object"));
        setField(term1895, term1895.getClass(), "iChrono", null);
        setLongField(term1895, term1895.getClass(), "iMillis", -872011222785455006L);
        setField(term1895, term1895.getClass(), "iZone", null);
        setIntField(term1895, term1895.getClass(), "iOffset", -1772434990);
        setField(term1899, term1899.getClass(), "language", "bs");
        setField(term1899, term1899.getClass(), "script", "Cyrl");
        setField(term1899, term1899.getClass(), "region", "BA");
        setField(term1899, term1899.getClass(), "variant", "");
        setIntField(term1899, term1899.getClass(), "hash", 2127395584);
        setField(term1898, term1898.getClass(), "baseLocale", term1899);
        setField(term1898, term1898.getClass(), "localeExtensions", null);
        setIntField(term1898, term1898.getClass(), "hashCodeValue", 2127395584);
        setField(term1898, term1898.getClass(), "languageTag", null);
        setField(term1895, term1895.getClass(), "iLocale", term1898);
        setField(term1895, term1895.getClass(), "iPivotYear", term1918);
        setIntField(term1895, term1895.getClass(), "iDefaultYear", -1845499264);
        setField(term1922, term1922.getClass(), "iField", null);
        setIntField(term1922, term1922.getClass(), "iValue", -505439934);
        setField(term1922, term1922.getClass(), "iText", "UiUYnPrcCi");
        setField(term1937, term1937.getClass(), "language", null);
        setField(term1937, term1937.getClass(), "script", null);
        setField(term1937, term1937.getClass(), "region", null);
        setField(term1937, term1937.getClass(), "variant", null);
        setIntField(term1937, term1937.getClass(), "hash", -908689767);
        setField(term1936, term1936.getClass(), "baseLocale", term1937);
        setField(term1936, term1936.getClass(), "localeExtensions", null);
        setIntField(term1936, term1936.getClass(), "hashCodeValue", -908689767);
        setField(term1936, term1936.getClass(), "languageTag", null);
        setField(term1922, term1922.getClass(), "iLocale", term1936);
        setElement(term1921, 0, term1922);
        setField(term1940, term1940.getClass(), "iField", null);
        setIntField(term1940, term1940.getClass(), "iValue", -344842608);
        setField(term1940, term1940.getClass(), "iText", "UoYtihxVaS");
        setField(term1955, term1955.getClass(), "language", null);
        setField(term1955, term1955.getClass(), "script", null);
        setField(term1955, term1955.getClass(), "region", null);
        setField(term1955, term1955.getClass(), "variant", null);
        setIntField(term1955, term1955.getClass(), "hash", 93046252);
        setField(term1954, term1954.getClass(), "baseLocale", term1955);
        setField(term1954, term1954.getClass(), "localeExtensions", null);
        setIntField(term1954, term1954.getClass(), "hashCodeValue", 93046252);
        setField(term1954, term1954.getClass(), "languageTag", null);
        setField(term1940, term1940.getClass(), "iLocale", term1954);
        setElement(term1921, 1, term1940);
        setField(term1958, term1958.getClass(), "iField", null);
        setIntField(term1958, term1958.getClass(), "iValue", 941650513);
        setField(term1958, term1958.getClass(), "iText", "JDswTTCZHV");
        setField(term1973, term1973.getClass(), "language", null);
        setField(term1973, term1973.getClass(), "script", null);
        setField(term1973, term1973.getClass(), "region", null);
        setField(term1973, term1973.getClass(), "variant", null);
        setIntField(term1973, term1973.getClass(), "hash", 1444940593);
        setField(term1972, term1972.getClass(), "baseLocale", term1973);
        setField(term1972, term1972.getClass(), "localeExtensions", null);
        setIntField(term1972, term1972.getClass(), "hashCodeValue", 1444940593);
        setField(term1972, term1972.getClass(), "languageTag", null);
        setField(term1958, term1958.getClass(), "iLocale", term1972);
        setElement(term1921, 2, term1958);
        setField(term1976, term1976.getClass(), "iField", null);
        setIntField(term1976, term1976.getClass(), "iValue", 444029505);
        setField(term1976, term1976.getClass(), "iText", "onpbIeEKoi");
        setField(term1991, term1991.getClass(), "language", null);
        setField(term1991, term1991.getClass(), "script", null);
        setField(term1991, term1991.getClass(), "region", null);
        setField(term1991, term1991.getClass(), "variant", null);
        setIntField(term1991, term1991.getClass(), "hash", 104804738);
        setField(term1990, term1990.getClass(), "baseLocale", term1991);
        setField(term1990, term1990.getClass(), "localeExtensions", null);
        setIntField(term1990, term1990.getClass(), "hashCodeValue", 104804738);
        setField(term1990, term1990.getClass(), "languageTag", null);
        setField(term1976, term1976.getClass(), "iLocale", term1990);
        setElement(term1921, 3, term1976);
        setField(term1994, term1994.getClass(), "iField", null);
        setIntField(term1994, term1994.getClass(), "iValue", -1034506028);
        setField(term1994, term1994.getClass(), "iText", "YRHGsAkhxb");
        setField(term2009, term2009.getClass(), "language", null);
        setField(term2009, term2009.getClass(), "script", null);
        setField(term2009, term2009.getClass(), "region", null);
        setField(term2009, term2009.getClass(), "variant", null);
        setIntField(term2009, term2009.getClass(), "hash", -1138819383);
        setField(term2008, term2008.getClass(), "baseLocale", term2009);
        setField(term2008, term2008.getClass(), "localeExtensions", null);
        setIntField(term2008, term2008.getClass(), "hashCodeValue", -1138819383);
        setField(term2008, term2008.getClass(), "languageTag", null);
        setField(term1994, term1994.getClass(), "iLocale", term2008);
        setElement(term1921, 4, term1994);
        setField(term1895, term1895.getClass(), "iSavedFields", term1921);
        setIntField(term1895, term1895.getClass(), "iSavedFieldsCount", -1263114719);
        setBooleanField(term1895, term1895.getClass(), "iSavedFieldsShared", false);
        setField(term1895, term1895.getClass(), "iSavedState", term2014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "saveState", argTypes, term1895, args);
    }

};


