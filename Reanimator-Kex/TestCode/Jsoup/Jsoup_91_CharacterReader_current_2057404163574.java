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

public class CharacterReader_current_2057404163574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143411;

    public CharacterReader_current_2057404163574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143411 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term143463 = newInstance(Class.forName("java.io.CharArrayReader"));
        setIntField(term143411, term143411.getClass(), "bufPos", -2147483648);
        setIntField(term143411, term143411.getClass(), "bufSplitPoint", -2147483648);
        setField(term143411, term143411.getClass(), "reader", term143463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "current", argTypes, term143411, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


