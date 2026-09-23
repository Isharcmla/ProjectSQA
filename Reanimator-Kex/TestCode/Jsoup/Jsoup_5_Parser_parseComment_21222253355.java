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
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashMap;

public class Parser_parseComment_21222253355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term538;

    public Parser_parseComment_21222253355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term554 = new HashSet();
        ArrayList term555 = new ArrayList();
        ((ArrayList) term555).add((Object)null);
        ((ArrayList) term555).add((Object)null);
        Object term542 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term543 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term558 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term543, term543.getClass(), "tagName", null);
        setBooleanField(term543, term543.getClass(), "knownTag", true);
        setBooleanField(term543, term543.getClass(), "isBlock", false);
        setBooleanField(term543, term543.getClass(), "canContainBlock", true);
        setBooleanField(term543, term543.getClass(), "canContainInline", false);
        setBooleanField(term543, term543.getClass(), "optionalClosing", true);
        setBooleanField(term543, term543.getClass(), "empty", false);
        setBooleanField(term543, term543.getClass(), "selfClosing", false);
        setBooleanField(term543, term543.getClass(), "preserveWhitespace", true);
        setField(term543, term543.getClass(), "ancestors", null);
        setField(term543, term543.getClass(), "excludes", null);
        setBooleanField(term543, term543.getClass(), "directDescendant", false);
        setBooleanField(term543, term543.getClass(), "limitChildren", true);
        setField(term542, term542.getClass(), "tag", term543);
        setField(term542, term542.getClass(), "classNames", term554);
        setField(term542, term542.getClass(), "parentNode", null);
        setField(term542, term542.getClass(), "childNodes", term555);
        setField(term558, term558.getClass(), "attributes", null);
        setField(term542, term542.getClass(), "attributes", term558);
        setField(term542, term542.getClass(), "baseUri", "");
        setIntField(term542, term542.getClass(), "siblingIndex", -2038273078);
        Object term562 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term562, term562.getClass(), "tag", null);
        setField(term562, term562.getClass(), "classNames", null);
        setField(term562, term562.getClass(), "parentNode", null);
        setField(term562, term562.getClass(), "childNodes", null);
        setField(term562, term562.getClass(), "attributes", null);
        setField(term562, term562.getClass(), "baseUri", null);
        setIntField(term562, term562.getClass(), "siblingIndex", 1227103734);
        LinkedList term539 = new LinkedList();
        ((LinkedList) term539).add(term542);
        ((LinkedList) term539).add(term562);
        ((LinkedList) term539).add((Object)null);
        ((LinkedList) term539).add((Object)null);
        Class<? extends Object> term691 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term690 = ((Class) term691).getDeclaredField((String) "base");
        ((Field) term690).setAccessible(true);
        Object enum1 = ((Field) term690).get((Object) null);
        ArrayList term626 = new ArrayList();
        ((ArrayList) term626).add((Object)null);
        Object term567 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term567, term567.getClass(), "tagName", null);
        setBooleanField(term567, term567.getClass(), "knownTag", false);
        setBooleanField(term567, term567.getClass(), "isBlock", false);
        setBooleanField(term567, term567.getClass(), "canContainBlock", false);
        setBooleanField(term567, term567.getClass(), "canContainInline", false);
        setBooleanField(term567, term567.getClass(), "optionalClosing", true);
        setBooleanField(term567, term567.getClass(), "empty", false);
        setBooleanField(term567, term567.getClass(), "selfClosing", false);
        setBooleanField(term567, term567.getClass(), "preserveWhitespace", true);
        setField(term567, term567.getClass(), "ancestors", null);
        setField(term567, term567.getClass(), "excludes", null);
        setBooleanField(term567, term567.getClass(), "directDescendant", true);
        setBooleanField(term567, term567.getClass(), "limitChildren", false);
        ArrayList term630 = new ArrayList();
        ((ArrayList) term630).add((Object)null);
        ((ArrayList) term630).add(term567);
        ((ArrayList) term630).add(term567);
        ((ArrayList) term630).add((Object)null);
        HashMap term637 = new HashMap();
        Set<Object> term894 =  ((Map) term637).keySet();
        HashSet term636 = new HashSet((Collection<? extends Object>) term894);
        ArrayList term643 = new ArrayList();
        ((ArrayList) term643).add((Object)null);
        LinkedHashMap term648 = new LinkedHashMap();
        term538 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term586 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        Object term600 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term601 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term605 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term647 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term538, term538.getClass(), "stack", term539);
        setField(term586, term586.getClass(), "queue", "KoyGrUJeJW");
        setIntField(term586, term586.getClass(), "pos", -522618178);
        setField(term538, term538.getClass(), "tq", term586);
        setField(term601, term601.getClass(), "escapeMode", enum1);
        setField(term601, term601.getClass(), "charset", null);
        setField(term601, term601.getClass(), "charsetEncoder", null);
        setField(term601, term601.getClass(), "this$0", null);
        setField(term600, term600.getClass(), "outputSettings", term601);
        setField(term605, term605.getClass(), "tagName", "tShwQLRGNe");
        setBooleanField(term605, term605.getClass(), "knownTag", true);
        setBooleanField(term605, term605.getClass(), "isBlock", true);
        setBooleanField(term605, term605.getClass(), "canContainBlock", true);
        setBooleanField(term605, term605.getClass(), "canContainInline", true);
        setBooleanField(term605, term605.getClass(), "optionalClosing", false);
        setBooleanField(term605, term605.getClass(), "empty", false);
        setBooleanField(term605, term605.getClass(), "selfClosing", true);
        setBooleanField(term605, term605.getClass(), "preserveWhitespace", true);
        setField(term605, term605.getClass(), "ancestors", term626);
        setField(term605, term605.getClass(), "excludes", term630);
        setBooleanField(term605, term605.getClass(), "directDescendant", false);
        setBooleanField(term605, term605.getClass(), "limitChildren", false);
        setField(term600, term600.getClass(), "tag", term605);
        setField(term600, term600.getClass(), "classNames", term636);
        setField(term600, term600.getClass(), "parentNode", null);
        setField(term600, term600.getClass(), "childNodes", term643);
        setField(term647, term647.getClass(), "attributes", term648);
        setField(term600, term600.getClass(), "attributes", term647);
        setField(term600, term600.getClass(), "baseUri", "wGmYcqUkgE");
        setIntField(term600, term600.getClass(), "siblingIndex", 1134449235);
        setField(term538, term538.getClass(), "doc", term600);
        setField(term538, term538.getClass(), "baseUri", "idgaQsnJpQ");
        setBooleanField(term538, term538.getClass(), "relaxed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parseComment", argTypes, term538, args);
    }

};


