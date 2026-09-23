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

public class Tokeniser_read_374258942237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219611;

    public Tokeniser_read_374258942237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term220436 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term220435 = ((Class) term220436).getDeclaredField((String) "BeforeDoctypeSystemIdentifier");
        ((Field) term220435).setAccessible(true);
        Object enum484 = ((Field) term220435).get((Object) null);
        term219611 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term219793 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term219861 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term219611, term219611.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term219611, term219611.getClass(), "isEmitPending", false);
        setField(term219611, term219611.getClass(), "state", enum484);
        setIntField(term219793, term219793.getClass(), "bufPos", -2147483648);
        setIntField(term219793, term219793.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term219793, term219793.getClass(), "bufLength", -2147483648);
        setField(term219611, term219611.getClass(), "reader", term219793);
        setField(term219611, term219611.getClass(), "errors", term219861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term219611, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


