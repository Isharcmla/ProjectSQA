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

public class HtmlTreeBuilder_getFromStack_640208782247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615606;
     Object term615669;

    public HtmlTreeBuilder_getFromStack_640208782247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term615658 = new ArrayList();
        term615606 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term615606, term615606.getClass(), "stack", term615658);
        ArrayList term615670 = new ArrayList();
        term615669 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term615669, term615669.getClass(), "state", null);
        setField(term615669, term615669.getClass(), "originalState", null);
        setBooleanField(term615669, term615669.getClass(), "baseUriSetFromDoc", false);
        setField(term615669, term615669.getClass(), "headElement", null);
        setField(term615669, term615669.getClass(), "formElement", null);
        setField(term615669, term615669.getClass(), "contextElement", null);
        setField(term615669, term615669.getClass(), "formattingElements", null);
        setField(term615669, term615669.getClass(), "pendingTableCharacters", null);
        setField(term615669, term615669.getClass(), "emptyEnd", null);
        setBooleanField(term615669, term615669.getClass(), "framesetOk", false);
        setBooleanField(term615669, term615669.getClass(), "fosterInserts", false);
        setBooleanField(term615669, term615669.getClass(), "fragmentParsing", false);
        setField(term615669, term615669.getClass(), "specificScopeTarget", null);
        setField(term615669, term615669.getClass(), "reader", null);
        setField(term615669, term615669.getClass(), "tokeniser", null);
        setField(term615669, term615669.getClass(), "doc", null);
        setField(term615669, term615669.getClass(), "stack", term615670);
        setField(term615669, term615669.getClass(), "baseUri", null);
        setField(term615669, term615669.getClass(), "currentToken", null);
        setField(term615669, term615669.getClass(), "errors", null);
        setField(term615669, term615669.getClass(), "start", null);
        setField(term615669, term615669.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getFromStack", argTypes, term615606, args);
        assertTrue(recursiveEquals(term615606, term615669));
        assertTrue(recursiveEquals(retValue, null));
    }

};


