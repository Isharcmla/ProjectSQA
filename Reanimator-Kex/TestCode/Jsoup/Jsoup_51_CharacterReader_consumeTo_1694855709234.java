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

public class CharacterReader_consumeTo_1694855709234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81289;

    public CharacterReader_consumeTo_1694855709234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81289 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term80688 = (char[]) newCharArray(489);
        Object[] term81178 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term81289, term81289.getClass(), "pos", -100036935);
        setIntField(term81289, term81289.getClass(), "length", -1341633850);
        setField(term81289, term81289.getClass(), "input", term80688);
        setField(term81289, term81289.getClass(), "stringCache", term81178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        try {
            callMethod(klass, "consumeTo", argTypes, term81289, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


