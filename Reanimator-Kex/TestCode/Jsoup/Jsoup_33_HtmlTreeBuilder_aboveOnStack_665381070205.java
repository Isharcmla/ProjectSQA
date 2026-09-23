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

public class HtmlTreeBuilder_aboveOnStack_665381070205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413880;
     Object term414016;
     Object term414045;
     Object term414047;

    public HtmlTreeBuilder_aboveOnStack_665381070205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term413880 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term413962 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term413880, term413880.getClass(), "stack", term413962);
        term414016 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        term414045 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term414046 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term414045, term414045.getClass(), "state", null);
        setField(term414045, term414045.getClass(), "originalState", null);
        setBooleanField(term414045, term414045.getClass(), "baseUriSetFromDoc", false);
        setField(term414045, term414045.getClass(), "headElement", null);
        setField(term414045, term414045.getClass(), "formElement", null);
        setField(term414045, term414045.getClass(), "contextElement", null);
        setField(term414045, term414045.getClass(), "formattingElements", null);
        setField(term414045, term414045.getClass(), "pendingTableCharacters", null);
        setBooleanField(term414045, term414045.getClass(), "framesetOk", false);
        setBooleanField(term414045, term414045.getClass(), "fosterInserts", false);
        setBooleanField(term414045, term414045.getClass(), "fragmentParsing", false);
        setField(term414045, term414045.getClass(), "reader", null);
        setField(term414045, term414045.getClass(), "tokeniser", null);
        setField(term414045, term414045.getClass(), "doc", null);
        setIntField(term414046, term414046.getClass(), "size", 0);
        setField(term414046, term414046.getClass(), "first", null);
        setField(term414046, term414046.getClass(), "last", null);
        setIntField(term414046, term414046.getClass(), "modCount", 0);
        setField(term414045, term414045.getClass(), "stack", term414046);
        setField(term414045, term414045.getClass(), "baseUri", null);
        setField(term414045, term414045.getClass(), "currentToken", null);
        setField(term414045, term414045.getClass(), "errors", null);
        term414047 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term414047, term414047.getClass(), "outputSettings", null);
        setField(term414047, term414047.getClass(), "quirksMode", null);
        setField(term414047, term414047.getClass(), "tag", null);
        setField(term414047, term414047.getClass(), "classNames", null);
        setField(term414047, term414047.getClass(), "parentNode", null);
        setField(term414047, term414047.getClass(), "childNodes", null);
        setField(term414047, term414047.getClass(), "attributes", null);
        setField(term414047, term414047.getClass(), "baseUri", null);
        setIntField(term414047, term414047.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term414016;
        Object retValue = callMethod(klass, "aboveOnStack", argTypes, term413880, args);
        assertTrue(recursiveEquals(term413880, term414045));
        assertTrue(recursiveEquals(term414016, term414047));
        assertTrue(recursiveEquals(retValue, null));
    }

};


