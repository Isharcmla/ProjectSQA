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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class HtmlTreeBuilder_toString_1404444971324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233281;
     Object term233758;

    public HtmlTreeBuilder_toString_1404444971324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term233765 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term233764 = ((Class) term233765).getDeclaredField((String) "InTable");
        ((Field) term233764).setAccessible(true);
        Object enum575 = ((Field) term233764).get((Object) null);
        ArrayList term233455 = new ArrayList();
        term233281 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term233281, term233281.getClass(), "currentToken", null);
        setField(term233281, term233281.getClass(), "state", enum575);
        setField(term233281, term233281.getClass(), "stack", term233455);
        Class<? extends Object> term233978 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term233977 = ((Class) term233978).getDeclaredField((String) "InTable");
        ((Field) term233977).setAccessible(true);
        Object enum576 = ((Field) term233977).get((Object) null);
        ArrayList term233762 = new ArrayList();
        term233758 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term233758, term233758.getClass(), "state", enum576);
        setField(term233758, term233758.getClass(), "originalState", null);
        setBooleanField(term233758, term233758.getClass(), "baseUriSetFromDoc", false);
        setField(term233758, term233758.getClass(), "headElement", null);
        setField(term233758, term233758.getClass(), "formElement", null);
        setField(term233758, term233758.getClass(), "contextElement", null);
        setField(term233758, term233758.getClass(), "formattingElements", null);
        setField(term233758, term233758.getClass(), "pendingTableCharacters", null);
        setField(term233758, term233758.getClass(), "emptyEnd", null);
        setBooleanField(term233758, term233758.getClass(), "framesetOk", false);
        setBooleanField(term233758, term233758.getClass(), "fosterInserts", false);
        setBooleanField(term233758, term233758.getClass(), "fragmentParsing", false);
        setField(term233758, term233758.getClass(), "specificScopeTarget", null);
        setField(term233758, term233758.getClass(), "reader", null);
        setField(term233758, term233758.getClass(), "tokeniser", null);
        setField(term233758, term233758.getClass(), "doc", null);
        setField(term233758, term233758.getClass(), "stack", term233762);
        setField(term233758, term233758.getClass(), "baseUri", null);
        setField(term233758, term233758.getClass(), "currentToken", null);
        setField(term233758, term233758.getClass(), "errors", null);
        setField(term233758, term233758.getClass(), "settings", null);
        setField(term233758, term233758.getClass(), "start", null);
        setField(term233758, term233758.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term233281, args);
        assertTrue(recursiveEquals(term233281, term233758));
        assertTrue(recursiveEquals(retValue, "TreeBuilder{currentToken=null, state=InTable, currentElement=null}"));
    }

};


