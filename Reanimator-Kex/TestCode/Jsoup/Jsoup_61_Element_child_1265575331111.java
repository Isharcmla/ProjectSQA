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
import java.lang.IndexOutOfBoundsException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.lang.Integer;

public class Element_child_1265575331111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1027;
     Object term1078;

    public Element_child_1265575331111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1049 = new ArrayList();
        ((ArrayList) term1049).add((Object)null);
        ((ArrayList) term1049).add((Object)null);
        ((ArrayList) term1049).add((Object)null);
        ((ArrayList) term1049).add((Object)null);
        ((ArrayList) term1049).add((Object)null);
        LinkedHashMap term1054 = new LinkedHashMap();
        term1027 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1028 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1053 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1028, term1028.getClass(), "tagName", "JUmudUmaaV");
        setBooleanField(term1028, term1028.getClass(), "isBlock", false);
        setBooleanField(term1028, term1028.getClass(), "formatAsBlock", false);
        setBooleanField(term1028, term1028.getClass(), "canContainInline", false);
        setBooleanField(term1028, term1028.getClass(), "empty", true);
        setBooleanField(term1028, term1028.getClass(), "selfClosing", true);
        setBooleanField(term1028, term1028.getClass(), "preserveWhitespace", false);
        setBooleanField(term1028, term1028.getClass(), "formList", false);
        setBooleanField(term1028, term1028.getClass(), "formSubmit", false);
        setField(term1027, term1027.getClass(), "tag", term1028);
        setField(term1027, term1027.getClass(), "parentNode", null);
        setField(term1027, term1027.getClass(), "childNodes", term1049);
        setField(term1053, term1053.getClass(), "attributes", term1054);
        setField(term1027, term1027.getClass(), "attributes", term1053);
        setField(term1027, term1027.getClass(), "baseUri", "oVgzLbrsFr");
        setIntField(term1027, term1027.getClass(), "siblingIndex", 1134449235);
        term1078 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1078;
        try {
            callMethod(klass, "child", argTypes, term1027, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


