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
import static org.jsoup.parser.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class Tokeniser_error_503508769131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220444;
     Object term220592;

    public Tokeniser_error_503508769131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term220496 = new ArrayList();
        term220444 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term220566 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term220444, term220444.getClass(), "trackErrors", true);
        setField(term220444, term220444.getClass(), "errors", term220496);
        setIntField(term220566, term220566.getClass(), "pos", 0);
        setField(term220444, term220444.getClass(), "reader", term220566);
        Object term220596 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term220596, term220596.getClass(), "errorMsg", null);
        setIntField(term220596, term220596.getClass(), "pos", 0);
        setCharField(term220596, term220596.getClass(), "c", (char) 0);
        setField(term220596, term220596.getClass(), "tokeniserState", null);
        setField(term220596, term220596.getClass(), "treeBuilderState", null);
        setField(term220596, term220596.getClass(), "token", null);
        ArrayList term220594 = new ArrayList();
        ((ArrayList) term220594).add(term220596);
        term220592 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term220593 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term220593, term220593.getClass(), "input", null);
        setIntField(term220593, term220593.getClass(), "length", 0);
        setIntField(term220593, term220593.getClass(), "pos", 0);
        setIntField(term220593, term220593.getClass(), "mark", 0);
        setField(term220592, term220592.getClass(), "reader", term220593);
        setBooleanField(term220592, term220592.getClass(), "trackErrors", true);
        setField(term220592, term220592.getClass(), "errors", term220594);
        setField(term220592, term220592.getClass(), "state", null);
        setField(term220592, term220592.getClass(), "emitPending", null);
        setBooleanField(term220592, term220592.getClass(), "isEmitPending", false);
        setField(term220592, term220592.getClass(), "charBuffer", null);
        setField(term220592, term220592.getClass(), "dataBuffer", null);
        setField(term220592, term220592.getClass(), "tagPending", null);
        setField(term220592, term220592.getClass(), "doctypePending", null);
        setField(term220592, term220592.getClass(), "commentPending", null);
        setField(term220592, term220592.getClass(), "lastStartTag", null);
        setBooleanField(term220592, term220592.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "error", argTypes, term220444, args);
        assertTrue(recursiveEquals(term220444, term220592));
    }

};


