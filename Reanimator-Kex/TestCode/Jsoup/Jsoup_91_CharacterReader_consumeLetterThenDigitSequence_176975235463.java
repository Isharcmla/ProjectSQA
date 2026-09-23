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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_consumeLetterThenDigitSequence_176975235463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2101;

    public CharacterReader_consumeLetterThenDigitSequence_176975235463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2101 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2102 = (char[]) newCharArray(6);
        Object[] term2114 = (Object[]) newArray("java.lang.String", 2);
        setCharElement(term2102, 0, 'e');
        setCharElement(term2102, 1, 'N');
        setCharElement(term2102, 2, 'R');
        setCharElement(term2102, 3, 'd');
        setCharElement(term2102, 4, 'v');
        setCharElement(term2102, 5, 'g');
        setField(term2101, term2101.getClass(), "charBuf", term2102);
        setField(term2101, term2101.getClass(), "reader", null);
        setIntField(term2101, term2101.getClass(), "bufLength", -1888585309);
        setIntField(term2101, term2101.getClass(), "bufSplitPoint", 683666002);
        setIntField(term2101, term2101.getClass(), "bufPos", 1596213415);
        setIntField(term2101, term2101.getClass(), "readerPos", -268815336);
        setIntField(term2101, term2101.getClass(), "bufMark", -1210583429);
        setElement(term2114, 0, "wGmYcqUkgE");
        setElement(term2114, 1, "idgaQsnJpQ");
        setField(term2101, term2101.getClass(), "stringCache", term2114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeLetterThenDigitSequence", argTypes, term2101, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


