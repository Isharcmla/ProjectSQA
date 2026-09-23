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

public class Tokeniser_emitTagPending_85225482693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141269;
     Object term141528;

    public Tokeniser_emitTagPending_85225482693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141269 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term141333 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term141269, term141269.getClass(), "tagPending", term141333);
        term141528 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term141529 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term141528, term141528.getClass(), "reader", null);
        setField(term141528, term141528.getClass(), "errors", null);
        setField(term141528, term141528.getClass(), "state", null);
        setField(term141529, term141529.getClass(), "tagName", null);
        setField(term141529, term141529.getClass(), "normalName", null);
        setField(term141529, term141529.getClass(), "pendingAttributeName", null);
        setField(term141529, term141529.getClass(), "pendingAttributeValue", null);
        setField(term141529, term141529.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term141529, term141529.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term141529, term141529.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term141529, term141529.getClass(), "selfClosing", false);
        setField(term141529, term141529.getClass(), "attributes", null);
        setField(term141529, term141529.getClass(), "type", null);
        setField(term141528, term141528.getClass(), "emitPending", term141529);
        setBooleanField(term141528, term141528.getClass(), "isEmitPending", true);
        setField(term141528, term141528.getClass(), "charsString", null);
        setField(term141528, term141528.getClass(), "charsBuilder", null);
        setField(term141528, term141528.getClass(), "dataBuffer", null);
        setField(term141528, term141528.getClass(), "tagPending", term141529);
        setField(term141528, term141528.getClass(), "startPending", null);
        setField(term141528, term141528.getClass(), "endPending", null);
        setField(term141528, term141528.getClass(), "charPending", null);
        setField(term141528, term141528.getClass(), "doctypePending", null);
        setField(term141528, term141528.getClass(), "commentPending", null);
        setField(term141528, term141528.getClass(), "lastStartTag", null);
        setBooleanField(term141528, term141528.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term141528, term141528.getClass(), "codepointHolder", null);
        setField(term141528, term141528.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term141269, args);
        assertTrue(recursiveEquals(term141269, term141528));
    }

};


