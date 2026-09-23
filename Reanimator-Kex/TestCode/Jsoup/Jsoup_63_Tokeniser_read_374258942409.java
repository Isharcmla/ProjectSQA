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

public class Tokeniser_read_374258942409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394869;

    public Tokeniser_read_374258942409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term395618 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term395617 = ((Class) term395618).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term395617).setAccessible(true);
        Object enum598 = ((Field) term395617).get((Object) null);
        term394869 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term395051 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term395093 = newInstance(Class.forName("java.io.FileReader"));
        setBooleanField(term394869, term394869.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term394869, term394869.getClass(), "isEmitPending", false);
        setField(term394869, term394869.getClass(), "state", enum598);
        setIntField(term395051, term395051.getClass(), "bufPos", -2147483648);
        setIntField(term395051, term395051.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term395051, term395051.getClass(), "readerPos", 0);
        setField(term395051, term395051.getClass(), "reader", term395093);
        setField(term394869, term394869.getClass(), "reader", term395051);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term394869, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


