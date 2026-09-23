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

public class Tokeniser_emitTagPending_85225482663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181394;
     Object term181774;

    public Tokeniser_emitTagPending_85225482663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181394 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term181462 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term181394, term181394.getClass(), "tagPending", term181462);
        term181774 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term181775 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term181774, term181774.getClass(), "reader", null);
        setBooleanField(term181774, term181774.getClass(), "trackErrors", false);
        setField(term181774, term181774.getClass(), "errors", null);
        setField(term181774, term181774.getClass(), "state", null);
        setField(term181775, term181775.getClass(), "tagName", null);
        setField(term181775, term181775.getClass(), "pendingAttributeName", null);
        setField(term181775, term181775.getClass(), "pendingAttributeValue", null);
        setBooleanField(term181775, term181775.getClass(), "selfClosing", false);
        setField(term181775, term181775.getClass(), "attributes", null);
        setField(term181775, term181775.getClass(), "type", null);
        setField(term181774, term181774.getClass(), "emitPending", term181775);
        setBooleanField(term181774, term181774.getClass(), "isEmitPending", true);
        setField(term181774, term181774.getClass(), "charBuffer", null);
        setField(term181774, term181774.getClass(), "dataBuffer", null);
        setField(term181774, term181774.getClass(), "tagPending", term181775);
        setField(term181774, term181774.getClass(), "doctypePending", null);
        setField(term181774, term181774.getClass(), "commentPending", null);
        setField(term181774, term181774.getClass(), "lastStartTag", null);
        setBooleanField(term181774, term181774.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term181394, args);
        assertTrue(recursiveEquals(term181394, term181774));
    }

};


