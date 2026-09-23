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

public class HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270027;
     Object term270252;

    public HtmlTreeBuilder_removeFromActiveFormattingElements_1580466725288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term270079 = new ArrayList();
        term270027 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term270027, term270027.getClass(), "formattingElements", term270079);
        ArrayList term270253 = new ArrayList();
        term270252 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term270252, term270252.getClass(), "state", null);
        setField(term270252, term270252.getClass(), "originalState", null);
        setBooleanField(term270252, term270252.getClass(), "baseUriSetFromDoc", false);
        setField(term270252, term270252.getClass(), "headElement", null);
        setField(term270252, term270252.getClass(), "formElement", null);
        setField(term270252, term270252.getClass(), "contextElement", null);
        setField(term270252, term270252.getClass(), "formattingElements", term270253);
        setField(term270252, term270252.getClass(), "pendingTableCharacters", null);
        setField(term270252, term270252.getClass(), "emptyEnd", null);
        setBooleanField(term270252, term270252.getClass(), "framesetOk", false);
        setBooleanField(term270252, term270252.getClass(), "fosterInserts", false);
        setBooleanField(term270252, term270252.getClass(), "fragmentParsing", false);
        setField(term270252, term270252.getClass(), "specificScopeTarget", null);
        setField(term270252, term270252.getClass(), "reader", null);
        setField(term270252, term270252.getClass(), "tokeniser", null);
        setField(term270252, term270252.getClass(), "doc", null);
        setField(term270252, term270252.getClass(), "stack", null);
        setField(term270252, term270252.getClass(), "baseUri", null);
        setField(term270252, term270252.getClass(), "currentToken", null);
        setField(term270252, term270252.getClass(), "errors", null);
        setField(term270252, term270252.getClass(), "settings", null);
        setField(term270252, term270252.getClass(), "start", null);
        setField(term270252, term270252.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeFromActiveFormattingElements", argTypes, term270027, args);
        assertTrue(recursiveEquals(term270027, term270252));
    }

};


