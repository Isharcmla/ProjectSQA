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

public class CharacterReader_pos_150665043043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131;
     Object term5548;

    public CharacterReader_pos_150665043043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term132 = (char[]) newCharArray(3);
        Object[] term141 = (Object[]) newArray("java.lang.String", 4);
        setCharElement(term132, 0, 'n');
        setCharElement(term132, 1, 'Z');
        setCharElement(term132, 2, 't');
        setField(term131, term131.getClass(), "charBuf", term132);
        setField(term131, term131.getClass(), "reader", null);
        setIntField(term131, term131.getClass(), "bufLength", -1955890973);
        setIntField(term131, term131.getClass(), "bufSplitPoint", -2038273078);
        setIntField(term131, term131.getClass(), "bufPos", 1227103734);
        setIntField(term131, term131.getClass(), "readerPos", -1339778481);
        setIntField(term131, term131.getClass(), "bufMark", 1725571209);
        setElement(term141, 0, "EGtDIRbSSb");
        setElement(term141, 1, "SzjVpOQTyS");
        setElement(term141, 2, "MjGYSRKTNF");
        setElement(term141, 3, "hRNSzYYIrc");
        setField(term131, term131.getClass(), "stringCache", term141);
        term5548 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5549 = (char[]) newCharArray(3);
        Object[] term5550 = (Object[]) newArray("java.lang.String", 4);
        setCharElement(term5549, 0, 'n');
        setCharElement(term5549, 1, 'Z');
        setCharElement(term5549, 2, 't');
        setField(term5548, term5548.getClass(), "charBuf", term5549);
        setField(term5548, term5548.getClass(), "reader", null);
        setIntField(term5548, term5548.getClass(), "bufLength", -1955890973);
        setIntField(term5548, term5548.getClass(), "bufSplitPoint", -2038273078);
        setIntField(term5548, term5548.getClass(), "bufPos", 1227103734);
        setIntField(term5548, term5548.getClass(), "readerPos", -1339778481);
        setIntField(term5548, term5548.getClass(), "bufMark", 1725571209);
        setElement(term5550, 0, "EGtDIRbSSb");
        setElement(term5550, 1, "SzjVpOQTyS");
        setElement(term5550, 2, "MjGYSRKTNF");
        setElement(term5550, 3, "hRNSzYYIrc");
        setField(term5548, term5548.getClass(), "stringCache", term5550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "pos", argTypes, term131, args);
        assertTrue(recursiveEquals(term131, term5548));
        assertTrue(recursiveEquals(retValue, -112674747));
    }

};


