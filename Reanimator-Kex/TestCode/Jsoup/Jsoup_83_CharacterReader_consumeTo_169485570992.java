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

public class CharacterReader_consumeTo_169485570992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17875;

    public CharacterReader_consumeTo_169485570992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17875 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term17722 = (char[]) newCharArray(42);
        Object[] term17765 = (Object[]) newArray("java.lang.String", 496);
        setIntField(term17875, term17875.getClass(), "bufPos", 1478230036);
        setIntField(term17875, term17875.getClass(), "bufSplitPoint", 1478230037);
        setIntField(term17875, term17875.getClass(), "bufLength", -1875378027);
        setField(term17875, term17875.getClass(), "charBuf", term17722);
        setField(term17875, term17875.getClass(), "stringCache", term17765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                  ";
        try {
            callMethod(klass, "consumeTo", argTypes, term17875, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


