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

public class HtmlTreeBuilder_popStackToClose_1309371195241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209191;
     Object term211037;

    public HtmlTreeBuilder_popStackToClose_1309371195241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term209243 = new ArrayList();
        term209191 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term209191, term209191.getClass(), "stack", term209243);
        ArrayList term211038 = new ArrayList();
        term211037 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term211037, term211037.getClass(), "state", null);
        setField(term211037, term211037.getClass(), "originalState", null);
        setBooleanField(term211037, term211037.getClass(), "baseUriSetFromDoc", false);
        setField(term211037, term211037.getClass(), "headElement", null);
        setField(term211037, term211037.getClass(), "formElement", null);
        setField(term211037, term211037.getClass(), "contextElement", null);
        setField(term211037, term211037.getClass(), "formattingElements", null);
        setField(term211037, term211037.getClass(), "pendingTableCharacters", null);
        setField(term211037, term211037.getClass(), "emptyEnd", null);
        setBooleanField(term211037, term211037.getClass(), "framesetOk", false);
        setBooleanField(term211037, term211037.getClass(), "fosterInserts", false);
        setBooleanField(term211037, term211037.getClass(), "fragmentParsing", false);
        setField(term211037, term211037.getClass(), "specificScopeTarget", null);
        setField(term211037, term211037.getClass(), "reader", null);
        setField(term211037, term211037.getClass(), "tokeniser", null);
        setField(term211037, term211037.getClass(), "doc", null);
        setField(term211037, term211037.getClass(), "stack", term211038);
        setField(term211037, term211037.getClass(), "baseUri", null);
        setField(term211037, term211037.getClass(), "currentToken", null);
        setField(term211037, term211037.getClass(), "errors", null);
        setField(term211037, term211037.getClass(), "settings", null);
        setField(term211037, term211037.getClass(), "start", null);
        setField(term211037, term211037.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToClose", argTypes, term209191, args);
        assertTrue(recursiveEquals(term209191, term211037));
    }

};


