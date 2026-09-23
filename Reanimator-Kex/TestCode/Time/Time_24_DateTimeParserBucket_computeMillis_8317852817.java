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

public class DateTimeParserBucket_computeMillis_8317852817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2162;

    public DateTimeParserBucket_computeMillis_8317852817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2181 = new Integer(-1456670397);
        term2162 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object term2165 = newInstance(Class.forName("java.util.Locale"));
        Object term2166 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term2184 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 3);
        Object term2185 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term2199 = newInstance(Class.forName("java.util.Locale"));
        Object term2200 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term2203 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term2217 = newInstance(Class.forName("java.util.Locale"));
        Object term2218 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term2221 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term2235 = newInstance(Class.forName("java.util.Locale"));
        Object term2236 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term2241 = newInstance(Class.forName("java.lang.Object"));
        setField(term2162, term2162.getClass(), "iChrono", null);
        setLongField(term2162, term2162.getClass(), "iMillis", 5127676408959197577L);
        setField(term2162, term2162.getClass(), "iZone", null);
        setIntField(term2162, term2162.getClass(), "iOffset", 1596213415);
        setField(term2166, term2166.getClass(), "language", "sq");
        setField(term2166, term2166.getClass(), "script", "");
        setField(term2166, term2166.getClass(), "region", "AL");
        setField(term2166, term2166.getClass(), "variant", "");
        setIntField(term2166, term2166.getClass(), "hash", 109636119);
        setField(term2165, term2165.getClass(), "baseLocale", term2166);
        setField(term2165, term2165.getClass(), "localeExtensions", null);
        setIntField(term2165, term2165.getClass(), "hashCodeValue", 109636119);
        setField(term2165, term2165.getClass(), "languageTag", null);
        setField(term2162, term2162.getClass(), "iLocale", term2165);
        setField(term2162, term2162.getClass(), "iPivotYear", term2181);
        setIntField(term2162, term2162.getClass(), "iDefaultYear", -268815336);
        setField(term2185, term2185.getClass(), "iField", null);
        setIntField(term2185, term2185.getClass(), "iValue", -1210583429);
        setField(term2185, term2185.getClass(), "iText", "ytSBIKXogI");
        setField(term2200, term2200.getClass(), "language", null);
        setField(term2200, term2200.getClass(), "script", null);
        setField(term2200, term2200.getClass(), "region", null);
        setField(term2200, term2200.getClass(), "variant", null);
        setIntField(term2200, term2200.getClass(), "hash", 103808460);
        setField(term2199, term2199.getClass(), "baseLocale", term2200);
        setField(term2199, term2199.getClass(), "localeExtensions", null);
        setIntField(term2199, term2199.getClass(), "hashCodeValue", 103808460);
        setField(term2199, term2199.getClass(), "languageTag", null);
        setField(term2185, term2185.getClass(), "iLocale", term2199);
        setElement(term2184, 0, term2185);
        setField(term2203, term2203.getClass(), "iField", null);
        setIntField(term2203, term2203.getClass(), "iValue", -663691365);
        setField(term2203, term2203.getClass(), "iText", "nHXjMycHlU");
        setField(term2218, term2218.getClass(), "language", null);
        setField(term2218, term2218.getClass(), "script", null);
        setField(term2218, term2218.getClass(), "region", null);
        setField(term2218, term2218.getClass(), "variant", null);
        setIntField(term2218, term2218.getClass(), "hash", 97803853);
        setField(term2217, term2217.getClass(), "baseLocale", term2218);
        setField(term2217, term2217.getClass(), "localeExtensions", null);
        setIntField(term2217, term2217.getClass(), "hashCodeValue", 97803853);
        setField(term2217, term2217.getClass(), "languageTag", null);
        setField(term2203, term2203.getClass(), "iLocale", term2217);
        setElement(term2184, 1, term2203);
        setField(term2221, term2221.getClass(), "iField", null);
        setIntField(term2221, term2221.getClass(), "iValue", 339854490);
        setField(term2221, term2221.getClass(), "iText", "ieCtQFdkii");
        setField(term2236, term2236.getClass(), "language", null);
        setField(term2236, term2236.getClass(), "script", null);
        setField(term2236, term2236.getClass(), "region", null);
        setField(term2236, term2236.getClass(), "variant", null);
        setIntField(term2236, term2236.getClass(), "hash", 96768608);
        setField(term2235, term2235.getClass(), "baseLocale", term2236);
        setField(term2235, term2235.getClass(), "localeExtensions", null);
        setIntField(term2235, term2235.getClass(), "hashCodeValue", 96768608);
        setField(term2235, term2235.getClass(), "languageTag", null);
        setField(term2221, term2221.getClass(), "iLocale", term2235);
        setElement(term2184, 2, term2221);
        setField(term2162, term2162.getClass(), "iSavedFields", term2184);
        setIntField(term2162, term2162.getClass(), "iSavedFieldsCount", -615654495);
        setBooleanField(term2162, term2162.getClass(), "iSavedFieldsShared", false);
        setField(term2162, term2162.getClass(), "iSavedState", term2241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeMillis", argTypes, term2162, args);
    }

};


