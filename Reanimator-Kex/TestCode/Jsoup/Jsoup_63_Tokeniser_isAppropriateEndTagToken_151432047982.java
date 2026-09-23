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

public class Tokeniser_isAppropriateEndTagToken_151432047982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139136;
     Object term139680;

    public Tokeniser_isAppropriateEndTagToken_151432047982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139136 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term139136, term139136.getClass(), "lastStartTag", null);
        term139680 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term139680, term139680.getClass(), "reader", null);
        setField(term139680, term139680.getClass(), "errors", null);
        setField(term139680, term139680.getClass(), "state", null);
        setField(term139680, term139680.getClass(), "emitPending", null);
        setBooleanField(term139680, term139680.getClass(), "isEmitPending", false);
        setField(term139680, term139680.getClass(), "charsString", null);
        setField(term139680, term139680.getClass(), "charsBuilder", null);
        setField(term139680, term139680.getClass(), "dataBuffer", null);
        setField(term139680, term139680.getClass(), "tagPending", null);
        setField(term139680, term139680.getClass(), "startPending", null);
        setField(term139680, term139680.getClass(), "endPending", null);
        setField(term139680, term139680.getClass(), "charPending", null);
        setField(term139680, term139680.getClass(), "doctypePending", null);
        setField(term139680, term139680.getClass(), "commentPending", null);
        setField(term139680, term139680.getClass(), "lastStartTag", null);
        setBooleanField(term139680, term139680.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term139680, term139680.getClass(), "codepointHolder", null);
        setField(term139680, term139680.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isAppropriateEndTagToken", argTypes, term139136, args);
        assertTrue(recursiveEquals(term139136, term139680));
        assertTrue(recursiveEquals(retValue, false));
    }

};


