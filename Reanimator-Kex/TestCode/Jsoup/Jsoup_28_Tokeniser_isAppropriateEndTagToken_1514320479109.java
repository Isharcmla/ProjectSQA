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

public class Tokeniser_isAppropriateEndTagToken_1514320479109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107878;
     Object term108509;

    public Tokeniser_isAppropriateEndTagToken_1514320479109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107878 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term107946 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term108014 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term107946, term107946.getClass(), "tagName", null);
        setField(term107878, term107878.getClass(), "lastStartTag", term107946);
        setField(term108014, term108014.getClass(), "tagName", "");
        setField(term107878, term107878.getClass(), "tagPending", term108014);
        term108509 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term108510 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term108513 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term108509, term108509.getClass(), "reader", null);
        setField(term108509, term108509.getClass(), "errors", null);
        setField(term108509, term108509.getClass(), "state", null);
        setField(term108509, term108509.getClass(), "emitPending", null);
        setBooleanField(term108509, term108509.getClass(), "isEmitPending", false);
        setField(term108509, term108509.getClass(), "charBuffer", null);
        setField(term108509, term108509.getClass(), "dataBuffer", null);
        setField(term108510, term108510.getClass(), "tagName", "");
        setField(term108510, term108510.getClass(), "pendingAttributeName", null);
        setField(term108510, term108510.getClass(), "pendingAttributeValue", null);
        setBooleanField(term108510, term108510.getClass(), "selfClosing", false);
        setField(term108510, term108510.getClass(), "attributes", null);
        setField(term108510, term108510.getClass(), "type", null);
        setField(term108509, term108509.getClass(), "tagPending", term108510);
        setField(term108509, term108509.getClass(), "doctypePending", null);
        setField(term108509, term108509.getClass(), "commentPending", null);
        setField(term108513, term108513.getClass(), "tagName", null);
        setField(term108513, term108513.getClass(), "pendingAttributeName", null);
        setField(term108513, term108513.getClass(), "pendingAttributeValue", null);
        setBooleanField(term108513, term108513.getClass(), "selfClosing", false);
        setField(term108513, term108513.getClass(), "attributes", null);
        setField(term108513, term108513.getClass(), "type", null);
        setField(term108509, term108509.getClass(), "lastStartTag", term108513);
        setBooleanField(term108509, term108509.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isAppropriateEndTagToken", argTypes, term107878, args);
        assertTrue(recursiveEquals(term107878, term108509));
        assertTrue(recursiveEquals(retValue, false));
    }

};


