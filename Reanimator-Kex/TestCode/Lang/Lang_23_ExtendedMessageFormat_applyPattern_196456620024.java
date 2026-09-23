package org.apache.commons.lang3.text;

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
import static org.apache.commons.lang3.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.text.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class ExtendedMessageFormat_applyPattern_196456620024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333;
     Object term2911;

    public ExtendedMessageFormat_applyPattern_196456620024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term346 = new HashMap();
        term333 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term351 = newInstance(Class.forName("java.util.Locale"));
        Object term352 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term379 = (Object[]) newArray("java.text.Format", 1);
        int[] term380 = (int[]) newIntArray(6);
        int[] term387 = (int[]) newIntArray(2);
        setField(term333, term333.getClass(), "toPattern", "tbcdzjIfER");
        setField(term333, term333.getClass(), "registry", term346);
        setField(term352, term352.getClass(), "language", "ee");
        setField(term352, term352.getClass(), "script", "");
        setField(term352, term352.getClass(), "region", "GH");
        setField(term352, term352.getClass(), "variant", "");
        setIntField(term352, term352.getClass(), "hash", 96354975);
        setField(term351, term351.getClass(), "baseLocale", term352);
        setField(term351, term351.getClass(), "localeExtensions", null);
        setIntField(term351, term351.getClass(), "hashCodeValue", 96354975);
        setField(term351, term351.getClass(), "languageTag", null);
        setField(term333, term333.getClass(), "locale", term351);
        setField(term333, term333.getClass(), "pattern", "HyxfbSQYBe");
        setField(term333, term333.getClass(), "formats", term379);
        setIntElement(term380, 0, -522618178);
        setIntElement(term380, 1, 1134449235);
        setIntElement(term380, 2, -883034806);
        setIntElement(term380, 3, 1585847225);
        setIntElement(term380, 4, 597278769);
        setIntElement(term380, 5, -1685132342);
        setField(term333, term333.getClass(), "offsets", term380);
        setIntElement(term387, 0, -1456670397);
        setIntElement(term387, 1, 1622346318);
        setField(term333, term333.getClass(), "argumentNumbers", term387);
        setIntField(term333, term333.getClass(), "maxOffset", 1048535127);
        HashMap term2914 = new HashMap();
        term2911 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term2915 = newInstance(Class.forName("java.util.Locale"));
        Object term2916 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term2927 = (Object[]) newArray("java.text.Format", 1);
        int[] term2928 = (int[]) newIntArray(6);
        int[] term2929 = (int[]) newIntArray(2);
        setField(term2911, term2911.getClass(), "toPattern", "pCTimMblYc");
        setField(term2911, term2911.getClass(), "registry", term2914);
        setField(term2916, term2916.getClass(), "language", "ee");
        setField(term2916, term2916.getClass(), "script", "");
        setField(term2916, term2916.getClass(), "region", "GH");
        setField(term2916, term2916.getClass(), "variant", "");
        setIntField(term2916, term2916.getClass(), "hash", 96354975);
        setField(term2915, term2915.getClass(), "baseLocale", term2916);
        setField(term2915, term2915.getClass(), "localeExtensions", null);
        setIntField(term2915, term2915.getClass(), "hashCodeValue", 96354975);
        setField(term2915, term2915.getClass(), "languageTag", null);
        setField(term2911, term2911.getClass(), "locale", term2915);
        setField(term2911, term2911.getClass(), "pattern", "pCTimMblYc");
        setField(term2911, term2911.getClass(), "formats", term2927);
        setIntElement(term2928, 0, -522618178);
        setIntElement(term2928, 1, 1134449235);
        setIntElement(term2928, 2, -883034806);
        setIntElement(term2928, 3, 1585847225);
        setIntElement(term2928, 4, 597278769);
        setIntElement(term2928, 5, -1685132342);
        setField(term2911, term2911.getClass(), "offsets", term2928);
        setIntElement(term2929, 0, -1456670397);
        setIntElement(term2929, 1, 1622346318);
        setField(term2911, term2911.getClass(), "argumentNumbers", term2929);
        setIntField(term2911, term2911.getClass(), "maxOffset", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pCTimMblYc";
        callMethod(klass, "applyPattern", argTypes, term333, args);
        assertTrue(recursiveEquals(term333, term2911));
    }

};


