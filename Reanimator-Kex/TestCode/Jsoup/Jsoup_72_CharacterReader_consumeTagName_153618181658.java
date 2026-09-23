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

public class CharacterReader_consumeTagName_153618181658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1679;

    public CharacterReader_consumeTagName_153618181658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1679 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1680 = (char[]) newCharArray(3);
        Object[] term1689 = (Object[]) newArray("java.lang.String", 5);
        setCharElement(term1680, 0, 'h');
        setCharElement(term1680, 1, 'R');
        setCharElement(term1680, 2, 'N');
        setField(term1679, term1679.getClass(), "charBuf", term1680);
        setField(term1679, term1679.getClass(), "reader", null);
        setIntField(term1679, term1679.getClass(), "bufLength", 1655935355);
        setIntField(term1679, term1679.getClass(), "bufSplitPoint", -481533957);
        setIntField(term1679, term1679.getClass(), "bufPos", 1240914516);
        setIntField(term1679, term1679.getClass(), "readerPos", -1465035361);
        setIntField(term1679, term1679.getClass(), "bufMark", 1090617576);
        setElement(term1689, 0, "eqJfYWRaEL");
        setElement(term1689, 1, "fhkbdRViHi");
        setElement(term1689, 2, "uWHnvSvaPl");
        setElement(term1689, 3, "kBdSllIBVz");
        setElement(term1689, 4, "TJmVBGfTML");
        setField(term1679, term1679.getClass(), "stringCache", term1689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeTagName", argTypes, term1679, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


