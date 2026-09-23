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

public class CharacterReader_consumeData_200992232552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1525;

    public CharacterReader_consumeData_200992232552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1525 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1526 = (char[]) newCharArray(2);
        Object[] term1532 = (Object[]) newArray("java.lang.String", 5);
        setCharElement(term1526, 0, 'N');
        setCharElement(term1526, 1, 'F');
        setField(term1525, term1525.getClass(), "input", term1526);
        setIntField(term1525, term1525.getClass(), "length", -817164822);
        setIntField(term1525, term1525.getClass(), "pos", -1016503459);
        setIntField(term1525, term1525.getClass(), "mark", -1968847291);
        setElement(term1532, 0, "ytSBIKXogI");
        setElement(term1532, 1, "nHXjMycHlU");
        setElement(term1532, 2, "ieCtQFdkii");
        setElement(term1532, 3, "dEnhdmILtU");
        setElement(term1532, 4, "hoicvmsovO");
        setField(term1525, term1525.getClass(), "stringCache", term1532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeData", argTypes, term1525, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


