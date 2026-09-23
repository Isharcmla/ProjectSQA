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
import java.lang.Character;

public class CharacterReader_matches_201433289564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2395;
     Object term2505;

    public CharacterReader_matches_201433289564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2395 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2396 = (char[]) newCharArray(6);
        Object[] term2408 = (Object[]) newArray("java.lang.String", 8);
        setCharElement(term2396, 0, 'l');
        setCharElement(term2396, 1, 'h');
        setCharElement(term2396, 2, 'k');
        setCharElement(term2396, 3, 'X');
        setCharElement(term2396, 4, 'u');
        setCharElement(term2396, 5, 'u');
        setField(term2395, term2395.getClass(), "charBuf", term2396);
        setField(term2395, term2395.getClass(), "reader", null);
        setIntField(term2395, term2395.getClass(), "bufLength", 1532716628);
        setIntField(term2395, term2395.getClass(), "bufSplitPoint", -1801760683);
        setIntField(term2395, term2395.getClass(), "bufPos", 1141317871);
        setIntField(term2395, term2395.getClass(), "readerPos", 890669485);
        setIntField(term2395, term2395.getClass(), "bufMark", 691577392);
        setElement(term2408, 0, "xOcJIiQQDu");
        setElement(term2408, 1, "GVizqqzXpy");
        setElement(term2408, 2, "JqXGgAhZPl");
        setElement(term2408, 3, "jiKYgYHqIS");
        setElement(term2408, 4, "DfISiziTgG");
        setElement(term2408, 5, "XqgfKFvPSD");
        setElement(term2408, 6, "JiVRgTZvKc");
        setElement(term2408, 7, "XPKmummaqg");
        setField(term2395, term2395.getClass(), "stringCache", term2408);
        term2505 = new Character('a');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term2505;
        try {
            callMethod(klass, "matches", argTypes, term2395, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


