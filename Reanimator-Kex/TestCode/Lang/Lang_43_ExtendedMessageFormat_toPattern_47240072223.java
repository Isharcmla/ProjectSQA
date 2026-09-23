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

public class ExtendedMessageFormat_toPattern_47240072223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179;
     Object term2651;

    public ExtendedMessageFormat_toPattern_47240072223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term192 = new HashMap();
        term179 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term197 = newInstance(Class.forName("java.util.Locale"));
        Object term198 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term224 = (Object[]) newArray("java.text.Format", 4);
        int[] term225 = (int[]) newIntArray(3);
        int[] term229 = (int[]) newIntArray(4);
        setField(term179, term179.getClass(), "toPattern", "jJCZpVmanW");
        setField(term179, term179.getClass(), "registry", term192);
        setField(term198, term198.getClass(), "language", "kab");
        setField(term198, term198.getClass(), "script", "");
        setField(term198, term198.getClass(), "region", "");
        setField(term198, term198.getClass(), "variant", "");
        setIntField(term198, term198.getClass(), "hash", -1139147084);
        setField(term197, term197.getClass(), "baseLocale", term198);
        setField(term197, term197.getClass(), "localeExtensions", null);
        setIntField(term197, term197.getClass(), "hashCodeValue", -1139147084);
        setField(term197, term197.getClass(), "languageTag", null);
        setField(term179, term179.getClass(), "locale", term197);
        setField(term179, term179.getClass(), "pattern", "EGtDIRbSSb");
        setField(term179, term179.getClass(), "formats", term224);
        setIntElement(term225, 0, 568599855);
        setIntElement(term225, 1, 1162663216);
        setIntElement(term225, 2, 1484323161);
        setField(term179, term179.getClass(), "offsets", term225);
        setIntElement(term229, 0, 391863371);
        setIntElement(term229, 1, -1922583790);
        setIntElement(term229, 2, -616727354);
        setIntElement(term229, 3, -1955890973);
        setField(term179, term179.getClass(), "argumentNumbers", term229);
        setIntField(term179, term179.getClass(), "maxOffset", -2038273078);
        HashMap term2654 = new HashMap();
        term2651 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term2655 = newInstance(Class.forName("java.util.Locale"));
        Object term2656 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term2667 = (Object[]) newArray("java.text.Format", 4);
        int[] term2668 = (int[]) newIntArray(3);
        int[] term2669 = (int[]) newIntArray(4);
        setField(term2651, term2651.getClass(), "toPattern", "jJCZpVmanW");
        setField(term2651, term2651.getClass(), "registry", term2654);
        setField(term2656, term2656.getClass(), "language", "kab");
        setField(term2656, term2656.getClass(), "script", "");
        setField(term2656, term2656.getClass(), "region", "");
        setField(term2656, term2656.getClass(), "variant", "");
        setIntField(term2656, term2656.getClass(), "hash", -1139147084);
        setField(term2655, term2655.getClass(), "baseLocale", term2656);
        setField(term2655, term2655.getClass(), "localeExtensions", null);
        setIntField(term2655, term2655.getClass(), "hashCodeValue", -1139147084);
        setField(term2655, term2655.getClass(), "languageTag", null);
        setField(term2651, term2651.getClass(), "locale", term2655);
        setField(term2651, term2651.getClass(), "pattern", "EGtDIRbSSb");
        setField(term2651, term2651.getClass(), "formats", term2667);
        setIntElement(term2668, 0, 568599855);
        setIntElement(term2668, 1, 1162663216);
        setIntElement(term2668, 2, 1484323161);
        setField(term2651, term2651.getClass(), "offsets", term2668);
        setIntElement(term2669, 0, 391863371);
        setIntElement(term2669, 1, -1922583790);
        setIntElement(term2669, 2, -616727354);
        setIntElement(term2669, 3, -1955890973);
        setField(term2651, term2651.getClass(), "argumentNumbers", term2669);
        setIntField(term2651, term2651.getClass(), "maxOffset", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toPattern", argTypes, term179, args);
        assertTrue(recursiveEquals(term179, term2651));
        assertTrue(recursiveEquals(retValue, "jJCZpVmanW"));
    }

};


