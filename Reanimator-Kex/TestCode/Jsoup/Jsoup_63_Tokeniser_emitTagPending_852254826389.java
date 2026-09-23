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
import java.lang.StringBuilder;

public class Tokeniser_emitTagPending_852254826389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368343;
     Object term368653;

    public Tokeniser_emitTagPending_852254826389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term368509 = new StringBuilder();
        term368343 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term368411 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term368411, term368411.getClass(), "pendingAttributeName", "");
        setField(term368411, term368411.getClass(), "attributes", null);
        setBooleanField(term368411, term368411.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term368411, term368411.getClass(), "hasPendingAttributeValue", false);
        setField(term368411, term368411.getClass(), "pendingAttributeValue", term368509);
        setField(term368343, term368343.getClass(), "tagPending", term368411);
        term368653 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term368654 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term368655 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term368656 = (byte[]) newByteArray(16);
        Object term368657 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term368653, term368653.getClass(), "reader", null);
        setField(term368653, term368653.getClass(), "errors", null);
        setField(term368653, term368653.getClass(), "state", null);
        setField(term368654, term368654.getClass(), "tagName", null);
        setField(term368654, term368654.getClass(), "normalName", null);
        setField(term368654, term368654.getClass(), "pendingAttributeName", null);
        setField(term368655, term368655.getClass(), "value", term368656);
        setByteField(term368655, term368655.getClass(), "coder", (byte) 0);
        setIntField(term368655, term368655.getClass(), "count", 0);
        setField(term368654, term368654.getClass(), "pendingAttributeValue", term368655);
        setField(term368654, term368654.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term368654, term368654.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term368654, term368654.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term368654, term368654.getClass(), "selfClosing", false);
        setField(term368657, term368657.getClass(), "attributes", null);
        setField(term368654, term368654.getClass(), "attributes", term368657);
        setField(term368654, term368654.getClass(), "type", null);
        setField(term368653, term368653.getClass(), "emitPending", term368654);
        setBooleanField(term368653, term368653.getClass(), "isEmitPending", true);
        setField(term368653, term368653.getClass(), "charsString", null);
        setField(term368653, term368653.getClass(), "charsBuilder", null);
        setField(term368653, term368653.getClass(), "dataBuffer", null);
        setField(term368653, term368653.getClass(), "tagPending", term368654);
        setField(term368653, term368653.getClass(), "startPending", null);
        setField(term368653, term368653.getClass(), "endPending", null);
        setField(term368653, term368653.getClass(), "charPending", null);
        setField(term368653, term368653.getClass(), "doctypePending", null);
        setField(term368653, term368653.getClass(), "commentPending", null);
        setField(term368653, term368653.getClass(), "lastStartTag", null);
        setBooleanField(term368653, term368653.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term368653, term368653.getClass(), "codepointHolder", null);
        setField(term368653, term368653.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term368343, args);
        assertTrue(recursiveEquals(term368343, term368653));
    }

};


