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

public class HtmlTreeBuilder_removeLastFormattingElement_307668102269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217651;
     Object term217857;

    public HtmlTreeBuilder_removeLastFormattingElement_307668102269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term217703 = new ArrayList();
        term217651 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term217651, term217651.getClass(), "formattingElements", term217703);
        ArrayList term217858 = new ArrayList();
        term217857 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term217857, term217857.getClass(), "state", null);
        setField(term217857, term217857.getClass(), "originalState", null);
        setBooleanField(term217857, term217857.getClass(), "baseUriSetFromDoc", false);
        setField(term217857, term217857.getClass(), "headElement", null);
        setField(term217857, term217857.getClass(), "formElement", null);
        setField(term217857, term217857.getClass(), "contextElement", null);
        setField(term217857, term217857.getClass(), "formattingElements", term217858);
        setField(term217857, term217857.getClass(), "pendingTableCharacters", null);
        setField(term217857, term217857.getClass(), "emptyEnd", null);
        setBooleanField(term217857, term217857.getClass(), "framesetOk", false);
        setBooleanField(term217857, term217857.getClass(), "fosterInserts", false);
        setBooleanField(term217857, term217857.getClass(), "fragmentParsing", false);
        setField(term217857, term217857.getClass(), "specificScopeTarget", null);
        setField(term217857, term217857.getClass(), "reader", null);
        setField(term217857, term217857.getClass(), "tokeniser", null);
        setField(term217857, term217857.getClass(), "doc", null);
        setField(term217857, term217857.getClass(), "stack", null);
        setField(term217857, term217857.getClass(), "baseUri", null);
        setField(term217857, term217857.getClass(), "currentToken", null);
        setField(term217857, term217857.getClass(), "errors", null);
        setField(term217857, term217857.getClass(), "settings", null);
        setField(term217857, term217857.getClass(), "start", null);
        setField(term217857, term217857.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "removeLastFormattingElement", argTypes, term217651, args);
        assertTrue(recursiveEquals(term217651, term217857));
        assertTrue(recursiveEquals(retValue, null));
    }

};


