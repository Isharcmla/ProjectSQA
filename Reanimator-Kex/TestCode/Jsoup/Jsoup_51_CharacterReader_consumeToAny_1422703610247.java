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

public class CharacterReader_consumeToAny_1422703610247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94916;
     Object term93820;

    public CharacterReader_consumeToAny_1422703610247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94916 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term93823 = (char[]) newCharArray(489);
        setIntField(term94916, term94916.getClass(), "pos", 1610629118);
        setIntField(term94916, term94916.getClass(), "length", 1610629120);
        setCharElement(term93823, 0, (char) 4);
        setCharElement(term93823, 1, (char) 4);
        setCharElement(term93823, 2, (char) 4);
        setCharElement(term93823, 3, (char) 4);
        setCharElement(term93823, 4, (char) 4);
        setCharElement(term93823, 5, (char) 4);
        setCharElement(term93823, 6, (char) 4);
        setCharElement(term93823, 7, (char) 4);
        setCharElement(term93823, 8, (char) 4);
        setCharElement(term93823, 9, (char) 4);
        setCharElement(term93823, 10, (char) 4);
        setCharElement(term93823, 11, (char) 4);
        setCharElement(term93823, 12, (char) 4);
        setCharElement(term93823, 13, (char) 4);
        setCharElement(term93823, 14, (char) 4);
        setCharElement(term93823, 15, (char) 4);
        setCharElement(term93823, 16, (char) 4);
        setCharElement(term93823, 17, (char) 4);
        setCharElement(term93823, 18, (char) 4);
        setCharElement(term93823, 19, (char) 4);
        setCharElement(term93823, 20, (char) 4);
        setCharElement(term93823, 21, (char) 4);
        setCharElement(term93823, 22, (char) 4);
        setCharElement(term93823, 23, (char) 4);
        setCharElement(term93823, 24, (char) 4);
        setCharElement(term93823, 25, (char) 4);
        setCharElement(term93823, 26, (char) 4);
        setCharElement(term93823, 27, (char) 4);
        setCharElement(term93823, 28, (char) 4);
        setCharElement(term93823, 29, (char) 4);
        setCharElement(term93823, 30, (char) 4);
        setCharElement(term93823, 31, (char) 4);
        setCharElement(term93823, 32, (char) 4);
        setCharElement(term93823, 33, (char) 4);
        setCharElement(term93823, 34, (char) 4);
        setCharElement(term93823, 35, (char) 4);
        setCharElement(term93823, 36, (char) 4);
        setCharElement(term93823, 37, (char) 4);
        setCharElement(term93823, 38, (char) 4);
        setCharElement(term93823, 39, (char) 4);
        setCharElement(term93823, 40, (char) 4);
        setCharElement(term93823, 41, (char) 4);
        setCharElement(term93823, 42, (char) 4);
        setCharElement(term93823, 43, (char) 4);
        setCharElement(term93823, 44, (char) 4);
        setCharElement(term93823, 45, (char) 4);
        setCharElement(term93823, 46, (char) 4);
        setCharElement(term93823, 47, (char) 4);
        setCharElement(term93823, 48, (char) 4);
        setCharElement(term93823, 49, (char) 4);
        setCharElement(term93823, 50, (char) 4);
        setCharElement(term93823, 51, (char) 4);
        setCharElement(term93823, 52, (char) 4);
        setCharElement(term93823, 53, (char) 4);
        setCharElement(term93823, 54, (char) 4);
        setCharElement(term93823, 55, (char) 4);
        setCharElement(term93823, 56, (char) 4);
        setCharElement(term93823, 57, (char) 4);
        setCharElement(term93823, 58, (char) 4);
        setCharElement(term93823, 59, (char) 4);
        setCharElement(term93823, 60, (char) 4);
        setCharElement(term93823, 61, (char) 4);
        setCharElement(term93823, 62, (char) 4);
        setCharElement(term93823, 63, (char) 4);
        setCharElement(term93823, 64, (char) 4);
        setCharElement(term93823, 65, (char) 4);
        setCharElement(term93823, 66, (char) 4);
        setCharElement(term93823, 67, (char) 4);
        setCharElement(term93823, 68, (char) 4);
        setCharElement(term93823, 69, (char) 4);
        setCharElement(term93823, 70, (char) 4);
        setCharElement(term93823, 71, (char) 4);
        setCharElement(term93823, 72, (char) 4);
        setCharElement(term93823, 73, (char) 4);
        setCharElement(term93823, 74, (char) 4);
        setCharElement(term93823, 75, (char) 4);
        setCharElement(term93823, 76, (char) 4);
        setCharElement(term93823, 77, (char) 4);
        setCharElement(term93823, 78, (char) 4);
        setCharElement(term93823, 79, (char) 4);
        setCharElement(term93823, 80, (char) 4);
        setCharElement(term93823, 81, (char) 4);
        setCharElement(term93823, 82, (char) 4);
        setCharElement(term93823, 83, (char) 4);
        setCharElement(term93823, 84, (char) 4);
        setCharElement(term93823, 85, (char) 4);
        setCharElement(term93823, 86, (char) 4);
        setCharElement(term93823, 87, (char) 4);
        setCharElement(term93823, 88, (char) 4);
        setCharElement(term93823, 89, (char) 4);
        setCharElement(term93823, 90, (char) 4);
        setCharElement(term93823, 91, (char) 4);
        setCharElement(term93823, 92, (char) 4);
        setCharElement(term93823, 93, (char) 4);
        setCharElement(term93823, 94, (char) 4);
        setCharElement(term93823, 95, (char) 4);
        setCharElement(term93823, 96, (char) 4);
        setCharElement(term93823, 97, (char) 4);
        setCharElement(term93823, 98, (char) 4);
        setCharElement(term93823, 99, (char) 4);
        setCharElement(term93823, 100, (char) 4);
        setCharElement(term93823, 101, (char) 4);
        setCharElement(term93823, 102, (char) 4);
        setCharElement(term93823, 103, (char) 4);
        setCharElement(term93823, 104, (char) 4);
        setCharElement(term93823, 105, (char) 4);
        setField(term94916, term94916.getClass(), "input", term93823);
        setField(term94916, term94916.getClass(), "stringCache", null);
        term93820 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term93820;
        try {
            callMethod(klass, "consumeToAny", argTypes, term94916, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


