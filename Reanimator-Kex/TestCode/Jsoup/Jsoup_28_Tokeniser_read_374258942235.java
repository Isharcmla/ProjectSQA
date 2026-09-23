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

public class Tokeniser_read_374258942235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221119;

    public Tokeniser_read_374258942235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term221805 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term221804 = ((Class) term221805).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term221804).setAccessible(true);
        Object enum377 = ((Field) term221804).get((Object) null);
        term221119 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term221301 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term221119, term221119.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term221119, term221119.getClass(), "isEmitPending", false);
        setField(term221119, term221119.getClass(), "state", enum377);
        setIntField(term221301, term221301.getClass(), "pos", -2147483648);
        setIntField(term221301, term221301.getClass(), "length", -2147483648);
        setField(term221119, term221119.getClass(), "reader", term221301);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term221119, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


