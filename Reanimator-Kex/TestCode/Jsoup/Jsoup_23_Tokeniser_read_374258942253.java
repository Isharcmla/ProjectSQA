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

public class Tokeniser_read_374258942253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221845;

    public Tokeniser_read_374258942253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term222687 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term222686 = ((Class) term222687).getDeclaredField((String) "ScriptDataDoubleEscaped");
        ((Field) term222686).setAccessible(true);
        Object enum387 = ((Field) term222686).get((Object) null);
        term221845 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term222027 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term222095 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term221845, term221845.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term221845, term221845.getClass(), "isEmitPending", false);
        setField(term221845, term221845.getClass(), "state", enum387);
        setIntField(term222027, term222027.getClass(), "pos", -2147483648);
        setIntField(term222027, term222027.getClass(), "length", -2147483648);
        setField(term221845, term221845.getClass(), "reader", term222027);
        setIntField(term222095, term222095.getClass(), "maxSize", 2147483647);
        setField(term221845, term221845.getClass(), "errors", term222095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term221845, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


