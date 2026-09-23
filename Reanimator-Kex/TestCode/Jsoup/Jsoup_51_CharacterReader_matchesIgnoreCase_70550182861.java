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

public class CharacterReader_matchesIgnoreCase_70550182861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2745;

    public CharacterReader_matchesIgnoreCase_70550182861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2745 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2746 = (char[]) newCharArray(3);
        Object[] term2753 = (Object[]) newArray("java.lang.String", 4);
        setCharElement(term2746, 0, 'l');
        setCharElement(term2746, 1, 's');
        setCharElement(term2746, 2, 'z');
        setField(term2745, term2745.getClass(), "input", term2746);
        setIntField(term2745, term2745.getClass(), "length", 1540719661);
        setIntField(term2745, term2745.getClass(), "pos", 1265463001);
        setIntField(term2745, term2745.getClass(), "mark", 335112684);
        setElement(term2753, 0, "sEnIVFtZuQ");
        setElement(term2753, 1, "ZVecLZMLHF");
        setElement(term2753, 2, "fztQhjqwdP");
        setElement(term2753, 3, "eVpkWxjuki");
        setField(term2745, term2745.getClass(), "stringCache", term2753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SJiQaLvSKv";
        try {
            callMethod(klass, "matchesIgnoreCase", argTypes, term2745, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


