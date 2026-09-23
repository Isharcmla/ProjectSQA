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

public class Tokeniser_emitTagPending_852254826117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214379;
     Object term214901;

    public Tokeniser_emitTagPending_852254826117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term214907 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term214906 = ((Class) term214907).getDeclaredField((String) "StartTag");
        ((Field) term214906).setAccessible(true);
        Object enum784 = ((Field) term214906).get((Object) null);
        term214379 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term214447 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term214623 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term214447, term214447.getClass(), "pendingAttributeName", null);
        setField(term214447, term214447.getClass(), "type", enum784);
        setField(term214379, term214379.getClass(), "tagPending", term214447);
        setBooleanField(term214379, term214379.getClass(), "isEmitPending", false);
        setField(term214379, term214379.getClass(), "emitPending", term214623);
        Class<? extends Object> term215098 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term215097 = ((Class) term215098).getDeclaredField((String) "StartTag");
        ((Field) term215097).setAccessible(true);
        Object enum785 = ((Field) term215097).get((Object) null);
        term214901 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term214902 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term214901, term214901.getClass(), "reader", null);
        setBooleanField(term214901, term214901.getClass(), "trackErrors", false);
        setField(term214901, term214901.getClass(), "errors", null);
        setField(term214901, term214901.getClass(), "state", null);
        setField(term214902, term214902.getClass(), "tagName", null);
        setField(term214902, term214902.getClass(), "pendingAttributeName", null);
        setField(term214902, term214902.getClass(), "pendingAttributeValue", null);
        setBooleanField(term214902, term214902.getClass(), "selfClosing", false);
        setField(term214902, term214902.getClass(), "attributes", null);
        setField(term214902, term214902.getClass(), "type", enum785);
        setField(term214901, term214901.getClass(), "emitPending", term214902);
        setBooleanField(term214901, term214901.getClass(), "isEmitPending", true);
        setField(term214901, term214901.getClass(), "charBuffer", null);
        setField(term214901, term214901.getClass(), "dataBuffer", null);
        setField(term214901, term214901.getClass(), "tagPending", term214902);
        setField(term214901, term214901.getClass(), "doctypePending", null);
        setField(term214901, term214901.getClass(), "commentPending", null);
        setField(term214901, term214901.getClass(), "lastStartTag", term214902);
        setBooleanField(term214901, term214901.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term214379, args);
        assertTrue(recursiveEquals(term214379, term214901));
    }

};


