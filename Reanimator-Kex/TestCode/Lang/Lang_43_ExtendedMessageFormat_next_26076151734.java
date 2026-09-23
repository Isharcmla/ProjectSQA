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

public class ExtendedMessageFormat_next_26076151734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1344;
     Object term1400;
     Object term5633;
     Object term5652;
     Object term5574;

    public ExtendedMessageFormat_next_26076151734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1357 = new HashMap();
        term1344 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term1362 = newInstance(Class.forName("java.util.Locale"));
        Object term1363 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1388 = (Object[]) newArray("java.text.Format", 1);
        int[] term1389 = (int[]) newIntArray(0);
        int[] term1390 = (int[]) newIntArray(8);
        setField(term1344, term1344.getClass(), "toPattern", "AijpHYOFuy");
        setField(term1344, term1344.getClass(), "registry", term1357);
        setField(term1363, term1363.getClass(), "language", "bm");
        setField(term1363, term1363.getClass(), "script", "");
        setField(term1363, term1363.getClass(), "region", "");
        setField(term1363, term1363.getClass(), "variant", "");
        setIntField(term1363, term1363.getClass(), "hash", 93752277);
        setField(term1362, term1362.getClass(), "baseLocale", term1363);
        setField(term1362, term1362.getClass(), "localeExtensions", null);
        setIntField(term1362, term1362.getClass(), "hashCodeValue", 93752277);
        setField(term1362, term1362.getClass(), "languageTag", null);
        setField(term1344, term1344.getClass(), "locale", term1362);
        setField(term1344, term1344.getClass(), "pattern", "SbAoxhfrkn");
        setField(term1344, term1344.getClass(), "formats", term1388);
        setField(term1344, term1344.getClass(), "offsets", term1389);
        setIntElement(term1390, 0, 202001407);
        setIntElement(term1390, 1, 158873461);
        setIntElement(term1390, 2, -430151637);
        setIntElement(term1390, 3, -1697741339);
        setIntElement(term1390, 4, 98922530);
        setIntElement(term1390, 5, -1388471422);
        setIntElement(term1390, 6, -1498296052);
        setIntElement(term1390, 7, 2098647989);
        setField(term1344, term1344.getClass(), "argumentNumbers", term1390);
        setIntField(term1344, term1344.getClass(), "maxOffset", 1598895173);
        term1400 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term1400, term1400.getClass(), "index", 1953277050);
        setIntField(term1400, term1400.getClass(), "errorIndex", 1283079251);
        HashMap term5636 = new HashMap();
        term5633 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term5637 = newInstance(Class.forName("java.util.Locale"));
        Object term5638 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term5649 = (Object[]) newArray("java.text.Format", 1);
        int[] term5650 = (int[]) newIntArray(0);
        int[] term5651 = (int[]) newIntArray(8);
        setField(term5633, term5633.getClass(), "toPattern", "AijpHYOFuy");
        setField(term5633, term5633.getClass(), "registry", term5636);
        setField(term5638, term5638.getClass(), "language", "bm");
        setField(term5638, term5638.getClass(), "script", "");
        setField(term5638, term5638.getClass(), "region", "");
        setField(term5638, term5638.getClass(), "variant", "");
        setIntField(term5638, term5638.getClass(), "hash", 93752277);
        setField(term5637, term5637.getClass(), "baseLocale", term5638);
        setField(term5637, term5637.getClass(), "localeExtensions", null);
        setIntField(term5637, term5637.getClass(), "hashCodeValue", 93752277);
        setField(term5637, term5637.getClass(), "languageTag", null);
        setField(term5633, term5633.getClass(), "locale", term5637);
        setField(term5633, term5633.getClass(), "pattern", "SbAoxhfrkn");
        setField(term5633, term5633.getClass(), "formats", term5649);
        setField(term5633, term5633.getClass(), "offsets", term5650);
        setIntElement(term5651, 0, 202001407);
        setIntElement(term5651, 1, 158873461);
        setIntElement(term5651, 2, -430151637);
        setIntElement(term5651, 3, -1697741339);
        setIntElement(term5651, 4, 98922530);
        setIntElement(term5651, 5, -1388471422);
        setIntElement(term5651, 6, -1498296052);
        setIntElement(term5651, 7, 2098647989);
        setField(term5633, term5633.getClass(), "argumentNumbers", term5651);
        setIntField(term5633, term5633.getClass(), "maxOffset", 1598895173);
        term5652 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term5652, term5652.getClass(), "index", 1953277051);
        setIntField(term5652, term5652.getClass(), "errorIndex", 1283079251);
        term5574 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term5574, term5574.getClass(), "index", 1953277051);
        setIntField(term5574, term5574.getClass(), "errorIndex", 1283079251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.text.ParsePosition");
        Object[] args = new Object[1];
        args[0] = term1400;
        Object retValue = callMethod(klass, "next", argTypes, term1344, args);
        assertTrue(recursiveEquals(term1344, term5633));
        assertTrue(recursiveEquals(term1400, term5652));
        assertTrue(recursiveEquals(retValue, term5574));
    }

};


