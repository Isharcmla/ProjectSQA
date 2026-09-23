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

public class Tokeniser_emitTagPending_852254826243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222022;
     Object term222188;

    public Tokeniser_emitTagPending_852254826243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222022 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term222086 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term222086, term222086.getClass(), "pendingAttributeName", "");
        setField(term222086, term222086.getClass(), "attributes", null);
        setField(term222022, term222022.getClass(), "tagPending", term222086);
        term222188 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term222189 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term222190 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term222188, term222188.getClass(), "reader", null);
        setField(term222188, term222188.getClass(), "errors", null);
        setField(term222188, term222188.getClass(), "state", null);
        setField(term222189, term222189.getClass(), "tagName", null);
        setField(term222189, term222189.getClass(), "normalName", null);
        setField(term222189, term222189.getClass(), "pendingAttributeName", null);
        setField(term222189, term222189.getClass(), "pendingAttributeValue", null);
        setField(term222189, term222189.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term222189, term222189.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term222189, term222189.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term222189, term222189.getClass(), "selfClosing", false);
        setField(term222190, term222190.getClass(), "attributes", null);
        setField(term222189, term222189.getClass(), "attributes", term222190);
        setField(term222189, term222189.getClass(), "type", null);
        setField(term222188, term222188.getClass(), "emitPending", term222189);
        setBooleanField(term222188, term222188.getClass(), "isEmitPending", true);
        setField(term222188, term222188.getClass(), "charsString", null);
        setField(term222188, term222188.getClass(), "charsBuilder", null);
        setField(term222188, term222188.getClass(), "dataBuffer", null);
        setField(term222188, term222188.getClass(), "tagPending", term222189);
        setField(term222188, term222188.getClass(), "startPending", null);
        setField(term222188, term222188.getClass(), "endPending", null);
        setField(term222188, term222188.getClass(), "charPending", null);
        setField(term222188, term222188.getClass(), "doctypePending", null);
        setField(term222188, term222188.getClass(), "commentPending", null);
        setField(term222188, term222188.getClass(), "lastStartTag", null);
        setBooleanField(term222188, term222188.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term222188, term222188.getClass(), "codepointHolder", null);
        setField(term222188, term222188.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term222022, args);
        assertTrue(recursiveEquals(term222022, term222188));
    }

};


