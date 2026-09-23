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
import java.lang.UnsupportedOperationException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class ExtendedMessageFormat_setFormatsByArgumentIndex_127791127028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term650;
     Object term714;

    public ExtendedMessageFormat_setFormatsByArgumentIndex_127791127028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term663 = new HashMap();
        term650 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term668 = newInstance(Class.forName("java.util.Locale"));
        Object term669 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term696 = (Object[]) newArray("java.text.Format", 2);
        int[] term697 = (int[]) newIntArray(8);
        int[] term706 = (int[]) newIntArray(6);
        setField(term650, term650.getClass(), "toPattern", "aJlieCFVtF");
        setField(term650, term650.getClass(), "registry", term663);
        setField(term669, term669.getClass(), "language", "fr");
        setField(term669, term669.getClass(), "script", "");
        setField(term669, term669.getClass(), "region", "CI");
        setField(term669, term669.getClass(), "variant", "");
        setIntField(term669, term669.getClass(), "hash", 97661966);
        setField(term668, term668.getClass(), "baseLocale", term669);
        setField(term668, term668.getClass(), "localeExtensions", null);
        setIntField(term668, term668.getClass(), "hashCodeValue", 97661966);
        setField(term668, term668.getClass(), "languageTag", null);
        setField(term650, term650.getClass(), "locale", term668);
        setField(term650, term650.getClass(), "pattern", "ZiaGIbnzTs");
        setField(term650, term650.getClass(), "formats", term696);
        setIntElement(term697, 0, 1328271830);
        setIntElement(term697, 1, 1596070772);
        setIntElement(term697, 2, 97029295);
        setIntElement(term697, 3, -1371869594);
        setIntElement(term697, 4, -2095575670);
        setIntElement(term697, 5, 1225272962);
        setIntElement(term697, 6, 1324040357);
        setIntElement(term697, 7, -1588772968);
        setField(term650, term650.getClass(), "offsets", term697);
        setIntElement(term706, 0, -93135961);
        setIntElement(term706, 1, -112921587);
        setIntElement(term706, 2, 933028652);
        setIntElement(term706, 3, 287287233);
        setIntElement(term706, 4, 962840079);
        setIntElement(term706, 5, 1540719661);
        setField(term650, term650.getClass(), "argumentNumbers", term706);
        setIntField(term650, term650.getClass(), "maxOffset", 1265463001);
        term714 = (Object[]) newArray("java.text.Format", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.text.Format"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term714;
        try {
            callMethod(klass, "setFormatsByArgumentIndex", argTypes, term650, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


