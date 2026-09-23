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

public class Element_html_92381463188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7975;

    public Element_html_92381463188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7998 = new ArrayList();
        ((ArrayList) term7998).add((Object)null);
        ((ArrayList) term7998).add((Object)null);
        ((ArrayList) term7998).add((Object)null);
        ((ArrayList) term7998).add((Object)null);
        ((ArrayList) term7998).add((Object)null);
        ((ArrayList) term7998).add((Object)null);
        ((ArrayList) term7998).add((Object)null);
        LinkedHashMap term8003 = new LinkedHashMap();
        term7975 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7976 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8002 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7976, term7976.getClass(), "tagName", "RTTvrwwhou");
        setBooleanField(term7976, term7976.getClass(), "isBlock", true);
        setBooleanField(term7976, term7976.getClass(), "formatAsBlock", false);
        setBooleanField(term7976, term7976.getClass(), "canContainBlock", true);
        setBooleanField(term7976, term7976.getClass(), "canContainInline", false);
        setBooleanField(term7976, term7976.getClass(), "empty", false);
        setBooleanField(term7976, term7976.getClass(), "selfClosing", false);
        setBooleanField(term7976, term7976.getClass(), "preserveWhitespace", false);
        setBooleanField(term7976, term7976.getClass(), "formList", true);
        setBooleanField(term7976, term7976.getClass(), "formSubmit", true);
        setField(term7975, term7975.getClass(), "tag", term7976);
        setField(term7975, term7975.getClass(), "parentNode", null);
        setField(term7975, term7975.getClass(), "childNodes", term7998);
        setField(term8002, term8002.getClass(), "attributes", term8003);
        setField(term7975, term7975.getClass(), "attributes", term8002);
        setField(term7975, term7975.getClass(), "baseUri", "nHpMKOmlpQ");
        setIntField(term7975, term7975.getClass(), "siblingIndex", -1885090354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fKhrQsJToZ";
        callMethod(klass, "html", argTypes, term7975, args);
    }

};


