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

public class CharacterReader_matches_186207884267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2633;
     Object term11810;

    public CharacterReader_matches_186207884267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2633 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2634 = (char[]) newCharArray(3);
        Object[] term2643 = (Object[]) newArray("java.lang.String", 4);
        setCharElement(term2634, 0, 'f');
        setCharElement(term2634, 1, 'L');
        setCharElement(term2634, 2, 'Q');
        setField(term2633, term2633.getClass(), "charBuf", term2634);
        setField(term2633, term2633.getClass(), "reader", null);
        setIntField(term2633, term2633.getClass(), "bufLength", 1072005683);
        setIntField(term2633, term2633.getClass(), "bufSplitPoint", 1861318859);
        setIntField(term2633, term2633.getClass(), "bufPos", 1474524152);
        setIntField(term2633, term2633.getClass(), "readerPos", 568954359);
        setIntField(term2633, term2633.getClass(), "bufMark", 53410913);
        setElement(term2643, 0, "BKLfkLiZTH");
        setElement(term2643, 1, "SPpkrGcPRr");
        setElement(term2643, 2, "sEccwbJKYE");
        setElement(term2643, 3, "AWRooQKkdW");
        setField(term2633, term2633.getClass(), "stringCache", term2643);
        term11810 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term11811 = (char[]) newCharArray(3);
        Object[] term11812 = (Object[]) newArray("java.lang.String", 4);
        setCharElement(term11811, 0, 'f');
        setCharElement(term11811, 1, 'L');
        setCharElement(term11811, 2, 'Q');
        setField(term11810, term11810.getClass(), "charBuf", term11811);
        setField(term11810, term11810.getClass(), "reader", null);
        setIntField(term11810, term11810.getClass(), "bufLength", 1072005683);
        setIntField(term11810, term11810.getClass(), "bufSplitPoint", 1861318859);
        setIntField(term11810, term11810.getClass(), "bufPos", 1474524152);
        setIntField(term11810, term11810.getClass(), "readerPos", 568954359);
        setIntField(term11810, term11810.getClass(), "bufMark", 53410913);
        setElement(term11812, 0, "BKLfkLiZTH");
        setElement(term11812, 1, "SPpkrGcPRr");
        setElement(term11812, 2, "sEccwbJKYE");
        setElement(term11812, 3, "AWRooQKkdW");
        setField(term11810, term11810.getClass(), "stringCache", term11812);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vjxIhXHxGR";
        Object retValue = callMethod(klass, "matches", argTypes, term2633, args);
        assertTrue(recursiveEquals(term2633, term11810));
        assertTrue(recursiveEquals(retValue, false));
    }

};


