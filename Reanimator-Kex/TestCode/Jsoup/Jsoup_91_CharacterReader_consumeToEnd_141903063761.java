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

public class CharacterReader_consumeToEnd_141903063761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1703;

    public CharacterReader_consumeToEnd_141903063761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1703 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1704 = (char[]) newCharArray(0);
        Object[] term1710 = (Object[]) newArray("java.lang.String", 9);
        setField(term1703, term1703.getClass(), "charBuf", term1704);
        setField(term1703, term1703.getClass(), "reader", null);
        setIntField(term1703, term1703.getClass(), "bufLength", -1845499264);
        setIntField(term1703, term1703.getClass(), "bufSplitPoint", -505439934);
        setIntField(term1703, term1703.getClass(), "bufPos", -344842608);
        setIntField(term1703, term1703.getClass(), "readerPos", 941650513);
        setIntField(term1703, term1703.getClass(), "bufMark", 444029505);
        setElement(term1710, 0, "hoicvmsovO");
        setElement(term1710, 1, "eqJfYWRaEL");
        setElement(term1710, 2, "fhkbdRViHi");
        setElement(term1710, 3, "uWHnvSvaPl");
        setElement(term1710, 4, "kBdSllIBVz");
        setElement(term1710, 5, "TJmVBGfTML");
        setElement(term1710, 6, "tPlsykYBqO");
        setElement(term1710, 7, "bLPjGVBhlX");
        setElement(term1710, 8, "whBvTVIIlC");
        setField(term1703, term1703.getClass(), "stringCache", term1710);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeToEnd", argTypes, term1703, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


