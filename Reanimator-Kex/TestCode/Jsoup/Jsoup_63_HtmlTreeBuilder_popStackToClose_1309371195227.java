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

public class HtmlTreeBuilder_popStackToClose_1309371195227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215875;
     Object term216427;

    public HtmlTreeBuilder_popStackToClose_1309371195227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term215927 = new ArrayList();
        term215875 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term215875, term215875.getClass(), "stack", term215927);
        ArrayList term216428 = new ArrayList();
        term216427 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term216427, term216427.getClass(), "state", null);
        setField(term216427, term216427.getClass(), "originalState", null);
        setBooleanField(term216427, term216427.getClass(), "baseUriSetFromDoc", false);
        setField(term216427, term216427.getClass(), "headElement", null);
        setField(term216427, term216427.getClass(), "formElement", null);
        setField(term216427, term216427.getClass(), "contextElement", null);
        setField(term216427, term216427.getClass(), "formattingElements", null);
        setField(term216427, term216427.getClass(), "pendingTableCharacters", null);
        setField(term216427, term216427.getClass(), "emptyEnd", null);
        setBooleanField(term216427, term216427.getClass(), "framesetOk", false);
        setBooleanField(term216427, term216427.getClass(), "fosterInserts", false);
        setBooleanField(term216427, term216427.getClass(), "fragmentParsing", false);
        setField(term216427, term216427.getClass(), "specificScopeTarget", null);
        setField(term216427, term216427.getClass(), "reader", null);
        setField(term216427, term216427.getClass(), "tokeniser", null);
        setField(term216427, term216427.getClass(), "doc", null);
        setField(term216427, term216427.getClass(), "stack", term216428);
        setField(term216427, term216427.getClass(), "baseUri", null);
        setField(term216427, term216427.getClass(), "currentToken", null);
        setField(term216427, term216427.getClass(), "errors", null);
        setField(term216427, term216427.getClass(), "settings", null);
        setField(term216427, term216427.getClass(), "start", null);
        setField(term216427, term216427.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToClose", argTypes, term215875, args);
        assertTrue(recursiveEquals(term215875, term216427));
    }

};


