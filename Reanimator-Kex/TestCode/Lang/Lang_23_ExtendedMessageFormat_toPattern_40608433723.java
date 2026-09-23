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

public class ExtendedMessageFormat_toPattern_40608433723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247;
     Object term2697;

    public ExtendedMessageFormat_toPattern_40608433723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term260 = new HashMap();
        term247 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term265 = newInstance(Class.forName("java.util.Locale"));
        Object term266 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term292 = (Object[]) newArray("java.text.Format", 4);
        int[] term293 = (int[]) newIntArray(3);
        int[] term297 = (int[]) newIntArray(4);
        setField(term247, term247.getClass(), "toPattern", "aJlieCFVtF");
        setField(term247, term247.getClass(), "registry", term260);
        setField(term266, term266.getClass(), "language", "kab");
        setField(term266, term266.getClass(), "script", "");
        setField(term266, term266.getClass(), "region", "");
        setField(term266, term266.getClass(), "variant", "");
        setIntField(term266, term266.getClass(), "hash", -1139147084);
        setField(term265, term265.getClass(), "baseLocale", term266);
        setField(term265, term265.getClass(), "localeExtensions", null);
        setIntField(term265, term265.getClass(), "hashCodeValue", -1139147084);
        setField(term265, term265.getClass(), "languageTag", null);
        setField(term247, term247.getClass(), "locale", term265);
        setField(term247, term247.getClass(), "pattern", "ZiaGIbnzTs");
        setField(term247, term247.getClass(), "formats", term292);
        setIntElement(term293, 0, 568599855);
        setIntElement(term293, 1, 1162663216);
        setIntElement(term293, 2, 1484323161);
        setField(term247, term247.getClass(), "offsets", term293);
        setIntElement(term297, 0, 391863371);
        setIntElement(term297, 1, -1922583790);
        setIntElement(term297, 2, -616727354);
        setIntElement(term297, 3, -1955890973);
        setField(term247, term247.getClass(), "argumentNumbers", term297);
        setIntField(term247, term247.getClass(), "maxOffset", -2038273078);
        HashMap term2700 = new HashMap();
        term2697 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term2701 = newInstance(Class.forName("java.util.Locale"));
        Object term2702 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term2713 = (Object[]) newArray("java.text.Format", 4);
        int[] term2714 = (int[]) newIntArray(3);
        int[] term2715 = (int[]) newIntArray(4);
        setField(term2697, term2697.getClass(), "toPattern", "aJlieCFVtF");
        setField(term2697, term2697.getClass(), "registry", term2700);
        setField(term2702, term2702.getClass(), "language", "kab");
        setField(term2702, term2702.getClass(), "script", "");
        setField(term2702, term2702.getClass(), "region", "");
        setField(term2702, term2702.getClass(), "variant", "");
        setIntField(term2702, term2702.getClass(), "hash", -1139147084);
        setField(term2701, term2701.getClass(), "baseLocale", term2702);
        setField(term2701, term2701.getClass(), "localeExtensions", null);
        setIntField(term2701, term2701.getClass(), "hashCodeValue", -1139147084);
        setField(term2701, term2701.getClass(), "languageTag", null);
        setField(term2697, term2697.getClass(), "locale", term2701);
        setField(term2697, term2697.getClass(), "pattern", "ZiaGIbnzTs");
        setField(term2697, term2697.getClass(), "formats", term2713);
        setIntElement(term2714, 0, 568599855);
        setIntElement(term2714, 1, 1162663216);
        setIntElement(term2714, 2, 1484323161);
        setField(term2697, term2697.getClass(), "offsets", term2714);
        setIntElement(term2715, 0, 391863371);
        setIntElement(term2715, 1, -1922583790);
        setIntElement(term2715, 2, -616727354);
        setIntElement(term2715, 3, -1955890973);
        setField(term2697, term2697.getClass(), "argumentNumbers", term2715);
        setIntField(term2697, term2697.getClass(), "maxOffset", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toPattern", argTypes, term247, args);
        assertTrue(recursiveEquals(term247, term2697));
        assertTrue(recursiveEquals(retValue, "aJlieCFVtF"));
    }

};


