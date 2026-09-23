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

public class CharacterReader_containsIgnoreCase_2016817048466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115232;

    public CharacterReader_containsIgnoreCase_2016817048466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115232 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term115274 = newInstance(Class.forName("java.io.FileReader"));
        setIntField(term115232, term115232.getClass(), "bufPos", -2147483648);
        setIntField(term115232, term115232.getClass(), "bufSplitPoint", -2147483648);
        setField(term115232, term115232.getClass(), "reader", term115274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "containsIgnoreCase", argTypes, term115232, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


