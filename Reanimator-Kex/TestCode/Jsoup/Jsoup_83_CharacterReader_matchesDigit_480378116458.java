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

public class CharacterReader_matchesDigit_480378116458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114075;
     Object term114241;

    public CharacterReader_matchesDigit_480378116458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114075 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term113970 = (char[]) newCharArray(8);
        setIntField(term114075, term114075.getClass(), "bufPos", 6);
        setIntField(term114075, term114075.getClass(), "bufSplitPoint", 7);
        setIntField(term114075, term114075.getClass(), "bufLength", 7);
        setCharElement(term113970, 0, (char) 58);
        setCharElement(term113970, 1, (char) 58);
        setCharElement(term113970, 2, (char) 58);
        setCharElement(term113970, 3, (char) 58);
        setCharElement(term113970, 4, (char) 58);
        setCharElement(term113970, 5, (char) 58);
        setCharElement(term113970, 6, (char) 58);
        setCharElement(term113970, 7, (char) 58);
        setField(term114075, term114075.getClass(), "charBuf", term113970);
        term114241 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term114242 = (char[]) newCharArray(8);
        setCharElement(term114242, 0, (char) 58);
        setCharElement(term114242, 1, (char) 58);
        setCharElement(term114242, 2, (char) 58);
        setCharElement(term114242, 3, (char) 58);
        setCharElement(term114242, 4, (char) 58);
        setCharElement(term114242, 5, (char) 58);
        setCharElement(term114242, 6, (char) 58);
        setCharElement(term114242, 7, (char) 58);
        setField(term114241, term114241.getClass(), "charBuf", term114242);
        setField(term114241, term114241.getClass(), "reader", null);
        setIntField(term114241, term114241.getClass(), "bufLength", 7);
        setIntField(term114241, term114241.getClass(), "bufSplitPoint", 7);
        setIntField(term114241, term114241.getClass(), "bufPos", 6);
        setIntField(term114241, term114241.getClass(), "readerPos", 0);
        setIntField(term114241, term114241.getClass(), "bufMark", 0);
        setField(term114241, term114241.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term114075, args);
        assertTrue(recursiveEquals(term114075, term114241));
        assertTrue(recursiveEquals(retValue, false));
    }

};


