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
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294419;

    public Tokeniser_read_374258942329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term295249 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term295248 = ((Class) term295249).getDeclaredField((String) "BeforeDoctypeSystemIdentifier");
        ((Field) term295248).setAccessible(true);
        Object enum539 = ((Field) term295248).get((Object) null);
        term294419 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term294601 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term294667 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term294733 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setBooleanField(term294419, term294419.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term294419, term294419.getClass(), "isEmitPending", false);
        setField(term294419, term294419.getClass(), "state", enum539);
        setIntField(term294601, term294601.getClass(), "bufPos", -2147483648);
        setIntField(term294601, term294601.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term294601, term294601.getClass(), "bufLength", -2147483648);
        setField(term294419, term294419.getClass(), "reader", term294601);
        setField(term294419, term294419.getClass(), "doctypePending", term294667);
        setField(term294419, term294419.getClass(), "emitPending", term294733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term294419, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


