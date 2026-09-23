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

public class Tokeniser_read_374258942215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179262;

    public Tokeniser_read_374258942215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term179937 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term179936 = ((Class) term179937).getDeclaredField((String) "ScriptDataEscapedDash");
        ((Field) term179936).setAccessible(true);
        Object enum358 = ((Field) term179936).get((Object) null);
        term179262 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term179444 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term179262, term179262.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term179262, term179262.getClass(), "isEmitPending", false);
        setField(term179262, term179262.getClass(), "state", enum358);
        setIntField(term179444, term179444.getClass(), "pos", -2147483648);
        setIntField(term179444, term179444.getClass(), "length", -2147483647);
        setField(term179262, term179262.getClass(), "reader", term179444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term179262, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


