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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HtmlTreeBuilder_parseFragment_634349069114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1734;

    public HtmlTreeBuilder_parseFragment_634349069114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1734 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term1734, term1734.getClass(), "state", null);
        setField(term1734, term1734.getClass(), "originalState", null);
        setBooleanField(term1734, term1734.getClass(), "baseUriSetFromDoc", false);
        setField(term1734, term1734.getClass(), "headElement", null);
        setField(term1734, term1734.getClass(), "formElement", null);
        setField(term1734, term1734.getClass(), "contextElement", null);
        setField(term1734, term1734.getClass(), "formattingElements", null);
        setField(term1734, term1734.getClass(), "pendingTableCharacters", null);
        setField(term1734, term1734.getClass(), "emptyEnd", null);
        setBooleanField(term1734, term1734.getClass(), "framesetOk", false);
        setBooleanField(term1734, term1734.getClass(), "fosterInserts", false);
        setBooleanField(term1734, term1734.getClass(), "fragmentParsing", false);
        setField(term1734, term1734.getClass(), "specificScopeTarget", null);
        setField(term1734, term1734.getClass(), "reader", null);
        setField(term1734, term1734.getClass(), "tokeniser", null);
        setField(term1734, term1734.getClass(), "doc", null);
        setField(term1734, term1734.getClass(), "stack", null);
        setField(term1734, term1734.getClass(), "baseUri", null);
        setField(term1734, term1734.getClass(), "currentToken", null);
        setField(term1734, term1734.getClass(), "errors", null);
        setField(term1734, term1734.getClass(), "settings", null);
        setField(term1734, term1734.getClass(), "start", null);
        setField(term1734, term1734.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("org.jsoup.parser.ParseErrorList");
        argTypes[4] = Class.forName("org.jsoup.parser.ParseSettings");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            callMethod(klass, "parseFragment", argTypes, term1734, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


