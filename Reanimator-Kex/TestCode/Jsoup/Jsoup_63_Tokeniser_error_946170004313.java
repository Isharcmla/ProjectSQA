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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Tokeniser_error_946170004313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272156;

    public Tokeniser_error_946170004313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272156 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term272224 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term272294 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term271949 = (char[]) newCharArray(106);
        setIntField(term272224, term272224.getClass(), "maxSize", 2147483647);
        setField(term272156, term272156.getClass(), "errors", term272224);
        setIntField(term272294, term272294.getClass(), "readerPos", 0);
        setIntField(term272294, term272294.getClass(), "bufPos", -2147483648);
        setIntField(term272294, term272294.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term272294, term272294.getClass(), "bufLength", -2147483647);
        setField(term272294, term272294.getClass(), "charBuf", term271949);
        setField(term272156, term272156.getClass(), "reader", term272294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "error", argTypes, term272156, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


