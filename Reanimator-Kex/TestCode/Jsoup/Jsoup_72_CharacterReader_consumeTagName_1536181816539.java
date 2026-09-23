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

public class CharacterReader_consumeTagName_1536181816539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1146547;

    public CharacterReader_consumeTagName_1536181816539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1146547 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term1146603 = newInstance(Class.forName("java.io.InputStreamReader"));
        setIntField(term1146547, term1146547.getClass(), "bufPos", -2147483648);
        setIntField(term1146547, term1146547.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term1146547, term1146547.getClass(), "readerPos", 0);
        setField(term1146547, term1146547.getClass(), "reader", term1146603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeTagName", argTypes, term1146547, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


