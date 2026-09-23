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

public class Tokeniser_createCommentPending_1149611246111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149084;
     Object term149430;

    public Tokeniser_createCommentPending_1149611246111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149084 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term149150 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term149150, term149150.getClass(), "data", null);
        setField(term149084, term149084.getClass(), "commentPending", term149150);
        term149430 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term149431 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term149430, term149430.getClass(), "reader", null);
        setField(term149430, term149430.getClass(), "errors", null);
        setField(term149430, term149430.getClass(), "state", null);
        setField(term149430, term149430.getClass(), "emitPending", null);
        setBooleanField(term149430, term149430.getClass(), "isEmitPending", false);
        setField(term149430, term149430.getClass(), "charsString", null);
        setField(term149430, term149430.getClass(), "charsBuilder", null);
        setField(term149430, term149430.getClass(), "dataBuffer", null);
        setField(term149430, term149430.getClass(), "tagPending", null);
        setField(term149430, term149430.getClass(), "startPending", null);
        setField(term149430, term149430.getClass(), "endPending", null);
        setField(term149430, term149430.getClass(), "charPending", null);
        setField(term149430, term149430.getClass(), "doctypePending", null);
        setField(term149431, term149431.getClass(), "data", null);
        setBooleanField(term149431, term149431.getClass(), "bogus", false);
        setField(term149431, term149431.getClass(), "type", null);
        setField(term149430, term149430.getClass(), "commentPending", term149431);
        setField(term149430, term149430.getClass(), "lastStartTag", null);
        setBooleanField(term149430, term149430.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term149430, term149430.getClass(), "codepointHolder", null);
        setField(term149430, term149430.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createCommentPending", argTypes, term149084, args);
        assertTrue(recursiveEquals(term149084, term149430));
    }

};


