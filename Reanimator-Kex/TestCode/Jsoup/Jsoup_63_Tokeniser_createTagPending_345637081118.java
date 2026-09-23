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

public class Tokeniser_createTagPending_345637081118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151313;
     Object term151937;
     Object term151928;

    public Tokeniser_createTagPending_345637081118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151313 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term151381 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term151313, term151313.getClass(), "startPending", term151381);
        term151937 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term151938 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term151939 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term151937, term151937.getClass(), "reader", null);
        setField(term151937, term151937.getClass(), "errors", null);
        setField(term151937, term151937.getClass(), "state", null);
        setField(term151937, term151937.getClass(), "emitPending", null);
        setBooleanField(term151937, term151937.getClass(), "isEmitPending", false);
        setField(term151937, term151937.getClass(), "charsString", null);
        setField(term151937, term151937.getClass(), "charsBuilder", null);
        setField(term151937, term151937.getClass(), "dataBuffer", null);
        setField(term151938, term151938.getClass(), "tagName", null);
        setField(term151938, term151938.getClass(), "normalName", null);
        setField(term151938, term151938.getClass(), "pendingAttributeName", null);
        setField(term151938, term151938.getClass(), "pendingAttributeValue", null);
        setField(term151938, term151938.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term151938, term151938.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term151938, term151938.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term151938, term151938.getClass(), "selfClosing", false);
        setField(term151939, term151939.getClass(), "attributes", null);
        setField(term151938, term151938.getClass(), "attributes", term151939);
        setField(term151938, term151938.getClass(), "type", null);
        setField(term151937, term151937.getClass(), "tagPending", term151938);
        setField(term151937, term151937.getClass(), "startPending", term151938);
        setField(term151937, term151937.getClass(), "endPending", null);
        setField(term151937, term151937.getClass(), "charPending", null);
        setField(term151937, term151937.getClass(), "doctypePending", null);
        setField(term151937, term151937.getClass(), "commentPending", null);
        setField(term151937, term151937.getClass(), "lastStartTag", null);
        setBooleanField(term151937, term151937.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term151937, term151937.getClass(), "codepointHolder", null);
        setField(term151937, term151937.getClass(), "multipointHolder", null);
        term151928 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term151932 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term151928, term151928.getClass(), "tagName", null);
        setField(term151928, term151928.getClass(), "normalName", null);
        setField(term151928, term151928.getClass(), "pendingAttributeName", null);
        setField(term151928, term151928.getClass(), "pendingAttributeValue", null);
        setField(term151928, term151928.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term151928, term151928.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term151928, term151928.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term151928, term151928.getClass(), "selfClosing", false);
        setField(term151932, term151932.getClass(), "attributes", null);
        setField(term151928, term151928.getClass(), "attributes", term151932);
        setField(term151928, term151928.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        Object retValue = callMethod(klass, "createTagPending", argTypes, term151313, args);
        assertTrue(recursiveEquals(term151313, term151937));
        assertTrue(recursiveEquals(retValue, term151928));
    }

};


