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

public class CharacterReader_consumeTo_1694855709111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21000;

    public CharacterReader_consumeTo_1694855709111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21000 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term20888 = (Object[]) newArray("java.lang.String", 17);
        setIntField(term21000, term21000.getClass(), "bufPos", 2147483646);
        setIntField(term21000, term21000.getClass(), "bufSplitPoint", 2147483647);
        setIntField(term21000, term21000.getClass(), "bufLength", -2147483641);
        setField(term21000, term21000.getClass(), "charBuf", null);
        setElement(term20888, 0, "");
        setElement(term20888, 1, "");
        setElement(term20888, 2, "");
        setElement(term20888, 3, "");
        setElement(term20888, 4, "");
        setElement(term20888, 5, "");
        setElement(term20888, 6, "");
        setElement(term20888, 7, "");
        setElement(term20888, 8, "");
        setElement(term20888, 9, "");
        setElement(term20888, 10, "");
        setElement(term20888, 11, "");
        setElement(term20888, 12, "");
        setElement(term20888, 13, "");
        setElement(term20888, 14, "");
        setElement(term20888, 15, "");
        setElement(term20888, 16, "");
        setField(term21000, term21000.getClass(), "stringCache", term20888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ";
        try {
            callMethod(klass, "consumeTo", argTypes, term21000, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


