package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsContainingText_2847184156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4935;
     Object term31076;
     Object term31072;

    public Element_getElementsContainingText_2847184156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4957 = new ArrayList();
        ((ArrayList) term4957).add((Object)null);
        ((ArrayList) term4957).add((Object)null);
        ((ArrayList) term4957).add((Object)null);
        ((ArrayList) term4957).add((Object)null);
        LinkedHashMap term4962 = new LinkedHashMap();
        term4935 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4936 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4961 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4936, term4936.getClass(), "tagName", "PJcSNDruWd");
        setBooleanField(term4936, term4936.getClass(), "isBlock", true);
        setBooleanField(term4936, term4936.getClass(), "formatAsBlock", true);
        setBooleanField(term4936, term4936.getClass(), "canContainInline", false);
        setBooleanField(term4936, term4936.getClass(), "empty", false);
        setBooleanField(term4936, term4936.getClass(), "selfClosing", true);
        setBooleanField(term4936, term4936.getClass(), "preserveWhitespace", true);
        setBooleanField(term4936, term4936.getClass(), "formList", false);
        setBooleanField(term4936, term4936.getClass(), "formSubmit", true);
        setField(term4935, term4935.getClass(), "tag", term4936);
        setField(term4935, term4935.getClass(), "parentNode", null);
        setField(term4935, term4935.getClass(), "childNodes", term4957);
        setField(term4961, term4961.getClass(), "attributes", term4962);
        setField(term4935, term4935.getClass(), "attributes", term4961);
        setField(term4935, term4935.getClass(), "baseUri", "lZIgPZPgTu");
        setIntField(term4935, term4935.getClass(), "siblingIndex", 941650513);
        ArrayList term31080 = new ArrayList();
        ((ArrayList) term31080).add((Object)null);
        ((ArrayList) term31080).add((Object)null);
        ((ArrayList) term31080).add((Object)null);
        ((ArrayList) term31080).add((Object)null);
        LinkedHashMap term31083 = new LinkedHashMap();
        term31076 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term31077 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term31082 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term31077, term31077.getClass(), "tagName", "PJcSNDruWd");
        setBooleanField(term31077, term31077.getClass(), "isBlock", true);
        setBooleanField(term31077, term31077.getClass(), "formatAsBlock", true);
        setBooleanField(term31077, term31077.getClass(), "canContainInline", false);
        setBooleanField(term31077, term31077.getClass(), "empty", false);
        setBooleanField(term31077, term31077.getClass(), "selfClosing", true);
        setBooleanField(term31077, term31077.getClass(), "preserveWhitespace", true);
        setBooleanField(term31077, term31077.getClass(), "formList", false);
        setBooleanField(term31077, term31077.getClass(), "formSubmit", true);
        setField(term31076, term31076.getClass(), "tag", term31077);
        setField(term31076, term31076.getClass(), "parentNode", null);
        setField(term31076, term31076.getClass(), "childNodes", term31080);
        setField(term31082, term31082.getClass(), "attributes", term31083);
        setField(term31076, term31076.getClass(), "attributes", term31082);
        setField(term31076, term31076.getClass(), "baseUri", "lZIgPZPgTu");
        setIntField(term31076, term31076.getClass(), "siblingIndex", 941650513);
        term31072 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term31073 = (Object[]) newArray("java.lang.Object", 0);
        setField(term31072, term31072.getClass(), "elementData", term31073);
        setIntField(term31072, term31072.getClass(), "size", 0);
        setIntField(term31072, term31072.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iuCxnHGMoW";
        Object retValue = callMethod(klass, "getElementsContainingText", argTypes, term4935, args);
        assertTrue(recursiveEquals(term4935, term31076));
        assertTrue(recursiveEquals(retValue, term31072));
    }

};


