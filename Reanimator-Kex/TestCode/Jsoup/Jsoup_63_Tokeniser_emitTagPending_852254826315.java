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

public class Tokeniser_emitTagPending_852254826315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273695;
     Object term273918;

    public Tokeniser_emitTagPending_852254826315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273695 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term273759 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term273855 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term273759, term273759.getClass(), "pendingAttributeName", "");
        setField(term273759, term273759.getClass(), "attributes", term273855);
        setField(term273695, term273695.getClass(), "tagPending", term273759);
        term273918 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term273919 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term273920 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term273918, term273918.getClass(), "reader", null);
        setField(term273918, term273918.getClass(), "errors", null);
        setField(term273918, term273918.getClass(), "state", null);
        setField(term273919, term273919.getClass(), "tagName", null);
        setField(term273919, term273919.getClass(), "normalName", null);
        setField(term273919, term273919.getClass(), "pendingAttributeName", null);
        setField(term273919, term273919.getClass(), "pendingAttributeValue", null);
        setField(term273919, term273919.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term273919, term273919.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term273919, term273919.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term273919, term273919.getClass(), "selfClosing", false);
        setField(term273920, term273920.getClass(), "attributes", null);
        setField(term273919, term273919.getClass(), "attributes", term273920);
        setField(term273919, term273919.getClass(), "type", null);
        setField(term273918, term273918.getClass(), "emitPending", term273919);
        setBooleanField(term273918, term273918.getClass(), "isEmitPending", true);
        setField(term273918, term273918.getClass(), "charsString", null);
        setField(term273918, term273918.getClass(), "charsBuilder", null);
        setField(term273918, term273918.getClass(), "dataBuffer", null);
        setField(term273918, term273918.getClass(), "tagPending", term273919);
        setField(term273918, term273918.getClass(), "startPending", null);
        setField(term273918, term273918.getClass(), "endPending", null);
        setField(term273918, term273918.getClass(), "charPending", null);
        setField(term273918, term273918.getClass(), "doctypePending", null);
        setField(term273918, term273918.getClass(), "commentPending", null);
        setField(term273918, term273918.getClass(), "lastStartTag", null);
        setBooleanField(term273918, term273918.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term273918, term273918.getClass(), "codepointHolder", null);
        setField(term273918, term273918.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term273695, args);
        assertTrue(recursiveEquals(term273695, term273918));
    }

};


