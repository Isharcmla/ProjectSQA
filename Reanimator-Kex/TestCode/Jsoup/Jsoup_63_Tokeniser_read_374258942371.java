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
import org.jsoup.UncheckedIOException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343005;

    public Tokeniser_read_374258942371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term344273 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term344272 = ((Class) term344273).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term344272).setAccessible(true);
        Object enum568 = ((Field) term344272).get((Object) null);
        term343005 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term343187 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term343225 = newInstance(Class.forName("java.io.Reader$1"));
        setBooleanField(term343005, term343005.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term343005, term343005.getClass(), "isEmitPending", false);
        setField(term343005, term343005.getClass(), "state", enum568);
        setIntField(term343187, term343187.getClass(), "bufPos", -2147483648);
        setIntField(term343187, term343187.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term343187, term343187.getClass(), "readerPos", 0);
        setField(term343187, term343187.getClass(), "reader", term343225);
        setField(term343005, term343005.getClass(), "reader", term343187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term343005, args);
            assertTrue(false);
        }
        catch (UncheckedIOException e) {
        }

    }

};


