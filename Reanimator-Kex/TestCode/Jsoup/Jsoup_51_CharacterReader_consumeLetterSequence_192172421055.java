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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_consumeLetterSequence_192172421055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1805;

    public CharacterReader_consumeLetterSequence_192172421055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1805 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1806 = (char[]) newCharArray(0);
        Object[] term1810 = (Object[]) newArray("java.lang.String", 9);
        setField(term1805, term1805.getClass(), "input", term1806);
        setIntField(term1805, term1805.getClass(), "length", -1048298087);
        setIntField(term1805, term1805.getClass(), "pos", 292681826);
        setIntField(term1805, term1805.getClass(), "mark", 458147407);
        setElement(term1810, 0, "bLPjGVBhlX");
        setElement(term1810, 1, "whBvTVIIlC");
        setElement(term1810, 2, "IgRJUzaCwW");
        setElement(term1810, 3, "JUmudUmaaV");
        setElement(term1810, 4, "KoyGrUJeJW");
        setElement(term1810, 5, "HqBOwkVqjD");
        setElement(term1810, 6, "MAcUBcBckh");
        setElement(term1810, 7, "oVgzLbrsFr");
        setElement(term1810, 8, "vQVyKLdtaz");
        setField(term1805, term1805.getClass(), "stringCache", term1810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeLetterSequence", argTypes, term1805, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


