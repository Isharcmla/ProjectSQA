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

public class Tokeniser_emitTagPending_852254826200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198804;
     Object term199586;

    public Tokeniser_emitTagPending_852254826200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198804 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term198868 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term198868, term198868.getClass(), "pendingAttributeName", "");
        setField(term198804, term198804.getClass(), "tagPending", term198868);
        term199586 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term199587 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term199588 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term199586, term199586.getClass(), "reader", null);
        setField(term199586, term199586.getClass(), "errors", null);
        setField(term199586, term199586.getClass(), "state", null);
        setField(term199587, term199587.getClass(), "tagName", null);
        setField(term199587, term199587.getClass(), "normalName", null);
        setField(term199587, term199587.getClass(), "pendingAttributeName", null);
        setField(term199587, term199587.getClass(), "pendingAttributeValue", null);
        setField(term199587, term199587.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term199587, term199587.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term199587, term199587.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term199587, term199587.getClass(), "selfClosing", false);
        setField(term199588, term199588.getClass(), "attributes", null);
        setField(term199587, term199587.getClass(), "attributes", term199588);
        setField(term199587, term199587.getClass(), "type", null);
        setField(term199586, term199586.getClass(), "emitPending", term199587);
        setBooleanField(term199586, term199586.getClass(), "isEmitPending", true);
        setField(term199586, term199586.getClass(), "charsString", null);
        setField(term199586, term199586.getClass(), "charsBuilder", null);
        setField(term199586, term199586.getClass(), "dataBuffer", null);
        setField(term199586, term199586.getClass(), "tagPending", term199587);
        setField(term199586, term199586.getClass(), "startPending", null);
        setField(term199586, term199586.getClass(), "endPending", null);
        setField(term199586, term199586.getClass(), "charPending", null);
        setField(term199586, term199586.getClass(), "doctypePending", null);
        setField(term199586, term199586.getClass(), "commentPending", null);
        setField(term199586, term199586.getClass(), "lastStartTag", null);
        setBooleanField(term199586, term199586.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term199586, term199586.getClass(), "codepointHolder", null);
        setField(term199586, term199586.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term198804, args);
        assertTrue(recursiveEquals(term198804, term199586));
    }

};


