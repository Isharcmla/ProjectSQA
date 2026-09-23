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

public class CharacterReader_consumeTo_1694855709194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37798;

    public CharacterReader_consumeTo_1694855709194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37798 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term37798, term37798.getClass(), "bufPos", -2147483648);
        setIntField(term37798, term37798.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term37798, term37798.getClass(), "bufLength", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        try {
            callMethod(klass, "consumeTo", argTypes, term37798, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


