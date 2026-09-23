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

public class CharacterReader_matchesAny_42275714767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2919;
     Object term2989;
     Object term12246;
     Object term12259;

    public CharacterReader_matchesAny_42275714767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2919 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2920 = (char[]) newCharArray(2);
        Object[] term2928 = (Object[]) newArray("java.lang.String", 5);
        setCharElement(term2920, 0, 'Y');
        setCharElement(term2920, 1, 'V');
        setField(term2919, term2919.getClass(), "charBuf", term2920);
        setField(term2919, term2919.getClass(), "reader", null);
        setIntField(term2919, term2919.getClass(), "bufLength", -375014958);
        setIntField(term2919, term2919.getClass(), "bufSplitPoint", 1107176718);
        setIntField(term2919, term2919.getClass(), "bufPos", 480137250);
        setIntField(term2919, term2919.getClass(), "readerPos", -341152642);
        setIntField(term2919, term2919.getClass(), "bufMark", -2015854073);
        setElement(term2928, 0, "OEXDRUKcFl");
        setElement(term2928, 1, "RYdKCNNMBR");
        setElement(term2928, 2, "yGtHPyvYiQ");
        setElement(term2928, 3, "MvRIxilFMJ");
        setElement(term2928, 4, "iNwOJRBEjp");
        setField(term2919, term2919.getClass(), "stringCache", term2928);
        term2989 = (char[]) newCharArray(0);
        term12246 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term12247 = (char[]) newCharArray(2);
        Object[] term12248 = (Object[]) newArray("java.lang.String", 5);
        setCharElement(term12247, 0, 'Y');
        setCharElement(term12247, 1, 'V');
        setField(term12246, term12246.getClass(), "charBuf", term12247);
        setField(term12246, term12246.getClass(), "reader", null);
        setIntField(term12246, term12246.getClass(), "bufLength", -375014958);
        setIntField(term12246, term12246.getClass(), "bufSplitPoint", 1107176718);
        setIntField(term12246, term12246.getClass(), "bufPos", 480137250);
        setIntField(term12246, term12246.getClass(), "readerPos", -341152642);
        setIntField(term12246, term12246.getClass(), "bufMark", -2015854073);
        setElement(term12248, 0, "OEXDRUKcFl");
        setElement(term12248, 1, "RYdKCNNMBR");
        setElement(term12248, 2, "yGtHPyvYiQ");
        setElement(term12248, 3, "MvRIxilFMJ");
        setElement(term12248, 4, "iNwOJRBEjp");
        setField(term12246, term12246.getClass(), "stringCache", term12248);
        term12259 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2989;
        Object retValue = callMethod(klass, "matchesAny", argTypes, term2919, args);
        assertTrue(recursiveEquals(term2919, term12246));
        assertTrue(recursiveEquals(term2989, term12259));
        assertTrue(recursiveEquals(retValue, false));
    }

};


