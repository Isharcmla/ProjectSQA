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

public class HtmlTreeBuilder_originalState_1371512870114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13131;
     Object term129856;

    public HtmlTreeBuilder_originalState_1371512870114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13131 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term13131, term13131.getClass(), "state", null);
        setField(term13131, term13131.getClass(), "originalState", null);
        setBooleanField(term13131, term13131.getClass(), "baseUriSetFromDoc", false);
        setField(term13131, term13131.getClass(), "headElement", null);
        setField(term13131, term13131.getClass(), "formElement", null);
        setField(term13131, term13131.getClass(), "contextElement", null);
        setField(term13131, term13131.getClass(), "formattingElements", null);
        setField(term13131, term13131.getClass(), "pendingTableCharacters", null);
        setField(term13131, term13131.getClass(), "emptyEnd", null);
        setBooleanField(term13131, term13131.getClass(), "framesetOk", false);
        setBooleanField(term13131, term13131.getClass(), "fosterInserts", false);
        setBooleanField(term13131, term13131.getClass(), "fragmentParsing", false);
        setField(term13131, term13131.getClass(), "specificScopeTarget", null);
        setField(term13131, term13131.getClass(), "parser", null);
        setField(term13131, term13131.getClass(), "reader", null);
        setField(term13131, term13131.getClass(), "tokeniser", null);
        setField(term13131, term13131.getClass(), "doc", null);
        setField(term13131, term13131.getClass(), "stack", null);
        setField(term13131, term13131.getClass(), "baseUri", null);
        setField(term13131, term13131.getClass(), "currentToken", null);
        setField(term13131, term13131.getClass(), "settings", null);
        setField(term13131, term13131.getClass(), "start", null);
        setField(term13131, term13131.getClass(), "end", null);
        term129856 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term129856, term129856.getClass(), "state", null);
        setField(term129856, term129856.getClass(), "originalState", null);
        setBooleanField(term129856, term129856.getClass(), "baseUriSetFromDoc", false);
        setField(term129856, term129856.getClass(), "headElement", null);
        setField(term129856, term129856.getClass(), "formElement", null);
        setField(term129856, term129856.getClass(), "contextElement", null);
        setField(term129856, term129856.getClass(), "formattingElements", null);
        setField(term129856, term129856.getClass(), "pendingTableCharacters", null);
        setField(term129856, term129856.getClass(), "emptyEnd", null);
        setBooleanField(term129856, term129856.getClass(), "framesetOk", false);
        setBooleanField(term129856, term129856.getClass(), "fosterInserts", false);
        setBooleanField(term129856, term129856.getClass(), "fragmentParsing", false);
        setField(term129856, term129856.getClass(), "specificScopeTarget", null);
        setField(term129856, term129856.getClass(), "parser", null);
        setField(term129856, term129856.getClass(), "reader", null);
        setField(term129856, term129856.getClass(), "tokeniser", null);
        setField(term129856, term129856.getClass(), "doc", null);
        setField(term129856, term129856.getClass(), "stack", null);
        setField(term129856, term129856.getClass(), "baseUri", null);
        setField(term129856, term129856.getClass(), "currentToken", null);
        setField(term129856, term129856.getClass(), "settings", null);
        setField(term129856, term129856.getClass(), "start", null);
        setField(term129856, term129856.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "originalState", argTypes, term13131, args);
        assertTrue(recursiveEquals(term13131, term129856));
        assertTrue(recursiveEquals(retValue, null));
    }

};


