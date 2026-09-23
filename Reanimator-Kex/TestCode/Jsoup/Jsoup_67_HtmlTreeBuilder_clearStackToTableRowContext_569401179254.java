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

public class HtmlTreeBuilder_clearStackToTableRowContext_569401179254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214763;
     Object term215133;

    public HtmlTreeBuilder_clearStackToTableRowContext_569401179254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term214815 = new ArrayList();
        term214763 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term214763, term214763.getClass(), "stack", term214815);
        ArrayList term215134 = new ArrayList();
        term215133 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term215133, term215133.getClass(), "state", null);
        setField(term215133, term215133.getClass(), "originalState", null);
        setBooleanField(term215133, term215133.getClass(), "baseUriSetFromDoc", false);
        setField(term215133, term215133.getClass(), "headElement", null);
        setField(term215133, term215133.getClass(), "formElement", null);
        setField(term215133, term215133.getClass(), "contextElement", null);
        setField(term215133, term215133.getClass(), "formattingElements", null);
        setField(term215133, term215133.getClass(), "pendingTableCharacters", null);
        setField(term215133, term215133.getClass(), "emptyEnd", null);
        setBooleanField(term215133, term215133.getClass(), "framesetOk", false);
        setBooleanField(term215133, term215133.getClass(), "fosterInserts", false);
        setBooleanField(term215133, term215133.getClass(), "fragmentParsing", false);
        setField(term215133, term215133.getClass(), "specificScopeTarget", null);
        setField(term215133, term215133.getClass(), "reader", null);
        setField(term215133, term215133.getClass(), "tokeniser", null);
        setField(term215133, term215133.getClass(), "doc", null);
        setField(term215133, term215133.getClass(), "stack", term215134);
        setField(term215133, term215133.getClass(), "baseUri", null);
        setField(term215133, term215133.getClass(), "currentToken", null);
        setField(term215133, term215133.getClass(), "errors", null);
        setField(term215133, term215133.getClass(), "settings", null);
        setField(term215133, term215133.getClass(), "start", null);
        setField(term215133, term215133.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableRowContext", argTypes, term214763, args);
        assertTrue(recursiveEquals(term214763, term215133));
    }

};


