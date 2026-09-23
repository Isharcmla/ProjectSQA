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

public class HtmlTreeBuilder_popStackToClose_1309371195212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249491;
     Object term249554;

    public HtmlTreeBuilder_popStackToClose_1309371195212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term249543 = new ArrayList();
        term249491 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term249491, term249491.getClass(), "stack", term249543);
        ArrayList term249555 = new ArrayList();
        term249554 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term249554, term249554.getClass(), "state", null);
        setField(term249554, term249554.getClass(), "originalState", null);
        setBooleanField(term249554, term249554.getClass(), "baseUriSetFromDoc", false);
        setField(term249554, term249554.getClass(), "headElement", null);
        setField(term249554, term249554.getClass(), "formElement", null);
        setField(term249554, term249554.getClass(), "contextElement", null);
        setField(term249554, term249554.getClass(), "formattingElements", null);
        setField(term249554, term249554.getClass(), "pendingTableCharacters", null);
        setField(term249554, term249554.getClass(), "emptyEnd", null);
        setBooleanField(term249554, term249554.getClass(), "framesetOk", false);
        setBooleanField(term249554, term249554.getClass(), "fosterInserts", false);
        setBooleanField(term249554, term249554.getClass(), "fragmentParsing", false);
        setField(term249554, term249554.getClass(), "specificScopeTarget", null);
        setField(term249554, term249554.getClass(), "reader", null);
        setField(term249554, term249554.getClass(), "tokeniser", null);
        setField(term249554, term249554.getClass(), "doc", null);
        setField(term249554, term249554.getClass(), "stack", term249555);
        setField(term249554, term249554.getClass(), "baseUri", null);
        setField(term249554, term249554.getClass(), "currentToken", null);
        setField(term249554, term249554.getClass(), "errors", null);
        setField(term249554, term249554.getClass(), "settings", null);
        setField(term249554, term249554.getClass(), "start", null);
        setField(term249554, term249554.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToClose", argTypes, term249491, args);
        assertTrue(recursiveEquals(term249491, term249554));
    }

};


