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

public class Tokeniser_read_374258942349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314849;

    public Tokeniser_read_374258942349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term315530 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term315529 = ((Class) term315530).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term315529).setAccessible(true);
        Object enum547 = ((Field) term315529).get((Object) null);
        term314849 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term315031 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term314849, term314849.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term314849, term314849.getClass(), "isEmitPending", false);
        setField(term314849, term314849.getClass(), "state", enum547);
        setIntField(term315031, term315031.getClass(), "bufPos", -2147483648);
        setIntField(term315031, term315031.getClass(), "bufSplitPoint", -2147483648);
        setField(term314849, term314849.getClass(), "reader", term315031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term314849, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


