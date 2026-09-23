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

public class Tokeniser_isAppropriateEndTagToken_1514320479189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188769;
     Object term191462;

    public Tokeniser_isAppropriateEndTagToken_1514320479189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188769 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term188875 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term188769, term188769.getClass(), "lastStartTag", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term188875, term188875.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term188769, term188769.getClass(), "tagPending", term188875);
        term191462 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term191463 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term191462, term191462.getClass(), "reader", null);
        setField(term191462, term191462.getClass(), "errors", null);
        setField(term191462, term191462.getClass(), "state", null);
        setField(term191462, term191462.getClass(), "emitPending", null);
        setBooleanField(term191462, term191462.getClass(), "isEmitPending", false);
        setField(term191462, term191462.getClass(), "charsString", null);
        setField(term191462, term191462.getClass(), "charsBuilder", null);
        setField(term191462, term191462.getClass(), "dataBuffer", null);
        setField(term191463, term191463.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term191463, term191463.getClass(), "normalName", null);
        setField(term191463, term191463.getClass(), "pendingAttributeName", null);
        setField(term191463, term191463.getClass(), "pendingAttributeValue", null);
        setField(term191463, term191463.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term191463, term191463.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term191463, term191463.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term191463, term191463.getClass(), "selfClosing", false);
        setField(term191463, term191463.getClass(), "attributes", null);
        setField(term191463, term191463.getClass(), "type", null);
        setField(term191462, term191462.getClass(), "tagPending", term191463);
        setField(term191462, term191462.getClass(), "startPending", null);
        setField(term191462, term191462.getClass(), "endPending", null);
        setField(term191462, term191462.getClass(), "charPending", null);
        setField(term191462, term191462.getClass(), "doctypePending", null);
        setField(term191462, term191462.getClass(), "commentPending", null);
        setField(term191462, term191462.getClass(), "lastStartTag", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setBooleanField(term191462, term191462.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term191462, term191462.getClass(), "codepointHolder", null);
        setField(term191462, term191462.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isAppropriateEndTagToken", argTypes, term188769, args);
        assertTrue(recursiveEquals(term188769, term191462));
        assertTrue(recursiveEquals(retValue, true));
    }

};


