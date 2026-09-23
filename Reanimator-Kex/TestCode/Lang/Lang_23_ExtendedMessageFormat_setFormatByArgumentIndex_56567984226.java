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

public class ExtendedMessageFormat_setFormatByArgumentIndex_56567984226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term539;
     Object term599;

    public ExtendedMessageFormat_setFormatByArgumentIndex_56567984226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term552 = new HashMap();
        term539 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term557 = newInstance(Class.forName("java.util.Locale"));
        Object term558 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term585 = (Object[]) newArray("java.text.Format", 6);
        int[] term586 = (int[]) newIntArray(5);
        int[] term592 = (int[]) newIntArray(5);
        setField(term539, term539.getClass(), "toPattern", "xOEqzGAmDU");
        setField(term539, term539.getClass(), "registry", term552);
        setField(term558, term558.getClass(), "language", "en");
        setField(term558, term558.getClass(), "script", "");
        setField(term558, term558.getClass(), "region", "GU");
        setField(term558, term558.getClass(), "variant", "");
        setIntField(term558, term558.getClass(), "hash", 96623497);
        setField(term557, term557.getClass(), "baseLocale", term558);
        setField(term557, term557.getClass(), "localeExtensions", null);
        setIntField(term557, term557.getClass(), "hashCodeValue", 96623497);
        setField(term557, term557.getClass(), "languageTag", null);
        setField(term539, term539.getClass(), "locale", term557);
        setField(term539, term539.getClass(), "pattern", "eZFUvlxvGV");
        setField(term539, term539.getClass(), "formats", term585);
        setIntElement(term586, 0, -1530420153);
        setIntElement(term586, 1, -469968304);
        setIntElement(term586, 2, -1145578966);
        setIntElement(term586, 3, 679763016);
        setIntElement(term586, 4, 1962444399);
        setField(term539, term539.getClass(), "offsets", term586);
        setIntElement(term592, 0, 767834723);
        setIntElement(term592, 1, -602026508);
        setIntElement(term592, 2, -157887805);
        setIntElement(term592, 3, 1876565163);
        setIntElement(term592, 4, -817164822);
        setField(term539, term539.getClass(), "argumentNumbers", term592);
        setIntField(term539, term539.getClass(), "maxOffset", -1016503459);
        term599 = new Integer(1632125673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.text.Format");
        Object[] args = new Object[2];
        args[0] = term599;
        args[1] = null;
        try {
            callMethod(klass, "setFormatByArgumentIndex", argTypes, term539, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


