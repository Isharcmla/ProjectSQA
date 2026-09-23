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
import java.lang.Object;

public class Tokeniser_emitCommentPending_190650425169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183507;
     Object term183619;

    public Tokeniser_emitCommentPending_190650425169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183507 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term183573 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term183507, term183507.getClass(), "commentPending", term183573);
        setBooleanField(term183507, term183507.getClass(), "isEmitPending", false);
        term183619 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term183620 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term183619, term183619.getClass(), "reader", null);
        setBooleanField(term183619, term183619.getClass(), "trackErrors", false);
        setField(term183619, term183619.getClass(), "errors", null);
        setField(term183619, term183619.getClass(), "state", null);
        setField(term183620, term183620.getClass(), "data", null);
        setField(term183620, term183620.getClass(), "type", null);
        setField(term183619, term183619.getClass(), "emitPending", term183620);
        setBooleanField(term183619, term183619.getClass(), "isEmitPending", true);
        setField(term183619, term183619.getClass(), "charBuffer", null);
        setField(term183619, term183619.getClass(), "dataBuffer", null);
        setField(term183619, term183619.getClass(), "tagPending", null);
        setField(term183619, term183619.getClass(), "doctypePending", null);
        setField(term183619, term183619.getClass(), "commentPending", term183620);
        setField(term183619, term183619.getClass(), "lastStartTag", null);
        setBooleanField(term183619, term183619.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitCommentPending", argTypes, term183507, args);
        assertTrue(recursiveEquals(term183507, term183619));
    }

};


