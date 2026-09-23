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

public class Tokeniser_read_374258942241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206418;

    public Tokeniser_read_374258942241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term207275 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term207274 = ((Class) term207275).getDeclaredField((String) "SelfClosingStartTag");
        ((Field) term207274).setAccessible(true);
        Object enum375 = ((Field) term207274).get((Object) null);
        term206418 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term206598 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term206666 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term206418, term206418.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term206418, term206418.getClass(), "isEmitPending", false);
        setField(term206418, term206418.getClass(), "state", enum375);
        setIntField(term206598, term206598.getClass(), "pos", -2147483648);
        setIntField(term206598, term206598.getClass(), "length", -2147483648);
        setField(term206418, term206418.getClass(), "reader", term206598);
        setField(term206418, term206418.getClass(), "errors", term206666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term206418, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


