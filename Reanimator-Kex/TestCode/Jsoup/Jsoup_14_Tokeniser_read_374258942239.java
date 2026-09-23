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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Tokeniser_read_374258942239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355869;

    public Tokeniser_read_374258942239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term356091 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term356090 = ((Class) term356091).getDeclaredField((String) "ScriptDataEscapedLessthanSign");
        ((Field) term356090).setAccessible(true);
        Object enum912 = ((Field) term356090).get((Object) null);
        term355869 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term356051 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term355869, term355869.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term355869, term355869.getClass(), "isEmitPending", false);
        setField(term355869, term355869.getClass(), "state", enum912);
        setIntField(term356051, term356051.getClass(), "pos", -2147483648);
        setIntField(term356051, term356051.getClass(), "length", -2147483647);
        setField(term356051, term356051.getClass(), "input", "");
        setField(term355869, term355869.getClass(), "reader", term356051);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term355869, args);
    }

};


