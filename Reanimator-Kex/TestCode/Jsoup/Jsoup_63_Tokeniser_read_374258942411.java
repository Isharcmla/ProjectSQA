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
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397928;

    public Tokeniser_read_374258942411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term398691 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term398690 = ((Class) term398691).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term398690).setAccessible(true);
        Object enum600 = ((Field) term398690).get((Object) null);
        term397928 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term398110 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term398164 = newInstance(Class.forName("java.io.LineNumberReader"));
        setBooleanField(term397928, term397928.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term397928, term397928.getClass(), "isEmitPending", false);
        setField(term397928, term397928.getClass(), "state", enum600);
        setIntField(term398110, term398110.getClass(), "bufPos", -2147483648);
        setIntField(term398110, term398110.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term398110, term398110.getClass(), "readerPos", 0);
        setField(term398110, term398110.getClass(), "reader", term398164);
        setField(term397928, term397928.getClass(), "reader", term398110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term397928, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


