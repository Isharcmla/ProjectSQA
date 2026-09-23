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
import java.util.LinkedHashMap;

public class Tokeniser_emitTagPending_852254826197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171200;
     Object term172444;

    public Tokeniser_emitTagPending_852254826197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171200 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term171264 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term171264, term171264.getClass(), "pendingAttributeName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term171264, term171264.getClass(), "attributes", null);
        setField(term171264, term171264.getClass(), "pendingAttributeValue", null);
        setField(term171200, term171200.getClass(), "tagPending", term171264);
        LinkedHashMap term172447 = new LinkedHashMap();
        term172444 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term172445 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term172446 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term172444, term172444.getClass(), "reader", null);
        setField(term172444, term172444.getClass(), "errors", null);
        setField(term172444, term172444.getClass(), "state", null);
        setField(term172445, term172445.getClass(), "tagName", null);
        setField(term172445, term172445.getClass(), "pendingAttributeName", null);
        setField(term172445, term172445.getClass(), "pendingAttributeValue", null);
        setBooleanField(term172445, term172445.getClass(), "selfClosing", false);
        setField(term172446, term172446.getClass(), "attributes", term172447);
        setField(term172445, term172445.getClass(), "attributes", term172446);
        setField(term172445, term172445.getClass(), "type", null);
        setField(term172444, term172444.getClass(), "emitPending", term172445);
        setBooleanField(term172444, term172444.getClass(), "isEmitPending", true);
        setField(term172444, term172444.getClass(), "charBuffer", null);
        setField(term172444, term172444.getClass(), "dataBuffer", null);
        setField(term172444, term172444.getClass(), "tagPending", term172445);
        setField(term172444, term172444.getClass(), "doctypePending", null);
        setField(term172444, term172444.getClass(), "commentPending", null);
        setField(term172444, term172444.getClass(), "lastStartTag", null);
        setBooleanField(term172444, term172444.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term171200, args);
        assertTrue(recursiveEquals(term171200, term172444));
    }

};


