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
import java.lang.Object;

public class CharacterReader_consumeData_2009922325617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1402904;

    public CharacterReader_consumeData_2009922325617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1402904 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term1402956 = newInstance(Class.forName("java.io.CharArrayReader"));
        setIntField(term1402904, term1402904.getClass(), "bufPos", -2147483648);
        setIntField(term1402904, term1402904.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term1402904, term1402904.getClass(), "readerPos", 0);
        setField(term1402904, term1402904.getClass(), "reader", term1402956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeData", argTypes, term1402904, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


