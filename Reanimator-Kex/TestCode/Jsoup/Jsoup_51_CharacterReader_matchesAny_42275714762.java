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

public class CharacterReader_matchesAny_42275714762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2867;
     Object term2935;

    public CharacterReader_matchesAny_42275714762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2867 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2868 = (char[]) newCharArray(2);
        Object[] term2874 = (Object[]) newArray("java.lang.String", 5);
        setCharElement(term2868, 0, 'Y');
        setCharElement(term2868, 1, 'V');
        setField(term2867, term2867.getClass(), "input", term2868);
        setIntField(term2867, term2867.getClass(), "length", 1551099402);
        setIntField(term2867, term2867.getClass(), "pos", -2027534003);
        setIntField(term2867, term2867.getClass(), "mark", 1063420942);
        setElement(term2874, 0, "OEXDRUKcFl");
        setElement(term2874, 1, "RYdKCNNMBR");
        setElement(term2874, 2, "yGtHPyvYiQ");
        setElement(term2874, 3, "MvRIxilFMJ");
        setElement(term2874, 4, "iNwOJRBEjp");
        setField(term2867, term2867.getClass(), "stringCache", term2874);
        term2935 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2935;
        try {
            callMethod(klass, "matchesAny", argTypes, term2867, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


