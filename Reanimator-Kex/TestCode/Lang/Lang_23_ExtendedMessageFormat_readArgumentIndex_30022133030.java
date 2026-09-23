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

public class ExtendedMessageFormat_readArgumentIndex_30022133030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term949;
     Object term1026;

    public ExtendedMessageFormat_readArgumentIndex_30022133030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term962 = new HashMap();
        term949 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term967 = newInstance(Class.forName("java.util.Locale"));
        Object term968 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term999 = (Object[]) newArray("java.text.Format", 5);
        int[] term1000 = (int[]) newIntArray(6);
        int[] term1007 = (int[]) newIntArray(5);
        setField(term949, term949.getClass(), "toPattern", "dWRymuLBtr");
        setField(term949, term949.getClass(), "registry", term962);
        setField(term968, term968.getClass(), "language", "zh");
        setField(term968, term968.getClass(), "script", "Hans");
        setField(term968, term968.getClass(), "region", "MO");
        setField(term968, term968.getClass(), "variant", "");
        setIntField(term968, term968.getClass(), "hash", -2024855090);
        setField(term967, term967.getClass(), "baseLocale", term968);
        setField(term967, term967.getClass(), "localeExtensions", null);
        setIntField(term967, term967.getClass(), "hashCodeValue", -2024855090);
        setField(term967, term967.getClass(), "languageTag", null);
        setField(term949, term949.getClass(), "locale", term967);
        setField(term949, term949.getClass(), "pattern", "AijpHYOFuy");
        setField(term949, term949.getClass(), "formats", term999);
        setIntElement(term1000, 0, -344842608);
        setIntElement(term1000, 1, 941650513);
        setIntElement(term1000, 2, 444029505);
        setIntElement(term1000, 3, -1034506028);
        setIntElement(term1000, 4, -1263114719);
        setIntElement(term1000, 5, -894662986);
        setField(term949, term949.getClass(), "offsets", term1000);
        setIntElement(term1007, 0, 304775596);
        setIntElement(term1007, 1, -1347665717);
        setIntElement(term1007, 2, -1888585309);
        setIntElement(term1007, 3, 683666002);
        setIntElement(term1007, 4, 1596213415);
        setField(term949, term949.getClass(), "argumentNumbers", term1007);
        setIntField(term949, term949.getClass(), "maxOffset", -268815336);
        term1026 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term1026, term1026.getClass(), "index", -615654495);
        setIntField(term1026, term1026.getClass(), "errorIndex", -1476117762);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.text.ParsePosition");
        Object[] args = new Object[2];
        args[0] = "SbAoxhfrkn";
        args[1] = term1026;
        try {
            callMethod(klass, "readArgumentIndex", argTypes, term949, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


