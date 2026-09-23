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

public class CharacterReader_matchesIgnoreCase_70550182852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339;

    public CharacterReader_matchesIgnoreCase_70550182852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term339 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term340 = (char[]) newCharArray(9);
        setCharElement(term340, 0, 'S');
        setCharElement(term340, 1, 'z');
        setCharElement(term340, 2, 'Y');
        setCharElement(term340, 3, 'Y');
        setCharElement(term340, 4, 'I');
        setCharElement(term340, 5, 'r');
        setCharElement(term340, 6, 'c');
        setCharElement(term340, 7, 'R');
        setCharElement(term340, 8, 'M');
        setField(term339, term339.getClass(), "input", term340);
        setIntField(term339, term339.getClass(), "length", -2095575670);
        setIntField(term339, term339.getClass(), "pos", 1225272962);
        setIntField(term339, term339.getClass(), "mark", 1324040357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        try {
            callMethod(klass, "matchesIgnoreCase", argTypes, term339, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


