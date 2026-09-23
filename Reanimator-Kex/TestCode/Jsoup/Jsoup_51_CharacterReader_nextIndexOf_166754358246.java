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
import java.lang.Character;

public class CharacterReader_nextIndexOf_166754358246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term823;
     Object term909;

    public CharacterReader_nextIndexOf_166754358246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term823 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term824 = (char[]) newCharArray(8);
        Object[] term836 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term824, 0, 't');
        setCharElement(term824, 1, 'l');
        setCharElement(term824, 2, 'P');
        setCharElement(term824, 3, 'w');
        setCharElement(term824, 4, 'D');
        setCharElement(term824, 5, 'Y');
        setCharElement(term824, 6, 'F');
        setCharElement(term824, 7, 's');
        setField(term823, term823.getClass(), "input", term824);
        setIntField(term823, term823.getClass(), "length", 865208305);
        setIntField(term823, term823.getClass(), "pos", -1275173084);
        setIntField(term823, term823.getClass(), "mark", -244121226);
        setElement(term836, 0, "AijpHYOFuy");
        setElement(term836, 1, "SbAoxhfrkn");
        setElement(term836, 2, "kuTXqwMtDB");
        setElement(term836, 3, "Ghbwtircqb");
        setElement(term836, 4, "xrwlQZdwCp");
        setElement(term836, 5, "IDCWpPLRkE");
        setField(term823, term823.getClass(), "stringCache", term836);
        term909 = new Character('j');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term909;
        try {
            callMethod(klass, "nextIndexOf", argTypes, term823, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


