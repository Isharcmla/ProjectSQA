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
import java.lang.Object;

public class CharacterReader_nextIndexOf_158727933747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term979;

    public CharacterReader_nextIndexOf_158727933747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term979 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term980 = (char[]) newCharArray(2);
        Object[] term986 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term980, 0, 'J');
        setCharElement(term980, 1, 'C');
        setField(term979, term979.getClass(), "input", term980);
        setIntField(term979, term979.getClass(), "length", -203030934);
        setIntField(term979, term979.getClass(), "pos", -1179120542);
        setIntField(term979, term979.getClass(), "mark", -73683645);
        setElement(term986, 0, "nyiiPDVjAc");
        setField(term979, term979.getClass(), "stringCache", term986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "nextIndexOf", argTypes, term979, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


