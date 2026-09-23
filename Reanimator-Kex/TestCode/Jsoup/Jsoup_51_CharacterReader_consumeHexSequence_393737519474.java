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

public class CharacterReader_consumeHexSequence_393737519474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3129982;
     Object term3131111;

    public CharacterReader_consumeHexSequence_393737519474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3129982 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3128874 = (char[]) newCharArray(489);
        Object[] term3129854 = (Object[]) newArray("java.lang.String", 40);
        setIntField(term3129982, term3129982.getClass(), "pos", 0);
        setIntField(term3129982, term3129982.getClass(), "length", 1);
        setCharElement(term3128874, 0, 'c');
        setField(term3129982, term3129982.getClass(), "input", term3128874);
        setElement(term3129854, 0, "");
        setElement(term3129854, 1, "");
        setElement(term3129854, 2, "");
        setElement(term3129854, 3, "");
        setElement(term3129854, 4, "");
        setElement(term3129854, 5, "");
        setElement(term3129854, 6, "");
        setElement(term3129854, 7, "");
        setElement(term3129854, 8, "");
        setElement(term3129854, 9, "");
        setElement(term3129854, 10, "");
        setElement(term3129854, 11, "");
        setElement(term3129854, 12, "");
        setElement(term3129854, 13, "");
        setElement(term3129854, 14, "");
        setElement(term3129854, 15, "");
        setElement(term3129854, 16, "");
        setElement(term3129854, 17, "");
        setElement(term3129854, 18, "");
        setElement(term3129854, 19, "");
        setElement(term3129854, 20, "");
        setElement(term3129854, 21, "");
        setElement(term3129854, 22, "");
        setElement(term3129854, 23, "");
        setElement(term3129854, 24, "");
        setElement(term3129854, 25, "");
        setElement(term3129854, 26, "");
        setElement(term3129854, 27, "");
        setElement(term3129854, 28, "");
        setElement(term3129854, 29, "");
        setElement(term3129854, 30, "");
        setElement(term3129854, 31, "");
        setElement(term3129854, 32, "");
        setElement(term3129854, 33, "");
        setElement(term3129854, 34, "");
        setElement(term3129854, 35, "");
        setElement(term3129854, 36, "");
        setElement(term3129854, 37, "");
        setElement(term3129854, 38, "");
        setElement(term3129854, 39, "");
        setField(term3129982, term3129982.getClass(), "stringCache", term3129854);
        term3131111 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3131112 = (char[]) newCharArray(489);
        Object[] term3131113 = (Object[]) newArray("java.lang.String", 40);
        setCharElement(term3131112, 0, 'c');
        setField(term3131111, term3131111.getClass(), "input", term3131112);
        setIntField(term3131111, term3131111.getClass(), "length", 1);
        setIntField(term3131111, term3131111.getClass(), "pos", 1);
        setIntField(term3131111, term3131111.getClass(), "mark", 0);
        setElement(term3131113, 0, "");
        setElement(term3131113, 1, "");
        setElement(term3131113, 2, "");
        setElement(term3131113, 3, "");
        setElement(term3131113, 4, "");
        setElement(term3131113, 5, "");
        setElement(term3131113, 6, "");
        setElement(term3131113, 7, "");
        setElement(term3131113, 8, "");
        setElement(term3131113, 9, "");
        setElement(term3131113, 10, "");
        setElement(term3131113, 11, "");
        setElement(term3131113, 12, "");
        setElement(term3131113, 13, "");
        setElement(term3131113, 14, "");
        setElement(term3131113, 15, "");
        setElement(term3131113, 16, "");
        setElement(term3131113, 17, "");
        setElement(term3131113, 18, "");
        setElement(term3131113, 19, "");
        setElement(term3131113, 20, "");
        setElement(term3131113, 21, "");
        setElement(term3131113, 22, "");
        setElement(term3131113, 23, "");
        setElement(term3131113, 24, "");
        setElement(term3131113, 25, "");
        setElement(term3131113, 26, "");
        setElement(term3131113, 27, "");
        setElement(term3131113, 28, "");
        setElement(term3131113, 29, "");
        setElement(term3131113, 30, "");
        setElement(term3131113, 31, "");
        setElement(term3131113, 32, "");
        setElement(term3131113, 33, "");
        setElement(term3131113, 34, "");
        setElement(term3131113, 35, "c");
        setElement(term3131113, 36, "");
        setElement(term3131113, 37, "");
        setElement(term3131113, 38, "");
        setElement(term3131113, 39, "");
        setField(term3131111, term3131111.getClass(), "stringCache", term3131113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeHexSequence", argTypes, term3129982, args);
        assertTrue(recursiveEquals(term3129982, term3131111));
        assertTrue(recursiveEquals(retValue, "c"));
    }

};


