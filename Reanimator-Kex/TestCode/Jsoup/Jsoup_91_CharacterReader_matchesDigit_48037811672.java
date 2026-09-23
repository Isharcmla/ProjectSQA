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

public class CharacterReader_matchesDigit_48037811672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3367;

    public CharacterReader_matchesDigit_48037811672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3367 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3368 = (char[]) newCharArray(9);
        Object[] term3383 = (Object[]) newArray("java.lang.String", 7);
        setCharElement(term3368, 0, 'F');
        setCharElement(term3368, 1, 'V');
        setCharElement(term3368, 2, 't');
        setCharElement(term3368, 3, 'F');
        setCharElement(term3368, 4, 'Z');
        setCharElement(term3368, 5, 'i');
        setCharElement(term3368, 6, 'a');
        setCharElement(term3368, 7, 'G');
        setCharElement(term3368, 8, 'I');
        setField(term3367, term3367.getClass(), "charBuf", term3368);
        setField(term3367, term3367.getClass(), "reader", null);
        setIntField(term3367, term3367.getClass(), "bufLength", 1555897383);
        setIntField(term3367, term3367.getClass(), "bufSplitPoint", 202001407);
        setIntField(term3367, term3367.getClass(), "bufPos", 158873461);
        setIntField(term3367, term3367.getClass(), "readerPos", -430151637);
        setIntField(term3367, term3367.getClass(), "bufMark", -1697741339);
        setElement(term3383, 0, "xIeFjkHkOe");
        setElement(term3383, 1, "SdCKLMIYnX");
        setElement(term3383, 2, "OJJtVNPyKZ");
        setElement(term3383, 3, "AKNapTAfmD");
        setElement(term3383, 4, "xJgPlLxpgC");
        setElement(term3383, 5, "EYtfuJaxiM");
        setElement(term3383, 6, "gCWtLVKVVe");
        setField(term3367, term3367.getClass(), "stringCache", term3383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "matchesDigit", argTypes, term3367, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


