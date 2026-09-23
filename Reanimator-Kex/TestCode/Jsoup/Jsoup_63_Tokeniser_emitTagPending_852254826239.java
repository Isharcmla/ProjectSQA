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

public class Tokeniser_emitTagPending_852254826239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221138;
     Object term221308;

    public Tokeniser_emitTagPending_852254826239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221138 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term221206 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term221206, term221206.getClass(), "pendingAttributeName", "");
        setField(term221138, term221138.getClass(), "tagPending", term221206);
        term221308 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term221309 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term221310 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term221308, term221308.getClass(), "reader", null);
        setField(term221308, term221308.getClass(), "errors", null);
        setField(term221308, term221308.getClass(), "state", null);
        setField(term221309, term221309.getClass(), "tagName", null);
        setField(term221309, term221309.getClass(), "normalName", null);
        setField(term221309, term221309.getClass(), "pendingAttributeName", null);
        setField(term221309, term221309.getClass(), "pendingAttributeValue", null);
        setField(term221309, term221309.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term221309, term221309.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term221309, term221309.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term221309, term221309.getClass(), "selfClosing", false);
        setField(term221310, term221310.getClass(), "attributes", null);
        setField(term221309, term221309.getClass(), "attributes", term221310);
        setField(term221309, term221309.getClass(), "type", null);
        setField(term221308, term221308.getClass(), "emitPending", term221309);
        setBooleanField(term221308, term221308.getClass(), "isEmitPending", true);
        setField(term221308, term221308.getClass(), "charsString", null);
        setField(term221308, term221308.getClass(), "charsBuilder", null);
        setField(term221308, term221308.getClass(), "dataBuffer", null);
        setField(term221308, term221308.getClass(), "tagPending", term221309);
        setField(term221308, term221308.getClass(), "startPending", null);
        setField(term221308, term221308.getClass(), "endPending", null);
        setField(term221308, term221308.getClass(), "charPending", null);
        setField(term221308, term221308.getClass(), "doctypePending", null);
        setField(term221308, term221308.getClass(), "commentPending", null);
        setField(term221308, term221308.getClass(), "lastStartTag", null);
        setBooleanField(term221308, term221308.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term221308, term221308.getClass(), "codepointHolder", null);
        setField(term221308, term221308.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term221138, args);
        assertTrue(recursiveEquals(term221138, term221308));
    }

};


