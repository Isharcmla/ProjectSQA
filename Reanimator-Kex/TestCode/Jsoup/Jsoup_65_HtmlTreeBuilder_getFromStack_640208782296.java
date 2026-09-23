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

public class HtmlTreeBuilder_getFromStack_640208782296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227792;
     Object term227855;

    public HtmlTreeBuilder_getFromStack_640208782296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term227844 = new ArrayList();
        term227792 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term227792, term227792.getClass(), "stack", term227844);
        ArrayList term227856 = new ArrayList();
        term227855 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term227855, term227855.getClass(), "state", null);
        setField(term227855, term227855.getClass(), "originalState", null);
        setBooleanField(term227855, term227855.getClass(), "baseUriSetFromDoc", false);
        setField(term227855, term227855.getClass(), "headElement", null);
        setField(term227855, term227855.getClass(), "formElement", null);
        setField(term227855, term227855.getClass(), "contextElement", null);
        setField(term227855, term227855.getClass(), "formattingElements", null);
        setField(term227855, term227855.getClass(), "pendingTableCharacters", null);
        setField(term227855, term227855.getClass(), "emptyEnd", null);
        setBooleanField(term227855, term227855.getClass(), "framesetOk", false);
        setBooleanField(term227855, term227855.getClass(), "fosterInserts", false);
        setBooleanField(term227855, term227855.getClass(), "fragmentParsing", false);
        setField(term227855, term227855.getClass(), "specificScopeTarget", null);
        setField(term227855, term227855.getClass(), "reader", null);
        setField(term227855, term227855.getClass(), "tokeniser", null);
        setField(term227855, term227855.getClass(), "doc", null);
        setField(term227855, term227855.getClass(), "stack", term227856);
        setField(term227855, term227855.getClass(), "baseUri", null);
        setField(term227855, term227855.getClass(), "currentToken", null);
        setField(term227855, term227855.getClass(), "errors", null);
        setField(term227855, term227855.getClass(), "settings", null);
        setField(term227855, term227855.getClass(), "start", null);
        setField(term227855, term227855.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getFromStack", argTypes, term227792, args);
        assertTrue(recursiveEquals(term227792, term227855));
        assertTrue(recursiveEquals(retValue, null));
    }

};


