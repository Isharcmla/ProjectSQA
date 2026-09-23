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
import java.lang.Integer;

public class ExtendedMessageFormat_setFormat_52426625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445;
     Object term504;

    public ExtendedMessageFormat_setFormat_52426625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term458 = new HashMap();
        term445 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term463 = newInstance(Class.forName("java.util.Locale"));
        Object term464 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term492 = (Object[]) newArray("java.text.Format", 6);
        int[] term493 = (int[]) newIntArray(7);
        int[] term501 = (int[]) newIntArray(1);
        setField(term445, term445.getClass(), "toPattern", "hNxWaHcfhY");
        setField(term445, term445.getClass(), "registry", term458);
        setField(term464, term464.getClass(), "language", "chr");
        setField(term464, term464.getClass(), "script", "");
        setField(term464, term464.getClass(), "region", "US");
        setField(term464, term464.getClass(), "variant", "");
        setIntField(term464, term464.getClass(), "hash", -1361154731);
        setField(term463, term463.getClass(), "baseLocale", term464);
        setField(term463, term463.getClass(), "localeExtensions", null);
        setIntField(term463, term463.getClass(), "hashCodeValue", -1361154731);
        setField(term463, term463.getClass(), "languageTag", null);
        setField(term445, term445.getClass(), "locale", term463);
        setField(term445, term445.getClass(), "pattern", "RkybSrpybU");
        setField(term445, term445.getClass(), "formats", term492);
        setIntElement(term493, 0, -117576464);
        setIntElement(term493, 1, -1007160944);
        setIntElement(term493, 2, 1135664017);
        setIntElement(term493, 3, 590364439);
        setIntElement(term493, 4, 865208305);
        setIntElement(term493, 5, -1275173084);
        setIntElement(term493, 6, -244121226);
        setField(term445, term445.getClass(), "offsets", term493);
        setIntElement(term501, 0, -203030934);
        setField(term445, term445.getClass(), "argumentNumbers", term501);
        setIntField(term445, term445.getClass(), "maxOffset", -1179120542);
        term504 = new Integer(-1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.text.Format");
        Object[] args = new Object[2];
        args[0] = term504;
        args[1] = null;
        try {
            callMethod(klass, "setFormat", argTypes, term445, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


