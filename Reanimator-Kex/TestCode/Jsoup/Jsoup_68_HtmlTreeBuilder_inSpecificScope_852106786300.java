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

public class HtmlTreeBuilder_inSpecificScope_852106786300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271665;
     Object term271773;

    public HtmlTreeBuilder_inSpecificScope_852106786300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term271717 = new ArrayList();
        term271665 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term271665, term271665.getClass(), "stack", term271717);
        ArrayList term271774 = new ArrayList();
        term271773 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term271773, term271773.getClass(), "state", null);
        setField(term271773, term271773.getClass(), "originalState", null);
        setBooleanField(term271773, term271773.getClass(), "baseUriSetFromDoc", false);
        setField(term271773, term271773.getClass(), "headElement", null);
        setField(term271773, term271773.getClass(), "formElement", null);
        setField(term271773, term271773.getClass(), "contextElement", null);
        setField(term271773, term271773.getClass(), "formattingElements", null);
        setField(term271773, term271773.getClass(), "pendingTableCharacters", null);
        setField(term271773, term271773.getClass(), "emptyEnd", null);
        setBooleanField(term271773, term271773.getClass(), "framesetOk", false);
        setBooleanField(term271773, term271773.getClass(), "fosterInserts", false);
        setBooleanField(term271773, term271773.getClass(), "fragmentParsing", false);
        setField(term271773, term271773.getClass(), "specificScopeTarget", null);
        setField(term271773, term271773.getClass(), "reader", null);
        setField(term271773, term271773.getClass(), "tokeniser", null);
        setField(term271773, term271773.getClass(), "doc", null);
        setField(term271773, term271773.getClass(), "stack", term271774);
        setField(term271773, term271773.getClass(), "baseUri", null);
        setField(term271773, term271773.getClass(), "currentToken", null);
        setField(term271773, term271773.getClass(), "errors", null);
        setField(term271773, term271773.getClass(), "settings", null);
        setField(term271773, term271773.getClass(), "start", null);
        setField(term271773, term271773.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "inSpecificScope", argTypes, term271665, args);
        assertTrue(recursiveEquals(term271665, term271773));
        assertTrue(recursiveEquals(retValue, false));
    }

};


