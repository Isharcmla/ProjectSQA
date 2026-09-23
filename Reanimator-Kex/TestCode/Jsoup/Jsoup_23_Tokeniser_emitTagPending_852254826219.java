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

public class Tokeniser_emitTagPending_852254826219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182405;
     Object term183717;

    public Tokeniser_emitTagPending_852254826219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term182629 = new LinkedHashMap();
        term182405 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term182473 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term182569 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term182473, term182473.getClass(), "pendingAttributeName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term182473, term182473.getClass(), "pendingAttributeValue", null);
        setField(term182569, term182569.getClass(), "attributes", term182629);
        setField(term182473, term182473.getClass(), "attributes", term182569);
        setField(term182405, term182405.getClass(), "tagPending", term182473);
        LinkedHashMap term183720 = new LinkedHashMap();
        term183717 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term183718 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term183719 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term183717, term183717.getClass(), "reader", null);
        setField(term183717, term183717.getClass(), "errors", null);
        setField(term183717, term183717.getClass(), "state", null);
        setField(term183718, term183718.getClass(), "tagName", null);
        setField(term183718, term183718.getClass(), "pendingAttributeName", null);
        setField(term183718, term183718.getClass(), "pendingAttributeValue", null);
        setBooleanField(term183718, term183718.getClass(), "selfClosing", false);
        setField(term183719, term183719.getClass(), "attributes", term183720);
        setField(term183718, term183718.getClass(), "attributes", term183719);
        setField(term183718, term183718.getClass(), "type", null);
        setField(term183717, term183717.getClass(), "emitPending", term183718);
        setBooleanField(term183717, term183717.getClass(), "isEmitPending", true);
        setField(term183717, term183717.getClass(), "charBuffer", null);
        setField(term183717, term183717.getClass(), "dataBuffer", null);
        setField(term183717, term183717.getClass(), "tagPending", term183718);
        setField(term183717, term183717.getClass(), "doctypePending", null);
        setField(term183717, term183717.getClass(), "commentPending", null);
        setField(term183717, term183717.getClass(), "lastStartTag", null);
        setBooleanField(term183717, term183717.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term182405, args);
        assertTrue(recursiveEquals(term182405, term183717));
    }

};


