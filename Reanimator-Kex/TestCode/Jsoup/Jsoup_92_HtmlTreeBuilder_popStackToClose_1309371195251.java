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

public class HtmlTreeBuilder_popStackToClose_1309371195251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318791;
     Object term318854;

    public HtmlTreeBuilder_popStackToClose_1309371195251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term318843 = new ArrayList();
        term318791 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term318791, term318791.getClass(), "stack", term318843);
        ArrayList term318855 = new ArrayList();
        term318854 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term318854, term318854.getClass(), "state", null);
        setField(term318854, term318854.getClass(), "originalState", null);
        setBooleanField(term318854, term318854.getClass(), "baseUriSetFromDoc", false);
        setField(term318854, term318854.getClass(), "headElement", null);
        setField(term318854, term318854.getClass(), "formElement", null);
        setField(term318854, term318854.getClass(), "contextElement", null);
        setField(term318854, term318854.getClass(), "formattingElements", null);
        setField(term318854, term318854.getClass(), "pendingTableCharacters", null);
        setField(term318854, term318854.getClass(), "emptyEnd", null);
        setBooleanField(term318854, term318854.getClass(), "framesetOk", false);
        setBooleanField(term318854, term318854.getClass(), "fosterInserts", false);
        setBooleanField(term318854, term318854.getClass(), "fragmentParsing", false);
        setField(term318854, term318854.getClass(), "specificScopeTarget", null);
        setField(term318854, term318854.getClass(), "parser", null);
        setField(term318854, term318854.getClass(), "reader", null);
        setField(term318854, term318854.getClass(), "tokeniser", null);
        setField(term318854, term318854.getClass(), "doc", null);
        setField(term318854, term318854.getClass(), "stack", term318855);
        setField(term318854, term318854.getClass(), "baseUri", null);
        setField(term318854, term318854.getClass(), "currentToken", null);
        setField(term318854, term318854.getClass(), "settings", null);
        setField(term318854, term318854.getClass(), "start", null);
        setField(term318854, term318854.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToClose", argTypes, term318791, args);
        assertTrue(recursiveEquals(term318791, term318854));
    }

};


