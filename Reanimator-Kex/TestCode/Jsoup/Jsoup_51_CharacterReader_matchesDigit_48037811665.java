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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;

public class CharacterReader_matchesDigit_48037811665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3335;
     Object term13815;

    public CharacterReader_matchesDigit_48037811665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3335 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3336 = (char[]) newCharArray(6);
        Object[] term3346 = (Object[]) newArray("java.lang.String", 7);
        setCharElement(term3336, 0, 'o');
        setCharElement(term3336, 1, 'V');
        setCharElement(term3336, 2, 'c');
        setCharElement(term3336, 3, 'I');
        setCharElement(term3336, 4, 'n');
        setCharElement(term3336, 5, 'Y');
        setField(term3335, term3335.getClass(), "input", term3336);
        setIntField(term3335, term3335.getClass(), "length", -1465035361);
        setIntField(term3335, term3335.getClass(), "pos", 1090617576);
        setIntField(term3335, term3335.getClass(), "mark", -1547384488);
        setElement(term3346, 0, "AKNapTAfmD");
        setElement(term3346, 1, "xJgPlLxpgC");
        setElement(term3346, 2, "EYtfuJaxiM");
        setElement(term3346, 3, "gCWtLVKVVe");
        setElement(term3346, 4, "fWKJoSoCwE");
        setElement(term3346, 5, "wfaXBpWAUH");
        setElement(term3346, 6, "VMeAzAHwZj");
        setField(term3335, term3335.getClass(), "stringCache", term3346);
        term13815 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term13816 = (char[]) newCharArray(6);
        Object[] term13817 = (Object[]) newArray("java.lang.String", 7);
        setCharElement(term13816, 0, 'o');
        setCharElement(term13816, 1, 'V');
        setCharElement(term13816, 2, 'c');
        setCharElement(term13816, 3, 'I');
        setCharElement(term13816, 4, 'n');
        setCharElement(term13816, 5, 'Y');
        setField(term13815, term13815.getClass(), "input", term13816);
        setIntField(term13815, term13815.getClass(), "length", -1465035361);
        setIntField(term13815, term13815.getClass(), "pos", 1090617576);
        setIntField(term13815, term13815.getClass(), "mark", -1547384488);
        setElement(term13817, 0, "AKNapTAfmD");
        setElement(term13817, 1, "xJgPlLxpgC");
        setElement(term13817, 2, "EYtfuJaxiM");
        setElement(term13817, 3, "gCWtLVKVVe");
        setElement(term13817, 4, "fWKJoSoCwE");
        setElement(term13817, 5, "wfaXBpWAUH");
        setElement(term13817, 6, "VMeAzAHwZj");
        setField(term13815, term13815.getClass(), "stringCache", term13817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term3335, args);
        assertTrue(recursiveEquals(term3335, term13815));
        assertTrue(recursiveEquals(retValue, false));
    }

};


