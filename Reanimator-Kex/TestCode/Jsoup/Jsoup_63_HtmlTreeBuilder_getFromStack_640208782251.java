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

public class HtmlTreeBuilder_getFromStack_640208782251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221111;
     Object term221599;

    public HtmlTreeBuilder_getFromStack_640208782251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term221163 = new ArrayList();
        term221111 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term221111, term221111.getClass(), "stack", term221163);
        ArrayList term221600 = new ArrayList();
        term221599 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term221599, term221599.getClass(), "state", null);
        setField(term221599, term221599.getClass(), "originalState", null);
        setBooleanField(term221599, term221599.getClass(), "baseUriSetFromDoc", false);
        setField(term221599, term221599.getClass(), "headElement", null);
        setField(term221599, term221599.getClass(), "formElement", null);
        setField(term221599, term221599.getClass(), "contextElement", null);
        setField(term221599, term221599.getClass(), "formattingElements", null);
        setField(term221599, term221599.getClass(), "pendingTableCharacters", null);
        setField(term221599, term221599.getClass(), "emptyEnd", null);
        setBooleanField(term221599, term221599.getClass(), "framesetOk", false);
        setBooleanField(term221599, term221599.getClass(), "fosterInserts", false);
        setBooleanField(term221599, term221599.getClass(), "fragmentParsing", false);
        setField(term221599, term221599.getClass(), "specificScopeTarget", null);
        setField(term221599, term221599.getClass(), "reader", null);
        setField(term221599, term221599.getClass(), "tokeniser", null);
        setField(term221599, term221599.getClass(), "doc", null);
        setField(term221599, term221599.getClass(), "stack", term221600);
        setField(term221599, term221599.getClass(), "baseUri", null);
        setField(term221599, term221599.getClass(), "currentToken", null);
        setField(term221599, term221599.getClass(), "errors", null);
        setField(term221599, term221599.getClass(), "settings", null);
        setField(term221599, term221599.getClass(), "start", null);
        setField(term221599, term221599.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getFromStack", argTypes, term221111, args);
        assertTrue(recursiveEquals(term221111, term221599));
        assertTrue(recursiveEquals(retValue, null));
    }

};


