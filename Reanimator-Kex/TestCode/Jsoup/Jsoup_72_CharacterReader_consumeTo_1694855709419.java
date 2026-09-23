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

public class CharacterReader_consumeTo_1694855709419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369149;

    public CharacterReader_consumeTo_1694855709419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369149 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term368540 = (char[]) newCharArray(489);
        Object[] term369030 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term369149, term369149.getClass(), "bufPos", -1038107938);
        setIntField(term369149, term369149.getClass(), "bufSplitPoint", -1038107937);
        setIntField(term369149, term369149.getClass(), "bufLength", -2147357939);
        setField(term369149, term369149.getClass(), "charBuf", term368540);
        setField(term369149, term369149.getClass(), "stringCache", term369030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        try {
            callMethod(klass, "consumeTo", argTypes, term369149, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


