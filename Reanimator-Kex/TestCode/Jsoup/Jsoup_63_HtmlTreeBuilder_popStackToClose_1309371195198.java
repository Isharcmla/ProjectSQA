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

public class HtmlTreeBuilder_popStackToClose_1309371195198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210395;
     Object term210458;

    public HtmlTreeBuilder_popStackToClose_1309371195198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term210447 = new ArrayList();
        term210395 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term210395, term210395.getClass(), "stack", term210447);
        ArrayList term210459 = new ArrayList();
        term210458 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term210458, term210458.getClass(), "state", null);
        setField(term210458, term210458.getClass(), "originalState", null);
        setBooleanField(term210458, term210458.getClass(), "baseUriSetFromDoc", false);
        setField(term210458, term210458.getClass(), "headElement", null);
        setField(term210458, term210458.getClass(), "formElement", null);
        setField(term210458, term210458.getClass(), "contextElement", null);
        setField(term210458, term210458.getClass(), "formattingElements", null);
        setField(term210458, term210458.getClass(), "pendingTableCharacters", null);
        setField(term210458, term210458.getClass(), "emptyEnd", null);
        setBooleanField(term210458, term210458.getClass(), "framesetOk", false);
        setBooleanField(term210458, term210458.getClass(), "fosterInserts", false);
        setBooleanField(term210458, term210458.getClass(), "fragmentParsing", false);
        setField(term210458, term210458.getClass(), "specificScopeTarget", null);
        setField(term210458, term210458.getClass(), "reader", null);
        setField(term210458, term210458.getClass(), "tokeniser", null);
        setField(term210458, term210458.getClass(), "doc", null);
        setField(term210458, term210458.getClass(), "stack", term210459);
        setField(term210458, term210458.getClass(), "baseUri", null);
        setField(term210458, term210458.getClass(), "currentToken", null);
        setField(term210458, term210458.getClass(), "errors", null);
        setField(term210458, term210458.getClass(), "settings", null);
        setField(term210458, term210458.getClass(), "start", null);
        setField(term210458, term210458.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToClose", argTypes, term210395, args);
        assertTrue(recursiveEquals(term210395, term210458));
    }

};


