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

public class HtmlTreeBuilder_clearStackToTableRowContext_569401179294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229909;
     Object term229983;

    public HtmlTreeBuilder_clearStackToTableRowContext_569401179294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term229961 = new ArrayList();
        term229909 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term229909, term229909.getClass(), "stack", term229961);
        ArrayList term229984 = new ArrayList();
        term229983 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term229983, term229983.getClass(), "state", null);
        setField(term229983, term229983.getClass(), "originalState", null);
        setBooleanField(term229983, term229983.getClass(), "baseUriSetFromDoc", false);
        setField(term229983, term229983.getClass(), "headElement", null);
        setField(term229983, term229983.getClass(), "formElement", null);
        setField(term229983, term229983.getClass(), "contextElement", null);
        setField(term229983, term229983.getClass(), "formattingElements", null);
        setField(term229983, term229983.getClass(), "pendingTableCharacters", null);
        setField(term229983, term229983.getClass(), "emptyEnd", null);
        setBooleanField(term229983, term229983.getClass(), "framesetOk", false);
        setBooleanField(term229983, term229983.getClass(), "fosterInserts", false);
        setBooleanField(term229983, term229983.getClass(), "fragmentParsing", false);
        setField(term229983, term229983.getClass(), "specificScopeTarget", null);
        setField(term229983, term229983.getClass(), "reader", null);
        setField(term229983, term229983.getClass(), "tokeniser", null);
        setField(term229983, term229983.getClass(), "doc", null);
        setField(term229983, term229983.getClass(), "stack", term229984);
        setField(term229983, term229983.getClass(), "baseUri", null);
        setField(term229983, term229983.getClass(), "currentToken", null);
        setField(term229983, term229983.getClass(), "errors", null);
        setField(term229983, term229983.getClass(), "settings", null);
        setField(term229983, term229983.getClass(), "start", null);
        setField(term229983, term229983.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableRowContext", argTypes, term229909, args);
        assertTrue(recursiveEquals(term229909, term229983));
    }

};


