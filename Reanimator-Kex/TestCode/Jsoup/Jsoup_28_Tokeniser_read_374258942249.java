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

public class Tokeniser_read_374258942249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234865;

    public Tokeniser_read_374258942249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term235722 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term235721 = ((Class) term235722).getDeclaredField((String) "SelfClosingStartTag");
        ((Field) term235721).setAccessible(true);
        Object enum385 = ((Field) term235721).get((Object) null);
        term234865 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term235045 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term235113 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term234865, term234865.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term234865, term234865.getClass(), "isEmitPending", false);
        setField(term234865, term234865.getClass(), "state", enum385);
        setIntField(term235045, term235045.getClass(), "pos", -2147483648);
        setIntField(term235045, term235045.getClass(), "length", -2147483648);
        setField(term234865, term234865.getClass(), "reader", term235045);
        setField(term234865, term234865.getClass(), "errors", term235113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term234865, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


