package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_consumeTo_169485570954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1129;

    public CharacterReader_consumeTo_169485570954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1129 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1130 = (char[]) newCharArray(5);
        Object[] term1141 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term1130, 0, 'D');
        setCharElement(term1130, 1, 'I');
        setCharElement(term1130, 2, 'R');
        setCharElement(term1130, 3, 'b');
        setCharElement(term1130, 4, 'S');
        setField(term1129, term1129.getClass(), "charBuf", term1130);
        setField(term1129, term1129.getClass(), "reader", null);
        setIntField(term1129, term1129.getClass(), "bufLength", 97029295);
        setIntField(term1129, term1129.getClass(), "bufSplitPoint", -1371869594);
        setIntField(term1129, term1129.getClass(), "bufPos", -2095575670);
        setIntField(term1129, term1129.getClass(), "readerPos", 1225272962);
        setIntField(term1129, term1129.getClass(), "bufMark", 1324040357);
        setElement(term1141, 0, "gGSMzuGICf");
        setElement(term1141, 1, "hxCBltsObl");
        setElement(term1141, 2, "BndsHwAFMv");
        setElement(term1141, 3, "GzFkzHGYFt");
        setElement(term1141, 4, "tShwQLRGNe");
        setElement(term1141, 5, "LvtrsXUliU");
        setField(term1129, term1129.getClass(), "stringCache", term1141);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xLbjWUgOIL";
        try {
            callMethod(klass, "consumeTo", argTypes, term1129, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


