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

public class CharacterReader_nextIndexOf_158727933741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153;

    public CharacterReader_nextIndexOf_158727933741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term154 = (char[]) newCharArray(6);
        setCharElement(term154, 0, 'j');
        setCharElement(term154, 1, 'J');
        setCharElement(term154, 2, 'C');
        setCharElement(term154, 3, 'Z');
        setCharElement(term154, 4, 'p');
        setCharElement(term154, 5, 'V');
        setField(term153, term153.getClass(), "input", term154);
        setIntField(term153, term153.getClass(), "length", -203030934);
        setIntField(term153, term153.getClass(), "pos", -1179120542);
        setIntField(term153, term153.getClass(), "mark", -73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "nextIndexOf", argTypes, term153, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


