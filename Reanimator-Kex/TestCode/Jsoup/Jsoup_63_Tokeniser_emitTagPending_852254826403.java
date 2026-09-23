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

public class Tokeniser_emitTagPending_852254826403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386279;
     Object term386502;

    public Tokeniser_emitTagPending_852254826403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386279 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term386343 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term386439 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term386343, term386343.getClass(), "pendingAttributeName", "");
        setField(term386343, term386343.getClass(), "attributes", term386439);
        setBooleanField(term386343, term386343.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term386343, term386343.getClass(), "hasEmptyAttributeValue", true);
        setField(term386279, term386279.getClass(), "tagPending", term386343);
        term386502 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term386503 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term386504 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term386502, term386502.getClass(), "reader", null);
        setField(term386502, term386502.getClass(), "errors", null);
        setField(term386502, term386502.getClass(), "state", null);
        setField(term386503, term386503.getClass(), "tagName", null);
        setField(term386503, term386503.getClass(), "normalName", null);
        setField(term386503, term386503.getClass(), "pendingAttributeName", null);
        setField(term386503, term386503.getClass(), "pendingAttributeValue", null);
        setField(term386503, term386503.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term386503, term386503.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term386503, term386503.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term386503, term386503.getClass(), "selfClosing", false);
        setField(term386504, term386504.getClass(), "attributes", null);
        setField(term386503, term386503.getClass(), "attributes", term386504);
        setField(term386503, term386503.getClass(), "type", null);
        setField(term386502, term386502.getClass(), "emitPending", term386503);
        setBooleanField(term386502, term386502.getClass(), "isEmitPending", true);
        setField(term386502, term386502.getClass(), "charsString", null);
        setField(term386502, term386502.getClass(), "charsBuilder", null);
        setField(term386502, term386502.getClass(), "dataBuffer", null);
        setField(term386502, term386502.getClass(), "tagPending", term386503);
        setField(term386502, term386502.getClass(), "startPending", null);
        setField(term386502, term386502.getClass(), "endPending", null);
        setField(term386502, term386502.getClass(), "charPending", null);
        setField(term386502, term386502.getClass(), "doctypePending", null);
        setField(term386502, term386502.getClass(), "commentPending", null);
        setField(term386502, term386502.getClass(), "lastStartTag", null);
        setBooleanField(term386502, term386502.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term386502, term386502.getClass(), "codepointHolder", null);
        setField(term386502, term386502.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term386279, args);
        assertTrue(recursiveEquals(term386279, term386502));
    }

};


