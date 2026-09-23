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

public class Tokeniser_appropriateEndTagName_76314592263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136437;
     Object term136688;

    public Tokeniser_appropriateEndTagName_76314592263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136437 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term136437, term136437.getClass(), "lastStartTag", null);
        term136688 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term136688, term136688.getClass(), "reader", null);
        setField(term136688, term136688.getClass(), "errors", null);
        setField(term136688, term136688.getClass(), "state", null);
        setField(term136688, term136688.getClass(), "emitPending", null);
        setBooleanField(term136688, term136688.getClass(), "isEmitPending", false);
        setField(term136688, term136688.getClass(), "charsString", null);
        setField(term136688, term136688.getClass(), "charsBuilder", null);
        setField(term136688, term136688.getClass(), "dataBuffer", null);
        setField(term136688, term136688.getClass(), "tagPending", null);
        setField(term136688, term136688.getClass(), "startPending", null);
        setField(term136688, term136688.getClass(), "endPending", null);
        setField(term136688, term136688.getClass(), "charPending", null);
        setField(term136688, term136688.getClass(), "doctypePending", null);
        setField(term136688, term136688.getClass(), "commentPending", null);
        setField(term136688, term136688.getClass(), "lastStartTag", null);
        setBooleanField(term136688, term136688.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term136688, term136688.getClass(), "codepointHolder", null);
        setField(term136688, term136688.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appropriateEndTagName", argTypes, term136437, args);
        assertTrue(recursiveEquals(term136437, term136688));
        assertTrue(recursiveEquals(retValue, null));
    }

};


