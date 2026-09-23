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

public class CharacterReader_consumeTagName_153618181660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1663;
     Object term9898;

    public CharacterReader_consumeTagName_153618181660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1663 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1664 = (char[]) newCharArray(5);
        Object[] term1675 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term1664, 0, 'R');
        setCharElement(term1664, 1, 'M');
        setCharElement(term1664, 2, 'F');
        setCharElement(term1664, 3, 'I');
        setCharElement(term1664, 4, 's');
        setField(term1663, term1663.getClass(), "charBuf", term1664);
        setField(term1663, term1663.getClass(), "reader", null);
        setIntField(term1663, term1663.getClass(), "bufLength", -1547384488);
        setIntField(term1663, term1663.getClass(), "bufSplitPoint", 1442160736);
        setIntField(term1663, term1663.getClass(), "bufPos", 1114000454);
        setIntField(term1663, term1663.getClass(), "readerPos", -556405712);
        setIntField(term1663, term1663.getClass(), "bufMark", -1772434990);
        setElement(term1675, 0, "dEnhdmILtU");
        setField(term1663, term1663.getClass(), "stringCache", term1675);
        term9898 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term9899 = (char[]) newCharArray(5);
        Object[] term9900 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term9899, 0, 'R');
        setCharElement(term9899, 1, 'M');
        setCharElement(term9899, 2, 'F');
        setCharElement(term9899, 3, 'I');
        setCharElement(term9899, 4, 's');
        setField(term9898, term9898.getClass(), "charBuf", term9899);
        setField(term9898, term9898.getClass(), "reader", null);
        setIntField(term9898, term9898.getClass(), "bufLength", -1547384488);
        setIntField(term9898, term9898.getClass(), "bufSplitPoint", 1442160736);
        setIntField(term9898, term9898.getClass(), "bufPos", 1114000454);
        setIntField(term9898, term9898.getClass(), "readerPos", -556405712);
        setIntField(term9898, term9898.getClass(), "bufMark", -1772434990);
        setElement(term9900, 0, "dEnhdmILtU");
        setField(term9898, term9898.getClass(), "stringCache", term9900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeTagName", argTypes, term1663, args);
        assertTrue(recursiveEquals(term1663, term9898));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


