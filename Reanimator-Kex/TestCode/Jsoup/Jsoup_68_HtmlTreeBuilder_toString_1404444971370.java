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

public class HtmlTreeBuilder_toString_1404444971370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298595;
     Object term299069;

    public HtmlTreeBuilder_toString_1404444971370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term299076 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term299075 = ((Class) term299076).getDeclaredField((String) "InHead");
        ((Field) term299075).setAccessible(true);
        Object enum584 = ((Field) term299075).get((Object) null);
        ArrayList term298771 = new ArrayList();
        term298595 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term298595, term298595.getClass(), "currentToken", null);
        setField(term298595, term298595.getClass(), "state", enum584);
        setField(term298595, term298595.getClass(), "stack", term298771);
        Class<? extends Object> term299286 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term299285 = ((Class) term299286).getDeclaredField((String) "InHead");
        ((Field) term299285).setAccessible(true);
        Object enum585 = ((Field) term299285).get((Object) null);
        ArrayList term299073 = new ArrayList();
        term299069 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term299069, term299069.getClass(), "state", enum585);
        setField(term299069, term299069.getClass(), "originalState", null);
        setBooleanField(term299069, term299069.getClass(), "baseUriSetFromDoc", false);
        setField(term299069, term299069.getClass(), "headElement", null);
        setField(term299069, term299069.getClass(), "formElement", null);
        setField(term299069, term299069.getClass(), "contextElement", null);
        setField(term299069, term299069.getClass(), "formattingElements", null);
        setField(term299069, term299069.getClass(), "pendingTableCharacters", null);
        setField(term299069, term299069.getClass(), "emptyEnd", null);
        setBooleanField(term299069, term299069.getClass(), "framesetOk", false);
        setBooleanField(term299069, term299069.getClass(), "fosterInserts", false);
        setBooleanField(term299069, term299069.getClass(), "fragmentParsing", false);
        setField(term299069, term299069.getClass(), "specificScopeTarget", null);
        setField(term299069, term299069.getClass(), "reader", null);
        setField(term299069, term299069.getClass(), "tokeniser", null);
        setField(term299069, term299069.getClass(), "doc", null);
        setField(term299069, term299069.getClass(), "stack", term299073);
        setField(term299069, term299069.getClass(), "baseUri", null);
        setField(term299069, term299069.getClass(), "currentToken", null);
        setField(term299069, term299069.getClass(), "errors", null);
        setField(term299069, term299069.getClass(), "settings", null);
        setField(term299069, term299069.getClass(), "start", null);
        setField(term299069, term299069.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term298595, args);
        assertTrue(recursiveEquals(term298595, term299069));
        assertTrue(recursiveEquals(retValue, "TreeBuilder{currentToken=null, state=InHead, currentElement=null}"));
    }

};


