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

public class CharacterReader_consumeData_2009922325356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79585;

    public CharacterReader_consumeData_2009922325356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79585 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term79637 = newInstance(Class.forName("java.io.CharArrayReader"));
        setIntField(term79585, term79585.getClass(), "bufPos", -2147483648);
        setIntField(term79585, term79585.getClass(), "bufSplitPoint", -2147483648);
        setField(term79585, term79585.getClass(), "reader", term79637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeData", argTypes, term79585, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


