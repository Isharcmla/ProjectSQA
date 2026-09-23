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

public class HtmlTreeBuilder_getActiveFormattingElement_851320383292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227557;
     Object term227620;

    public HtmlTreeBuilder_getActiveFormattingElement_851320383292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term227609 = new ArrayList();
        term227557 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term227557, term227557.getClass(), "formattingElements", term227609);
        ArrayList term227621 = new ArrayList();
        term227620 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term227620, term227620.getClass(), "state", null);
        setField(term227620, term227620.getClass(), "originalState", null);
        setBooleanField(term227620, term227620.getClass(), "baseUriSetFromDoc", false);
        setField(term227620, term227620.getClass(), "headElement", null);
        setField(term227620, term227620.getClass(), "formElement", null);
        setField(term227620, term227620.getClass(), "contextElement", null);
        setField(term227620, term227620.getClass(), "formattingElements", term227621);
        setField(term227620, term227620.getClass(), "pendingTableCharacters", null);
        setField(term227620, term227620.getClass(), "emptyEnd", null);
        setBooleanField(term227620, term227620.getClass(), "framesetOk", false);
        setBooleanField(term227620, term227620.getClass(), "fosterInserts", false);
        setBooleanField(term227620, term227620.getClass(), "fragmentParsing", false);
        setField(term227620, term227620.getClass(), "specificScopeTarget", null);
        setField(term227620, term227620.getClass(), "reader", null);
        setField(term227620, term227620.getClass(), "tokeniser", null);
        setField(term227620, term227620.getClass(), "doc", null);
        setField(term227620, term227620.getClass(), "stack", null);
        setField(term227620, term227620.getClass(), "baseUri", null);
        setField(term227620, term227620.getClass(), "currentToken", null);
        setField(term227620, term227620.getClass(), "errors", null);
        setField(term227620, term227620.getClass(), "settings", null);
        setField(term227620, term227620.getClass(), "start", null);
        setField(term227620, term227620.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getActiveFormattingElement", argTypes, term227557, args);
        assertTrue(recursiveEquals(term227557, term227620));
        assertTrue(recursiveEquals(retValue, null));
    }

};


