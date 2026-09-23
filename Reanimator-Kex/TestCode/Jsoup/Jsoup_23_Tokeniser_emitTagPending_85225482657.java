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

public class Tokeniser_emitTagPending_85225482657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80179;
     Object term80553;

    public Tokeniser_emitTagPending_85225482657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80179 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term80247 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term80179, term80179.getClass(), "tagPending", term80247);
        term80553 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term80554 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term80553, term80553.getClass(), "reader", null);
        setField(term80553, term80553.getClass(), "errors", null);
        setField(term80553, term80553.getClass(), "state", null);
        setField(term80554, term80554.getClass(), "tagName", null);
        setField(term80554, term80554.getClass(), "pendingAttributeName", null);
        setField(term80554, term80554.getClass(), "pendingAttributeValue", null);
        setBooleanField(term80554, term80554.getClass(), "selfClosing", false);
        setField(term80554, term80554.getClass(), "attributes", null);
        setField(term80554, term80554.getClass(), "type", null);
        setField(term80553, term80553.getClass(), "emitPending", term80554);
        setBooleanField(term80553, term80553.getClass(), "isEmitPending", true);
        setField(term80553, term80553.getClass(), "charBuffer", null);
        setField(term80553, term80553.getClass(), "dataBuffer", null);
        setField(term80553, term80553.getClass(), "tagPending", term80554);
        setField(term80553, term80553.getClass(), "doctypePending", null);
        setField(term80553, term80553.getClass(), "commentPending", null);
        setField(term80553, term80553.getClass(), "lastStartTag", null);
        setBooleanField(term80553, term80553.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term80179, args);
        assertTrue(recursiveEquals(term80179, term80553));
    }

};


