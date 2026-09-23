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

public class Element_appendElement_191958221025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1716;

    public Element_appendElement_191958221025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1738 = new ArrayList();
        ((ArrayList) term1738).add((Object)null);
        ((ArrayList) term1738).add((Object)null);
        ((ArrayList) term1738).add((Object)null);
        ((ArrayList) term1738).add((Object)null);
        ((ArrayList) term1738).add((Object)null);
        ((ArrayList) term1738).add((Object)null);
        ((ArrayList) term1738).add((Object)null);
        ((ArrayList) term1738).add((Object)null);
        ((ArrayList) term1738).add((Object)null);
        LinkedHashMap term1743 = new LinkedHashMap();
        term1716 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1717 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1742 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1717, term1717.getClass(), "tagName", "AdxvLJhNLe");
        setBooleanField(term1717, term1717.getClass(), "isBlock", true);
        setBooleanField(term1717, term1717.getClass(), "formatAsBlock", true);
        setBooleanField(term1717, term1717.getClass(), "canContainInline", true);
        setBooleanField(term1717, term1717.getClass(), "empty", false);
        setBooleanField(term1717, term1717.getClass(), "selfClosing", true);
        setBooleanField(term1717, term1717.getClass(), "preserveWhitespace", false);
        setBooleanField(term1717, term1717.getClass(), "formList", true);
        setBooleanField(term1717, term1717.getClass(), "formSubmit", true);
        setField(term1716, term1716.getClass(), "tag", term1717);
        setField(term1716, term1716.getClass(), "parentNode", null);
        setField(term1716, term1716.getClass(), "childNodes", term1738);
        setField(term1742, term1742.getClass(), "attributes", term1743);
        setField(term1716, term1716.getClass(), "attributes", term1742);
        setField(term1716, term1716.getClass(), "baseUri", "xIeFjkHkOe");
        setIntField(term1716, term1716.getClass(), "siblingIndex", -1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SdCKLMIYnX";
        callMethod(klass, "appendElement", argTypes, term1716, args);
    }

};


