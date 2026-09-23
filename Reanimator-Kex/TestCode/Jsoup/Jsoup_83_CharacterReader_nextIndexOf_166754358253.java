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

public class CharacterReader_nextIndexOf_166754358253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term999;
     Object term1021;

    public CharacterReader_nextIndexOf_166754358253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term999 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1000 = (char[]) newCharArray(2);
        Object[] term1008 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term1000, 0, 'j');
        setCharElement(term1000, 1, 'J');
        setField(term999, term999.getClass(), "charBuf", term1000);
        setField(term999, term999.getClass(), "reader", null);
        setIntField(term999, term999.getClass(), "bufLength", 454281060);
        setIntField(term999, term999.getClass(), "bufSplitPoint", -1786399638);
        setIntField(term999, term999.getClass(), "bufPos", 2055867847);
        setIntField(term999, term999.getClass(), "readerPos", -1048298087);
        setIntField(term999, term999.getClass(), "bufMark", 292681826);
        setElement(term1008, 0, "nyiiPDVjAc");
        setField(term999, term999.getClass(), "stringCache", term1008);
        term1021 = new Character('C');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term1021;
        try {
            callMethod(klass, "nextIndexOf", argTypes, term999, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


