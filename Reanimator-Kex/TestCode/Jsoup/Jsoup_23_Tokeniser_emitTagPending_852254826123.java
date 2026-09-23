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

public class Tokeniser_emitTagPending_852254826123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110890;
     Object term111401;

    public Tokeniser_emitTagPending_852254826123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term111407 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term111406 = ((Class) term111407).getDeclaredField((String) "StartTag");
        ((Field) term111406).setAccessible(true);
        Object enum298 = ((Field) term111406).get((Object) null);
        term110890 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term110958 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term111124 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        setField(term110958, term110958.getClass(), "pendingAttributeName", null);
        setField(term110958, term110958.getClass(), "type", enum298);
        setBooleanField(term110958, term110958.getClass(), "selfClosing", true);
        setField(term110890, term110890.getClass(), "tagPending", term110958);
        setBooleanField(term110890, term110890.getClass(), "isEmitPending", false);
        setField(term110890, term110890.getClass(), "emitPending", term111124);
        setField(term110890, term110890.getClass(), "lastStartTag", null);
        Class<? extends Object> term111598 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term111597 = ((Class) term111598).getDeclaredField((String) "StartTag");
        ((Field) term111597).setAccessible(true);
        Object enum299 = ((Field) term111597).get((Object) null);
        term111401 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term111402 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term111401, term111401.getClass(), "reader", null);
        setField(term111401, term111401.getClass(), "errors", null);
        setField(term111401, term111401.getClass(), "state", null);
        setField(term111402, term111402.getClass(), "tagName", null);
        setField(term111402, term111402.getClass(), "pendingAttributeName", null);
        setField(term111402, term111402.getClass(), "pendingAttributeValue", null);
        setBooleanField(term111402, term111402.getClass(), "selfClosing", true);
        setField(term111402, term111402.getClass(), "attributes", null);
        setField(term111402, term111402.getClass(), "type", enum299);
        setField(term111401, term111401.getClass(), "emitPending", term111402);
        setBooleanField(term111401, term111401.getClass(), "isEmitPending", true);
        setField(term111401, term111401.getClass(), "charBuffer", null);
        setField(term111401, term111401.getClass(), "dataBuffer", null);
        setField(term111401, term111401.getClass(), "tagPending", term111402);
        setField(term111401, term111401.getClass(), "doctypePending", null);
        setField(term111401, term111401.getClass(), "commentPending", null);
        setField(term111401, term111401.getClass(), "lastStartTag", term111402);
        setBooleanField(term111401, term111401.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term110890, args);
        assertTrue(recursiveEquals(term110890, term111401));
    }

};


