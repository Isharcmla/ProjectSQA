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

public class CharacterReader_matchesLetter_85209721954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406;

    public CharacterReader_matchesLetter_85209721954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term407 = (char[]) newCharArray(6);
        setCharElement(term407, 0, 'N');
        setCharElement(term407, 1, 'R');
        setCharElement(term407, 2, 'd');
        setCharElement(term407, 3, 'v');
        setCharElement(term407, 4, 'g');
        setCharElement(term407, 5, 'J');
        setField(term406, term406.getClass(), "input", term407);
        setIntField(term406, term406.getClass(), "length", 933028652);
        setIntField(term406, term406.getClass(), "pos", 287287233);
        setIntField(term406, term406.getClass(), "mark", 962840079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "matchesLetter", argTypes, term406, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


