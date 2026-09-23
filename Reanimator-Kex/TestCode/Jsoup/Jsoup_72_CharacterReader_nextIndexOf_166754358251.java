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
import java.lang.Character;

public class CharacterReader_nextIndexOf_166754358251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term843;
     Object term931;

    public CharacterReader_nextIndexOf_166754358251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term843 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term844 = (char[]) newCharArray(8);
        Object[] term858 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term844, 0, 't');
        setCharElement(term844, 1, 'l');
        setCharElement(term844, 2, 'P');
        setCharElement(term844, 3, 'w');
        setCharElement(term844, 4, 'D');
        setCharElement(term844, 5, 'Y');
        setCharElement(term844, 6, 'F');
        setCharElement(term844, 7, 's');
        setField(term843, term843.getClass(), "charBuf", term844);
        setField(term843, term843.getClass(), "reader", null);
        setIntField(term843, term843.getClass(), "bufLength", -1016503459);
        setIntField(term843, term843.getClass(), "bufSplitPoint", -1968847291);
        setIntField(term843, term843.getClass(), "bufPos", 579005622);
        setIntField(term843, term843.getClass(), "readerPos", -14890619);
        setIntField(term843, term843.getClass(), "bufMark", 1632125673);
        setElement(term858, 0, "AijpHYOFuy");
        setElement(term858, 1, "SbAoxhfrkn");
        setElement(term858, 2, "kuTXqwMtDB");
        setElement(term858, 3, "Ghbwtircqb");
        setElement(term858, 4, "xrwlQZdwCp");
        setElement(term858, 5, "IDCWpPLRkE");
        setField(term843, term843.getClass(), "stringCache", term858);
        term931 = new Character('j');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term931;
        try {
            callMethod(klass, "nextIndexOf", argTypes, term843, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


