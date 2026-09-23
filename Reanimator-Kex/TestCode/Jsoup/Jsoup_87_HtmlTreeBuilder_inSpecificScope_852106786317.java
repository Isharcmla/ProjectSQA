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

public class HtmlTreeBuilder_inSpecificScope_852106786317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492202;
     Object term492267;

    public HtmlTreeBuilder_inSpecificScope_852106786317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term492254 = new ArrayList();
        term492202 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term492202, term492202.getClass(), "stack", term492254);
        ArrayList term492268 = new ArrayList();
        term492267 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term492267, term492267.getClass(), "state", null);
        setField(term492267, term492267.getClass(), "originalState", null);
        setBooleanField(term492267, term492267.getClass(), "baseUriSetFromDoc", false);
        setField(term492267, term492267.getClass(), "headElement", null);
        setField(term492267, term492267.getClass(), "formElement", null);
        setField(term492267, term492267.getClass(), "contextElement", null);
        setField(term492267, term492267.getClass(), "formattingElements", null);
        setField(term492267, term492267.getClass(), "pendingTableCharacters", null);
        setField(term492267, term492267.getClass(), "emptyEnd", null);
        setBooleanField(term492267, term492267.getClass(), "framesetOk", false);
        setBooleanField(term492267, term492267.getClass(), "fosterInserts", false);
        setBooleanField(term492267, term492267.getClass(), "fragmentParsing", false);
        setField(term492267, term492267.getClass(), "specificScopeTarget", null);
        setField(term492267, term492267.getClass(), "parser", null);
        setField(term492267, term492267.getClass(), "reader", null);
        setField(term492267, term492267.getClass(), "tokeniser", null);
        setField(term492267, term492267.getClass(), "doc", null);
        setField(term492267, term492267.getClass(), "stack", term492268);
        setField(term492267, term492267.getClass(), "baseUri", null);
        setField(term492267, term492267.getClass(), "currentToken", null);
        setField(term492267, term492267.getClass(), "settings", null);
        setField(term492267, term492267.getClass(), "start", null);
        setField(term492267, term492267.getClass(), "end", null);
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
        Object retValue = callMethod(klass, "inSpecificScope", argTypes, term492202, args);
        assertTrue(recursiveEquals(term492202, term492267));
        assertTrue(recursiveEquals(retValue, false));
    }

};


