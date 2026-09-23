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

public class CharacterReader_consumeHexSequence_393737519517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4121532;

    public CharacterReader_consumeHexSequence_393737519517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4121532 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4121393 = (char[]) newCharArray(9);
        Object[] term4121413 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term4121532, term4121532.getClass(), "pos", 0);
        setIntField(term4121532, term4121532.getClass(), "length", 1);
        setCharElement(term4121393, 0, (char) 53);
        setCharElement(term4121393, 1, (char) 53);
        setCharElement(term4121393, 2, (char) 53);
        setCharElement(term4121393, 3, (char) 53);
        setCharElement(term4121393, 4, (char) 53);
        setCharElement(term4121393, 5, (char) 53);
        setCharElement(term4121393, 6, (char) 53);
        setCharElement(term4121393, 7, (char) 53);
        setCharElement(term4121393, 8, (char) 53);
        setField(term4121532, term4121532.getClass(), "input", term4121393);
        setField(term4121532, term4121532.getClass(), "stringCache", term4121413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term4121532, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


