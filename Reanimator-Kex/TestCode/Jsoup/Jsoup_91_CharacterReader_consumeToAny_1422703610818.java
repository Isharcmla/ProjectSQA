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

public class CharacterReader_consumeToAny_1422703610818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243243;
     Object term242892;
     Object term243608;
     Object term243613;

    public CharacterReader_consumeToAny_1422703610818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243243 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term242896 = (char[]) newCharArray(105);
        Object[] term243107 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term243243, term243243.getClass(), "bufPos", 0);
        setIntField(term243243, term243243.getClass(), "bufSplitPoint", 1);
        setIntField(term243243, term243243.getClass(), "bufLength", 3);
        setField(term243243, term243243.getClass(), "charBuf", term242896);
        setField(term243243, term243243.getClass(), "stringCache", term243107);
        term242892 = (char[]) newCharArray(0);
        term243608 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term243609 = (char[]) newCharArray(105);
        Object[] term243610 = (Object[]) newArray("java.lang.String", 489);
        setField(term243608, term243608.getClass(), "charBuf", term243609);
        setField(term243608, term243608.getClass(), "reader", null);
        setIntField(term243608, term243608.getClass(), "bufLength", 3);
        setIntField(term243608, term243608.getClass(), "bufSplitPoint", 1);
        setIntField(term243608, term243608.getClass(), "bufPos", 3);
        setIntField(term243608, term243608.getClass(), "readerPos", 0);
        setIntField(term243608, term243608.getClass(), "bufMark", 0);
        setElement(term243610, 0, "   ");
        setField(term243608, term243608.getClass(), "stringCache", term243610);
        term243613 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term242892;
        Object retValue = callMethod(klass, "consumeToAny", argTypes, term243243, args);
        assertTrue(recursiveEquals(term243243, term243608));
        assertTrue(recursiveEquals(term242892, term243613));
        assertTrue(recursiveEquals(retValue, "   "));
    }

};


