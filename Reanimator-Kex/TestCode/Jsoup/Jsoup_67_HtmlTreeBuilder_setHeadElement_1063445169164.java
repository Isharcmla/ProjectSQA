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

public class HtmlTreeBuilder_setHeadElement_1063445169164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71848;
     Object term164685;

    public HtmlTreeBuilder_setHeadElement_1063445169164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71848 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term71848, term71848.getClass(), "state", null);
        setField(term71848, term71848.getClass(), "originalState", null);
        setBooleanField(term71848, term71848.getClass(), "baseUriSetFromDoc", false);
        setField(term71848, term71848.getClass(), "headElement", null);
        setField(term71848, term71848.getClass(), "formElement", null);
        setField(term71848, term71848.getClass(), "contextElement", null);
        setField(term71848, term71848.getClass(), "formattingElements", null);
        setField(term71848, term71848.getClass(), "pendingTableCharacters", null);
        setField(term71848, term71848.getClass(), "emptyEnd", null);
        setBooleanField(term71848, term71848.getClass(), "framesetOk", false);
        setBooleanField(term71848, term71848.getClass(), "fosterInserts", false);
        setBooleanField(term71848, term71848.getClass(), "fragmentParsing", false);
        setField(term71848, term71848.getClass(), "specificScopeTarget", null);
        setField(term71848, term71848.getClass(), "reader", null);
        setField(term71848, term71848.getClass(), "tokeniser", null);
        setField(term71848, term71848.getClass(), "doc", null);
        setField(term71848, term71848.getClass(), "stack", null);
        setField(term71848, term71848.getClass(), "baseUri", null);
        setField(term71848, term71848.getClass(), "currentToken", null);
        setField(term71848, term71848.getClass(), "errors", null);
        setField(term71848, term71848.getClass(), "settings", null);
        setField(term71848, term71848.getClass(), "start", null);
        setField(term71848, term71848.getClass(), "end", null);
        term164685 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term164685, term164685.getClass(), "state", null);
        setField(term164685, term164685.getClass(), "originalState", null);
        setBooleanField(term164685, term164685.getClass(), "baseUriSetFromDoc", false);
        setField(term164685, term164685.getClass(), "headElement", null);
        setField(term164685, term164685.getClass(), "formElement", null);
        setField(term164685, term164685.getClass(), "contextElement", null);
        setField(term164685, term164685.getClass(), "formattingElements", null);
        setField(term164685, term164685.getClass(), "pendingTableCharacters", null);
        setField(term164685, term164685.getClass(), "emptyEnd", null);
        setBooleanField(term164685, term164685.getClass(), "framesetOk", false);
        setBooleanField(term164685, term164685.getClass(), "fosterInserts", false);
        setBooleanField(term164685, term164685.getClass(), "fragmentParsing", false);
        setField(term164685, term164685.getClass(), "specificScopeTarget", null);
        setField(term164685, term164685.getClass(), "reader", null);
        setField(term164685, term164685.getClass(), "tokeniser", null);
        setField(term164685, term164685.getClass(), "doc", null);
        setField(term164685, term164685.getClass(), "stack", null);
        setField(term164685, term164685.getClass(), "baseUri", null);
        setField(term164685, term164685.getClass(), "currentToken", null);
        setField(term164685, term164685.getClass(), "errors", null);
        setField(term164685, term164685.getClass(), "settings", null);
        setField(term164685, term164685.getClass(), "start", null);
        setField(term164685, term164685.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHeadElement", argTypes, term71848, args);
        assertTrue(recursiveEquals(term71848, term164685));
    }

};


