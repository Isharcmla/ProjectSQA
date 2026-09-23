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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharacterReader_consumeTo_169485570943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187;

    public CharacterReader_consumeTo_169485570943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term188 = (char[]) newCharArray(5);
        setCharElement(term188, 0, 't');
        setCharElement(term188, 1, 'D');
        setCharElement(term188, 2, 'I');
        setCharElement(term188, 3, 'R');
        setCharElement(term188, 4, 'b');
        setField(term187, term187.getClass(), "input", term188);
        setIntField(term187, term187.getClass(), "length", -1530420153);
        setIntField(term187, term187.getClass(), "pos", -469968304);
        setIntField(term187, term187.getClass(), "mark", -1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sjlJAEtRrb";
        try {
            callMethod(klass, "consumeTo", argTypes, term187, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


