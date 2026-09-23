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

public class CharacterReader_matchConsumeIgnoreCase_13476025657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471;

    public CharacterReader_matchConsumeIgnoreCase_13476025657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term472 = (char[]) newCharArray(7);
        setCharElement(term472, 0, 'i');
        setCharElement(term472, 1, 'g');
        setCharElement(term472, 2, 'E');
        setCharElement(term472, 3, 'T');
        setCharElement(term472, 4, 'm');
        setCharElement(term472, 5, 'J');
        setCharElement(term472, 6, 'M');
        setField(term471, term471.getClass(), "input", term472);
        setIntField(term471, term471.getClass(), "length", 1375330971);
        setIntField(term471, term471.getClass(), "pos", -478195677);
        setIntField(term471, term471.getClass(), "mark", 972867650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        try {
            callMethod(klass, "matchConsumeIgnoreCase", argTypes, term471, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


