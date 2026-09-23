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

public class CharacterReader_consumeLetterSequence_192172421062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1909;

    public CharacterReader_consumeLetterSequence_192172421062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1909 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1910 = (char[]) newCharArray(4);
        Object[] term1920 = (Object[]) newArray("java.lang.String", 8);
        setCharElement(term1910, 0, 'Y');
        setCharElement(term1910, 1, 'G');
        setCharElement(term1910, 2, 'g');
        setCharElement(term1910, 3, 'n');
        setField(term1909, term1909.getClass(), "charBuf", term1910);
        setField(term1909, term1909.getClass(), "reader", null);
        setIntField(term1909, term1909.getClass(), "bufLength", -1034506028);
        setIntField(term1909, term1909.getClass(), "bufSplitPoint", -1263114719);
        setIntField(term1909, term1909.getClass(), "bufPos", -894662986);
        setIntField(term1909, term1909.getClass(), "readerPos", 304775596);
        setIntField(term1909, term1909.getClass(), "bufMark", -1347665717);
        setElement(term1920, 0, "IgRJUzaCwW");
        setElement(term1920, 1, "JUmudUmaaV");
        setElement(term1920, 2, "KoyGrUJeJW");
        setElement(term1920, 3, "HqBOwkVqjD");
        setElement(term1920, 4, "MAcUBcBckh");
        setElement(term1920, 5, "oVgzLbrsFr");
        setElement(term1920, 6, "vQVyKLdtaz");
        setElement(term1920, 7, "OWKQODBLzb");
        setField(term1909, term1909.getClass(), "stringCache", term1920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeLetterSequence", argTypes, term1909, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


