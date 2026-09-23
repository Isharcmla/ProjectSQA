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
import java.lang.Object;

public class CharacterReader_consumeAsString_1848884645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term773;

    public CharacterReader_consumeAsString_1848884645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term773 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term774 = (char[]) newCharArray(0);
        Object[] term778 = (Object[]) newArray("java.lang.String", 2);
        setField(term773, term773.getClass(), "input", term774);
        setIntField(term773, term773.getClass(), "length", -1007160944);
        setIntField(term773, term773.getClass(), "pos", 1135664017);
        setIntField(term773, term773.getClass(), "mark", 590364439);
        setElement(term778, 0, "OWDIEULEFu");
        setElement(term778, 1, "dWRymuLBtr");
        setField(term773, term773.getClass(), "stringCache", term778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeAsString", argTypes, term773, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


