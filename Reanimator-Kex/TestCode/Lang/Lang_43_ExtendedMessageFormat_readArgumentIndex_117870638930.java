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

public class ExtendedMessageFormat_readArgumentIndex_117870638930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term881;
     Object term958;

    public ExtendedMessageFormat_readArgumentIndex_117870638930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term894 = new HashMap();
        term881 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term899 = newInstance(Class.forName("java.util.Locale"));
        Object term900 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term931 = (Object[]) newArray("java.text.Format", 5);
        int[] term932 = (int[]) newIntArray(6);
        int[] term939 = (int[]) newIntArray(5);
        setField(term881, term881.getClass(), "toPattern", "hNxWaHcfhY");
        setField(term881, term881.getClass(), "registry", term894);
        setField(term900, term900.getClass(), "language", "zh");
        setField(term900, term900.getClass(), "script", "Hans");
        setField(term900, term900.getClass(), "region", "MO");
        setField(term900, term900.getClass(), "variant", "");
        setIntField(term900, term900.getClass(), "hash", -2024855090);
        setField(term899, term899.getClass(), "baseLocale", term900);
        setField(term899, term899.getClass(), "localeExtensions", null);
        setIntField(term899, term899.getClass(), "hashCodeValue", -2024855090);
        setField(term899, term899.getClass(), "languageTag", null);
        setField(term881, term881.getClass(), "locale", term899);
        setField(term881, term881.getClass(), "pattern", "RkybSrpybU");
        setField(term881, term881.getClass(), "formats", term931);
        setIntElement(term932, 0, -344842608);
        setIntElement(term932, 1, 941650513);
        setIntElement(term932, 2, 444029505);
        setIntElement(term932, 3, -1034506028);
        setIntElement(term932, 4, -1263114719);
        setIntElement(term932, 5, -894662986);
        setField(term881, term881.getClass(), "offsets", term932);
        setIntElement(term939, 0, 304775596);
        setIntElement(term939, 1, -1347665717);
        setIntElement(term939, 2, -1888585309);
        setIntElement(term939, 3, 683666002);
        setIntElement(term939, 4, 1596213415);
        setField(term881, term881.getClass(), "argumentNumbers", term939);
        setIntField(term881, term881.getClass(), "maxOffset", -268815336);
        term958 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term958, term958.getClass(), "index", -615654495);
        setIntField(term958, term958.getClass(), "errorIndex", -1476117762);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.text.ParsePosition");
        Object[] args = new Object[2];
        args[0] = "xOEqzGAmDU";
        args[1] = term958;
        try {
            callMethod(klass, "readArgumentIndex", argTypes, term881, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


