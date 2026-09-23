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

public class ExtendedMessageFormat_next_61772354234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1412;
     Object term1468;
     Object term5676;
     Object term5695;
     Object term5617;

    public ExtendedMessageFormat_next_61772354234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1425 = new HashMap();
        term1412 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term1430 = newInstance(Class.forName("java.util.Locale"));
        Object term1431 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1456 = (Object[]) newArray("java.text.Format", 1);
        int[] term1457 = (int[]) newIntArray(0);
        int[] term1458 = (int[]) newIntArray(8);
        setField(term1412, term1412.getClass(), "toPattern", "hxCBltsObl");
        setField(term1412, term1412.getClass(), "registry", term1425);
        setField(term1431, term1431.getClass(), "language", "bm");
        setField(term1431, term1431.getClass(), "script", "");
        setField(term1431, term1431.getClass(), "region", "");
        setField(term1431, term1431.getClass(), "variant", "");
        setIntField(term1431, term1431.getClass(), "hash", 93752277);
        setField(term1430, term1430.getClass(), "baseLocale", term1431);
        setField(term1430, term1430.getClass(), "localeExtensions", null);
        setIntField(term1430, term1430.getClass(), "hashCodeValue", 93752277);
        setField(term1430, term1430.getClass(), "languageTag", null);
        setField(term1412, term1412.getClass(), "locale", term1430);
        setField(term1412, term1412.getClass(), "pattern", "BndsHwAFMv");
        setField(term1412, term1412.getClass(), "formats", term1456);
        setField(term1412, term1412.getClass(), "offsets", term1457);
        setIntElement(term1458, 0, 202001407);
        setIntElement(term1458, 1, 158873461);
        setIntElement(term1458, 2, -430151637);
        setIntElement(term1458, 3, -1697741339);
        setIntElement(term1458, 4, 98922530);
        setIntElement(term1458, 5, -1388471422);
        setIntElement(term1458, 6, -1498296052);
        setIntElement(term1458, 7, 2098647989);
        setField(term1412, term1412.getClass(), "argumentNumbers", term1458);
        setIntField(term1412, term1412.getClass(), "maxOffset", 1598895173);
        term1468 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term1468, term1468.getClass(), "index", 1953277050);
        setIntField(term1468, term1468.getClass(), "errorIndex", 1283079251);
        HashMap term5679 = new HashMap();
        term5676 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term5680 = newInstance(Class.forName("java.util.Locale"));
        Object term5681 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term5692 = (Object[]) newArray("java.text.Format", 1);
        int[] term5693 = (int[]) newIntArray(0);
        int[] term5694 = (int[]) newIntArray(8);
        setField(term5676, term5676.getClass(), "toPattern", "hxCBltsObl");
        setField(term5676, term5676.getClass(), "registry", term5679);
        setField(term5681, term5681.getClass(), "language", "bm");
        setField(term5681, term5681.getClass(), "script", "");
        setField(term5681, term5681.getClass(), "region", "");
        setField(term5681, term5681.getClass(), "variant", "");
        setIntField(term5681, term5681.getClass(), "hash", 93752277);
        setField(term5680, term5680.getClass(), "baseLocale", term5681);
        setField(term5680, term5680.getClass(), "localeExtensions", null);
        setIntField(term5680, term5680.getClass(), "hashCodeValue", 93752277);
        setField(term5680, term5680.getClass(), "languageTag", null);
        setField(term5676, term5676.getClass(), "locale", term5680);
        setField(term5676, term5676.getClass(), "pattern", "BndsHwAFMv");
        setField(term5676, term5676.getClass(), "formats", term5692);
        setField(term5676, term5676.getClass(), "offsets", term5693);
        setIntElement(term5694, 0, 202001407);
        setIntElement(term5694, 1, 158873461);
        setIntElement(term5694, 2, -430151637);
        setIntElement(term5694, 3, -1697741339);
        setIntElement(term5694, 4, 98922530);
        setIntElement(term5694, 5, -1388471422);
        setIntElement(term5694, 6, -1498296052);
        setIntElement(term5694, 7, 2098647989);
        setField(term5676, term5676.getClass(), "argumentNumbers", term5694);
        setIntField(term5676, term5676.getClass(), "maxOffset", 1598895173);
        term5695 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term5695, term5695.getClass(), "index", 1953277051);
        setIntField(term5695, term5695.getClass(), "errorIndex", 1283079251);
        term5617 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term5617, term5617.getClass(), "index", 1953277051);
        setIntField(term5617, term5617.getClass(), "errorIndex", 1283079251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.text.ParsePosition");
        Object[] args = new Object[1];
        args[0] = term1468;
        Object retValue = callMethod(klass, "next", argTypes, term1412, args);
        assertTrue(recursiveEquals(term1412, term5676));
        assertTrue(recursiveEquals(term1468, term5695));
        assertTrue(recursiveEquals(retValue, term5617));
    }

};


