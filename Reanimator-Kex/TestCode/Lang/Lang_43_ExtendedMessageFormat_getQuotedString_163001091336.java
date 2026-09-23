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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Boolean;

public class ExtendedMessageFormat_getQuotedString_163001091336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1590;
     Object term1660;
     Object term1663;

    public ExtendedMessageFormat_getQuotedString_163001091336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1603 = new HashMap();
        term1590 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term1608 = newInstance(Class.forName("java.util.Locale"));
        Object term1609 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1636 = (Object[]) newArray("java.text.Format", 5);
        int[] term1637 = (int[]) newIntArray(4);
        int[] term1642 = (int[]) newIntArray(4);
        setField(term1590, term1590.getClass(), "toPattern", "nyiiPDVjAc");
        setField(term1590, term1590.getClass(), "registry", term1603);
        setField(term1609, term1609.getClass(), "language", "ca");
        setField(term1609, term1609.getClass(), "script", "");
        setField(term1609, term1609.getClass(), "region", "FR");
        setField(term1609, term1609.getClass(), "variant", "");
        setIntField(term1609, term1609.getClass(), "hash", 94388118);
        setField(term1608, term1608.getClass(), "baseLocale", term1609);
        setField(term1608, term1608.getClass(), "localeExtensions", null);
        setIntField(term1608, term1608.getClass(), "hashCodeValue", 94388118);
        setField(term1608, term1608.getClass(), "languageTag", null);
        setField(term1590, term1590.getClass(), "locale", term1608);
        setField(term1590, term1590.getClass(), "pattern", "aKnKipADSo");
        setField(term1590, term1590.getClass(), "formats", term1636);
        setIntElement(term1637, 0, 1296895584);
        setIntElement(term1637, 1, 628918458);
        setIntElement(term1637, 2, -1274456137);
        setIntElement(term1637, 3, 1041916673);
        setField(term1590, term1590.getClass(), "offsets", term1637);
        setIntElement(term1642, 0, -601863069);
        setIntElement(term1642, 1, 663292551);
        setIntElement(term1642, 2, -1885090354);
        setIntElement(term1642, 3, -2066804303);
        setField(term1590, term1590.getClass(), "argumentNumbers", term1642);
        setIntField(term1590, term1590.getClass(), "maxOffset", -1731761810);
        term1660 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term1660, term1660.getClass(), "index", -1504890659);
        setIntField(term1660, term1660.getClass(), "errorIndex", 1358829571);
        term1663 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.text.ParsePosition");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "wSQxaModmm";
        args[1] = term1660;
        args[2] = term1663;
        try {
            callMethod(klass, "getQuotedString", argTypes, term1590, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


