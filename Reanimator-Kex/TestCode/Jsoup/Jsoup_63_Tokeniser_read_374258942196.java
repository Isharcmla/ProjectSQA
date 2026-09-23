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

public class Tokeniser_read_374258942196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196560;

    public Tokeniser_read_374258942196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term197835 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term197834 = ((Class) term197835).getDeclaredField((String) "ScriptDataEscapeStartDash");
        ((Field) term197834).setAccessible(true);
        Object enum463 = ((Field) term197834).get((Object) null);
        term196560 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term196742 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term196560, term196560.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term196560, term196560.getClass(), "isEmitPending", false);
        setField(term196560, term196560.getClass(), "state", enum463);
        setIntField(term196742, term196742.getClass(), "bufPos", -2147483648);
        setIntField(term196742, term196742.getClass(), "bufSplitPoint", -2147483647);
        setField(term196560, term196560.getClass(), "reader", term196742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term196560, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


