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

public class HtmlTreeBuilder_setFormElement_823543729163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84401;
     Object term198360;

    public HtmlTreeBuilder_setFormElement_823543729163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84401 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term84401, term84401.getClass(), "state", null);
        setField(term84401, term84401.getClass(), "originalState", null);
        setBooleanField(term84401, term84401.getClass(), "baseUriSetFromDoc", false);
        setField(term84401, term84401.getClass(), "headElement", null);
        setField(term84401, term84401.getClass(), "formElement", null);
        setField(term84401, term84401.getClass(), "contextElement", null);
        setField(term84401, term84401.getClass(), "formattingElements", null);
        setField(term84401, term84401.getClass(), "pendingTableCharacters", null);
        setField(term84401, term84401.getClass(), "emptyEnd", null);
        setBooleanField(term84401, term84401.getClass(), "framesetOk", false);
        setBooleanField(term84401, term84401.getClass(), "fosterInserts", false);
        setBooleanField(term84401, term84401.getClass(), "fragmentParsing", false);
        setField(term84401, term84401.getClass(), "specificScopeTarget", null);
        setField(term84401, term84401.getClass(), "parser", null);
        setField(term84401, term84401.getClass(), "reader", null);
        setField(term84401, term84401.getClass(), "tokeniser", null);
        setField(term84401, term84401.getClass(), "doc", null);
        setField(term84401, term84401.getClass(), "stack", null);
        setField(term84401, term84401.getClass(), "baseUri", null);
        setField(term84401, term84401.getClass(), "currentToken", null);
        setField(term84401, term84401.getClass(), "settings", null);
        setField(term84401, term84401.getClass(), "start", null);
        setField(term84401, term84401.getClass(), "end", null);
        term198360 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term198360, term198360.getClass(), "state", null);
        setField(term198360, term198360.getClass(), "originalState", null);
        setBooleanField(term198360, term198360.getClass(), "baseUriSetFromDoc", false);
        setField(term198360, term198360.getClass(), "headElement", null);
        setField(term198360, term198360.getClass(), "formElement", null);
        setField(term198360, term198360.getClass(), "contextElement", null);
        setField(term198360, term198360.getClass(), "formattingElements", null);
        setField(term198360, term198360.getClass(), "pendingTableCharacters", null);
        setField(term198360, term198360.getClass(), "emptyEnd", null);
        setBooleanField(term198360, term198360.getClass(), "framesetOk", false);
        setBooleanField(term198360, term198360.getClass(), "fosterInserts", false);
        setBooleanField(term198360, term198360.getClass(), "fragmentParsing", false);
        setField(term198360, term198360.getClass(), "specificScopeTarget", null);
        setField(term198360, term198360.getClass(), "parser", null);
        setField(term198360, term198360.getClass(), "reader", null);
        setField(term198360, term198360.getClass(), "tokeniser", null);
        setField(term198360, term198360.getClass(), "doc", null);
        setField(term198360, term198360.getClass(), "stack", null);
        setField(term198360, term198360.getClass(), "baseUri", null);
        setField(term198360, term198360.getClass(), "currentToken", null);
        setField(term198360, term198360.getClass(), "settings", null);
        setField(term198360, term198360.getClass(), "start", null);
        setField(term198360, term198360.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.FormElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFormElement", argTypes, term84401, args);
        assertTrue(recursiveEquals(term84401, term198360));
    }

};


