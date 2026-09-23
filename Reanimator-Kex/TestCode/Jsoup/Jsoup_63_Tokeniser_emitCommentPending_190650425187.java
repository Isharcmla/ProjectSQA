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

public class Tokeniser_emitCommentPending_190650425187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140614;
     Object term140858;

    public Tokeniser_emitCommentPending_190650425187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140614 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term140680 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term140614, term140614.getClass(), "commentPending", term140680);
        setBooleanField(term140614, term140614.getClass(), "isEmitPending", false);
        term140858 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term140859 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term140858, term140858.getClass(), "reader", null);
        setField(term140858, term140858.getClass(), "errors", null);
        setField(term140858, term140858.getClass(), "state", null);
        setField(term140859, term140859.getClass(), "data", null);
        setBooleanField(term140859, term140859.getClass(), "bogus", false);
        setField(term140859, term140859.getClass(), "type", null);
        setField(term140858, term140858.getClass(), "emitPending", term140859);
        setBooleanField(term140858, term140858.getClass(), "isEmitPending", true);
        setField(term140858, term140858.getClass(), "charsString", null);
        setField(term140858, term140858.getClass(), "charsBuilder", null);
        setField(term140858, term140858.getClass(), "dataBuffer", null);
        setField(term140858, term140858.getClass(), "tagPending", null);
        setField(term140858, term140858.getClass(), "startPending", null);
        setField(term140858, term140858.getClass(), "endPending", null);
        setField(term140858, term140858.getClass(), "charPending", null);
        setField(term140858, term140858.getClass(), "doctypePending", null);
        setField(term140858, term140858.getClass(), "commentPending", term140859);
        setField(term140858, term140858.getClass(), "lastStartTag", null);
        setBooleanField(term140858, term140858.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term140858, term140858.getClass(), "codepointHolder", null);
        setField(term140858, term140858.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitCommentPending", argTypes, term140614, args);
        assertTrue(recursiveEquals(term140614, term140858));
    }

};


