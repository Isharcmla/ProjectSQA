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

public class CharacterReader_isEmptyNoBufferUp_11916939946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375;
     Object term5724;

    public CharacterReader_isEmptyNoBufferUp_11916939946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term375 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term376 = (char[]) newCharArray(2);
        Object[] term384 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term376, 0, 'D');
        setCharElement(term376, 1, 's');
        setField(term375, term375.getClass(), "charBuf", term376);
        setField(term375, term375.getClass(), "reader", null);
        setIntField(term375, term375.getClass(), "bufLength", -1685132342);
        setIntField(term375, term375.getClass(), "bufSplitPoint", -1456670397);
        setIntField(term375, term375.getClass(), "bufPos", 1622346318);
        setIntField(term375, term375.getClass(), "readerPos", 1048535127);
        setIntField(term375, term375.getClass(), "bufMark", -655067527);
        setElement(term384, 0, "aJlieCFVtF");
        setElement(term384, 1, "ZiaGIbnzTs");
        setElement(term384, 2, "tbcdzjIfER");
        setElement(term384, 3, "HyxfbSQYBe");
        setElement(term384, 4, "pCTimMblYc");
        setElement(term384, 5, "hNxWaHcfhY");
        setField(term375, term375.getClass(), "stringCache", term384);
        term5724 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5725 = (char[]) newCharArray(2);
        Object[] term5726 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term5725, 0, 'D');
        setCharElement(term5725, 1, 's');
        setField(term5724, term5724.getClass(), "charBuf", term5725);
        setField(term5724, term5724.getClass(), "reader", null);
        setIntField(term5724, term5724.getClass(), "bufLength", -1685132342);
        setIntField(term5724, term5724.getClass(), "bufSplitPoint", -1456670397);
        setIntField(term5724, term5724.getClass(), "bufPos", 1622346318);
        setIntField(term5724, term5724.getClass(), "readerPos", 1048535127);
        setIntField(term5724, term5724.getClass(), "bufMark", -655067527);
        setElement(term5726, 0, "aJlieCFVtF");
        setElement(term5726, 1, "ZiaGIbnzTs");
        setElement(term5726, 2, "tbcdzjIfER");
        setElement(term5726, 3, "HyxfbSQYBe");
        setElement(term5726, 4, "pCTimMblYc");
        setElement(term5726, 5, "hNxWaHcfhY");
        setField(term5724, term5724.getClass(), "stringCache", term5726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmptyNoBufferUp", argTypes, term375, args);
        assertTrue(recursiveEquals(term375, term5724));
        assertTrue(recursiveEquals(retValue, true));
    }

};


