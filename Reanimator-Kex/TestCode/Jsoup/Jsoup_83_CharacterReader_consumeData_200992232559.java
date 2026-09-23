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

public class CharacterReader_consumeData_200992232559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1539;

    public CharacterReader_consumeData_200992232559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1539 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1540 = (char[]) newCharArray(3);
        Object[] term1549 = (Object[]) newArray("java.lang.String", 5);
        setCharElement(term1540, 0, 'I');
        setCharElement(term1540, 1, 'r');
        setCharElement(term1540, 2, 'c');
        setField(term1539, term1539.getClass(), "charBuf", term1540);
        setField(term1539, term1539.getClass(), "reader", null);
        setIntField(term1539, term1539.getClass(), "bufLength", 1655935355);
        setIntField(term1539, term1539.getClass(), "bufSplitPoint", -481533957);
        setIntField(term1539, term1539.getClass(), "bufPos", 1240914516);
        setIntField(term1539, term1539.getClass(), "readerPos", -1465035361);
        setIntField(term1539, term1539.getClass(), "bufMark", 1090617576);
        setElement(term1549, 0, "ffYhPOzlUs");
        setElement(term1549, 1, "MLqYREekMl");
        setElement(term1549, 2, "ytSBIKXogI");
        setElement(term1549, 3, "nHXjMycHlU");
        setElement(term1549, 4, "ieCtQFdkii");
        setField(term1539, term1539.getClass(), "stringCache", term1549);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeData", argTypes, term1539, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


