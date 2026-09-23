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

public class CharacterReader_consumeData_200992232557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1557;

    public CharacterReader_consumeData_200992232557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1557 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1558 = (char[]) newCharArray(2);
        Object[] term1566 = (Object[]) newArray("java.lang.String", 5);
        setCharElement(term1558, 0, 'N');
        setCharElement(term1558, 1, 'F');
        setField(term1557, term1557.getClass(), "charBuf", term1558);
        setField(term1557, term1557.getClass(), "reader", null);
        setIntField(term1557, term1557.getClass(), "bufLength", -2027534003);
        setIntField(term1557, term1557.getClass(), "bufSplitPoint", 1063420942);
        setIntField(term1557, term1557.getClass(), "bufPos", 1375330971);
        setIntField(term1557, term1557.getClass(), "readerPos", -478195677);
        setIntField(term1557, term1557.getClass(), "bufMark", 972867650);
        setElement(term1566, 0, "ytSBIKXogI");
        setElement(term1566, 1, "nHXjMycHlU");
        setElement(term1566, 2, "ieCtQFdkii");
        setElement(term1566, 3, "dEnhdmILtU");
        setElement(term1566, 4, "hoicvmsovO");
        setField(term1557, term1557.getClass(), "stringCache", term1566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeData", argTypes, term1557, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


