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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;

public class CharacterReader_pos_150665043037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term4407;

    public CharacterReader_pos_150665043037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term24 = (char[]) newCharArray(5);
        Object[] term33 = (Object[]) newArray("java.lang.String", 4);
        setCharElement(term24, 0, 'P');
        setCharElement(term24, 1, 'A');
        setCharElement(term24, 2, 'E');
        setCharElement(term24, 3, 'B');
        setCharElement(term24, 4, 't');
        setField(term23, term23.getClass(), "input", term24);
        setIntField(term23, term23.getClass(), "length", 568599855);
        setIntField(term23, term23.getClass(), "pos", 1162663216);
        setIntField(term23, term23.getClass(), "mark", 1484323161);
        setElement(term33, 0, "sjlJAEtRrb");
        setElement(term33, 1, "MuLcgQHgqz");
        setElement(term33, 2, "xxtlPwDYFs");
        setElement(term33, 3, "jJCZpVmanW");
        setField(term23, term23.getClass(), "stringCache", term33);
        term4407 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4408 = (char[]) newCharArray(5);
        Object[] term4409 = (Object[]) newArray("java.lang.String", 4);
        setCharElement(term4408, 0, 'P');
        setCharElement(term4408, 1, 'A');
        setCharElement(term4408, 2, 'E');
        setCharElement(term4408, 3, 'B');
        setCharElement(term4408, 4, 't');
        setField(term4407, term4407.getClass(), "input", term4408);
        setIntField(term4407, term4407.getClass(), "length", 568599855);
        setIntField(term4407, term4407.getClass(), "pos", 1162663216);
        setIntField(term4407, term4407.getClass(), "mark", 1484323161);
        setElement(term4409, 0, "sjlJAEtRrb");
        setElement(term4409, 1, "MuLcgQHgqz");
        setElement(term4409, 2, "xxtlPwDYFs");
        setElement(term4409, 3, "jJCZpVmanW");
        setField(term4407, term4407.getClass(), "stringCache", term4409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "pos", argTypes, term23, args);
        assertTrue(recursiveEquals(term23, term4407));
        assertTrue(recursiveEquals(retValue, 1162663216));
    }

};


