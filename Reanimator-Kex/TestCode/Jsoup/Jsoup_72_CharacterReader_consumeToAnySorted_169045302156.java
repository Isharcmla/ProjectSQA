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

public class CharacterReader_consumeToAnySorted_169045302156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1400;
     Object term1482;
     Object term8523;
     Object term8538;

    public CharacterReader_consumeToAnySorted_169045302156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1400 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1401 = (char[]) newCharArray(2);
        Object[] term1409 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term1401, 0, 'M');
        setCharElement(term1401, 1, 'j');
        setField(term1400, term1400.getClass(), "charBuf", term1401);
        setField(term1400, term1400.getClass(), "reader", null);
        setIntField(term1400, term1400.getClass(), "bufLength", 962840079);
        setIntField(term1400, term1400.getClass(), "bufSplitPoint", 1540719661);
        setIntField(term1400, term1400.getClass(), "bufPos", 1265463001);
        setIntField(term1400, term1400.getClass(), "readerPos", 335112684);
        setIntField(term1400, term1400.getClass(), "bufMark", 1551099402);
        setElement(term1409, 0, "UoYtihxVaS");
        setElement(term1409, 1, "JDswTTCZHV");
        setElement(term1409, 2, "onpbIeEKoi");
        setElement(term1409, 3, "YRHGsAkhxb");
        setElement(term1409, 4, "ffYhPOzlUs");
        setElement(term1409, 5, "MLqYREekMl");
        setField(term1400, term1400.getClass(), "stringCache", term1409);
        term1482 = (char[]) newCharArray(6);
        setCharElement(term1482, 0, 'G');
        setCharElement(term1482, 1, 'Y');
        setCharElement(term1482, 2, 'S');
        setCharElement(term1482, 3, 'R');
        setCharElement(term1482, 4, 'K');
        setCharElement(term1482, 5, 'T');
        term8523 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term8524 = (char[]) newCharArray(2);
        Object[] term8525 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term8524, 0, 'M');
        setCharElement(term8524, 1, 'j');
        setField(term8523, term8523.getClass(), "charBuf", term8524);
        setField(term8523, term8523.getClass(), "reader", null);
        setIntField(term8523, term8523.getClass(), "bufLength", 962840079);
        setIntField(term8523, term8523.getClass(), "bufSplitPoint", 1540719661);
        setIntField(term8523, term8523.getClass(), "bufPos", 1265463001);
        setIntField(term8523, term8523.getClass(), "readerPos", 335112684);
        setIntField(term8523, term8523.getClass(), "bufMark", 1551099402);
        setElement(term8525, 0, "UoYtihxVaS");
        setElement(term8525, 1, "JDswTTCZHV");
        setElement(term8525, 2, "onpbIeEKoi");
        setElement(term8525, 3, "YRHGsAkhxb");
        setElement(term8525, 4, "ffYhPOzlUs");
        setElement(term8525, 5, "MLqYREekMl");
        setField(term8523, term8523.getClass(), "stringCache", term8525);
        term8538 = (char[]) newCharArray(6);
        setCharElement(term8538, 0, 'G');
        setCharElement(term8538, 1, 'Y');
        setCharElement(term8538, 2, 'S');
        setCharElement(term8538, 3, 'R');
        setCharElement(term8538, 4, 'K');
        setCharElement(term8538, 5, 'T');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1482;
        Object retValue = callMethod(klass, "consumeToAnySorted", argTypes, term1400, args);
        assertTrue(recursiveEquals(term1400, term8523));
        assertTrue(recursiveEquals(term1482, term8538));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


