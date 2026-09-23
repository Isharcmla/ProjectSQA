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

public class Tokeniser_emitTagPending_852254826277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240107;
     Object term240670;

    public Tokeniser_emitTagPending_852254826277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term240680 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term240679 = ((Class) term240680).getDeclaredField((String) "StartTag");
        ((Field) term240679).setAccessible(true);
        Object enum497 = ((Field) term240679).get((Object) null);
        term240107 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term240175 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term240379 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        setField(term240175, term240175.getClass(), "pendingAttributeName", null);
        setField(term240175, term240175.getClass(), "type", enum497);
        setField(term240175, term240175.getClass(), "tagName", "");
        setBooleanField(term240175, term240175.getClass(), "selfClosing", true);
        setField(term240107, term240107.getClass(), "tagPending", term240175);
        setBooleanField(term240107, term240107.getClass(), "isEmitPending", false);
        setField(term240107, term240107.getClass(), "emitPending", term240379);
        setField(term240107, term240107.getClass(), "lastStartTag", null);
        Class<? extends Object> term240871 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term240870 = ((Class) term240871).getDeclaredField((String) "StartTag");
        ((Field) term240870).setAccessible(true);
        Object enum498 = ((Field) term240870).get((Object) null);
        term240670 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term240671 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term240670, term240670.getClass(), "reader", null);
        setField(term240670, term240670.getClass(), "errors", null);
        setField(term240670, term240670.getClass(), "state", null);
        setField(term240671, term240671.getClass(), "tagName", "");
        setField(term240671, term240671.getClass(), "normalName", null);
        setField(term240671, term240671.getClass(), "pendingAttributeName", null);
        setField(term240671, term240671.getClass(), "pendingAttributeValue", null);
        setField(term240671, term240671.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term240671, term240671.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term240671, term240671.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term240671, term240671.getClass(), "selfClosing", true);
        setField(term240671, term240671.getClass(), "attributes", null);
        setField(term240671, term240671.getClass(), "type", enum498);
        setField(term240670, term240670.getClass(), "emitPending", term240671);
        setBooleanField(term240670, term240670.getClass(), "isEmitPending", true);
        setField(term240670, term240670.getClass(), "charsString", null);
        setField(term240670, term240670.getClass(), "charsBuilder", null);
        setField(term240670, term240670.getClass(), "dataBuffer", null);
        setField(term240670, term240670.getClass(), "tagPending", term240671);
        setField(term240670, term240670.getClass(), "startPending", null);
        setField(term240670, term240670.getClass(), "endPending", null);
        setField(term240670, term240670.getClass(), "charPending", null);
        setField(term240670, term240670.getClass(), "doctypePending", null);
        setField(term240670, term240670.getClass(), "commentPending", null);
        setField(term240670, term240670.getClass(), "lastStartTag", "");
        setBooleanField(term240670, term240670.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term240670, term240670.getClass(), "codepointHolder", null);
        setField(term240670, term240670.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term240107, args);
        assertTrue(recursiveEquals(term240107, term240670));
    }

};


