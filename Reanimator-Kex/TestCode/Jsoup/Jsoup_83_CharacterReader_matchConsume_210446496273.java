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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_matchConsume_210446496273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3547;

    public CharacterReader_matchConsume_210446496273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3547 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3548 = (char[]) newCharArray(6);
        Object[] term3560 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term3548, 0, 'b');
        setCharElement(term3548, 1, 'n');
        setCharElement(term3548, 2, 'z');
        setCharElement(term3548, 3, 'T');
        setCharElement(term3548, 4, 's');
        setCharElement(term3548, 5, 't');
        setField(term3547, term3547.getClass(), "charBuf", term3548);
        setField(term3547, term3547.getClass(), "reader", null);
        setIntField(term3547, term3547.getClass(), "bufLength", 98922530);
        setIntField(term3547, term3547.getClass(), "bufSplitPoint", -1388471422);
        setIntField(term3547, term3547.getClass(), "bufPos", -1498296052);
        setIntField(term3547, term3547.getClass(), "readerPos", 2098647989);
        setIntField(term3547, term3547.getClass(), "bufMark", 1598895173);
        setElement(term3560, 0, "fWKJoSoCwE");
        setElement(term3560, 1, "wfaXBpWAUH");
        setElement(term3560, 2, "VMeAzAHwZj");
        setElement(term3560, 3, "PznxWXsZME");
        setElement(term3560, 4, "ZzIujlwVsw");
        setElement(term3560, 5, "LWyEaeIyAo");
        setField(term3547, term3547.getClass(), "stringCache", term3560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yVMkkQhvmN";
        try {
            callMethod(klass, "matchConsume", argTypes, term3547, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


