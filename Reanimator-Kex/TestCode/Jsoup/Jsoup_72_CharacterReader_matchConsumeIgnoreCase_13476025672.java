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

public class CharacterReader_matchConsumeIgnoreCase_13476025672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3769;

    public CharacterReader_matchConsumeIgnoreCase_13476025672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3769 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3770 = (char[]) newCharArray(6);
        Object[] term3782 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term3770, 0, 'C');
        setCharElement(term3770, 1, 'F');
        setCharElement(term3770, 2, 'V');
        setCharElement(term3770, 3, 't');
        setCharElement(term3770, 4, 'F');
        setCharElement(term3770, 5, 'Z');
        setField(term3769, term3769.getClass(), "charBuf", term3770);
        setField(term3769, term3769.getClass(), "reader", null);
        setIntField(term3769, term3769.getClass(), "bufLength", 98922530);
        setIntField(term3769, term3769.getClass(), "bufSplitPoint", -1388471422);
        setIntField(term3769, term3769.getClass(), "bufPos", -1498296052);
        setIntField(term3769, term3769.getClass(), "readerPos", 2098647989);
        setIntField(term3769, term3769.getClass(), "bufMark", 1598895173);
        setElement(term3782, 0, "UfQtPRyWRC");
        setElement(term3782, 1, "FPvxVzzSvD");
        setElement(term3782, 2, "WHcwFgsGFC");
        setElement(term3782, 3, "HzqpegHiRq");
        setElement(term3782, 4, "jwsfVjMoJT");
        setElement(term3782, 5, "ZfdXfCCFDf");
        setField(term3769, term3769.getClass(), "stringCache", term3782);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MwwjNtdOFT";
        try {
            callMethod(klass, "matchConsumeIgnoreCase", argTypes, term3769, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


