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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Node_getDeepChild_193408560273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247;

    public Node_getDeepChild_193408560273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term270 = new ArrayList();
        ((ArrayList) term270).add((Object)null);
        ((ArrayList) term270).add((Object)null);
        ((ArrayList) term270).add((Object)null);
        ((ArrayList) term270).add((Object)null);
        ((ArrayList) term270).add((Object)null);
        LinkedHashMap term275 = new LinkedHashMap();
        term247 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term248 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term274 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term248, term248.getClass(), "tagName", "uuaPigETmJ");
        setBooleanField(term248, term248.getClass(), "isBlock", false);
        setBooleanField(term248, term248.getClass(), "formatAsBlock", false);
        setBooleanField(term248, term248.getClass(), "canContainBlock", false);
        setBooleanField(term248, term248.getClass(), "canContainInline", false);
        setBooleanField(term248, term248.getClass(), "empty", true);
        setBooleanField(term248, term248.getClass(), "selfClosing", true);
        setBooleanField(term248, term248.getClass(), "preserveWhitespace", true);
        setBooleanField(term248, term248.getClass(), "formList", true);
        setBooleanField(term248, term248.getClass(), "formSubmit", false);
        setField(term247, term247.getClass(), "tag", term248);
        setField(term247, term247.getClass(), "parentNode", null);
        setField(term247, term247.getClass(), "childNodes", term270);
        setField(term274, term274.getClass(), "attributes", term275);
        setField(term247, term247.getClass(), "attributes", term274);
        setField(term247, term247.getClass(), "baseUri", "aJlieCFVtF");
        setIntField(term247, term247.getClass(), "siblingIndex", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term247;
        try {
            callMethod(klass, "getDeepChild", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


