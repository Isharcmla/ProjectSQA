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
import java.lang.UnsupportedOperationException;
import static org.apache.commons.lang3.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class ExtendedMessageFormat_setFormatsByArgumentIndex_39942621128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term718;
     Object term782;

    public ExtendedMessageFormat_setFormatsByArgumentIndex_39942621128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term731 = new HashMap();
        term718 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term736 = newInstance(Class.forName("java.util.Locale"));
        Object term737 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term764 = (Object[]) newArray("java.text.Format", 2);
        int[] term765 = (int[]) newIntArray(8);
        int[] term774 = (int[]) newIntArray(6);
        setField(term718, term718.getClass(), "toPattern", "flxyYxBRtu");
        setField(term718, term718.getClass(), "registry", term731);
        setField(term737, term737.getClass(), "language", "fr");
        setField(term737, term737.getClass(), "script", "");
        setField(term737, term737.getClass(), "region", "CI");
        setField(term737, term737.getClass(), "variant", "");
        setIntField(term737, term737.getClass(), "hash", 97661966);
        setField(term736, term736.getClass(), "baseLocale", term737);
        setField(term736, term736.getClass(), "localeExtensions", null);
        setIntField(term736, term736.getClass(), "hashCodeValue", 97661966);
        setField(term736, term736.getClass(), "languageTag", null);
        setField(term718, term718.getClass(), "locale", term736);
        setField(term718, term718.getClass(), "pattern", "OclPbYPkcH");
        setField(term718, term718.getClass(), "formats", term764);
        setIntElement(term765, 0, 1328271830);
        setIntElement(term765, 1, 1596070772);
        setIntElement(term765, 2, 97029295);
        setIntElement(term765, 3, -1371869594);
        setIntElement(term765, 4, -2095575670);
        setIntElement(term765, 5, 1225272962);
        setIntElement(term765, 6, 1324040357);
        setIntElement(term765, 7, -1588772968);
        setField(term718, term718.getClass(), "offsets", term765);
        setIntElement(term774, 0, -93135961);
        setIntElement(term774, 1, -112921587);
        setIntElement(term774, 2, 933028652);
        setIntElement(term774, 3, 287287233);
        setIntElement(term774, 4, 962840079);
        setIntElement(term774, 5, 1540719661);
        setField(term718, term718.getClass(), "argumentNumbers", term774);
        setIntField(term718, term718.getClass(), "maxOffset", 1265463001);
        term782 = (Object[]) newArray("java.text.Format", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.text.Format"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term782;
        try {
            callMethod(klass, "setFormatsByArgumentIndex", argTypes, term718, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


