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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.lang.Integer;

public class Element_child_1265575331105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1047;
     Object term1120;

    public Element_child_1265575331105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1069 = new HashMap();
        Set<Object> term20189 =  ((Map) term1069).keySet();
        HashSet term1068 = new HashSet((Collection<? extends Object>) term20189);
        ArrayList term1091 = new ArrayList();
        ((ArrayList) term1091).add((Object)null);
        ((ArrayList) term1091).add((Object)null);
        ((ArrayList) term1091).add((Object)null);
        LinkedHashMap term1096 = new LinkedHashMap();
        term1047 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1048 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1095 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1048, term1048.getClass(), "tagName", "sEnIVFtZuQ");
        setBooleanField(term1048, term1048.getClass(), "isBlock", true);
        setBooleanField(term1048, term1048.getClass(), "formatAsBlock", true);
        setBooleanField(term1048, term1048.getClass(), "canContainBlock", true);
        setBooleanField(term1048, term1048.getClass(), "canContainInline", false);
        setBooleanField(term1048, term1048.getClass(), "empty", false);
        setBooleanField(term1048, term1048.getClass(), "selfClosing", true);
        setBooleanField(term1048, term1048.getClass(), "preserveWhitespace", true);
        setField(term1047, term1047.getClass(), "tag", term1048);
        setField(term1047, term1047.getClass(), "classNames", term1068);
        setField(term1047, term1047.getClass(), "parentNode", null);
        setField(term1047, term1047.getClass(), "childNodes", term1091);
        setField(term1095, term1095.getClass(), "attributes", term1096);
        setField(term1047, term1047.getClass(), "attributes", term1095);
        setField(term1047, term1047.getClass(), "baseUri", "dpNsDgfPso");
        setIntField(term1047, term1047.getClass(), "siblingIndex", -522618178);
        term1120 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1120;
        try {
            callMethod(klass, "child", argTypes, term1047, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


