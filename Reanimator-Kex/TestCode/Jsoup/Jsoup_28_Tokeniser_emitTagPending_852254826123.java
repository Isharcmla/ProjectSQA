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

public class Tokeniser_emitTagPending_852254826123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114206;
     Object term114320;

    public Tokeniser_emitTagPending_852254826123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114206 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term114270 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term114206, term114206.getClass(), "tagPending", term114270);
        term114320 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term114321 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term114320, term114320.getClass(), "reader", null);
        setField(term114320, term114320.getClass(), "errors", null);
        setField(term114320, term114320.getClass(), "state", null);
        setField(term114321, term114321.getClass(), "tagName", null);
        setField(term114321, term114321.getClass(), "pendingAttributeName", null);
        setField(term114321, term114321.getClass(), "pendingAttributeValue", null);
        setBooleanField(term114321, term114321.getClass(), "selfClosing", false);
        setField(term114321, term114321.getClass(), "attributes", null);
        setField(term114321, term114321.getClass(), "type", null);
        setField(term114320, term114320.getClass(), "emitPending", term114321);
        setBooleanField(term114320, term114320.getClass(), "isEmitPending", true);
        setField(term114320, term114320.getClass(), "charBuffer", null);
        setField(term114320, term114320.getClass(), "dataBuffer", null);
        setField(term114320, term114320.getClass(), "tagPending", term114321);
        setField(term114320, term114320.getClass(), "doctypePending", null);
        setField(term114320, term114320.getClass(), "commentPending", null);
        setField(term114320, term114320.getClass(), "lastStartTag", null);
        setBooleanField(term114320, term114320.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term114206, args);
        assertTrue(recursiveEquals(term114206, term114320));
    }

};


