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

public class Element_getElementsMatchingOwnText_210255518564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5411;

    public Element_getElementsMatchingOwnText_210255518564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5434 = new ArrayList();
        ((ArrayList) term5434).add((Object)null);
        ((ArrayList) term5434).add((Object)null);
        ((ArrayList) term5434).add((Object)null);
        ((ArrayList) term5434).add((Object)null);
        ((ArrayList) term5434).add((Object)null);
        ((ArrayList) term5434).add((Object)null);
        ((ArrayList) term5434).add((Object)null);
        LinkedHashMap term5439 = new LinkedHashMap();
        term5411 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5412 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5438 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5412, term5412.getClass(), "tagName", "mLwibAPEsa");
        setBooleanField(term5412, term5412.getClass(), "isBlock", false);
        setBooleanField(term5412, term5412.getClass(), "formatAsBlock", false);
        setBooleanField(term5412, term5412.getClass(), "canContainBlock", true);
        setBooleanField(term5412, term5412.getClass(), "canContainInline", true);
        setBooleanField(term5412, term5412.getClass(), "empty", true);
        setBooleanField(term5412, term5412.getClass(), "selfClosing", true);
        setBooleanField(term5412, term5412.getClass(), "preserveWhitespace", false);
        setBooleanField(term5412, term5412.getClass(), "formList", false);
        setBooleanField(term5412, term5412.getClass(), "formSubmit", false);
        setField(term5411, term5411.getClass(), "tag", term5412);
        setField(term5411, term5411.getClass(), "parentNode", null);
        setField(term5411, term5411.getClass(), "childNodes", term5434);
        setField(term5438, term5438.getClass(), "attributes", term5439);
        setField(term5411, term5411.getClass(), "attributes", term5438);
        setField(term5411, term5411.getClass(), "baseUri", "MeTmRZXErV");
        setIntField(term5411, term5411.getClass(), "siblingIndex", -1565502840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jNxbVmoZgq";
        callMethod(klass, "getElementsMatchingOwnText", argTypes, term5411, args);
    }

};


