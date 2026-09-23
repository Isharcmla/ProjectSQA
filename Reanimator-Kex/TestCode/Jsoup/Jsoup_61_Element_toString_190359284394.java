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

public class Element_toString_190359284394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8243;

    public Element_toString_190359284394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8265 = new ArrayList();
        ((ArrayList) term8265).add((Object)null);
        ((ArrayList) term8265).add((Object)null);
        ((ArrayList) term8265).add((Object)null);
        ((ArrayList) term8265).add((Object)null);
        LinkedHashMap term8270 = new LinkedHashMap();
        term8243 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8244 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8269 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8244, term8244.getClass(), "tagName", "GeddnXjHGy");
        setBooleanField(term8244, term8244.getClass(), "isBlock", false);
        setBooleanField(term8244, term8244.getClass(), "formatAsBlock", true);
        setBooleanField(term8244, term8244.getClass(), "canContainInline", false);
        setBooleanField(term8244, term8244.getClass(), "empty", false);
        setBooleanField(term8244, term8244.getClass(), "selfClosing", false);
        setBooleanField(term8244, term8244.getClass(), "preserveWhitespace", false);
        setBooleanField(term8244, term8244.getClass(), "formList", false);
        setBooleanField(term8244, term8244.getClass(), "formSubmit", true);
        setField(term8243, term8243.getClass(), "tag", term8244);
        setField(term8243, term8243.getClass(), "parentNode", null);
        setField(term8243, term8243.getClass(), "childNodes", term8265);
        setField(term8269, term8269.getClass(), "attributes", term8270);
        setField(term8243, term8243.getClass(), "attributes", term8269);
        setField(term8243, term8243.getClass(), "baseUri", "mNHyqmOAFy");
        setIntField(term8243, term8243.getClass(), "siblingIndex", 1687361082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8243, args);
    }

};


