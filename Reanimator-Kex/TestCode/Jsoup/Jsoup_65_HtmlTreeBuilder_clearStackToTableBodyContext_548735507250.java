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

public class HtmlTreeBuilder_clearStackToTableBodyContext_548735507250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213951;
     Object term214339;

    public HtmlTreeBuilder_clearStackToTableBodyContext_548735507250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term214003 = new ArrayList();
        term213951 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term213951, term213951.getClass(), "stack", term214003);
        ArrayList term214340 = new ArrayList();
        term214339 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term214339, term214339.getClass(), "state", null);
        setField(term214339, term214339.getClass(), "originalState", null);
        setBooleanField(term214339, term214339.getClass(), "baseUriSetFromDoc", false);
        setField(term214339, term214339.getClass(), "headElement", null);
        setField(term214339, term214339.getClass(), "formElement", null);
        setField(term214339, term214339.getClass(), "contextElement", null);
        setField(term214339, term214339.getClass(), "formattingElements", null);
        setField(term214339, term214339.getClass(), "pendingTableCharacters", null);
        setField(term214339, term214339.getClass(), "emptyEnd", null);
        setBooleanField(term214339, term214339.getClass(), "framesetOk", false);
        setBooleanField(term214339, term214339.getClass(), "fosterInserts", false);
        setBooleanField(term214339, term214339.getClass(), "fragmentParsing", false);
        setField(term214339, term214339.getClass(), "specificScopeTarget", null);
        setField(term214339, term214339.getClass(), "reader", null);
        setField(term214339, term214339.getClass(), "tokeniser", null);
        setField(term214339, term214339.getClass(), "doc", null);
        setField(term214339, term214339.getClass(), "stack", term214340);
        setField(term214339, term214339.getClass(), "baseUri", null);
        setField(term214339, term214339.getClass(), "currentToken", null);
        setField(term214339, term214339.getClass(), "errors", null);
        setField(term214339, term214339.getClass(), "settings", null);
        setField(term214339, term214339.getClass(), "start", null);
        setField(term214339, term214339.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableBodyContext", argTypes, term213951, args);
        assertTrue(recursiveEquals(term213951, term214339));
    }

};


