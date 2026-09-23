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

public class CharacterReader_matchesDigit_48037811670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3393;

    public CharacterReader_matchesDigit_48037811670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3393 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3394 = (char[]) newCharArray(6);
        Object[] term3406 = (Object[]) newArray("java.lang.String", 7);
        setCharElement(term3394, 0, 'o');
        setCharElement(term3394, 1, 'V');
        setCharElement(term3394, 2, 'c');
        setCharElement(term3394, 3, 'I');
        setCharElement(term3394, 4, 'n');
        setCharElement(term3394, 5, 'Y');
        setField(term3393, term3393.getClass(), "charBuf", term3394);
        setField(term3393, term3393.getClass(), "reader", null);
        setIntField(term3393, term3393.getClass(), "bufLength", 2095798786);
        setIntField(term3393, term3393.getClass(), "bufSplitPoint", -1565502840);
        setIntField(term3393, term3393.getClass(), "bufPos", 344323424);
        setIntField(term3393, term3393.getClass(), "readerPos", 9726679);
        setIntField(term3393, term3393.getClass(), "bufMark", -25637976);
        setElement(term3406, 0, "AKNapTAfmD");
        setElement(term3406, 1, "xJgPlLxpgC");
        setElement(term3406, 2, "EYtfuJaxiM");
        setElement(term3406, 3, "gCWtLVKVVe");
        setElement(term3406, 4, "fWKJoSoCwE");
        setElement(term3406, 5, "wfaXBpWAUH");
        setElement(term3406, 6, "VMeAzAHwZj");
        setField(term3393, term3393.getClass(), "stringCache", term3406);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "matchesDigit", argTypes, term3393, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


