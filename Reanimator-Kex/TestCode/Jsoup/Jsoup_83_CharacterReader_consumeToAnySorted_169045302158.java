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

public class CharacterReader_consumeToAnySorted_169045302158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1464;
     Object term1502;

    public CharacterReader_consumeToAnySorted_169045302158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1464 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1465 = (char[]) newCharArray(6);
        Object[] term1477 = (Object[]) newArray("java.lang.String", 2);
        setCharElement(term1465, 0, 'K');
        setCharElement(term1465, 1, 'T');
        setCharElement(term1465, 2, 'N');
        setCharElement(term1465, 3, 'F');
        setCharElement(term1465, 4, 'h');
        setCharElement(term1465, 5, 'R');
        setField(term1464, term1464.getClass(), "charBuf", term1465);
        setField(term1464, term1464.getClass(), "reader", null);
        setIntField(term1464, term1464.getClass(), "bufLength", -2027534003);
        setIntField(term1464, term1464.getClass(), "bufSplitPoint", 1063420942);
        setIntField(term1464, term1464.getClass(), "bufPos", 1375330971);
        setIntField(term1464, term1464.getClass(), "readerPos", -478195677);
        setIntField(term1464, term1464.getClass(), "bufMark", 972867650);
        setElement(term1477, 0, "onpbIeEKoi");
        setElement(term1477, 1, "YRHGsAkhxb");
        setField(term1464, term1464.getClass(), "stringCache", term1477);
        term1502 = (char[]) newCharArray(5);
        setCharElement(term1502, 0, 'N');
        setCharElement(term1502, 1, 'S');
        setCharElement(term1502, 2, 'z');
        setCharElement(term1502, 3, 'Y');
        setCharElement(term1502, 4, 'Y');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1502;
        try {
            callMethod(klass, "consumeToAnySorted", argTypes, term1464, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


