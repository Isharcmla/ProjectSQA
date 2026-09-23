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
     Object term1071;
     Object term1146;

    public Element_child_1265575331105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1095 = new HashMap();
        Set<Object> term11482 =  ((Map) term1095).keySet();
        HashSet term1094 = new HashSet((Collection<? extends Object>) term11482);
        ArrayList term1117 = new ArrayList();
        ((ArrayList) term1117).add((Object)null);
        ((ArrayList) term1117).add((Object)null);
        ((ArrayList) term1117).add((Object)null);
        LinkedHashMap term1122 = new LinkedHashMap();
        term1071 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1072 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1121 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1072, term1072.getClass(), "tagName", "sEnIVFtZuQ");
        setBooleanField(term1072, term1072.getClass(), "isBlock", true);
        setBooleanField(term1072, term1072.getClass(), "formatAsBlock", false);
        setBooleanField(term1072, term1072.getClass(), "canContainBlock", false);
        setBooleanField(term1072, term1072.getClass(), "canContainInline", false);
        setBooleanField(term1072, term1072.getClass(), "empty", false);
        setBooleanField(term1072, term1072.getClass(), "selfClosing", false);
        setBooleanField(term1072, term1072.getClass(), "preserveWhitespace", false);
        setBooleanField(term1072, term1072.getClass(), "formList", false);
        setBooleanField(term1072, term1072.getClass(), "formSubmit", false);
        setField(term1071, term1071.getClass(), "tag", term1072);
        setField(term1071, term1071.getClass(), "classNames", term1094);
        setField(term1071, term1071.getClass(), "parentNode", null);
        setField(term1071, term1071.getClass(), "childNodes", term1117);
        setField(term1121, term1121.getClass(), "attributes", term1122);
        setField(term1071, term1071.getClass(), "attributes", term1121);
        setField(term1071, term1071.getClass(), "baseUri", "dpNsDgfPso");
        setIntField(term1071, term1071.getClass(), "siblingIndex", -522618178);
        term1146 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1146;
        try {
            callMethod(klass, "child", argTypes, term1071, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


