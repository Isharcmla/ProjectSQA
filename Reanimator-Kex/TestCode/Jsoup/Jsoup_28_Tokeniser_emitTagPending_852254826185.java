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

public class Tokeniser_emitTagPending_852254826185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161556;
     Object term162804;

    public Tokeniser_emitTagPending_852254826185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161556 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term161624 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term161624, term161624.getClass(), "pendingAttributeName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term161624, term161624.getClass(), "attributes", null);
        setField(term161624, term161624.getClass(), "pendingAttributeValue", null);
        setField(term161556, term161556.getClass(), "tagPending", term161624);
        LinkedHashMap term162807 = new LinkedHashMap();
        term162804 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term162805 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term162806 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term162804, term162804.getClass(), "reader", null);
        setField(term162804, term162804.getClass(), "errors", null);
        setField(term162804, term162804.getClass(), "state", null);
        setField(term162805, term162805.getClass(), "tagName", null);
        setField(term162805, term162805.getClass(), "pendingAttributeName", null);
        setField(term162805, term162805.getClass(), "pendingAttributeValue", null);
        setBooleanField(term162805, term162805.getClass(), "selfClosing", false);
        setField(term162806, term162806.getClass(), "attributes", term162807);
        setField(term162805, term162805.getClass(), "attributes", term162806);
        setField(term162805, term162805.getClass(), "type", null);
        setField(term162804, term162804.getClass(), "emitPending", term162805);
        setBooleanField(term162804, term162804.getClass(), "isEmitPending", true);
        setField(term162804, term162804.getClass(), "charBuffer", null);
        setField(term162804, term162804.getClass(), "dataBuffer", null);
        setField(term162804, term162804.getClass(), "tagPending", term162805);
        setField(term162804, term162804.getClass(), "doctypePending", null);
        setField(term162804, term162804.getClass(), "commentPending", null);
        setField(term162804, term162804.getClass(), "lastStartTag", null);
        setBooleanField(term162804, term162804.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term161556, args);
        assertTrue(recursiveEquals(term161556, term162804));
    }

};


