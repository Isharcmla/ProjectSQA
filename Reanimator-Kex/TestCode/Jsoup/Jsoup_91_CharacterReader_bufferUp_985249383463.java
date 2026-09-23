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

public class CharacterReader_bufferUp_985249383463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117753;

    public CharacterReader_bufferUp_985249383463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117753 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term117799 = newInstance(Class.forName("java.io.StringReader"));
        setIntField(term117753, term117753.getClass(), "bufPos", -2147483648);
        setIntField(term117753, term117753.getClass(), "bufSplitPoint", -2147483648);
        setField(term117753, term117753.getClass(), "reader", term117799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "bufferUp", argTypes, term117753, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


