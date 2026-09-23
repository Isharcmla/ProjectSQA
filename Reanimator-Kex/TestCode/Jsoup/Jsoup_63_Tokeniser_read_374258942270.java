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

public class Tokeniser_read_374258942270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233635;

    public Tokeniser_read_374258942270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term234998 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term234997 = ((Class) term234998).getDeclaredField((String) "AttributeValue_doubleQuoted");
        ((Field) term234997).setAccessible(true);
        Object enum494 = ((Field) term234997).get((Object) null);
        term233635 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term233817 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term233635, term233635.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term233635, term233635.getClass(), "isEmitPending", false);
        setField(term233635, term233635.getClass(), "state", enum494);
        setIntField(term233817, term233817.getClass(), "bufPos", -2147483648);
        setIntField(term233817, term233817.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term233817, term233817.getClass(), "bufLength", -2147483647);
        setField(term233635, term233635.getClass(), "reader", term233817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term233635, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


