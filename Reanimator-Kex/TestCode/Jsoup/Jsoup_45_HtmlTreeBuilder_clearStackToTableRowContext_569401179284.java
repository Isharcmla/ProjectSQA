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
import java.lang.Object;

public class HtmlTreeBuilder_clearStackToTableRowContext_569401179284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638983;
     Object term642147;

    public HtmlTreeBuilder_clearStackToTableRowContext_569401179284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term639089 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term639035 = new ArrayList();
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        ((ArrayList) term639035).add(term639089);
        term638983 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term638983, term638983.getClass(), "stack", term639035);
        ArrayList term642148 = new ArrayList();
        term642147 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term642147, term642147.getClass(), "state", null);
        setField(term642147, term642147.getClass(), "originalState", null);
        setBooleanField(term642147, term642147.getClass(), "baseUriSetFromDoc", false);
        setField(term642147, term642147.getClass(), "headElement", null);
        setField(term642147, term642147.getClass(), "formElement", null);
        setField(term642147, term642147.getClass(), "contextElement", null);
        setField(term642147, term642147.getClass(), "formattingElements", null);
        setField(term642147, term642147.getClass(), "pendingTableCharacters", null);
        setField(term642147, term642147.getClass(), "emptyEnd", null);
        setBooleanField(term642147, term642147.getClass(), "framesetOk", false);
        setBooleanField(term642147, term642147.getClass(), "fosterInserts", false);
        setBooleanField(term642147, term642147.getClass(), "fragmentParsing", false);
        setField(term642147, term642147.getClass(), "specificScopeTarget", null);
        setField(term642147, term642147.getClass(), "reader", null);
        setField(term642147, term642147.getClass(), "tokeniser", null);
        setField(term642147, term642147.getClass(), "doc", null);
        setField(term642147, term642147.getClass(), "stack", term642148);
        setField(term642147, term642147.getClass(), "baseUri", null);
        setField(term642147, term642147.getClass(), "currentToken", null);
        setField(term642147, term642147.getClass(), "errors", null);
        setField(term642147, term642147.getClass(), "start", null);
        setField(term642147, term642147.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableRowContext", argTypes, term638983, args);
        assertTrue(recursiveEquals(term638983, term642147));
    }

};


