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
import java.lang.IllegalArgumentException;
import static org.apache.commons.lang3.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Boolean;

public class ExtendedMessageFormat_appendQuotedString_81625729835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1501;
     Object term1562;
     Object term1565;
     Object term1585;

    public ExtendedMessageFormat_appendQuotedString_81625729835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1514 = new HashMap();
        term1501 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term1519 = newInstance(Class.forName("java.util.Locale"));
        Object term1520 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1545 = (Object[]) newArray("java.text.Format", 0);
        int[] term1546 = (int[]) newIntArray(0);
        int[] term1547 = (int[]) newIntArray(1);
        setField(term1501, term1501.getClass(), "toPattern", "GzFkzHGYFt");
        setField(term1501, term1501.getClass(), "registry", term1514);
        setField(term1520, term1520.getClass(), "language", "be");
        setField(term1520, term1520.getClass(), "script", "");
        setField(term1520, term1520.getClass(), "region", "");
        setField(term1520, term1520.getClass(), "variant", "");
        setIntField(term1520, term1520.getClass(), "hash", 93513949);
        setField(term1519, term1519.getClass(), "baseLocale", term1520);
        setField(term1519, term1519.getClass(), "localeExtensions", null);
        setIntField(term1519, term1519.getClass(), "hashCodeValue", 93513949);
        setField(term1519, term1519.getClass(), "languageTag", null);
        setField(term1501, term1501.getClass(), "locale", term1519);
        setField(term1501, term1501.getClass(), "pattern", "tShwQLRGNe");
        setField(term1501, term1501.getClass(), "formats", term1545);
        setField(term1501, term1501.getClass(), "offsets", term1546);
        setIntElement(term1547, 0, -523949691);
        setField(term1501, term1501.getClass(), "argumentNumbers", term1547);
        setIntField(term1501, term1501.getClass(), "maxOffset", 1398204340);
        term1562 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term1562, term1562.getClass(), "index", 1384592638);
        setIntField(term1562, term1562.getClass(), "errorIndex", -1002370457);
        term1565 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1566 = (byte[]) newByteArray(16);
        setField(term1565, term1565.getClass(), "value", term1566);
        setByteField(term1565, term1565.getClass(), "coder", (byte) 47);
        setIntField(term1565, term1565.getClass(), "count", -2014576105);
        term1585 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.text.ParsePosition");
        argTypes[2] = Class.forName("java.lang.StringBuilder");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "LvtrsXUliU";
        args[1] = term1562;
        args[2] = term1565;
        args[3] = term1585;
        try {
            callMethod(klass, "appendQuotedString", argTypes, term1501, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


