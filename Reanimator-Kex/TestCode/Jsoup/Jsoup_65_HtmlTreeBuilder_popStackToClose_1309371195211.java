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
import java.util.ArrayList;

public class HtmlTreeBuilder_popStackToClose_1309371195211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202563;
     Object term203258;

    public HtmlTreeBuilder_popStackToClose_1309371195211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term202615 = new ArrayList();
        term202563 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term202563, term202563.getClass(), "stack", term202615);
        ArrayList term203259 = new ArrayList();
        term203258 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term203258, term203258.getClass(), "state", null);
        setField(term203258, term203258.getClass(), "originalState", null);
        setBooleanField(term203258, term203258.getClass(), "baseUriSetFromDoc", false);
        setField(term203258, term203258.getClass(), "headElement", null);
        setField(term203258, term203258.getClass(), "formElement", null);
        setField(term203258, term203258.getClass(), "contextElement", null);
        setField(term203258, term203258.getClass(), "formattingElements", null);
        setField(term203258, term203258.getClass(), "pendingTableCharacters", null);
        setField(term203258, term203258.getClass(), "emptyEnd", null);
        setBooleanField(term203258, term203258.getClass(), "framesetOk", false);
        setBooleanField(term203258, term203258.getClass(), "fosterInserts", false);
        setBooleanField(term203258, term203258.getClass(), "fragmentParsing", false);
        setField(term203258, term203258.getClass(), "specificScopeTarget", null);
        setField(term203258, term203258.getClass(), "reader", null);
        setField(term203258, term203258.getClass(), "tokeniser", null);
        setField(term203258, term203258.getClass(), "doc", null);
        setField(term203258, term203258.getClass(), "stack", term203259);
        setField(term203258, term203258.getClass(), "baseUri", null);
        setField(term203258, term203258.getClass(), "currentToken", null);
        setField(term203258, term203258.getClass(), "errors", null);
        setField(term203258, term203258.getClass(), "settings", null);
        setField(term203258, term203258.getClass(), "start", null);
        setField(term203258, term203258.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToClose", argTypes, term202563, args);
        assertTrue(recursiveEquals(term202563, term203258));
    }

};


