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

public class Tokeniser_consumeCharacterReference_2014082919265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229800;

    public Tokeniser_consumeCharacterReference_2014082919265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229800 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term229870 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term229926 = newInstance(Class.forName("java.io.InputStreamReader"));
        setIntField(term229870, term229870.getClass(), "bufPos", -2147483648);
        setIntField(term229870, term229870.getClass(), "bufLength", -2147483647);
        setIntField(term229870, term229870.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term229870, term229870.getClass(), "readerPos", 0);
        setField(term229870, term229870.getClass(), "reader", term229926);
        setField(term229800, term229800.getClass(), "reader", term229870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Character");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        try {
            callMethod(klass, "consumeCharacterReference", argTypes, term229800, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


