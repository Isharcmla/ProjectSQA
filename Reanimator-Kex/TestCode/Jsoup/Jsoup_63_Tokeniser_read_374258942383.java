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

public class Tokeniser_read_374258942383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360440;

    public Tokeniser_read_374258942383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term361192 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term361191 = ((Class) term361192).getDeclaredField((String) "BogusDoctype");
        ((Field) term361191).setAccessible(true);
        Object enum578 = ((Field) term361191).get((Object) null);
        term360440 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term360622 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term360690 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setBooleanField(term360440, term360440.getClass(), "selfClosingFlagAcknowledged", true);
        setBooleanField(term360440, term360440.getClass(), "isEmitPending", false);
        setField(term360440, term360440.getClass(), "state", enum578);
        setIntField(term360622, term360622.getClass(), "bufPos", -2147483648);
        setIntField(term360622, term360622.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term360622, term360622.getClass(), "bufLength", -2147483648);
        setField(term360440, term360440.getClass(), "reader", term360622);
        setIntField(term360690, term360690.getClass(), "maxSize", 2147483647);
        setField(term360440, term360440.getClass(), "errors", term360690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term360440, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


