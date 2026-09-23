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

public class CharacterReader_consumeLetterThenDigitSequence_176975235461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2049;

    public CharacterReader_consumeLetterThenDigitSequence_176975235461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2049 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2050 = (char[]) newCharArray(4);
        Object[] term2060 = (Object[]) newArray("java.lang.String", 8);
        setCharElement(term2050, 0, 'r');
        setCharElement(term2050, 1, 'c');
        setCharElement(term2050, 2, 'R');
        setCharElement(term2050, 3, 'M');
        setField(term2049, term2049.getClass(), "charBuf", term2050);
        setField(term2049, term2049.getClass(), "reader", null);
        setIntField(term2049, term2049.getClass(), "bufLength", -1034506028);
        setIntField(term2049, term2049.getClass(), "bufSplitPoint", -1263114719);
        setIntField(term2049, term2049.getClass(), "bufPos", -894662986);
        setIntField(term2049, term2049.getClass(), "readerPos", 304775596);
        setIntField(term2049, term2049.getClass(), "bufMark", -1347665717);
        setElement(term2060, 0, "OWKQODBLzb");
        setElement(term2060, 1, "wGmYcqUkgE");
        setElement(term2060, 2, "idgaQsnJpQ");
        setElement(term2060, 3, "VgZnGoIFwQ");
        setElement(term2060, 4, "jUbSRrkrYZ");
        setElement(term2060, 5, "bWWfajKbEX");
        setElement(term2060, 6, "cAPeiZHKGJ");
        setElement(term2060, 7, "LvJFtLBaxj");
        setField(term2049, term2049.getClass(), "stringCache", term2060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeLetterThenDigitSequence", argTypes, term2049, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


