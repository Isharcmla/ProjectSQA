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

public class CharacterReader_nextIndexOf_1587279337606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155979;

    public CharacterReader_nextIndexOf_1587279337606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155979 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term156033 = newInstance(Class.forName("java.io.LineNumberReader"));
        setIntField(term155979, term155979.getClass(), "bufPos", -2147483648);
        setIntField(term155979, term155979.getClass(), "bufSplitPoint", -2147483648);
        setField(term155979, term155979.getClass(), "reader", term156033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "nextIndexOf", argTypes, term155979, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


