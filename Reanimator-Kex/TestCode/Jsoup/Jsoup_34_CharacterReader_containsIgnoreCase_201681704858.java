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

public class CharacterReader_containsIgnoreCase_201681704858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term512;

    public CharacterReader_containsIgnoreCase_201681704858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term512 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term513 = (char[]) newCharArray(2);
        setCharElement(term513, 0, 'x');
        setCharElement(term513, 1, 'l');
        setField(term512, term512.getClass(), "input", term513);
        setIntField(term512, term512.getClass(), "length", 1655935355);
        setIntField(term512, term512.getClass(), "pos", -481533957);
        setIntField(term512, term512.getClass(), "mark", 1240914516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        try {
            callMethod(klass, "containsIgnoreCase", argTypes, term512, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


