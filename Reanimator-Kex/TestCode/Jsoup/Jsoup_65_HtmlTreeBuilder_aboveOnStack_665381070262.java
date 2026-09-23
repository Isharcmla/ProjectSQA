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

public class HtmlTreeBuilder_aboveOnStack_665381070262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217758;
     Object term223331;

    public HtmlTreeBuilder_aboveOnStack_665381070262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term217810 = new ArrayList();
        term217758 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term217758, term217758.getClass(), "stack", term217810);
        ArrayList term223332 = new ArrayList();
        term223331 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term223331, term223331.getClass(), "state", null);
        setField(term223331, term223331.getClass(), "originalState", null);
        setBooleanField(term223331, term223331.getClass(), "baseUriSetFromDoc", false);
        setField(term223331, term223331.getClass(), "headElement", null);
        setField(term223331, term223331.getClass(), "formElement", null);
        setField(term223331, term223331.getClass(), "contextElement", null);
        setField(term223331, term223331.getClass(), "formattingElements", null);
        setField(term223331, term223331.getClass(), "pendingTableCharacters", null);
        setField(term223331, term223331.getClass(), "emptyEnd", null);
        setBooleanField(term223331, term223331.getClass(), "framesetOk", false);
        setBooleanField(term223331, term223331.getClass(), "fosterInserts", false);
        setBooleanField(term223331, term223331.getClass(), "fragmentParsing", false);
        setField(term223331, term223331.getClass(), "specificScopeTarget", null);
        setField(term223331, term223331.getClass(), "reader", null);
        setField(term223331, term223331.getClass(), "tokeniser", null);
        setField(term223331, term223331.getClass(), "doc", null);
        setField(term223331, term223331.getClass(), "stack", term223332);
        setField(term223331, term223331.getClass(), "baseUri", null);
        setField(term223331, term223331.getClass(), "currentToken", null);
        setField(term223331, term223331.getClass(), "errors", null);
        setField(term223331, term223331.getClass(), "settings", null);
        setField(term223331, term223331.getClass(), "start", null);
        setField(term223331, term223331.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "aboveOnStack", argTypes, term217758, args);
        assertTrue(recursiveEquals(term217758, term223331));
        assertTrue(recursiveEquals(retValue, null));
    }

};


