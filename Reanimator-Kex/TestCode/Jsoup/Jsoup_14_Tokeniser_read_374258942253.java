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

public class Tokeniser_read_374258942253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377362;

    public Tokeniser_read_374258942253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term377544 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term377543 = ((Class) term377544).getDeclaredField((String) "RawtextLessthanSign");
        ((Field) term377543).setAccessible(true);
        Object enum920 = ((Field) term377543).get((Object) null);
        term377362 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term377542 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term377362, term377362.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term377362, term377362.getClass(), "isEmitPending", false);
        setField(term377362, term377362.getClass(), "state", enum920);
        setIntField(term377542, term377542.getClass(), "pos", -2147483648);
        setIntField(term377542, term377542.getClass(), "length", -2147483647);
        setField(term377542, term377542.getClass(), "input", null);
        setField(term377362, term377362.getClass(), "reader", term377542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "read", argTypes, term377362, args);
    }

};


