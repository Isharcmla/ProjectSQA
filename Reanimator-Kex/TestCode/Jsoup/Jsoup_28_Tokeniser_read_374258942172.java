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

public class Tokeniser_read_374258942172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150332;

    public Tokeniser_read_374258942172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term154538 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term154537 = ((Class) term154538).getDeclaredField((String) "ScriptDataEscapedDash");
        ((Field) term154537).setAccessible(true);
        Object enum327 = ((Field) term154537).get((Object) null);
        term150332 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term150514 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term150332, term150332.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term150332, term150332.getClass(), "isEmitPending", false);
        setField(term150332, term150332.getClass(), "state", enum327);
        setIntField(term150514, term150514.getClass(), "pos", -2147483648);
        setIntField(term150514, term150514.getClass(), "length", -2147483647);
        setField(term150332, term150332.getClass(), "reader", term150514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term150332, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


