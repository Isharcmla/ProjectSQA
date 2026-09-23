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
import java.lang.String;

public class Tokeniser_emitTagPending_852254826419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410563;
     Object term411134;

    public Tokeniser_emitTagPending_852254826419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term411141 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term411140 = ((Class) term411141).getDeclaredField((String) "StartTag");
        ((Field) term411140).setAccessible(true);
        Object enum608 = ((Field) term411140).get((Object) null);
        term410563 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term410631 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term410843 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term410631, term410631.getClass(), "pendingAttributeName", "");
        setField(term410631, term410631.getClass(), "attributes", null);
        setBooleanField(term410631, term410631.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term410631, term410631.getClass(), "hasPendingAttributeValue", false);
        setField(term410631, term410631.getClass(), "pendingAttributeValue", null);
        setField(term410631, term410631.getClass(), "pendingAttributeValueS", null);
        setField(term410631, term410631.getClass(), "type", enum608);
        setField(term410563, term410563.getClass(), "tagPending", term410631);
        setBooleanField(term410563, term410563.getClass(), "isEmitPending", false);
        setField(term410563, term410563.getClass(), "emitPending", term410843);
        Class<? extends Object> term411332 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term411331 = ((Class) term411332).getDeclaredField((String) "StartTag");
        ((Field) term411331).setAccessible(true);
        Object enum609 = ((Field) term411331).get((Object) null);
        term411134 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term411135 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term411136 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term411134, term411134.getClass(), "reader", null);
        setField(term411134, term411134.getClass(), "errors", null);
        setField(term411134, term411134.getClass(), "state", null);
        setField(term411135, term411135.getClass(), "tagName", null);
        setField(term411135, term411135.getClass(), "normalName", null);
        setField(term411135, term411135.getClass(), "pendingAttributeName", null);
        setField(term411135, term411135.getClass(), "pendingAttributeValue", null);
        setField(term411135, term411135.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term411135, term411135.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term411135, term411135.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term411135, term411135.getClass(), "selfClosing", false);
        setField(term411136, term411136.getClass(), "attributes", null);
        setField(term411135, term411135.getClass(), "attributes", term411136);
        setField(term411135, term411135.getClass(), "type", enum609);
        setField(term411134, term411134.getClass(), "emitPending", term411135);
        setBooleanField(term411134, term411134.getClass(), "isEmitPending", true);
        setField(term411134, term411134.getClass(), "charsString", null);
        setField(term411134, term411134.getClass(), "charsBuilder", null);
        setField(term411134, term411134.getClass(), "dataBuffer", null);
        setField(term411134, term411134.getClass(), "tagPending", term411135);
        setField(term411134, term411134.getClass(), "startPending", null);
        setField(term411134, term411134.getClass(), "endPending", null);
        setField(term411134, term411134.getClass(), "charPending", null);
        setField(term411134, term411134.getClass(), "doctypePending", null);
        setField(term411134, term411134.getClass(), "commentPending", null);
        setField(term411134, term411134.getClass(), "lastStartTag", null);
        setBooleanField(term411134, term411134.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term411134, term411134.getClass(), "codepointHolder", null);
        setField(term411134, term411134.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term410563, args);
        assertTrue(recursiveEquals(term410563, term411134));
    }

};


