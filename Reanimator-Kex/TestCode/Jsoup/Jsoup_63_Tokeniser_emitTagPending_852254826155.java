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

public class Tokeniser_emitTagPending_852254826155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165494;
     Object term165618;

    public Tokeniser_emitTagPending_852254826155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165494 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term165562 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term165494, term165494.getClass(), "tagPending", term165562);
        term165618 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term165619 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term165618, term165618.getClass(), "reader", null);
        setField(term165618, term165618.getClass(), "errors", null);
        setField(term165618, term165618.getClass(), "state", null);
        setField(term165619, term165619.getClass(), "tagName", null);
        setField(term165619, term165619.getClass(), "normalName", null);
        setField(term165619, term165619.getClass(), "pendingAttributeName", null);
        setField(term165619, term165619.getClass(), "pendingAttributeValue", null);
        setField(term165619, term165619.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term165619, term165619.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term165619, term165619.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term165619, term165619.getClass(), "selfClosing", false);
        setField(term165619, term165619.getClass(), "attributes", null);
        setField(term165619, term165619.getClass(), "type", null);
        setField(term165618, term165618.getClass(), "emitPending", term165619);
        setBooleanField(term165618, term165618.getClass(), "isEmitPending", true);
        setField(term165618, term165618.getClass(), "charsString", null);
        setField(term165618, term165618.getClass(), "charsBuilder", null);
        setField(term165618, term165618.getClass(), "dataBuffer", null);
        setField(term165618, term165618.getClass(), "tagPending", term165619);
        setField(term165618, term165618.getClass(), "startPending", null);
        setField(term165618, term165618.getClass(), "endPending", null);
        setField(term165618, term165618.getClass(), "charPending", null);
        setField(term165618, term165618.getClass(), "doctypePending", null);
        setField(term165618, term165618.getClass(), "commentPending", null);
        setField(term165618, term165618.getClass(), "lastStartTag", null);
        setBooleanField(term165618, term165618.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term165618, term165618.getClass(), "codepointHolder", null);
        setField(term165618, term165618.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term165494, args);
        assertTrue(recursiveEquals(term165494, term165618));
    }

};


