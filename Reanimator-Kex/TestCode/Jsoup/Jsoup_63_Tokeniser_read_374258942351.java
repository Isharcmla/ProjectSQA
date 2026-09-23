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

public class Tokeniser_read_374258942351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317831;

    public Tokeniser_read_374258942351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term318700 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term318699 = ((Class) term318700).getDeclaredField((String) "BetweenDoctypePublicAndSystemIdentifiers");
        ((Field) term318699).setAccessible(true);
        Object enum549 = ((Field) term318699).get((Object) null);
        term317831 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term318013 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term318081 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term317831, term317831.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term317831, term317831.getClass(), "isEmitPending", false);
        setField(term317831, term317831.getClass(), "state", enum549);
        setIntField(term318013, term318013.getClass(), "bufPos", -2147483648);
        setIntField(term318013, term318013.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term318013, term318013.getClass(), "bufLength", -2147483648);
        setField(term317831, term317831.getClass(), "reader", term318013);
        setField(term317831, term317831.getClass(), "errors", term318081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term317831, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


