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
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_appendElement_191958221021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1454;

    public Element_appendElement_191958221021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1477 = new ArrayList();
        ((ArrayList) term1477).add((Object)null);
        ((ArrayList) term1477).add((Object)null);
        ((ArrayList) term1477).add((Object)null);
        ((ArrayList) term1477).add((Object)null);
        ((ArrayList) term1477).add((Object)null);
        ((ArrayList) term1477).add((Object)null);
        LinkedHashMap term1482 = new LinkedHashMap();
        term1454 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1455 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1481 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1455, term1455.getClass(), "tagName", "xBsXSDjXYK");
        setBooleanField(term1455, term1455.getClass(), "isBlock", false);
        setBooleanField(term1455, term1455.getClass(), "formatAsBlock", false);
        setBooleanField(term1455, term1455.getClass(), "canContainBlock", false);
        setBooleanField(term1455, term1455.getClass(), "canContainInline", false);
        setBooleanField(term1455, term1455.getClass(), "empty", true);
        setBooleanField(term1455, term1455.getClass(), "selfClosing", true);
        setBooleanField(term1455, term1455.getClass(), "preserveWhitespace", true);
        setBooleanField(term1455, term1455.getClass(), "formList", false);
        setBooleanField(term1455, term1455.getClass(), "formSubmit", true);
        setField(term1454, term1454.getClass(), "tag", term1455);
        setField(term1454, term1454.getClass(), "parentNode", null);
        setField(term1454, term1454.getClass(), "childNodes", term1477);
        setField(term1481, term1481.getClass(), "attributes", term1482);
        setField(term1454, term1454.getClass(), "attributes", term1481);
        setField(term1454, term1454.getClass(), "baseUri", "eVpkWxjuki");
        setIntField(term1454, term1454.getClass(), "siblingIndex", -6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SJiQaLvSKv";
        callMethod(klass, "appendElement", argTypes, term1454, args);
    }

};


