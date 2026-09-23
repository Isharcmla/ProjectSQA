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

public class CharacterReader_rangeEquals_141693673977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4320;
     Object term4377;
     Object term4379;
     Object term16316;

    public CharacterReader_rangeEquals_141693673977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4320 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4321 = (char[]) newCharArray(1);
        Object[] term4328 = (Object[]) newArray("java.lang.String", 4);
        setCharElement(term4321, 0, 'b');
        setField(term4320, term4320.getClass(), "charBuf", term4321);
        setField(term4320, term4320.getClass(), "reader", null);
        setIntField(term4320, term4320.getClass(), "bufLength", 628918458);
        setIntField(term4320, term4320.getClass(), "bufSplitPoint", -1274456137);
        setIntField(term4320, term4320.getClass(), "bufPos", 1041916673);
        setIntField(term4320, term4320.getClass(), "readerPos", -601863069);
        setIntField(term4320, term4320.getClass(), "bufMark", 663292551);
        setElement(term4328, 0, "OYbzXylRWW");
        setElement(term4328, 1, "DSNsTGYXDF");
        setElement(term4328, 2, "sQvGcVjdEx");
        setElement(term4328, 3, "rLHAoqXgPh");
        setField(term4320, term4320.getClass(), "stringCache", term4328);
        term4377 = new Integer(-1885090354);
        term4379 = new Integer(-2066804303);
        term16316 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term16317 = (char[]) newCharArray(1);
        Object[] term16318 = (Object[]) newArray("java.lang.String", 4);
        setCharElement(term16317, 0, 'b');
        setField(term16316, term16316.getClass(), "charBuf", term16317);
        setField(term16316, term16316.getClass(), "reader", null);
        setIntField(term16316, term16316.getClass(), "bufLength", 628918458);
        setIntField(term16316, term16316.getClass(), "bufSplitPoint", -1274456137);
        setIntField(term16316, term16316.getClass(), "bufPos", 1041916673);
        setIntField(term16316, term16316.getClass(), "readerPos", -601863069);
        setIntField(term16316, term16316.getClass(), "bufMark", 663292551);
        setElement(term16318, 0, "OYbzXylRWW");
        setElement(term16318, 1, "DSNsTGYXDF");
        setElement(term16318, 2, "sQvGcVjdEx");
        setElement(term16318, 3, "rLHAoqXgPh");
        setField(term16316, term16316.getClass(), "stringCache", term16318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term4377;
        args[1] = term4379;
        args[2] = "zUlRdimJtU";
        callMethod(klass, "rangeEquals", argTypes, term4320, args);
        assertTrue(recursiveEquals(term4320, term16316));
        assertTrue(recursiveEquals(term4377, -1885090354));
        assertTrue(recursiveEquals(term4379, -2066804303));
    }

};


