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

public class HtmlTreeBuilder_lastFormattingElement_1625168298284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269649;
     Object term269712;

    public HtmlTreeBuilder_lastFormattingElement_1625168298284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term269701 = new ArrayList();
        term269649 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term269649, term269649.getClass(), "formattingElements", term269701);
        ArrayList term269713 = new ArrayList();
        term269712 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term269712, term269712.getClass(), "state", null);
        setField(term269712, term269712.getClass(), "originalState", null);
        setBooleanField(term269712, term269712.getClass(), "baseUriSetFromDoc", false);
        setField(term269712, term269712.getClass(), "headElement", null);
        setField(term269712, term269712.getClass(), "formElement", null);
        setField(term269712, term269712.getClass(), "contextElement", null);
        setField(term269712, term269712.getClass(), "formattingElements", term269713);
        setField(term269712, term269712.getClass(), "pendingTableCharacters", null);
        setField(term269712, term269712.getClass(), "emptyEnd", null);
        setBooleanField(term269712, term269712.getClass(), "framesetOk", false);
        setBooleanField(term269712, term269712.getClass(), "fosterInserts", false);
        setBooleanField(term269712, term269712.getClass(), "fragmentParsing", false);
        setField(term269712, term269712.getClass(), "specificScopeTarget", null);
        setField(term269712, term269712.getClass(), "reader", null);
        setField(term269712, term269712.getClass(), "tokeniser", null);
        setField(term269712, term269712.getClass(), "doc", null);
        setField(term269712, term269712.getClass(), "stack", null);
        setField(term269712, term269712.getClass(), "baseUri", null);
        setField(term269712, term269712.getClass(), "currentToken", null);
        setField(term269712, term269712.getClass(), "errors", null);
        setField(term269712, term269712.getClass(), "settings", null);
        setField(term269712, term269712.getClass(), "start", null);
        setField(term269712, term269712.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "lastFormattingElement", argTypes, term269649, args);
        assertTrue(recursiveEquals(term269649, term269712));
        assertTrue(recursiveEquals(retValue, null));
    }

};


