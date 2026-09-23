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
import java.lang.Integer;

public class CharacterReader_rangeEquals_141693673979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4158;
     Object term4179;
     Object term4181;
     Object term15049;

    public CharacterReader_rangeEquals_141693673979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4158 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4159 = (char[]) newCharArray(1);
        Object[] term4166 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term4159, 0, 'S');
        setField(term4158, term4158.getClass(), "charBuf", term4159);
        setField(term4158, term4158.getClass(), "reader", null);
        setIntField(term4158, term4158.getClass(), "bufLength", -1885090354);
        setIntField(term4158, term4158.getClass(), "bufSplitPoint", -2066804303);
        setIntField(term4158, term4158.getClass(), "bufPos", -1731761810);
        setIntField(term4158, term4158.getClass(), "readerPos", 197109649);
        setIntField(term4158, term4158.getClass(), "bufMark", -1239406390);
        setElement(term4166, 0, "hMmaoREuCK");
        setField(term4158, term4158.getClass(), "stringCache", term4166);
        term4179 = new Integer(1557431527);
        term4181 = new Integer(-1504890659);
        term15049 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term15050 = (char[]) newCharArray(1);
        Object[] term15051 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term15050, 0, 'S');
        setField(term15049, term15049.getClass(), "charBuf", term15050);
        setField(term15049, term15049.getClass(), "reader", null);
        setIntField(term15049, term15049.getClass(), "bufLength", -1885090354);
        setIntField(term15049, term15049.getClass(), "bufSplitPoint", -2066804303);
        setIntField(term15049, term15049.getClass(), "bufPos", -1731761810);
        setIntField(term15049, term15049.getClass(), "readerPos", 197109649);
        setIntField(term15049, term15049.getClass(), "bufMark", -1239406390);
        setElement(term15051, 0, "hMmaoREuCK");
        setField(term15049, term15049.getClass(), "stringCache", term15051);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term4179;
        args[1] = term4181;
        args[2] = "VeDtgDzGAN";
        callMethod(klass, "rangeEquals", argTypes, term4158, args);
        assertTrue(recursiveEquals(term4158, term15049));
        assertTrue(recursiveEquals(term4179, 1557431527));
        assertTrue(recursiveEquals(term4181, -1504890659));
    }

};


