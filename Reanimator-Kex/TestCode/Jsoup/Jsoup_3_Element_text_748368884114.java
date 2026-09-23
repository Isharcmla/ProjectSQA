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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_text_748368884114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5101;
     Object term49396;

    public Element_text_748368884114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5123 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5123, term5123.getClass(), "tagName", null);
        setBooleanField(term5123, term5123.getClass(), "isBlock", false);
        setBooleanField(term5123, term5123.getClass(), "canContainBlock", false);
        setBooleanField(term5123, term5123.getClass(), "canContainInline", false);
        setBooleanField(term5123, term5123.getClass(), "optionalClosing", true);
        setBooleanField(term5123, term5123.getClass(), "empty", false);
        setBooleanField(term5123, term5123.getClass(), "preserveWhitespace", false);
        setField(term5123, term5123.getClass(), "ancestors", null);
        Object term5130 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5130, term5130.getClass(), "tagName", null);
        setBooleanField(term5130, term5130.getClass(), "isBlock", true);
        setBooleanField(term5130, term5130.getClass(), "canContainBlock", false);
        setBooleanField(term5130, term5130.getClass(), "canContainInline", true);
        setBooleanField(term5130, term5130.getClass(), "optionalClosing", false);
        setBooleanField(term5130, term5130.getClass(), "empty", true);
        setBooleanField(term5130, term5130.getClass(), "preserveWhitespace", true);
        setField(term5130, term5130.getClass(), "ancestors", null);
        Object term5137 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5137, term5137.getClass(), "tagName", null);
        setBooleanField(term5137, term5137.getClass(), "isBlock", true);
        setBooleanField(term5137, term5137.getClass(), "canContainBlock", true);
        setBooleanField(term5137, term5137.getClass(), "canContainInline", true);
        setBooleanField(term5137, term5137.getClass(), "optionalClosing", false);
        setBooleanField(term5137, term5137.getClass(), "empty", true);
        setBooleanField(term5137, term5137.getClass(), "preserveWhitespace", true);
        setField(term5137, term5137.getClass(), "ancestors", null);
        Object term5144 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5144, term5144.getClass(), "tagName", null);
        setBooleanField(term5144, term5144.getClass(), "isBlock", false);
        setBooleanField(term5144, term5144.getClass(), "canContainBlock", false);
        setBooleanField(term5144, term5144.getClass(), "canContainInline", false);
        setBooleanField(term5144, term5144.getClass(), "optionalClosing", false);
        setBooleanField(term5144, term5144.getClass(), "empty", true);
        setBooleanField(term5144, term5144.getClass(), "preserveWhitespace", true);
        setField(term5144, term5144.getClass(), "ancestors", null);
        ArrayList term5121 = new ArrayList();
        ((ArrayList) term5121).add(term5123);
        ((ArrayList) term5121).add(term5130);
        ((ArrayList) term5121).add(term5123);
        ((ArrayList) term5121).add(term5137);
        ((ArrayList) term5121).add(term5144);
        HashMap term5154 = new HashMap();
        Set<Object> term49424 =  ((Map) term5154).keySet();
        HashSet term5153 = new HashSet((Collection<? extends Object>) term49424);
        ArrayList term5170 = new ArrayList();
        ((ArrayList) term5170).add((Object)null);
        ((ArrayList) term5170).add((Object)null);
        ((ArrayList) term5170).add((Object)null);
        LinkedHashMap term5175 = new LinkedHashMap();
        term5101 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5102 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5174 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5102, term5102.getClass(), "tagName", "PtIjKpiSix");
        setBooleanField(term5102, term5102.getClass(), "isBlock", false);
        setBooleanField(term5102, term5102.getClass(), "canContainBlock", false);
        setBooleanField(term5102, term5102.getClass(), "canContainInline", false);
        setBooleanField(term5102, term5102.getClass(), "optionalClosing", true);
        setBooleanField(term5102, term5102.getClass(), "empty", true);
        setBooleanField(term5102, term5102.getClass(), "preserveWhitespace", false);
        setField(term5102, term5102.getClass(), "ancestors", term5121);
        setField(term5101, term5101.getClass(), "tag", term5102);
        setField(term5101, term5101.getClass(), "classNames", term5153);
        setField(term5101, term5101.getClass(), "parentNode", null);
        setField(term5101, term5101.getClass(), "childNodes", term5170);
        setField(term5174, term5174.getClass(), "attributes", term5175);
        setField(term5101, term5101.getClass(), "attributes", term5174);
        setField(term5101, term5101.getClass(), "baseUri", "yIWXcOQTgy");
        Object term49402 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49402, term49402.getClass(), "tagName", null);
        setBooleanField(term49402, term49402.getClass(), "isBlock", false);
        setBooleanField(term49402, term49402.getClass(), "canContainBlock", false);
        setBooleanField(term49402, term49402.getClass(), "canContainInline", false);
        setBooleanField(term49402, term49402.getClass(), "optionalClosing", true);
        setBooleanField(term49402, term49402.getClass(), "empty", false);
        setBooleanField(term49402, term49402.getClass(), "preserveWhitespace", false);
        setField(term49402, term49402.getClass(), "ancestors", null);
        Object term49403 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49403, term49403.getClass(), "tagName", null);
        setBooleanField(term49403, term49403.getClass(), "isBlock", true);
        setBooleanField(term49403, term49403.getClass(), "canContainBlock", false);
        setBooleanField(term49403, term49403.getClass(), "canContainInline", true);
        setBooleanField(term49403, term49403.getClass(), "optionalClosing", false);
        setBooleanField(term49403, term49403.getClass(), "empty", true);
        setBooleanField(term49403, term49403.getClass(), "preserveWhitespace", true);
        setField(term49403, term49403.getClass(), "ancestors", null);
        Object term49404 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49404, term49404.getClass(), "tagName", null);
        setBooleanField(term49404, term49404.getClass(), "isBlock", true);
        setBooleanField(term49404, term49404.getClass(), "canContainBlock", true);
        setBooleanField(term49404, term49404.getClass(), "canContainInline", true);
        setBooleanField(term49404, term49404.getClass(), "optionalClosing", false);
        setBooleanField(term49404, term49404.getClass(), "empty", true);
        setBooleanField(term49404, term49404.getClass(), "preserveWhitespace", true);
        setField(term49404, term49404.getClass(), "ancestors", null);
        Object term49405 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term49405, term49405.getClass(), "tagName", null);
        setBooleanField(term49405, term49405.getClass(), "isBlock", false);
        setBooleanField(term49405, term49405.getClass(), "canContainBlock", false);
        setBooleanField(term49405, term49405.getClass(), "canContainInline", false);
        setBooleanField(term49405, term49405.getClass(), "optionalClosing", false);
        setBooleanField(term49405, term49405.getClass(), "empty", true);
        setBooleanField(term49405, term49405.getClass(), "preserveWhitespace", true);
        setField(term49405, term49405.getClass(), "ancestors", null);
        ArrayList term49400 = new ArrayList();
        ((ArrayList) term49400).add(term49402);
        ((ArrayList) term49400).add(term49403);
        ((ArrayList) term49400).add(term49402);
        ((ArrayList) term49400).add(term49404);
        ((ArrayList) term49400).add(term49405);
        HashMap term49407 = new HashMap();
        Set<Object> term49445 =  ((Map) term49407).keySet();
        HashSet term49406 = new HashSet((Collection<? extends Object>) term49445);
        ArrayList term49408 = new ArrayList();
        ((ArrayList) term49408).add((Object)null);
        ((ArrayList) term49408).add((Object)null);
        ((ArrayList) term49408).add((Object)null);
        LinkedHashMap term49411 = new LinkedHashMap();
        term49396 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term49397 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term49410 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term49397, term49397.getClass(), "tagName", "PtIjKpiSix");
        setBooleanField(term49397, term49397.getClass(), "isBlock", false);
        setBooleanField(term49397, term49397.getClass(), "canContainBlock", false);
        setBooleanField(term49397, term49397.getClass(), "canContainInline", false);
        setBooleanField(term49397, term49397.getClass(), "optionalClosing", true);
        setBooleanField(term49397, term49397.getClass(), "empty", true);
        setBooleanField(term49397, term49397.getClass(), "preserveWhitespace", false);
        setField(term49397, term49397.getClass(), "ancestors", term49400);
        setField(term49396, term49396.getClass(), "tag", term49397);
        setField(term49396, term49396.getClass(), "classNames", term49406);
        setField(term49396, term49396.getClass(), "parentNode", null);
        setField(term49396, term49396.getClass(), "childNodes", term49408);
        setField(term49410, term49410.getClass(), "attributes", term49411);
        setField(term49396, term49396.getClass(), "attributes", term49410);
        setField(term49396, term49396.getClass(), "baseUri", "yIWXcOQTgy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "text", argTypes, term5101, args);
        assertTrue(recursiveEquals(term5101, term49396));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


