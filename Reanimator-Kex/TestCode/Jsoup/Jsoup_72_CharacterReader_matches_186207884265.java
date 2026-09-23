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

public class CharacterReader_matches_186207884265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2593;

    public CharacterReader_matches_186207884265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2593 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2594 = (char[]) newCharArray(9);
        Object[] term2609 = (Object[]) newArray("java.lang.String", 7);
        setCharElement(term2594, 0, 'P');
        setCharElement(term2594, 1, 'i');
        setCharElement(term2594, 2, 'g');
        setCharElement(term2594, 3, 'E');
        setCharElement(term2594, 4, 'T');
        setCharElement(term2594, 5, 'm');
        setCharElement(term2594, 6, 'J');
        setCharElement(term2594, 7, 'M');
        setCharElement(term2594, 8, 'x');
        setField(term2593, term2593.getClass(), "charBuf", term2594);
        setField(term2593, term2593.getClass(), "reader", null);
        setIntField(term2593, term2593.getClass(), "bufLength", -893623680);
        setIntField(term2593, term2593.getClass(), "bufSplitPoint", -1963434938);
        setIntField(term2593, term2593.getClass(), "bufPos", 906181092);
        setIntField(term2593, term2593.getClass(), "readerPos", 1045657203);
        setIntField(term2593, term2593.getClass(), "bufMark", 1386130016);
        setElement(term2609, 0, "BKLfkLiZTH");
        setElement(term2609, 1, "SPpkrGcPRr");
        setElement(term2609, 2, "sEccwbJKYE");
        setElement(term2609, 3, "AWRooQKkdW");
        setElement(term2609, 4, "vjxIhXHxGR");
        setElement(term2609, 5, "QXzGXbEXMu");
        setElement(term2609, 6, "qxSDVejjiY");
        setField(term2593, term2593.getClass(), "stringCache", term2609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xBsXSDjXYK";
        try {
            callMethod(klass, "matches", argTypes, term2593, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


