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

public class Tokeniser_read_374258942233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217933;

    public Tokeniser_read_374258942233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term218795 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term218794 = ((Class) term218795).getDeclaredField((String) "ScriptDataDoubleEscapedDash");
        ((Field) term218794).setAccessible(true);
        Object enum375 = ((Field) term218794).get((Object) null);
        term217933 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term218115 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term218183 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term217933, term217933.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term217933, term217933.getClass(), "isEmitPending", false);
        setField(term217933, term217933.getClass(), "state", enum375);
        setIntField(term218115, term218115.getClass(), "pos", -2147483648);
        setIntField(term218115, term218115.getClass(), "length", -2147483648);
        setField(term217933, term217933.getClass(), "reader", term218115);
        setIntField(term218183, term218183.getClass(), "maxSize", 2147483647);
        setField(term217933, term217933.getClass(), "errors", term218183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term217933, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


