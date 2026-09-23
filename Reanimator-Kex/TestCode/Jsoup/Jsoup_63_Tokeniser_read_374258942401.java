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

public class Tokeniser_read_374258942401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385046;

    public Tokeniser_read_374258942401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term385811 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term385810 = ((Class) term385811).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term385810).setAccessible(true);
        Object enum592 = ((Field) term385810).get((Object) null);
        term385046 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term385228 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term385286 = newInstance(Class.forName("java.io.Console$LineReader"));
        setBooleanField(term385046, term385046.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term385046, term385046.getClass(), "isEmitPending", false);
        setField(term385046, term385046.getClass(), "state", enum592);
        setIntField(term385228, term385228.getClass(), "bufPos", -2147483648);
        setIntField(term385228, term385228.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term385228, term385228.getClass(), "readerPos", 0);
        setField(term385228, term385228.getClass(), "reader", term385286);
        setField(term385046, term385046.getClass(), "reader", term385228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term385046, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


