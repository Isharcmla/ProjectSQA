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

public class CharacterReader_matchConsumeIgnoreCase_13476025667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3707;

    public CharacterReader_matchConsumeIgnoreCase_13476025667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3707 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3708 = (char[]) newCharArray(6);
        Object[] term3718 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term3708, 0, 'C');
        setCharElement(term3708, 1, 'F');
        setCharElement(term3708, 2, 'V');
        setCharElement(term3708, 3, 't');
        setCharElement(term3708, 4, 'F');
        setCharElement(term3708, 5, 'Z');
        setField(term3707, term3707.getClass(), "input", term3708);
        setIntField(term3707, term3707.getClass(), "length", -1772434990);
        setIntField(term3707, term3707.getClass(), "pos", -1845499264);
        setIntField(term3707, term3707.getClass(), "mark", -505439934);
        setElement(term3718, 0, "UfQtPRyWRC");
        setElement(term3718, 1, "FPvxVzzSvD");
        setElement(term3718, 2, "WHcwFgsGFC");
        setElement(term3718, 3, "HzqpegHiRq");
        setElement(term3718, 4, "jwsfVjMoJT");
        setElement(term3718, 5, "ZfdXfCCFDf");
        setField(term3707, term3707.getClass(), "stringCache", term3718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MwwjNtdOFT";
        try {
            callMethod(klass, "matchConsumeIgnoreCase", argTypes, term3707, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


