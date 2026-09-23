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

public class CharacterReader_consumeToEnd_141903063754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1767;

    public CharacterReader_consumeToEnd_141903063754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1767 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1768 = (char[]) newCharArray(5);
        Object[] term1777 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term1768, 0, 'S');
        setCharElement(term1768, 1, 'z');
        setCharElement(term1768, 2, 'Y');
        setCharElement(term1768, 3, 'Y');
        setCharElement(term1768, 4, 'I');
        setField(term1767, term1767.getClass(), "input", term1768);
        setIntField(term1767, term1767.getClass(), "length", 454281060);
        setIntField(term1767, term1767.getClass(), "pos", -1786399638);
        setIntField(term1767, term1767.getClass(), "mark", 2055867847);
        setElement(term1777, 0, "tPlsykYBqO");
        setField(term1767, term1767.getClass(), "stringCache", term1777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeToEnd", argTypes, term1767, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


