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

public class HtmlTreeBuilder_aboveOnStack_665381070387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357969;
     Object term358033;

    public HtmlTreeBuilder_aboveOnStack_665381070387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term358021 = new ArrayList();
        term357969 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term357969, term357969.getClass(), "stack", term358021);
        ArrayList term358034 = new ArrayList();
        term358033 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term358033, term358033.getClass(), "state", null);
        setField(term358033, term358033.getClass(), "originalState", null);
        setBooleanField(term358033, term358033.getClass(), "baseUriSetFromDoc", false);
        setField(term358033, term358033.getClass(), "headElement", null);
        setField(term358033, term358033.getClass(), "formElement", null);
        setField(term358033, term358033.getClass(), "contextElement", null);
        setField(term358033, term358033.getClass(), "formattingElements", null);
        setField(term358033, term358033.getClass(), "pendingTableCharacters", null);
        setField(term358033, term358033.getClass(), "emptyEnd", null);
        setBooleanField(term358033, term358033.getClass(), "framesetOk", false);
        setBooleanField(term358033, term358033.getClass(), "fosterInserts", false);
        setBooleanField(term358033, term358033.getClass(), "fragmentParsing", false);
        setField(term358033, term358033.getClass(), "specificScopeTarget", null);
        setField(term358033, term358033.getClass(), "parser", null);
        setField(term358033, term358033.getClass(), "reader", null);
        setField(term358033, term358033.getClass(), "tokeniser", null);
        setField(term358033, term358033.getClass(), "doc", null);
        setField(term358033, term358033.getClass(), "stack", term358034);
        setField(term358033, term358033.getClass(), "baseUri", null);
        setField(term358033, term358033.getClass(), "currentToken", null);
        setField(term358033, term358033.getClass(), "settings", null);
        setField(term358033, term358033.getClass(), "start", null);
        setField(term358033, term358033.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "aboveOnStack", argTypes, term357969, args);
        assertTrue(recursiveEquals(term357969, term358033));
        assertTrue(recursiveEquals(retValue, null));
    }

};


