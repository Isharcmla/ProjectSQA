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

public class CharacterReader_matchConsume_210446496271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3567;

    public CharacterReader_matchConsume_210446496271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3567 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3568 = (char[]) newCharArray(9);
        Object[] term3583 = (Object[]) newArray("java.lang.String", 7);
        setCharElement(term3568, 0, 'n');
        setCharElement(term3568, 1, 'L');
        setCharElement(term3568, 2, 'W');
        setCharElement(term3568, 3, 'B');
        setCharElement(term3568, 4, 'a');
        setCharElement(term3568, 5, 'J');
        setCharElement(term3568, 6, 'l');
        setCharElement(term3568, 7, 'i');
        setCharElement(term3568, 8, 'e');
        setField(term3567, term3567.getClass(), "charBuf", term3568);
        setField(term3567, term3567.getClass(), "reader", null);
        setIntField(term3567, term3567.getClass(), "bufLength", 1555897383);
        setIntField(term3567, term3567.getClass(), "bufSplitPoint", 202001407);
        setIntField(term3567, term3567.getClass(), "bufPos", 158873461);
        setIntField(term3567, term3567.getClass(), "readerPos", -430151637);
        setIntField(term3567, term3567.getClass(), "bufMark", -1697741339);
        setElement(term3583, 0, "PznxWXsZME");
        setElement(term3583, 1, "ZzIujlwVsw");
        setElement(term3583, 2, "LWyEaeIyAo");
        setElement(term3583, 3, "yVMkkQhvmN");
        setElement(term3583, 4, "mvrkADEgpp");
        setElement(term3583, 5, "pXOkjyeIRb");
        setElement(term3583, 6, "GgZWSjxjyE");
        setField(term3567, term3567.getClass(), "stringCache", term3583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EeBVbzjcCI";
        try {
            callMethod(klass, "matchConsume", argTypes, term3567, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


