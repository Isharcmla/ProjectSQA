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
import java.lang.Character;

public class CharacterReader_consumeTo_154260165655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1127;
     Object term1212;

    public CharacterReader_consumeTo_154260165655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1127 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1128 = (char[]) newCharArray(5);
        Object[] term1139 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term1128, 0, 't');
        setCharElement(term1128, 1, 'D');
        setCharElement(term1128, 2, 'I');
        setCharElement(term1128, 3, 'R');
        setCharElement(term1128, 4, 'b');
        setField(term1127, term1127.getClass(), "charBuf", term1128);
        setField(term1127, term1127.getClass(), "reader", null);
        setIntField(term1127, term1127.getClass(), "bufLength", 97029295);
        setIntField(term1127, term1127.getClass(), "bufSplitPoint", -1371869594);
        setIntField(term1127, term1127.getClass(), "bufPos", -2095575670);
        setIntField(term1127, term1127.getClass(), "readerPos", 1225272962);
        setIntField(term1127, term1127.getClass(), "bufMark", 1324040357);
        setElement(term1139, 0, "gGSMzuGICf");
        setElement(term1139, 1, "hxCBltsObl");
        setElement(term1139, 2, "BndsHwAFMv");
        setElement(term1139, 3, "GzFkzHGYFt");
        setElement(term1139, 4, "tShwQLRGNe");
        setElement(term1139, 5, "LvtrsXUliU");
        setField(term1127, term1127.getClass(), "stringCache", term1139);
        term1212 = new Character('S');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term1212;
        try {
            callMethod(klass, "consumeTo", argTypes, term1127, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


