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

public class HtmlTreeBuilder_popStackToClose_1309371195257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438836;
     Object term438944;

    public HtmlTreeBuilder_popStackToClose_1309371195257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term438836 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term438918 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term438836, term438836.getClass(), "stack", term438918);
        term438944 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term438945 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term438944, term438944.getClass(), "state", null);
        setField(term438944, term438944.getClass(), "originalState", null);
        setBooleanField(term438944, term438944.getClass(), "baseUriSetFromDoc", false);
        setField(term438944, term438944.getClass(), "headElement", null);
        setField(term438944, term438944.getClass(), "formElement", null);
        setField(term438944, term438944.getClass(), "contextElement", null);
        setField(term438944, term438944.getClass(), "formattingElements", null);
        setField(term438944, term438944.getClass(), "pendingTableCharacters", null);
        setBooleanField(term438944, term438944.getClass(), "framesetOk", false);
        setBooleanField(term438944, term438944.getClass(), "fosterInserts", false);
        setBooleanField(term438944, term438944.getClass(), "fragmentParsing", false);
        setField(term438944, term438944.getClass(), "reader", null);
        setField(term438944, term438944.getClass(), "tokeniser", null);
        setField(term438944, term438944.getClass(), "doc", null);
        setIntField(term438945, term438945.getClass(), "size", 0);
        setField(term438945, term438945.getClass(), "first", null);
        setField(term438945, term438945.getClass(), "last", null);
        setIntField(term438945, term438945.getClass(), "modCount", 0);
        setField(term438944, term438944.getClass(), "stack", term438945);
        setField(term438944, term438944.getClass(), "baseUri", null);
        setField(term438944, term438944.getClass(), "currentToken", null);
        setField(term438944, term438944.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToClose", argTypes, term438836, args);
        assertTrue(recursiveEquals(term438836, term438944));
    }

};


