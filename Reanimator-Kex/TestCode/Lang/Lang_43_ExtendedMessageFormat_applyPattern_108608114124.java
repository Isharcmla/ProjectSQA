package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class ExtendedMessageFormat_applyPattern_108608114124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265;
     Object term2865;

    public ExtendedMessageFormat_applyPattern_108608114124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term278 = new HashMap();
        term265 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term283 = newInstance(Class.forName("java.util.Locale"));
        Object term284 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term311 = (Object[]) newArray("java.text.Format", 1);
        int[] term312 = (int[]) newIntArray(6);
        int[] term319 = (int[]) newIntArray(2);
        setField(term265, term265.getClass(), "toPattern", "SzjVpOQTyS");
        setField(term265, term265.getClass(), "registry", term278);
        setField(term284, term284.getClass(), "language", "ee");
        setField(term284, term284.getClass(), "script", "");
        setField(term284, term284.getClass(), "region", "GH");
        setField(term284, term284.getClass(), "variant", "");
        setIntField(term284, term284.getClass(), "hash", 96354975);
        setField(term283, term283.getClass(), "baseLocale", term284);
        setField(term283, term283.getClass(), "localeExtensions", null);
        setIntField(term283, term283.getClass(), "hashCodeValue", 96354975);
        setField(term283, term283.getClass(), "languageTag", null);
        setField(term265, term265.getClass(), "locale", term283);
        setField(term265, term265.getClass(), "pattern", "MjGYSRKTNF");
        setField(term265, term265.getClass(), "formats", term311);
        setIntElement(term312, 0, -522618178);
        setIntElement(term312, 1, 1134449235);
        setIntElement(term312, 2, -883034806);
        setIntElement(term312, 3, 1585847225);
        setIntElement(term312, 4, 597278769);
        setIntElement(term312, 5, -1685132342);
        setField(term265, term265.getClass(), "offsets", term312);
        setIntElement(term319, 0, -1456670397);
        setIntElement(term319, 1, 1622346318);
        setField(term265, term265.getClass(), "argumentNumbers", term319);
        setIntField(term265, term265.getClass(), "maxOffset", 1048535127);
        HashMap term2868 = new HashMap();
        term2865 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term2869 = newInstance(Class.forName("java.util.Locale"));
        Object term2870 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term2881 = (Object[]) newArray("java.text.Format", 1);
        int[] term2882 = (int[]) newIntArray(6);
        int[] term2883 = (int[]) newIntArray(2);
        setField(term2865, term2865.getClass(), "toPattern", "hRNSzYYIrc");
        setField(term2865, term2865.getClass(), "registry", term2868);
        setField(term2870, term2870.getClass(), "language", "ee");
        setField(term2870, term2870.getClass(), "script", "");
        setField(term2870, term2870.getClass(), "region", "GH");
        setField(term2870, term2870.getClass(), "variant", "");
        setIntField(term2870, term2870.getClass(), "hash", 96354975);
        setField(term2869, term2869.getClass(), "baseLocale", term2870);
        setField(term2869, term2869.getClass(), "localeExtensions", null);
        setIntField(term2869, term2869.getClass(), "hashCodeValue", 96354975);
        setField(term2869, term2869.getClass(), "languageTag", null);
        setField(term2865, term2865.getClass(), "locale", term2869);
        setField(term2865, term2865.getClass(), "pattern", "hRNSzYYIrc");
        setField(term2865, term2865.getClass(), "formats", term2881);
        setIntElement(term2882, 0, -522618178);
        setIntElement(term2882, 1, 1134449235);
        setIntElement(term2882, 2, -883034806);
        setIntElement(term2882, 3, 1585847225);
        setIntElement(term2882, 4, 597278769);
        setIntElement(term2882, 5, -1685132342);
        setField(term2865, term2865.getClass(), "offsets", term2882);
        setIntElement(term2883, 0, -1456670397);
        setIntElement(term2883, 1, 1622346318);
        setField(term2865, term2865.getClass(), "argumentNumbers", term2883);
        setIntField(term2865, term2865.getClass(), "maxOffset", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        callMethod(klass, "applyPattern", argTypes, term265, args);
        assertTrue(recursiveEquals(term265, term2865));
    }

};


