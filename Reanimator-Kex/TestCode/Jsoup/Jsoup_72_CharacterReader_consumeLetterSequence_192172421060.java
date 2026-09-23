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

public class CharacterReader_consumeLetterSequence_192172421060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1843;

    public CharacterReader_consumeLetterSequence_192172421060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1843 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1844 = (char[]) newCharArray(0);
        Object[] term1850 = (Object[]) newArray("java.lang.String", 9);
        setField(term1843, term1843.getClass(), "charBuf", term1844);
        setField(term1843, term1843.getClass(), "reader", null);
        setIntField(term1843, term1843.getClass(), "bufLength", -1845499264);
        setIntField(term1843, term1843.getClass(), "bufSplitPoint", -505439934);
        setIntField(term1843, term1843.getClass(), "bufPos", -344842608);
        setIntField(term1843, term1843.getClass(), "readerPos", 941650513);
        setIntField(term1843, term1843.getClass(), "bufMark", 444029505);
        setElement(term1850, 0, "bLPjGVBhlX");
        setElement(term1850, 1, "whBvTVIIlC");
        setElement(term1850, 2, "IgRJUzaCwW");
        setElement(term1850, 3, "JUmudUmaaV");
        setElement(term1850, 4, "KoyGrUJeJW");
        setElement(term1850, 5, "HqBOwkVqjD");
        setElement(term1850, 6, "MAcUBcBckh");
        setElement(term1850, 7, "oVgzLbrsFr");
        setElement(term1850, 8, "vQVyKLdtaz");
        setField(term1843, term1843.getClass(), "stringCache", term1850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeLetterSequence", argTypes, term1843, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


