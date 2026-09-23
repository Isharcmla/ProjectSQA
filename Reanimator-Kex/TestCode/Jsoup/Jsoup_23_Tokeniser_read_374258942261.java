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

public class Tokeniser_read_374258942261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231647;

    public Tokeniser_read_374258942261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term232509 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term232508 = ((Class) term232509).getDeclaredField((String) "ScriptDataDoubleEscapedDash");
        ((Field) term232508).setAccessible(true);
        Object enum394 = ((Field) term232508).get((Object) null);
        term231647 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term231829 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term231897 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term231647, term231647.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term231647, term231647.getClass(), "isEmitPending", false);
        setField(term231647, term231647.getClass(), "state", enum394);
        setIntField(term231829, term231829.getClass(), "pos", -2147483648);
        setIntField(term231829, term231829.getClass(), "length", -2147483648);
        setField(term231647, term231647.getClass(), "reader", term231829);
        setIntField(term231897, term231897.getClass(), "maxSize", 2147483647);
        setField(term231647, term231647.getClass(), "errors", term231897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term231647, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


