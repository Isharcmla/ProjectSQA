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

public class CharacterReader_consumeTo_1694855709152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28707;

    public CharacterReader_consumeTo_1694855709152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28707 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term28595 = (Object[]) newArray("java.lang.String", 17);
        setIntField(term28707, term28707.getClass(), "bufPos", 2147483646);
        setIntField(term28707, term28707.getClass(), "bufSplitPoint", 2147483647);
        setIntField(term28707, term28707.getClass(), "bufLength", -2147483641);
        setField(term28707, term28707.getClass(), "charBuf", null);
        setElement(term28595, 0, "");
        setElement(term28595, 1, "");
        setElement(term28595, 2, "");
        setElement(term28595, 3, "");
        setElement(term28595, 4, "");
        setElement(term28595, 5, "");
        setElement(term28595, 6, "");
        setElement(term28595, 7, "");
        setElement(term28595, 8, "");
        setElement(term28595, 9, "");
        setElement(term28595, 10, "");
        setElement(term28595, 11, "");
        setElement(term28595, 12, "");
        setElement(term28595, 13, "");
        setElement(term28595, 14, "");
        setElement(term28595, 15, "");
        setElement(term28595, 16, "");
        setField(term28707, term28707.getClass(), "stringCache", term28595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ";
        try {
            callMethod(klass, "consumeTo", argTypes, term28707, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


