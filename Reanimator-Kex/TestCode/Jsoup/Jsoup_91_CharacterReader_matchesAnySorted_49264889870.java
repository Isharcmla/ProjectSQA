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

public class CharacterReader_matchesAnySorted_49264889870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2968;
     Object term3086;

    public CharacterReader_matchesAnySorted_49264889870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2968 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2969 = (char[]) newCharArray(2);
        Object[] term2977 = (Object[]) newArray("java.lang.String", 9);
        setCharElement(term2969, 0, 'V');
        setCharElement(term2969, 1, 'c');
        setField(term2968, term2968.getClass(), "charBuf", term2969);
        setField(term2968, term2968.getClass(), "reader", null);
        setIntField(term2968, term2968.getClass(), "bufLength", 71190297);
        setIntField(term2968, term2968.getClass(), "bufSplitPoint", 1202361360);
        setIntField(term2968, term2968.getClass(), "bufPos", -2015048153);
        setIntField(term2968, term2968.getClass(), "readerPos", -2063457669);
        setIntField(term2968, term2968.getClass(), "bufMark", -1222006000);
        setElement(term2977, 0, "OEXDRUKcFl");
        setElement(term2977, 1, "RYdKCNNMBR");
        setElement(term2977, 2, "yGtHPyvYiQ");
        setElement(term2977, 3, "MvRIxilFMJ");
        setElement(term2977, 4, "iNwOJRBEjp");
        setElement(term2977, 5, "XylxrMBraH");
        setElement(term2977, 6, "pORebkoRdD");
        setElement(term2977, 7, "mXGCWJDOqA");
        setElement(term2977, 8, "dpNsDgfPso");
        setField(term2968, term2968.getClass(), "stringCache", term2977);
        term3086 = (char[]) newCharArray(7);
        setCharElement(term3086, 0, 'I');
        setCharElement(term3086, 1, 'n');
        setCharElement(term3086, 2, 'Y');
        setCharElement(term3086, 3, 'n');
        setCharElement(term3086, 4, 'L');
        setCharElement(term3086, 5, 'W');
        setCharElement(term3086, 6, 'B');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3086;
        try {
            callMethod(klass, "matchesAnySorted", argTypes, term2968, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


