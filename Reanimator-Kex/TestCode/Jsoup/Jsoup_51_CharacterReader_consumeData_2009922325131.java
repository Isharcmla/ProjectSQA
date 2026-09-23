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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;

public class CharacterReader_consumeData_2009922325131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36344;
     Object term36603;

    public CharacterReader_consumeData_2009922325131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36344 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term36344, term36344.getClass(), "pos", -2147483648);
        setIntField(term36344, term36344.getClass(), "length", -2147483648);
        setField(term36344, term36344.getClass(), "input", null);
        term36603 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term36603, term36603.getClass(), "input", null);
        setIntField(term36603, term36603.getClass(), "length", -2147483648);
        setIntField(term36603, term36603.getClass(), "pos", -2147483648);
        setIntField(term36603, term36603.getClass(), "mark", 0);
        setField(term36603, term36603.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeData", argTypes, term36344, args);
        assertTrue(recursiveEquals(term36344, term36603));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


