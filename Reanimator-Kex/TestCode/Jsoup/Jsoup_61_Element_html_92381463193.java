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

public class Element_html_92381463193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8150;

    public Element_html_92381463193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8172 = new ArrayList();
        ((ArrayList) term8172).add((Object)null);
        ((ArrayList) term8172).add((Object)null);
        ((ArrayList) term8172).add((Object)null);
        LinkedHashMap term8177 = new LinkedHashMap();
        term8150 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8151 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8176 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8151, term8151.getClass(), "tagName", "BYrGukTyof");
        setBooleanField(term8151, term8151.getClass(), "isBlock", true);
        setBooleanField(term8151, term8151.getClass(), "formatAsBlock", false);
        setBooleanField(term8151, term8151.getClass(), "canContainInline", false);
        setBooleanField(term8151, term8151.getClass(), "empty", true);
        setBooleanField(term8151, term8151.getClass(), "selfClosing", false);
        setBooleanField(term8151, term8151.getClass(), "preserveWhitespace", true);
        setBooleanField(term8151, term8151.getClass(), "formList", true);
        setBooleanField(term8151, term8151.getClass(), "formSubmit", true);
        setField(term8150, term8150.getClass(), "tag", term8151);
        setField(term8150, term8150.getClass(), "parentNode", null);
        setField(term8150, term8150.getClass(), "childNodes", term8172);
        setField(term8176, term8176.getClass(), "attributes", term8177);
        setField(term8150, term8150.getClass(), "attributes", term8176);
        setField(term8150, term8150.getClass(), "baseUri", "FiYYLuailz");
        setIntField(term8150, term8150.getClass(), "siblingIndex", 114754804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XebAeSnCKZ";
        callMethod(klass, "html", argTypes, term8150, args);
    }

};


