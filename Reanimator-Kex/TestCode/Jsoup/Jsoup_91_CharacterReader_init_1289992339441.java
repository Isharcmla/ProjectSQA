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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_init_1289992339441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105510;

    public CharacterReader_init_1289992339441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term105472 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term105387 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term105472, term105472.getClass(), "bufMark", 0);
        setField(term105472, term105472.getClass(), "stringCache", term105387);
        term105510 = newInstance(Class.forName("java.io.Reader$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.Reader");
        Object[] args = new Object[1];
        args[0] = term105510;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


