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

public class HtmlTreeBuilder_clearStackToTableRowContext_569401179318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term705691;
     Object term706117;

    public HtmlTreeBuilder_clearStackToTableRowContext_569401179318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term705743 = new ArrayList();
        term705691 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term705691, term705691.getClass(), "stack", term705743);
        ArrayList term706118 = new ArrayList();
        term706117 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term706117, term706117.getClass(), "state", null);
        setField(term706117, term706117.getClass(), "originalState", null);
        setBooleanField(term706117, term706117.getClass(), "baseUriSetFromDoc", false);
        setField(term706117, term706117.getClass(), "headElement", null);
        setField(term706117, term706117.getClass(), "formElement", null);
        setField(term706117, term706117.getClass(), "contextElement", null);
        setField(term706117, term706117.getClass(), "formattingElements", null);
        setField(term706117, term706117.getClass(), "pendingTableCharacters", null);
        setField(term706117, term706117.getClass(), "emptyEnd", null);
        setBooleanField(term706117, term706117.getClass(), "framesetOk", false);
        setBooleanField(term706117, term706117.getClass(), "fosterInserts", false);
        setBooleanField(term706117, term706117.getClass(), "fragmentParsing", false);
        setField(term706117, term706117.getClass(), "specificScopeTarget", null);
        setField(term706117, term706117.getClass(), "reader", null);
        setField(term706117, term706117.getClass(), "tokeniser", null);
        setField(term706117, term706117.getClass(), "doc", null);
        setField(term706117, term706117.getClass(), "stack", term706118);
        setField(term706117, term706117.getClass(), "baseUri", null);
        setField(term706117, term706117.getClass(), "currentToken", null);
        setField(term706117, term706117.getClass(), "errors", null);
        setField(term706117, term706117.getClass(), "start", null);
        setField(term706117, term706117.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableRowContext", argTypes, term705691, args);
        assertTrue(recursiveEquals(term705691, term706117));
    }

};


