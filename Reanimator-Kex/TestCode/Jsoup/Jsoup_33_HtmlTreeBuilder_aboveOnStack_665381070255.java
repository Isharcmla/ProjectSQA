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
import java.lang.Object;

public class HtmlTreeBuilder_aboveOnStack_665381070255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438556;
     Object term438698;
     Object term438727;
     Object term438729;

    public HtmlTreeBuilder_aboveOnStack_665381070255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term438556 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term438638 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term438556, term438556.getClass(), "stack", term438638);
        term438698 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        term438727 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term438728 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term438727, term438727.getClass(), "state", null);
        setField(term438727, term438727.getClass(), "originalState", null);
        setBooleanField(term438727, term438727.getClass(), "baseUriSetFromDoc", false);
        setField(term438727, term438727.getClass(), "headElement", null);
        setField(term438727, term438727.getClass(), "formElement", null);
        setField(term438727, term438727.getClass(), "contextElement", null);
        setField(term438727, term438727.getClass(), "formattingElements", null);
        setField(term438727, term438727.getClass(), "pendingTableCharacters", null);
        setBooleanField(term438727, term438727.getClass(), "framesetOk", false);
        setBooleanField(term438727, term438727.getClass(), "fosterInserts", false);
        setBooleanField(term438727, term438727.getClass(), "fragmentParsing", false);
        setField(term438727, term438727.getClass(), "reader", null);
        setField(term438727, term438727.getClass(), "tokeniser", null);
        setField(term438727, term438727.getClass(), "doc", null);
        setIntField(term438728, term438728.getClass(), "size", 0);
        setField(term438728, term438728.getClass(), "first", null);
        setField(term438728, term438728.getClass(), "last", null);
        setIntField(term438728, term438728.getClass(), "modCount", 0);
        setField(term438727, term438727.getClass(), "stack", term438728);
        setField(term438727, term438727.getClass(), "baseUri", null);
        setField(term438727, term438727.getClass(), "currentToken", null);
        setField(term438727, term438727.getClass(), "errors", null);
        term438729 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term438729, term438729.getClass(), "elements", null);
        setField(term438729, term438729.getClass(), "tag", null);
        setField(term438729, term438729.getClass(), "classNames", null);
        setField(term438729, term438729.getClass(), "parentNode", null);
        setField(term438729, term438729.getClass(), "childNodes", null);
        setField(term438729, term438729.getClass(), "attributes", null);
        setField(term438729, term438729.getClass(), "baseUri", null);
        setIntField(term438729, term438729.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term438698;
        Object retValue = callMethod(klass, "aboveOnStack", argTypes, term438556, args);
        assertTrue(recursiveEquals(term438556, term438727));
        assertTrue(recursiveEquals(term438698, term438729));
        assertTrue(recursiveEquals(retValue, null));
    }

};


