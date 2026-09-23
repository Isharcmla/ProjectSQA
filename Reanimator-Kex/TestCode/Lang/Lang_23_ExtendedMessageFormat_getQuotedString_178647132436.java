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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang3.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Boolean;

public class ExtendedMessageFormat_getQuotedString_178647132436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1636;
     Object term1706;
     Object term1709;

    public ExtendedMessageFormat_getQuotedString_178647132436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1649 = new HashMap();
        term1636 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term1654 = newInstance(Class.forName("java.util.Locale"));
        Object term1655 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1682 = (Object[]) newArray("java.text.Format", 5);
        int[] term1683 = (int[]) newIntArray(4);
        int[] term1688 = (int[]) newIntArray(4);
        setField(term1636, term1636.getClass(), "toPattern", "xLbjWUgOIL");
        setField(term1636, term1636.getClass(), "registry", term1649);
        setField(term1655, term1655.getClass(), "language", "ca");
        setField(term1655, term1655.getClass(), "script", "");
        setField(term1655, term1655.getClass(), "region", "FR");
        setField(term1655, term1655.getClass(), "variant", "");
        setIntField(term1655, term1655.getClass(), "hash", 94388118);
        setField(term1654, term1654.getClass(), "baseLocale", term1655);
        setField(term1654, term1654.getClass(), "localeExtensions", null);
        setIntField(term1654, term1654.getClass(), "hashCodeValue", 94388118);
        setField(term1654, term1654.getClass(), "languageTag", null);
        setField(term1636, term1636.getClass(), "locale", term1654);
        setField(term1636, term1636.getClass(), "pattern", "jDtqGUpnZN");
        setField(term1636, term1636.getClass(), "formats", term1682);
        setIntElement(term1683, 0, 1296895584);
        setIntElement(term1683, 1, 628918458);
        setIntElement(term1683, 2, -1274456137);
        setIntElement(term1683, 3, 1041916673);
        setField(term1636, term1636.getClass(), "offsets", term1683);
        setIntElement(term1688, 0, -601863069);
        setIntElement(term1688, 1, 663292551);
        setIntElement(term1688, 2, -1885090354);
        setIntElement(term1688, 3, -2066804303);
        setField(term1636, term1636.getClass(), "argumentNumbers", term1688);
        setIntField(term1636, term1636.getClass(), "maxOffset", -1731761810);
        term1706 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term1706, term1706.getClass(), "index", -1504890659);
        setIntField(term1706, term1706.getClass(), "errorIndex", 1358829571);
        term1709 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.text.ParsePosition");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "nGKItKLYNC";
        args[1] = term1706;
        args[2] = term1709;
        try {
            callMethod(klass, "getQuotedString", argTypes, term1636, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


