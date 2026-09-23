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

public class Tokeniser_emitTagPending_852254826319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280542;
     Object term281211;

    public Tokeniser_emitTagPending_852254826319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term281219 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term281218 = ((Class) term281219).getDeclaredField((String) "EndTag");
        ((Field) term281218).setAccessible(true);
        Object enum528 = ((Field) term281218).get((Object) null);
        term280542 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term280606 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term280702 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term280878 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term280606, term280606.getClass(), "pendingAttributeName", "");
        setField(term280606, term280606.getClass(), "attributes", term280702);
        setBooleanField(term280606, term280606.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term280606, term280606.getClass(), "hasPendingAttributeValue", false);
        setField(term280606, term280606.getClass(), "pendingAttributeValue", null);
        setField(term280606, term280606.getClass(), "pendingAttributeValueS", null);
        setField(term280606, term280606.getClass(), "type", enum528);
        setField(term280542, term280542.getClass(), "tagPending", term280606);
        setBooleanField(term280542, term280542.getClass(), "isEmitPending", false);
        setField(term280542, term280542.getClass(), "emitPending", null);
        setField(term280542, term280542.getClass(), "errors", term280878);
        Class<? extends Object> term281404 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term281403 = ((Class) term281404).getDeclaredField((String) "EndTag");
        ((Field) term281403).setAccessible(true);
        Object enum529 = ((Field) term281403).get((Object) null);
        term281211 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term281212 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term281213 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term281214 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term281211, term281211.getClass(), "reader", null);
        setIntField(term281212, term281212.getClass(), "maxSize", 0);
        setField(term281212, term281212.getClass(), "elementData", null);
        setIntField(term281212, term281212.getClass(), "size", 0);
        setIntField(term281212, term281212.getClass(), "modCount", 0);
        setField(term281211, term281211.getClass(), "errors", term281212);
        setField(term281211, term281211.getClass(), "state", null);
        setField(term281213, term281213.getClass(), "tagName", null);
        setField(term281213, term281213.getClass(), "normalName", null);
        setField(term281213, term281213.getClass(), "pendingAttributeName", null);
        setField(term281213, term281213.getClass(), "pendingAttributeValue", null);
        setField(term281213, term281213.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term281213, term281213.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term281213, term281213.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term281213, term281213.getClass(), "selfClosing", false);
        setField(term281214, term281214.getClass(), "attributes", null);
        setField(term281213, term281213.getClass(), "attributes", term281214);
        setField(term281213, term281213.getClass(), "type", enum529);
        setField(term281211, term281211.getClass(), "emitPending", term281213);
        setBooleanField(term281211, term281211.getClass(), "isEmitPending", true);
        setField(term281211, term281211.getClass(), "charsString", null);
        setField(term281211, term281211.getClass(), "charsBuilder", null);
        setField(term281211, term281211.getClass(), "dataBuffer", null);
        setField(term281211, term281211.getClass(), "tagPending", term281213);
        setField(term281211, term281211.getClass(), "startPending", null);
        setField(term281211, term281211.getClass(), "endPending", null);
        setField(term281211, term281211.getClass(), "charPending", null);
        setField(term281211, term281211.getClass(), "doctypePending", null);
        setField(term281211, term281211.getClass(), "commentPending", null);
        setField(term281211, term281211.getClass(), "lastStartTag", null);
        setBooleanField(term281211, term281211.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term281211, term281211.getClass(), "codepointHolder", null);
        setField(term281211, term281211.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term280542, args);
        assertTrue(recursiveEquals(term280542, term281211));
    }

};


