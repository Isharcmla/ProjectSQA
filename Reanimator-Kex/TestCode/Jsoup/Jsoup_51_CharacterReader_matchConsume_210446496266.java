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

public class CharacterReader_matchConsume_210446496266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3507;

    public CharacterReader_matchConsume_210446496266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3507 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3508 = (char[]) newCharArray(9);
        Object[] term3521 = (Object[]) newArray("java.lang.String", 7);
        setCharElement(term3508, 0, 'n');
        setCharElement(term3508, 1, 'L');
        setCharElement(term3508, 2, 'W');
        setCharElement(term3508, 3, 'B');
        setCharElement(term3508, 4, 'a');
        setCharElement(term3508, 5, 'J');
        setCharElement(term3508, 6, 'l');
        setCharElement(term3508, 7, 'i');
        setCharElement(term3508, 8, 'e');
        setField(term3507, term3507.getClass(), "input", term3508);
        setIntField(term3507, term3507.getClass(), "length", 1442160736);
        setIntField(term3507, term3507.getClass(), "pos", 1114000454);
        setIntField(term3507, term3507.getClass(), "mark", -556405712);
        setElement(term3521, 0, "PznxWXsZME");
        setElement(term3521, 1, "ZzIujlwVsw");
        setElement(term3521, 2, "LWyEaeIyAo");
        setElement(term3521, 3, "yVMkkQhvmN");
        setElement(term3521, 4, "mvrkADEgpp");
        setElement(term3521, 5, "pXOkjyeIRb");
        setElement(term3521, 6, "GgZWSjxjyE");
        setField(term3507, term3507.getClass(), "stringCache", term3521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EeBVbzjcCI";
        try {
            callMethod(klass, "matchConsume", argTypes, term3507, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


