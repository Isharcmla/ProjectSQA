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

public class Tokeniser_read_374258942312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271515;

    public Tokeniser_read_374258942312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term272667 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term272666 = ((Class) term272667).getDeclaredField((String) "AfterAttributeValue_quoted");
        ((Field) term272666).setAccessible(true);
        Object enum523 = ((Field) term272666).get((Object) null);
        term271515 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term271697 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term271515, term271515.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term271515, term271515.getClass(), "isEmitPending", false);
        setField(term271515, term271515.getClass(), "state", enum523);
        setIntField(term271697, term271697.getClass(), "bufPos", -2147483648);
        setIntField(term271697, term271697.getClass(), "bufLength", -2147483648);
        setField(term271515, term271515.getClass(), "reader", term271697);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term271515, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


