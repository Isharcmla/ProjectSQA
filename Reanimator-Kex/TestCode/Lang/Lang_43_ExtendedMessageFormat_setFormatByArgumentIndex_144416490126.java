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
import java.lang.Integer;

public class ExtendedMessageFormat_setFormatByArgumentIndex_144416490126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471;
     Object term531;

    public ExtendedMessageFormat_setFormatByArgumentIndex_144416490126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term484 = new HashMap();
        term471 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term489 = newInstance(Class.forName("java.util.Locale"));
        Object term490 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term517 = (Object[]) newArray("java.text.Format", 6);
        int[] term518 = (int[]) newIntArray(5);
        int[] term524 = (int[]) newIntArray(5);
        setField(term471, term471.getClass(), "toPattern", "uuaPigETmJ");
        setField(term471, term471.getClass(), "registry", term484);
        setField(term490, term490.getClass(), "language", "en");
        setField(term490, term490.getClass(), "script", "");
        setField(term490, term490.getClass(), "region", "GU");
        setField(term490, term490.getClass(), "variant", "");
        setIntField(term490, term490.getClass(), "hash", 96623497);
        setField(term489, term489.getClass(), "baseLocale", term490);
        setField(term489, term489.getClass(), "localeExtensions", null);
        setIntField(term489, term489.getClass(), "hashCodeValue", 96623497);
        setField(term489, term489.getClass(), "languageTag", null);
        setField(term471, term471.getClass(), "locale", term489);
        setField(term471, term471.getClass(), "pattern", "MxlszYVzRf");
        setField(term471, term471.getClass(), "formats", term517);
        setIntElement(term518, 0, -1530420153);
        setIntElement(term518, 1, -469968304);
        setIntElement(term518, 2, -1145578966);
        setIntElement(term518, 3, 679763016);
        setIntElement(term518, 4, 1962444399);
        setField(term471, term471.getClass(), "offsets", term518);
        setIntElement(term524, 0, 767834723);
        setIntElement(term524, 1, -602026508);
        setIntElement(term524, 2, -157887805);
        setIntElement(term524, 3, 1876565163);
        setIntElement(term524, 4, -817164822);
        setField(term471, term471.getClass(), "argumentNumbers", term524);
        setIntField(term471, term471.getClass(), "maxOffset", -1016503459);
        term531 = new Integer(1632125673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.text.Format");
        Object[] args = new Object[2];
        args[0] = term531;
        args[1] = null;
        try {
            callMethod(klass, "setFormatByArgumentIndex", argTypes, term471, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


