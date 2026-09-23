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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261013;

    public Tokeniser_read_374258942175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term261781 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term261780 = ((Class) term261781).getDeclaredField((String) "ScriptDataEscapeStartDash");
        ((Field) term261780).setAccessible(true);
        Object enum829 = ((Field) term261780).get((Object) null);
        term261013 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term261195 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term261013, term261013.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term261013, term261013.getClass(), "isEmitPending", false);
        setField(term261013, term261013.getClass(), "state", enum829);
        setIntField(term261195, term261195.getClass(), "pos", -2147483648);
        setIntField(term261195, term261195.getClass(), "length", -2147483647);
        setField(term261195, term261195.getClass(), "input", "");
        setField(term261013, term261013.getClass(), "reader", term261195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term261013, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


