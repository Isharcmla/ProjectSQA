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

public class CharacterReader_consumeData_2009922325265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56534;

    public CharacterReader_consumeData_2009922325265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56534 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term56588 = newInstance(Class.forName("java.io.LineNumberReader"));
        setIntField(term56534, term56534.getClass(), "bufPos", -2147483648);
        setIntField(term56534, term56534.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term56534, term56534.getClass(), "readerPos", 0);
        setField(term56534, term56534.getClass(), "reader", term56588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeData", argTypes, term56534, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


