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
import java.lang.Character;

public class CharacterReader_matches_201433289566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2451;
     Object term2552;

    public CharacterReader_matches_201433289566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2451 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2452 = (char[]) newCharArray(9);
        Object[] term2467 = (Object[]) newArray("java.lang.String", 7);
        setCharElement(term2452, 0, 'J');
        setCharElement(term2452, 1, 'M');
        setCharElement(term2452, 2, 'x');
        setCharElement(term2452, 3, 'l');
        setCharElement(term2452, 4, 's');
        setCharElement(term2452, 5, 'z');
        setCharElement(term2452, 6, 'Y');
        setCharElement(term2452, 7, 'V');
        setCharElement(term2452, 8, 'z');
        setField(term2451, term2451.getClass(), "charBuf", term2452);
        setField(term2451, term2451.getClass(), "reader", null);
        setIntField(term2451, term2451.getClass(), "bufLength", -893623680);
        setIntField(term2451, term2451.getClass(), "bufSplitPoint", -1963434938);
        setIntField(term2451, term2451.getClass(), "bufPos", 906181092);
        setIntField(term2451, term2451.getClass(), "readerPos", 1045657203);
        setIntField(term2451, term2451.getClass(), "bufMark", 1386130016);
        setElement(term2467, 0, "GVizqqzXpy");
        setElement(term2467, 1, "JqXGgAhZPl");
        setElement(term2467, 2, "jiKYgYHqIS");
        setElement(term2467, 3, "DfISiziTgG");
        setElement(term2467, 4, "XqgfKFvPSD");
        setElement(term2467, 5, "JiVRgTZvKc");
        setElement(term2467, 6, "XPKmummaqg");
        setField(term2451, term2451.getClass(), "stringCache", term2467);
        term2552 = new Character('R');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term2552;
        try {
            callMethod(klass, "matches", argTypes, term2451, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


